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

namespace _2.File_and
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnCreate_Click(object sender, EventArgs e)
        {
            File.Create("firstFile.txt");

            if (!File.Exists("secondFile.txt"))
            {
                FileInfo ourFile = new FileInfo("secondFile.txt");
                ourFile.Create();
            }
        }

        private void btnDelete_Click(object sender, EventArgs e)
        {
            if (File.Exists("firstFile.txt") || File.Exists("secondFile.txt"))
            {
                File.Delete("firstFile.txt");
                File.Delete("secondFile.txt");
            }
        }

        private void btnWrite_Click(object sender, EventArgs e)
        {
            FileStream fs = new FileStream("third.txt", FileMode.OpenOrCreate, FileAccess.Write);
            StreamWriter sw = new StreamWriter(fs);

            sw.WriteLine("this is the first line");
            sw.WriteLine("this is the second line");
            sw.Flush();

            sw.Close();
            fs.Close();
        }

        private void btnRead_Click(object sender, EventArgs e)
        {
            FileStream fs = new FileStream("third.txt", FileMode.OpenOrCreate, FileAccess.Read);
            StreamReader sr = new StreamReader(fs);
            string text = "";
            while (!sr.EndOfStream)
            {
                text += sr.ReadLine() + Environment.NewLine;
            }

            fs.Close();
            sr.Close();
            textBox1.Text = text;
        }

        private void btnCopy_Click(object sender, EventArgs e)
        {
            File.Copy("secondFile.txt", @"C:\temp1\secondFile.txt");
        }

        private void btnProperty_Click(object sender, EventArgs e)
        {
            FileInfo ourFile = new FileInfo("secondFile.txt");
            string name = ourFile.Name;
            string fullName = ourFile.FullName;
            string lastAccessTime = ourFile.LastAccessTime.ToString();
            MessageBox.Show(name + Environment.NewLine + fullName + Environment.NewLine + lastAccessTime);
        }
    }
}
