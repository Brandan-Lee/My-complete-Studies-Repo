using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _15.Delegate_Using
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        public delegate void FillTextBox(int x);
        string textValue = "";

        public void FillMathNote(int examNote)
        {
            textValue += "Your Math note is: " + examNote + Environment.NewLine;
        }

        public void FillChemistryNote(int examNote)
        {
            textValue += "Your Chemistry note is: " + examNote + Environment.NewLine;
        }

        public void ShowInTextbox()
        {
            textBox1.Text = textValue;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            FillTextBox fillText = new FillTextBox(FillMathNote);
            fillText += FillChemistryNote;
            fillText.Invoke(80);
            fillText -= FillMathNote;
            fillText(60);
            ShowInTextbox();
        }
    }
}
