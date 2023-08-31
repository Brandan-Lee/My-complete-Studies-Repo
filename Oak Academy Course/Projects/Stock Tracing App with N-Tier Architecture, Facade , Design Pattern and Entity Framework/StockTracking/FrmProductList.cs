﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace StockTracking
{
    public partial class FrmProductList : Form
    {
        public FrmProductList()
        {
            InitializeComponent();
        }

        private void txtPrice_KeyPress(object sender, KeyPressEventArgs e)
        {
            e.Handled = General.IsNumber(e);
        }

        private void txtStock_KeyPress(object sender, KeyPressEventArgs e)
        {
            e.Handled = General.IsNumber(e);
        }

        private void btnClose_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            ChangeToProductForm();
        }

        void ChangeToProductForm()
        {
            FrmProduct frm = new FrmProduct();
            this.Hide();
            frm.ShowDialog();
            this.Visible = true;
        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            ChangeToProductForm();
        }
    }
}
