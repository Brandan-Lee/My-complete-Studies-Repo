﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using StockTracking.BLL;
using StockTracking.DAL.DTO;

namespace StockTracking
{
    public partial class FrmCategory : Form
    {
        public FrmCategory()
        {
            InitializeComponent();
        }

        private void btnClose_Click(object sender, EventArgs e)
        {
            this.Close();
        }


        CategoryBLL bll = new CategoryBLL();
        private void FrmCategory_Load(object sender, EventArgs e)
        {

        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            if (txtCategoryName.Text.Trim() == "")
                MessageBox.Show("Category name is empty");
            else
            {
                CategoryDetailDTO category = new CategoryDetailDTO();
                category.CategoryName = txtCategoryName.Text;

                if (bll.Insert(category))
                {
                    MessageBox.Show("Category was added");
                    txtCategoryName.Clear();
                    category = new CategoryDetailDTO();
                }
            }
        }
    }
}