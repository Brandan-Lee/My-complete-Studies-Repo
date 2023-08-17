using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _2.Static_Using
{
    class Student
    {
        public static int StudentNumber { get; set; }

        public static void GetAddNote()
        {
            MessageBox.Show("static");
        }
    }
}
