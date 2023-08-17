using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _2.Buttons
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            firstButton.Text = "changed";
        }

        private void firstButton_Click(object sender, EventArgs e)
        {
            firstButton.Text = "clicked";
        }

        private void firstButton_KeyPress(object sender, KeyPressEventArgs e)
        {
            firstButton.Text = "Enter";
        }
    }
}
