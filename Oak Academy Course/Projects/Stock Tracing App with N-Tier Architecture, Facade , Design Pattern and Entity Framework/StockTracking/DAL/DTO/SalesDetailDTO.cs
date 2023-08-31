﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StockTracking.DAL.DTO
{
    public class SalesDetailDTO
    {
        public string CustomerName { get; set; }
        public string ProductName { get; set; }
        public string CategoryName { get; set; }
        public int CustomerID { get; set; }
        public int ProductID { get; set; }
        public int CategoryID { get; set; }
        public int SaleAmount { get; set; }
        public int Price { get; set; }
        public DateTime SaleDate { get; set; }
        public int StockAmount { get; set; }
        public int SalesID { get; set; }
    }
}
