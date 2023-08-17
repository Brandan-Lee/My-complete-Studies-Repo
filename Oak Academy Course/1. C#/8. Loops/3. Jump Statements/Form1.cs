using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _3.Jump_Statements
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

            for (int i = 0; i < 5; i++)
            {
                if (i == 4)
                    break;
                
                iValue += " " + i + " ";   
            }

            MessageBox.Show(iValue);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            string iValue = "";

            for (int i = 0; i < 5; i++)
            {
                if (i == 3)
                    continue;

                iValue += " " + i + " ";
            }

            MessageBox.Show(iValue);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            string message = "";
            int x = 3;

            switch (x)
            {
                case 1:
                    message = "You entered 1";
                    break;
                case 2:
                    message = "You entered 2";
                    break;
                case 3:
                    message = "You entered 3";
                    goto case 2;
                default:
                    message = "You entered 4";
                    break;
            }

            MessageBox.Show(message);
        }
    }
}
