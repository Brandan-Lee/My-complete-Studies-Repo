using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _1.Class_and_Object
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnSend_Click(object sender, EventArgs e)
        {
            Employee employeeDetails = new Employee();
            employeeDetails.EmployeeName = txtEmployeeName.Text;
            employeeDetails.EmployeeAge = Convert.ToInt32(txtEmployeeAge.Text);
            employeeDetails.EmployeePosition = txtEmployeePosition.Text;

            FrmEmployeeDetials frm = new FrmEmployeeDetials();
            frm.lblEmployeeName.Text = employeeDetails.EmployeeName;
            frm.lblEmployeeAge.Text = employeeDetails.EmployeeAge.ToString();
            frm.lblEmployeePosition.Text = employeeDetails.EmployeePosition;
            frm.ShowDialog();
        }
    }
}
