using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using DAL;
using BLL;

namespace Personel_Tracking
{
    public partial class FrmPermission : Form
    {
        public FrmPermission()
        {
            InitializeComponent();
        }

        private void btnClose_Click(object sender, EventArgs e)
        {
            this.Close();
        }


        TimeSpan permissionDay;
        private void FrmPermission_Load(object sender, EventArgs e)
        {
            txtUserNo.Text = UserStatic.UserNo.ToString();

        }

        private void dpStart_ValueChanged(object sender, EventArgs e)
        {
            permissionDay = dpEnd.Value.Date - dpStart.Value.Date;
            txtDayAmount.Text = permissionDay.TotalDays.ToString();
        }

        private void dpEnd_ValueChanged(object sender, EventArgs e)
        {
            permissionDay = dpEnd.Value.Date - dpStart.Value.Date;
            txtDayAmount.Text = permissionDay.TotalDays.ToString();
        }

        PERMISSION permission = new PERMISSION();
        private void btnSave_Click(object sender, EventArgs e)
        {
            if (txtDayAmount.Text.Trim() == "")
                MessageBox.Show("Please change and or start date");
            else if (Convert.ToInt32(txtDayAmount.Text) <= 0)
                MessageBox.Show("Permission day amount must be bigger than 0");
            else if (txtExplanation.Text.Trim() == "")
                MessageBox.Show("Explanation is empty");
            else
            {
                permission.EmployeeID = UserStatic.EmployeeID;
                permission.PermissionState = 1;
                permission.PermissionStartDate = dpStart.Value.Date;
                permission.PermissionEndDate = dpEnd.Value.Date;
                permission.PermissionDay = Convert.ToInt32(txtDayAmount.Text);
                permission.PermissionExplanation = txtExplanation.Text;

                PermissionBLL.AddPermission(permission);
                MessageBox.Show("Permission was added");
                permission = new PERMISSION();
                dpStart.Value = DateTime.Today;
                txtDayAmount.Clear();
                txtExplanation.Clear();
            }
        }
    }
}
