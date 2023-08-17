using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _3.Using_Random_Class
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnRandom_Click(object sender, EventArgs e)
        {
            Random rnd = new Random();
            label1.Text = rnd.Next().ToString();

            Random rnd1 = new Random();
            label2.Text = rnd1.Next(100).ToString();

            Random rnd2 = new Random();
            label3.Text = rnd2.Next(90, 100).ToString();

            Random rnd3 = new Random();
            label4.Text = rnd3.NextDouble().ToString();

            Random rnd4 = new Random();
            byte[] Array = new byte[5];
            rnd.NextBytes(Array);
            label5.Text = Array[0].ToString();
        }

        private void btnPassword_Click(object sender, EventArgs e)
        {
            string allValid = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$";
            string result = "";

            Random rnd = new Random();
            for (int i = 0; i < 6; i++)
            {
                result += allValid[rnd.Next(0, Convert.ToInt32(allValid.Length))];
            }

            label6.Text = result;
        }
    }
}
