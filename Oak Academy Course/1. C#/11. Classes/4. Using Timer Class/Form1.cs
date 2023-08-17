﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _4.Using_Timer_Class
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnStart_Click(object sender, EventArgs e)
        {
            timer1.Start();
        }

        private void btnStop_Click(object sender, EventArgs e)
        {
            timer1.Stop();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            progressBar1.Value = counter;
            counter--;

            label1.Text = counter.ToString();
            if (counter == 0)
            {
                timer1.Stop();
                MessageBox.Show("Timer Stop");
            }

            if (counter % 2 == 1)
                btnMessage.BackColor = Color.Red;
            else
                btnMessage.BackColor = Color.White;
            
        }

        int counter = 60;
        private void Form1_Load(object sender, EventArgs e)
        {
            label1.Text = 60.ToString();

        }
    }
}
