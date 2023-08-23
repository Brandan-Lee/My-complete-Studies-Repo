﻿using DAL.DTO;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DAL.DAO
{
    public class EmployeeDAO : EmployeeContext
    {
        public static void AddEmployee(EMPLOYEE employee)
        {
			try
			{
				db.EMPLOYEEs.InsertOnSubmit(employee);
				db.SubmitChanges();
			}
			catch (Exception ex)
			{
				throw ex;
			}
        }

        public static List<EmployeeDetailDTO> GetEmployees()
        {
			try
			{
				List<EmployeeDetailDTO> employeeList = new List<EmployeeDetailDTO>();

				var list = (from e in db.EMPLOYEEs
							join d in db.DEPARTMENTs on e.DepartmentID equals d.ID
							join p in db.POSITIONs on e.PositionID equals p.ID
							select new
							{
								employeeID = e.ID,
								userNo = e.UserNo,
								name = e.Name,
								surname = e.Surname,
								departmentName = d.DepartmentName,
								positionName = p.PositionName,
								departmentID = e.DepartmentID,
								positionID = e.PositionID,
								salary = e.Salary,
								isAdmin = e.IsAdmin,
								password = e.Password,
								imagePath = e.ImagePath,
								adress = e.Adress,
								birthday = e.Birthday

							}).OrderBy(x => x.userNo).ToList();

				foreach (var item in list)
				{
					EmployeeDetailDTO dto = new EmployeeDetailDTO();

					dto.EmployeeID = item.employeeID;
					dto.UserNo = item.userNo;
					dto.Name = item.name;
					dto.Surname = item.surname;
					dto.DepartmentName = item.departmentName;
					dto.PositionName = item.positionName;
					dto.DepartmentID = item.departmentID;
					dto.PositionID = item.positionID;
					dto.Salary = item.salary;
					dto.IsAdmin = item.isAdmin;
					dto.Password = item.password;
					dto.ImagePath = item.imagePath;
					dto.Adress = item.adress;
					dto.Birthday = item.birthday;

					employeeList.Add(dto);
				}

				return employeeList;
			}
			catch (Exception ex)
			{
				throw ex;
			}
        }

        public static List<EMPLOYEE> GetEmployees(int v, string text)
        {
			try
			{
				List<EMPLOYEE> list = db.EMPLOYEEs.Where(x => x.UserNo == v && x.Password == text).ToList();
				return list;
			}
			catch (Exception ex)
			{
				throw ex;
			}
        }

        public static List<EMPLOYEE> GetUsers(int v)
        {
            return db.EMPLOYEEs.Where(x => x.UserNo == v).ToList();
        }
    }
}
