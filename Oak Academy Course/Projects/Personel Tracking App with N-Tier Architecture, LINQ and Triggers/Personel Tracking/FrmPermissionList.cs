using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using DAL.DTO;
using DAL;
using BLL;

namespace Personel_Tracking
{
    public partial class FrmPermissionList : Form
    {
        public FrmPermissionList()
        {
            InitializeComponent();
        }

        private void txtUserNo_KeyPress(object sender, KeyPressEventArgs e)
        {
            e.Handled = General.IsNumber(e);
        }

        private void txtDayAmount_KeyPress(object sender, KeyPressEventArgs e)
        {
            e.Handled = General.IsNumber(e);
        }

        private void btnClose_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            ChangeToPermissionForm();
        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            ChangeToPermissionForm();
        }

        void ChangeToPermissionForm()
        {
            FrmPermission frm = new FrmPermission();
            this.Hide();
            frm.ShowDialog();
            this.Visible = true;
            FillGrid();
            CleanFilters();
        }

        bool comboFull = false;
        void FillGrid()
        {
            dto = PermissionBLL.GetAll();
            dataGridView1.DataSource = dto.Permissions;
            //fill comboboxes
            comboFull = false;

            cmbDepartment.DataSource = dto.Departments;
            cmbDepartment.DisplayMember = "DepartmentName";
            cmbDepartment.ValueMember = "ID";
            cmbDepartment.SelectedIndex = -1;

            cmbPosition.DataSource = dto.Positions;
            cmbPosition.DisplayMember = "PositionName";
            cmbPosition.ValueMember = "ID";
            cmbPosition.SelectedIndex = -1;

            cmbTaskState.DataSource = dto.States;
            cmbTaskState.DisplayMember = "StateName";
            cmbTaskState.ValueMember = "ID";
            cmbTaskState.SelectedIndex = -1;

            comboFull = true;
        }

        PermissionDTO dto = new PermissionDTO();  
        private void FrmPermissionList_Load(object sender, EventArgs e)
        {
            FillGrid();
            dataGridView1.Columns[0].Visible = false;
            dataGridView1.Columns[1].HeaderText = "User No";
            dataGridView1.Columns[2].HeaderText = "Name";
            dataGridView1.Columns[3].HeaderText = "Surname";
            dataGridView1.Columns[4].Visible = false;
            dataGridView1.Columns[5].Visible = false;
            dataGridView1.Columns[6].Visible = false;
            dataGridView1.Columns[7].Visible = false;
            dataGridView1.Columns[8].HeaderText = "Start Date";
            dataGridView1.Columns[9].HeaderText = "End Date";
            dataGridView1.Columns[10].HeaderText = "Day Amount";
            dataGridView1.Columns[11].HeaderText = "State";
            dataGridView1.Columns[12].Visible = false;
            dataGridView1.Columns[13].Visible = false;
            dataGridView1.Columns[14].Visible = false;
        }

        private void btnSearch_Click(object sender, EventArgs e)
        {
            List<PermissionDetailDTO> list = dto.Permissions;

            if (txtUserNo.Text.Trim() != "")
                list = list.Where(x => x.UserNo == Convert.ToInt32(txtUserNo.Text)).ToList();

            if (txtName.Text.Trim() != "")
                list = list.Where(x => x.Name.Contains(txtName.Text)).ToList();

            if (txtSurname.Text.Trim() != "")
                list = list.Where(x => x.Surname.Contains(txtSurname.Text)).ToList();

            if (cmbDepartment.SelectedIndex != -1)
                list = list.Where(x => x.DepartmentID == Convert.ToInt32(cmbDepartment.SelectedValue)).ToList();

            if (cmbPosition.SelectedIndex != -1)
                list = list.Where(x => x.PositionID == Convert.ToInt32(cmbPosition.SelectedValue)).ToList();

            if (rbStartDate.Checked)
                list = list.Where(x => x.StartDate > Convert.ToDateTime(dpStart.Value) && x.StartDate < Convert.ToDateTime(dpEnd.Value)).ToList();
            else if (rbDeliveryDate.Checked)
                list = list.Where(x => x.EndDate > Convert.ToDateTime(dpStart.Value) && x.EndDate < Convert.ToDateTime(dpEnd.Value)).ToList();

            if (cmbTaskState.SelectedIndex != -1)
                list = list.Where(x => x.State == Convert.ToInt32(cmbTaskState.SelectedValue)).ToList();

            if (txtDayAmount.Text.Trim() != "")
                list = list.Where(x => x.PermissionDayAmount == Convert.ToInt32(txtDayAmount.Text)).ToList();

            dataGridView1.DataSource = list;
        }

        private void btnClean_Click(object sender, EventArgs e)
        {
            CleanFilters();
        }

        void CleanFilters()
        {
            txtUserNo.Clear();
            txtName.Clear();
            txtSurname.Clear();
            comboFull = false;
            cmbDepartment.SelectedIndex = -1;
            cmbPosition.DataSource = dto.Positions;
            cmbPosition.SelectedIndex = -1;
            comboFull = true;
            rbDeliveryDate.Checked = false;
            rbStartDate.Checked = false;
            cmbTaskState.SelectedIndex = -1;
            txtDayAmount.Clear();

            dataGridView1.DataSource = dto.Permissions;
        }
    }
}
