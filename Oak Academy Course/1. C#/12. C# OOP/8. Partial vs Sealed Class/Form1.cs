using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _8.Patial_vs_Sealed_Class
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        public partial class Employee
        {
            public int EmployeeID { get; set; }
            public string Name { get; set; }
            public double Salary { get; set; }
        }

        public partial class Employee 
        {
            public void SetValues()
            {
                Name = "Brandan-Lee";
                EmployeeID = 1;
                Salary = 15000;
            }
        }

        public sealed class SealedClass 
        {
            
        }

        //Classes cannot be derived from a sealed base class
        public class NewClass : SealedClass
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            Employee employee = new Employee();
            employee.SetValues();

            textBox1.Text = employee.EmployeeID + Environment.NewLine;
            textBox1.Text += employee.Name + Environment.NewLine;
            textBox1.Text += employee.Salary + Environment.NewLine;
        }
    }
}
