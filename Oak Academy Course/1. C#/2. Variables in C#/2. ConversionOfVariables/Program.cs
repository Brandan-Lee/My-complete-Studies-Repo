using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConversionOfVariables
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Implicit casting
            byte x = 12;
            short y = 13;
            int z = 4;
            long t = 5;
            float k = 6;
            y = x;
            z = y;
            x = y; //wrong
            y = z; //wrong
z = x;      //Explicit casting
            double x = 24;
            int y;
            y = (int)x;
            y = Convert.ToInt32(x);
            //convert to string
            double x = 24;
            int y = 12;
            float z = 6;
            char t = "+";
            string s = x.ToString();
            s = y.ToString();
            s = z.ToString();
            s = t.ToString();
            Console.WriteLine(s);
            Console.ReadKey();
        }
    }
}
