using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _6.Abstract
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string text = "";
            Vehicle vc;
            vc = new Bus();
            double busFuel = vc.GetFuelAmount();

            text += "Bus Fuel Amount is: " + busFuel.ToString() + Environment.NewLine;

            vc = new Truck();
            double truckFuel = vc.GetFuelAmount();

            text += "Truck fuel amount is: " + truckFuel.ToString();

            textBox1.Text = text;
        }
    }
}
