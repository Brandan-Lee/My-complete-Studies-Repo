﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using StockTracking.DAL.DTO;
using StockTracking.DAL.DAO;
using StockTracking.DAL;

namespace StockTracking.BLL
{
    internal class SalesBLL : IBLL<SalesDetailDTO, SalesDTO>
    {
        SalesDAO dao = new SalesDAO();
        ProductDAO productdao = new ProductDAO();
        CategoryDAO categorydao = new CategoryDAO();
        CustomerDAO customerdao = new CustomerDAO();

        public bool Delete(SalesDetailDTO entity)
        {
            throw new NotImplementedException();
        }

        public bool GetBack(SalesDetailDTO entity)
        {
            throw new NotImplementedException();
        }

        public bool Insert(SalesDetailDTO entity)
        {
            SALE sales = new SALE();
            
            sales.CategoryID = entity.CategoryID;
            sales.ProductID = entity.ProductID;
            sales.CustomerID = entity.CustomerID;
            sales.ProductSalesPrice = entity.Price;
            sales.ProductSalesAmount = entity.SaleAmount;
            sales.SalesDate = entity.SaleDate;

            dao.Insert(sales);

            PRODUCT product = new PRODUCT();

            product.ID = entity.ProductID;
            int temp = entity.StockAmount - entity.SaleAmount;
            product.StockAmount = temp;
            productdao.Update(product);

            return true;
        }

        public SalesDTO Select()
        {
            SalesDTO dto = new SalesDTO();

            dto.Products = productdao.Select();
            dto.Categories = categorydao.Select();
            dto.Customers = customerdao.Select();
            dto.Sales = dao.Select();

            return dto;
        }

        public bool Update(SalesDetailDTO entity)
        {
            throw new NotImplementedException();
        }
    }
}
