using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _5.Polymorphism
{
    public class Teacher : Employee
    {
        public string EmployeePosition { get; set; }

        public string GetValues()
        {
            string text = "Employee ID: " + EmployeeID + Environment.NewLine;
            text += "Employee Name: " + Name + Environment.NewLine;
            text += "Employee Salary: " + EmployeeSalary + Environment.NewLine;
            text += "Employee Position: " + EmployeePosition;

            return text;
        }

        public void SetValues(int ID, string employeeName, double salary, string position)
        {
            EmployeeID = ID;
            Name = employeeName;
            EmployeeSalary = salary;
            EmployeePosition = position;
        }
    }
}
