using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _7.Nested_Class
{
    class OutClass
    {
        public static int OutClasVariable { get; set; }
        public int NonStaticVariable { get; set; }
        
        public void OutClassMethod() { }

        public class InClass
        {
            public void INClassMethod() 
            {
                int staticVariable = OutClass.OutClasVariable;
            }
        }
    }
}
