﻿using DTO;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DAL
{
    public class MetaDAO : PostContext
    {
        public int AddMeta(Meta meta)
        {
			try
			{
				db.Metas.Add(meta);
				db.SaveChanges();
				return meta.ID;
			}
			catch (Exception ex)
			{
				throw ex;
			}
        }

        public void DeleteMeta(int ID)
        {
            try
            {
                Meta meta = db.Metas.First(x => x.ID == ID);
                meta.isDeleted = true;
                meta.DeletedDate = DateTime.Now;
                meta.LastUpdateDate = DateTime.Now;
                meta.LastUpdateUserID = UserStatic.UserID;
                db.SaveChanges();
            }
            catch (Exception ex)
            {
                throw;
            }
        }

        public List<MetaDTO> GetMetaData()
        {
            List<Meta> list = db.Metas.Where(x => x.isDeleted == false).OrderBy(x => x.AddDate).ToList();
            List<MetaDTO> metaList = new List<MetaDTO>();

            foreach (var item in list)
            {
                MetaDTO dto = new MetaDTO();

                dto.MetaID = item.ID;
                dto.Name = item.Name;
                dto.MetaContent = item.MetaContent;

                metaList.Add(dto);
            }

            return metaList;
        }

        public MetaDTO GetMetaWithID(int ID)
        {
            Meta meta = db.Metas.First(x => x.ID == ID);
            MetaDTO dto = new MetaDTO();

            dto.MetaID = meta.ID;
            dto.Name = meta.Name;
            dto.MetaContent = meta.MetaContent;

            return dto;
        }

        public void UpdateMeta(MetaDTO model)
        {
            try
            {
                Meta meta = db.Metas.First(x => x.ID == model.MetaID);

                meta.Name = model.Name;
                meta.MetaContent = model.MetaContent;
                meta.LastUpdateDate = DateTime.Now;
                meta.LastUpdateUserID = UserStatic.UserID;
            }
            catch (Exception ex)
            {
                throw ex;
            }
        }
    }
}