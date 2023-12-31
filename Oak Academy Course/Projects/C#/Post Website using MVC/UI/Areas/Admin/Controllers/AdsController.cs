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
    public class AdsController : BaseController
    {
        AdsBLL bll = new AdsBLL();

        // GET: Admin/Ads
        public ActionResult AddAds()
        {
            AdsDTO dto = new AdsDTO();
            return View(dto);
        }

        [HttpPost]
        public ActionResult AddAds(AdsDTO model)
        {
            if (model.AdsImage == null)
                ViewBag.ProcessState = General.Messages.ImageMissing;
            else if (ModelState.IsValid)
            {
                string fileName = "";
                HttpPostedFileBase postedFile = model.AdsImage;
                Bitmap userImage = new Bitmap(postedFile.InputStream);
                Bitmap resizeImage = new Bitmap(userImage, 128, 128);
                string ext = Path.GetExtension(postedFile.FileName);

                if (ext == ".jpg" || ext == ".jpeg" || ext == ".png" || ext == ".gif")
                {
                    string uniqueNumber = Guid.NewGuid().ToString();
                    fileName = uniqueNumber + postedFile.FileName;
                    resizeImage.Save(Server.MapPath("~/Areas/Admin/Content/AdsImages/" + fileName));
                    model.ImagePath = fileName;

                    bll.AddAds(model);
                    ViewBag.ProcessState = General.Messages.AddSuccess;
                    ModelState.Clear();
                    model = new AdsDTO();
                }
                else
                    ViewBag.ProcessState = General.Messages.ExtensionError;
            }
            else
                ViewBag.ProcessState = General.Messages.EmptyArea;

            return View(model);
        }

        public ActionResult AdsList()
        {
            List<AdsDTO> adsList = new List<AdsDTO>();
            adsList = bll.GetAds();
            return View(adsList);
        }

        public ActionResult UpdateAds(int ID)
        {
            AdsDTO dto = bll.GetAdsWithID(ID);
            return View(dto);
        }

        [HttpPost]
        public ActionResult UpdateAds(AdsDTO model)
        {
            if (!ModelState.IsValid)
                ViewBag.ProcessState = General.Messages.EmptyArea;
            else
            {
                if (model.AdsImage != null)
                {
                    string fileName = "";
                    HttpPostedFileBase postedFile = model.AdsImage;
                    Bitmap userImage = new Bitmap(postedFile.InputStream);
                    Bitmap resizeImage = new Bitmap(userImage, 128, 128);
                    string ext = Path.GetExtension(postedFile.FileName);

                    if (ext == ".jpg" || ext == ".jpeg" || ext == ".png" || ext == ".gif")
                    {
                        string uniqueNumber = Guid.NewGuid().ToString();
                        fileName = uniqueNumber + postedFile.FileName;
                        resizeImage.Save(Server.MapPath("~/Areas/Admin/Content/AdsImages/" + fileName));
                        model.ImagePath = fileName;
                    }
                }

                string oldImagePath = bll.UpdateAds(model);

                if (model.AdsImage != null)
                {
                    if (System.IO.File.Exists(Server.MapPath("~/Areas/Admin/Content/AdsImages/" + oldImagePath)))
                    {
                        System.IO.File.Delete(Server.MapPath("~/Areas/Admin/Content/AdsImages/" + oldImagePath));
                    }
                }

                ViewBag.ProcessState = General.Messages.UpdateSuccess;
            }

            return View(model);
        }

        public JsonResult DeleteAds(int ID)
        {
            string imagePath = bll.DeleteAds(ID);

            if (System.IO.File.Exists(Server.MapPath("~/Areas/Admin/Content/AdsImages/" + imagePath)))
            {
                System.IO.File.Delete(Server.MapPath("~/Areas/Admin/Content/AdsImages/" + imagePath));
            }

            return Json("");
        }
    }
}