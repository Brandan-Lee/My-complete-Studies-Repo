using _1.First_MVC_Project.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace _1.First_MVC_Project.Controllers
{
    public class EmployeeController : Controller
    {
        // GET: Employee
        public ActionResult Index()
        {
            List<Employee> employeeList = new List<Employee>();

            Employee employee = new Employee();
            employee.ID = 1;
            employee.Name = "Charles";
            employee.Salary = 5000;
            employeeList.Add(employee);

            Employee emp2 = new Employee();
            emp2.ID = 2;
            emp2.Name = "Bernard";
            emp2.Salary = 4000;
            employeeList.Add(emp2);

            ViewData["Age"] = 20;
            ViewBag.Job = "Engineer";
            string company2 = "Oak";
            TempData["Company"] = company2;

            return View(employeeList);
        }

        public JsonResult GetDateWithJSON()
        {
            string JsonDate = DateTime.Today.ToShortDateString();
            return Json(JsonDate);
        }

        public ActionResult AddEmployee()
        {
            Employee employee = new Employee();
            return View(employee);
        }

        [HttpPost]
        public ActionResult AddEmployee(Employee employee)
        {
            string textValue = "";

            if (ModelState.IsValid)
                textValue = "Model state is valid";
            else
                textValue = "Model state is not valid";

            return View(employee);
        }

        public ActionResult UpdateEmployee()
        {
            Employee employee = new Employee();
            employee.ID = 1;
            string company = (string)TempData["Company"];
            employee.Name = company;
            employee.Salary = 1000;
            return View(employee);
        }

        [HttpPost]
        public ActionResult UpdateEmployee(Employee employee)
        {
            return View(employee);
        }
    }
}