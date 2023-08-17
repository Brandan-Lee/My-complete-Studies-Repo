using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _3.Breakpoints
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnCalculate_Click(object sender, EventArgs e)
        {
            double midtermExam, finalExam, GPT;

            midtermExam = Convert.ToDouble(txtMidterm.Text);
            finalExam = Convert.ToDouble(txtFinal.Text);
            GPT = midtermExam * 0.4 + finalExam * 0.6;

            txtGPT.Text = GPT.ToString();
        }
    }
}
