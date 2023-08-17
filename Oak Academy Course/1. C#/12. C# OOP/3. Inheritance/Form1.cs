using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _3.Inheritance
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnGetAll_Click(object sender, EventArgs e)
        {
            Teacher teacher = new Teacher();
            teacher.SetValues();
            teacher.SetValues2();
            teacher.FindSalary();
            string allValues = "";

            allValues += teacher.Name + Environment.NewLine;
            allValues += teacher.Surname + Environment.NewLine;
            allValues += teacher.Gender + Environment.NewLine;
            allValues += teacher.Age + Environment.NewLine;
            allValues += teacher.Branch + Environment.NewLine;
            allValues += teacher.Salary + Environment.NewLine;

            textBox1.Text = allValues;

        }
    }
}
