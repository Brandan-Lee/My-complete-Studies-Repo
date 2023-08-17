using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _5.Polymorphism
{
    public class Employee
    {
        public int EmployeeID { get; set; }
        public string Name { get; set; }
        public double EmployeeSalary { get; set; }
        
        public void SetValues(int ID)
        {
            EmployeeID = ID;
        }

        public void SetValues(int ID, string EmployeeName)
        {
            EmployeeID = ID;
            Name = EmployeeName;
        }

        public void SetValues(int ID, string employeeName, double salary)
        {
            EmployeeID = ID;
            Name = employeeName;
            EmployeeSalary = salary;
        }
    }
}
