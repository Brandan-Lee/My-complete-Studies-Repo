using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Class_and_object
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        Employee personelDetial = new Employee();
        private void btnSetValue_Click(object sender, EventArgs e)
        {
            personelDetial.EmployeeId = Convert.ToInt32(txtEmployeeId.Text);
            personelDetial.Name = txtName.Text;
            personelDetial.Age = Convert.ToInt32(txtAge.Text);

            MessageBox.Show("All date received");
        }

        private void btnSend_Click(object sender, EventArgs e)
        {
            personelDetial.EmployeeId = Convert.ToInt32(txtEmployeeId.Text);
            personelDetial.Name = txtName.Text;
            personelDetial.Age = Convert.ToInt32(txtAge.Text);

            Form2 frm = new Form2();
            frm.personelDetail = personelDetial;
            frm.ShowDialog();
        }
    }
}
