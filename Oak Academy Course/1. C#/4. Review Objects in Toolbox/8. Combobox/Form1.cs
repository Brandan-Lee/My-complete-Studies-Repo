using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _8.Combobox
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            comboBox1.Items.Add("Wednesday");
            comboBox1.Items.Add("Thursday");
            comboBox1.Items.Add("Friday");
            /*comboBox1.SelectedIndex = 0;*/
        }

        private void button1_Click(object sender, EventArgs e)
        {
            /*string selectedItem = comboBox1.SelectedItem.ToString();
            MessageBox.Show(selectedItem);*/
            
            int valueOrder = comboBox1.SelectedIndex;
            MessageBox.Show(valueOrder.ToString());
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            label1.Text = "combobox selected index was changed";
        }

        private void comboBox1_SelectedValueChanged(object sender, EventArgs e)
        {
            label2.Text = "combobox selected value changed";
        }
    }
}
