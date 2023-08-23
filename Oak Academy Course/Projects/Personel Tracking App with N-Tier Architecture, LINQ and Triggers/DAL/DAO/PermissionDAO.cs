using DAL.DTO;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Security;
using System.Text;
using System.Threading.Tasks;

namespace DAL.DAO
{
    public class PermissionDAO : EmployeeContext
    {
        public static void AddPermission(PERMISSION permission)
        {
			try
			{
				db.PERMISSIONs.InsertOnSubmit(permission);
				db.SubmitChanges();
			}
			catch (Exception ex)
			{
				throw ex;
			}
        }

        public static List<PermissionDetailDTO> GetPermissions()
        {
            List<PermissionDetailDTO> permissionList = new List<PermissionDetailDTO>();

            var list = (from p in db.PERMISSIONs
                        join s in db.PERMISSIONSTATEs on p.PermissionState equals s.ID
                        join e in db.EMPLOYEEs on p.EmployeeID equals e.ID
                        select new
                        {
                            userNo = e.UserNo,
                            name = e.Name,
                            surname = e.Surname,
                            stateName = s.StateName,
                            stateID = p.PermissionState,
                            startDate = p.PermissionStartDate,
                            endDate = p.PermissionEndDate,
                            employeeID = p.EmployeeID,
                            permissionID = p.ID,
                            explanation = p.PermissionExplanation,
                            dayAmount = p.PermissionDay,
                            departmentID = e.DepartmentID,
                            positionID = e.PositionID,
                        }).OrderBy(x => x.startDate).ToList();

            foreach (var item in list)
            {
                PermissionDetailDTO dto = new PermissionDetailDTO();

                dto.UserNo = item.userNo;
                dto.Name = item.name;
                dto.Surname = item.surname;
                dto.StateName = item.stateName;
                dto.State = item.stateID;
                dto.StartDate = item.startDate;
                dto.EndDate = item.endDate;
                dto.EmployeeID = item.employeeID;
                dto.PermissionID = item.permissionID;
                dto.Explanation = item.explanation;
                dto.PermissionDayAmount = item.dayAmount;
                dto.DepartmentID = item.departmentID;
                dto.PositionID = item.positionID;

                permissionList.Add(dto);
            }

            return permissionList;
        }

        public static List<PERMISSIONSTATE> GetStates()
        {
            return db.PERMISSIONSTATEs.ToList();
        }
    }
}
