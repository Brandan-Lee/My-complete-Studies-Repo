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

namespace _1.Directory_and
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnCreate_Click(object sender, EventArgs e)
        {
            /*Directory.CreateDirectory("temp");
            DirectoryInfo dr = new DirectoryInfo("temp2");
            dr.Create();
            Directory.CreateDirectory(@"C:\temp3");
            MessageBox.Show("Folder was created");*/

            if (!Directory.Exists("folder2"))
            {
                Directory.CreateDirectory("folder2");
            }

            DirectoryInfo dr = new DirectoryInfo("folder2");
            string accessTime = dr.LastAccessTime.ToString();
            string creationTime = dr.CreationTime.ToString();
            MessageBox.Show(accessTime, creationTime);
        }

        private void btnMove_Click(object sender, EventArgs e)
        {
            Directory.Move("temp", @"C:\Newfolder\temp");
            MessageBox.Show("The folder has been moved");
        }

        private void btnDelete_Click(object sender, EventArgs e)
        {
            Directory.Delete("temp");
        }
    }
}
