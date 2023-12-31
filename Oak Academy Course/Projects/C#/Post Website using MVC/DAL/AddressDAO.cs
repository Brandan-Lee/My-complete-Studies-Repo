﻿using DTO;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DAL
{
    public class AddressDAO : PostContext
    {
        public int AddAddress(Address ads)
        {
			try
			{
				db.Addresses.Add(ads);
				db.SaveChanges();
				return ads.ID;
			}
			catch (Exception ex)
			{
				throw ex;
			}
        }

        public void DeleteAddress(int ID)
        {
            try
            {
                Address address = db.Addresses.First(x => x.ID == ID);

                address.isDeleted = true;
                address.DeletedDate = DateTime.Now;
                address.LastUpdateDate = DateTime.Now;
                address.LastUpdateUserID = UserStatic.UserID;

                db.SaveChanges();
            }
            catch (Exception ex)
            {
                throw ex;
            }

        }

        public List<AddressDTO> GetAddresses()
        {
            List<Address> list = db.Addresses.Where(x => x.isDeleted == false).ToList();
            List<AddressDTO> addressList = new List<AddressDTO>();

            foreach (var item in list)
            {
                AddressDTO dto = new AddressDTO();

                dto.ID = item.ID;
                dto.AddressContent = item.AddressContent;
                dto.Email = item.Email;
                dto.Phone = item.Phone;
                dto.Phone2 = item.Phone2;
                dto.Fax = item.Fax;
                dto.LargeMapPath = item.MapPathLarge;
                dto.SmallMapPath = item.MapPathSmall;

                addressList.Add(dto);
            }

            return addressList;
        }

        public void UpdateAddress(AddressDTO model)
        {
            try
            {
                Address ads = db.Addresses.First(x => x.ID == model.ID);

                ads.AddressContent = model.AddressContent;
                ads.Email = model.Email;
                ads.Phone = model.Phone;
                ads.Phone2 = model.Phone2;
                ads.Fax = model.Fax;
                ads.MapPathLarge = model.LargeMapPath;
                ads.MapPathSmall = model.SmallMapPath;
                ads.LastUpdateUserID = UserStatic.UserID;
                ads.LastUpdateDate = DateTime.Now;
            }
            catch (Exception ex)
            {
                throw ex;
            }
        }
    }
}
