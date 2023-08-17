using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using BLL;
using DAL.DTO;

namespace Personel_Tracking
{
    public partial class FrmPositionList : Form
    {
        public FrmPositionList()
        {
            InitializeComponent();
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            ChangeToPositionForm();
        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            ChangeToPositionForm();
        }

        private void btnClose_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        void ChangeToPositionForm()
        {
            FrmPosition frm = new FrmPosition();
            this.Hide();
            frm.ShowDialog();
            this.Visible = true;
            FillGrid();
        }

        void FillGrid()
        {
            positionList = PositionBLL.GetPositions();
            dataGridView1.DataSource = positionList;
        }

        List<PositionDTO> positionList = new List<PositionDTO>();
        private void FrmPositionList_Load(object sender, EventArgs e)
        {
            FillGrid();
            dataGridView1.Columns[0].HeaderText = "Department Name";
            dataGridView1.Columns[1].Visible = false;
            dataGridView1.Columns[2].HeaderText = "Postition Name";
            dataGridView1.Columns[3].Visible = false;
        }
    }
}
