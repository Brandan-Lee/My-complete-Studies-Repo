﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _6.Radiobutton
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            radioButton1.Checked = false;
            bool control = radioButton1.Checked;
        }

        private void RadioButton1_CheckedChanged(object sender, EventArgs e)
        {
            MessageBox.Show("checked changed");
        }
    }
}
