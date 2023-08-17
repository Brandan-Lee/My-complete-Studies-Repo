using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ReviewingToolbox
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            /*string messageText = "Simple message text";
            MessageBox.Show(messageText);*/
            //MessageBox.Show("Simple message text");

            //give message box a title
            /*string message = "Do you want to close this window?";
            string messageTitle = "Close window";
            MessageBoxButtons buttons = MessageBoxButtons.YesNo;
            DialogResult result = MessageBox.Show(message, messageTitle, buttons);

            if (result == DialogResult.Yes)
            {
                this.Close();
            }
            else if (result == DialogResult.No)
            {
                //do nothing
            }*/

            //give icon to message box
            string message = "Did you see icon?";
            string title = "ok";
            MessageBox.Show(message, title, MessageBoxButtons.YesNo, MessageBoxIcon.Information);
        }
    }
}
