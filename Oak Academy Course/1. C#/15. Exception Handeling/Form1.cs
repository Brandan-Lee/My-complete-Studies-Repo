using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _16.Exception_Handeling
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                int result = Convert.ToInt32(txtFirstNumber.Text) / Convert.ToInt32(txtSecondNumber.Text);
            }
            catch (DivideByZeroException ex)
            {
                throw new Exception("You cannot divide any number by zero");
            }
            catch (Exception ex)
            {
                throw new Exception("Please use only numbers");
            }
            finally
            {
                MessageBox.Show("Program was finished");
            }
        }
    }
}
