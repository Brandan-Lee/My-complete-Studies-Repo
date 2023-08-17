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
using DAL.DTO;

namespace Personel_Tracking
{
    public partial class FrmTaskList : Form
    {
        public FrmTaskList()
        {
            InitializeComponent();
        }

        private void txtUserNo_KeyPress(object sender, KeyPressEventArgs e)
        {
            e.Handled = General.IsNumber(e);
        }

        private void btnClose_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            ChangeToTaskForm();
        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            ChangeToTaskForm();
        }

        void ChangeToTaskForm()
        {
            FrmTask frm = new FrmTask();
            this.Hide();
            frm.ShowDialog();
            this.Visible = true;
        }

        TaskDTO dto = new TaskDTO();
        private void FrmTaskList_Load(object sender, EventArgs e)
        {
            dto = TaskBLL.GetAll();
        }
    }
}
