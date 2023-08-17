using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _5.Polymorphism
{
    public class Teacher2 : Employee2
    {
        public override string SetValues(int ID, string employeeName, double salary)
        {
            EmployeeID = ID;
            Name = employeeName;
            EmployeeSalary = salary;
            EmployeePosition = "Software Developer";

            string text = "Employee ID: " + EmployeeID + Environment.NewLine;
            text += "Employee Name: " + Name + Environment.NewLine;
            text += "Employee Salary: " + EmployeeSalary + Environment.NewLine;
            text += "Employee Position: " + EmployeePosition;

            return text;
        }
    }
}
