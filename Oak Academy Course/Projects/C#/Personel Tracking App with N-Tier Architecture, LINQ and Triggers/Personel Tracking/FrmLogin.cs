﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using BLL;
using DAL;

namespace Personel_Tracking
{
    public partial class FrmLogin : Form
    {
        public FrmLogin()
        {
            InitializeComponent();
        }

        private void txtUserNo_KeyPress(object sender, KeyPressEventArgs e)
        {
            e.Handled = General.IsNumber(e);
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void btnLogin_Click(object sender, EventArgs e)
        {
            if (txtUserNo.Text.Trim() == "" || txtPassword.Text.Trim() == "")
                MessageBox.Show("Please fill in the user number and password");
            else
            {
                List<EMPLOYEE> employeeList = EmployeeBLL.GetEmployees(Convert.ToInt32(txtUserNo.Text), txtPassword.Text);

                if (employeeList.Count == 0)
                    MessageBox.Show("Please control your information");
                else
                {
                    EMPLOYEE employee = new EMPLOYEE();

                    employee = employeeList.First();
                    UserStatic.EmployeeID = employee.ID;
                    UserStatic.UserNo = employee.UserNo;
                    UserStatic.isAdmin = (bool)employee.IsAdmin;

                    FrmMain frm = new FrmMain();
                    this.Hide();
                    frm.ShowDialog();
                }
            }

        }
    }
}
