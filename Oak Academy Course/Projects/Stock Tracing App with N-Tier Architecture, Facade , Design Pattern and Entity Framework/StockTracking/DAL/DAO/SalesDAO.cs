using StockTracking.DAL.DTO;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StockTracking.DAL.DAO
{
    public class SalesDAO : StockContext, IDAO<SALE, SalesDetailDTO>
    {
        public bool Delete(SALE entity)
        {
            throw new NotImplementedException();
        }

        public bool GetBack(int ID)
        {
            throw new NotImplementedException();
        }

        public bool Insert(SALE entity)
        {
            try
            {
                db.SALES.Add(entity);
                db.SaveChanges();
                return true;
            }
            catch (Exception ex)
            {
                throw ex;
            }
        }

        public List<SalesDetailDTO> Select()
        {
            try
            {
                List<SalesDetailDTO> sales = new List<SalesDetailDTO>();

                var list = (from s in db.SALES
                            join p in db.PRODUCTs on s.ProductID equals p.ID
                            join c in db.CUSTOMERs on s.CustomerID equals c.ID
                            join category in db.CATEGORies on s.CategoryID equals category.ID
                            select new
                            {
                                productName = p.ProductName,
                                customerName = c.CustomerName,
                                categoryName = category.CategoryName,
                                productID = s.ProductID,
                                customerID = s.CustomerID,
                                salesID = s.ID,
                                categoryID = s.CategoryID,
                                salesPrice = s.ProductSalesPrice,
                                salesAmount = s.ProductSalesAmount,
                                salesDate = s.SalesDate
                            }).OrderBy(x => x.salesDate).ToList();

                foreach (var item in list)
                {
                    SalesDetailDTO dto = new SalesDetailDTO();

                    dto.ProductName = item.productName;
                    dto.CustomerName = item.customerName;
                    dto.CategoryName = item.categoryName;
                    dto.ProductID = item.productID;
                    dto.CustomerID = item.customerID;
                    dto.SalesID = item.salesID;
                    dto.CategoryID = item.categoryID;
                    dto.Price = item.salesPrice;
                    dto.SaleAmount = item.salesAmount;
                    dto.SaleDate = item.salesDate;

                    sales.Add(dto);
                }

                return sales;
            }
            catch (Exception ex)
            {
                throw ex;
            }
        }

        public bool Update(SALE entity)
        {
            try
            {
                SALE sale = db.SALES.First(x => x.ID == entity.ID);

                sale.ProductSalesAmount = entity.ProductSalesAmount;
                db.SaveChanges();
                return true;
            }
            catch (Exception ex)
            {
                throw ex;
            }
        }
    }
}
