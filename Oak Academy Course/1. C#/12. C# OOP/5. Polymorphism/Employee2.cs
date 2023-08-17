using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _5.Polymorphism
{
    public class Employee2
    {
        public int EmployeeID { get; set; }
        public string Name { get; set; }
        public double EmployeeSalary { get; set; }
        public string EmployeePosition { get; set; }

        public virtual string SetValues(int ID, string employeeName, double salary)
        {
            EmployeeID = ID;
            Name = employeeName;
            EmployeeSalary = salary;

            string text = "Employee ID: " + EmployeeID + Environment.NewLine;
            text += "Employee Name: " + Name + Environment.NewLine;
            text += "Employee Salary: " + EmployeeSalary + Environment.NewLine;

            return text;
        }
    }
}
