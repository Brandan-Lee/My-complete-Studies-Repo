using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace _3.Path_Class
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnShow_Click(object sender, EventArgs e)
        {
            string ourFile = @"C:\temp1\1.jpg";
            textBox1.Text = Path.GetDirectoryName(ourFile) + Environment.NewLine;
            textBox1.Text += Path.GetExtension(ourFile) + Environment.NewLine;
            textBox1.Text += Path.GetFileName(ourFile) + Environment.NewLine;
            textBox1.Text += Path.GetFileNameWithoutExtension(ourFile) + Environment.NewLine;
            textBox1.Text += Path.GetPathRoot(ourFile) + Environment.NewLine;
            textBox1.Text += Path.GetFullPath(ourFile) + Environment.NewLine;
        }
    }
}
