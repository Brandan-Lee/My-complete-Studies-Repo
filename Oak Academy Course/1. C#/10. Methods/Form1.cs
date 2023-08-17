using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Methods
{ 
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        public void HideRadioButtons()
        {
            groupBox1.Visible = false;
        }

        public void ClearAllText()
        {
            textBox1.Clear();
            textBox2.Clear();
        }

        public void FillTextBox(string text)
        {
            textBox2.Text = text;
        }

        public void SetNumber(int age)
        {
            label1.Text = "You are " + age.ToString() + " years old.";
        }

        string GetName()
        {
            string name = "Brandan-Lee";
            return name;
        }

        int Sum(int x, int y)
        {
            int result = x + y;
            return result;
        }

        string ValueControl()
        {
            string text = "";
            return text;
        }

        string ValueControl(string name)
        {
            string text = "";
            return text;
        }

        string ValueControl(string name, bool control)
        {
            string text = "";
            return text;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            /*HideRadioButtons();
            ClearAllText();*/
            /*FillTextBox(textBox1.Text);
            SetNumber(21);*/
            /*string name = GetName();
            MessageBox.Show(name); */
            /*int result = Sum(Convert.ToInt32(textBox1.Text), Convert.ToInt32(textBox2.Text));
            MessageBox.Show(result.ToString());*/
            string name = ValueControl();
            string name1 = ValueControl("Brandan-Lee");
            string name2 = ValueControl("Brandan-Lee", true);

            MessageBox.Show(name);
            MessageBox.Show(name1);
            MessageBox.Show(name2);
        }
    }
}
