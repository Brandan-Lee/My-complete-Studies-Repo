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
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }

        public Employee personelDetail = new Employee();
        private void Form2_Load(object sender, EventArgs e)
        {
            txtEmployeeId.Text = personelDetail.EmployeeId.ToString();
            txtName.Text = personelDetail.Name;
            txtAge.Text = personelDetail.Age.ToString();
        }
    }
}
