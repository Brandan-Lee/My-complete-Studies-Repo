using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _2.For_Foreach
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string iValue = "";

            for (int i = 0; i < 10; i++)
            {
                iValue += " " + i + " ";
            }

            MessageBox.Show(iValue);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            string iValue = "";

            for (int i = 0; i < 10; i++)
            {
                for (int k = 0; k < 8; k++)
                {
                    richTextBox1.Text += "i = " + i + " k = " + k + Environment.NewLine; 
                }
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            foreach (var item in collection)
            {

            }
        }
    }
}
