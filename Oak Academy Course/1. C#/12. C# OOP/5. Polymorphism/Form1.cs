using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _5.Polymorphism
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        //Class teacher and Employee is overloading polymorphism, and classes employee2 and teacher2 is overriding polymorphism
        private void btn1Paramater_Click(object sender, EventArgs e)
        {
            Teacher teacher = new Teacher();
            teacher.SetValues(1);
            string messageText = teacher.GetValues();

            textBox1.Text = messageText;
        }

        private void btn2Paramater_Click(object sender, EventArgs e)
        {
            Teacher teacher = new Teacher();
            teacher.SetValues(1, "Brandan-Lee");
            string messageText = teacher.GetValues();

            textBox1.Text = messageText;
        }

        private void btn3Paramater_Click(object sender, EventArgs e)
        {
            Teacher teacher = new Teacher();
            teacher.SetValues(1, "Brandan-Lee", 15000);
            string messageText = teacher.GetValues();

            textBox1.Text = messageText;
        }

        private void btn4Paramater_Click(object sender, EventArgs e)
        {
            Teacher teacher = new Teacher();
            teacher.SetValues(1, "Brandan-Lee", 15000, "Software Developer");
            string messageText = teacher.GetValues();

            textBox1.Text = messageText;
        }

        private void btnVirtual_Click(object sender, EventArgs e)
        {
            Employee2 employee = new Employee2();
            string messageText = employee.SetValues(1, "Brandan-Lee", 15000);

            textBox1.Text = messageText;
        }

        private void btnOverrida_Click(object sender, EventArgs e)
        {
            Teacher2 employee = new Teacher2();
            string messageText = employee.SetValues(1, "Brandan-Lee", 15000);

            textBox1.Text = messageText;
        }
    }
}
