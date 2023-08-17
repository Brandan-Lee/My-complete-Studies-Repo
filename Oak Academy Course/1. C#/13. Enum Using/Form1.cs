using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Enum_Using
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        enum colors { red, blue, white, black, yellow = 7, purple, brown, orange };

        private void button1_Click(object sender, EventArgs e)
        {
            string text = "Red: " + (int)colors.red + Environment.NewLine;
            text += "Blue: " + (int)colors.blue + Environment.NewLine;
            text += "White: " + (int)colors.white + Environment.NewLine;
            text += "Black: " + (int)colors.black + Environment.NewLine;
            text += "Yellow: " + (int)colors.yellow + Environment.NewLine;
            text += "Purple: " + (int)colors.purple + Environment.NewLine;
            text += "Brown: " + (int)colors.brown + Environment.NewLine;
            text += "Orange: " + (int)colors.orange;

            textBox1.Text = text;
        }
    }
}
