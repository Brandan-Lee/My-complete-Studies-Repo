﻿using BLL;
using DTO;
using System;
using System.Collections.Generic;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace UI.Areas.Admin.Controllers
{
    public class FavController : BaseController
    {
        FavBLL bll = new FavBLL();

        public ActionResult UpdateFav()
        {
            FavDTO dto = new FavDTO();
            dto = bll.GetFav();
            return View(dto);
        }

        [HttpPost]
        public ActionResult UpdateFav(FavDTO model)
        {
            if (!ModelState.IsValid)
                ViewBag.ProcessState = General.Messages.EmptyArea;
            else
            {
                /*Favicon*/
                if (model.FavImage != null)
                {
                    string favName = "";
                    HttpPostedFileBase postedFileFav = model.FavImage;
                    Bitmap favImage = new Bitmap(postedFileFav.InputStream);
                    Bitmap resizeFavImage = new Bitmap(favImage, 100, 100);
                    string ext = Path.GetExtension(postedFileFav.FileName);

                    if (ext == ".ico" || ext == ".jpg" || ext == ".jpeg" || ext == ".png")
                    {
                        string favUnique = Guid.NewGuid().ToString();
                        favName = favUnique + postedFileFav.FileName;
                        resizeFavImage.Save(Server.MapPath("~/Areas/Admin/Content/FavImages/" + favName));
                        model.Fav = favName;
                    }
                    else
                        ViewBag.ProcessState = General.Messages.ExtensionError;
                }

                /*Logo*/
                if (model.LogoImage != null)
                {
                    string logoName = "";
                    HttpPostedFileBase postedFileLogo = model.LogoImage;
                    Bitmap logoImage = new Bitmap(postedFileLogo.InputStream);
                    Bitmap resizeLogoImage = new Bitmap(logoImage, 100, 100);
                    string ext = Path.GetExtension(postedFileLogo.FileName);

                    if (ext == ".ico" || ext == ".jpg" || ext == ".jpeg" || ext == ".png")
                    {
                        string logoUnique = Guid.NewGuid().ToString();
                        logoName = logoUnique + postedFileLogo.FileName;
                        resizeLogoImage.Save(Server.MapPath("~/Areas/Admin/Content/FavImages/" + logoName));
                        model.Logo = logoName;
                    }
                    else
                        ViewBag.ProcessState = General.Messages.ExtensionError;
                }

                FavDTO returndto = new FavDTO();
                returndto = bll.UpdateFav(model);

                if (model.FavImage != null)
                {
                    if (System.IO.File.Exists(Server.MapPath("~/Areas/Admin/Content/FavImages/" + returndto.Fav)))
                    {
                        System.IO.File.Delete(Server.MapPath("~/Areas/Admin/Content/FavImages/" + returndto.Fav));
                    }
                }

                if (model.LogoImage != null)
                {
                    if (System.IO.File.Exists(Server.MapPath("~/Areas/Admin/Content/FavImages/" + returndto.Logo)))
                    {
                        System.IO.File.Delete(Server.MapPath("~/Areas/Admin/Content/FavImages/" + returndto.Logo));
                    }
                }

                ViewBag.ProcessState = General.Messages.UpdateSuccess;
            }

            return View(model);
        }
    }
}