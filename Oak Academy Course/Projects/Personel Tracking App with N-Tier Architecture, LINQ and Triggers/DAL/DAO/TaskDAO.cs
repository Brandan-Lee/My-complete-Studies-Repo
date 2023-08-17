using DAL.DTO;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DAL.DAO
{
    public class TaskDAO : EmployeeContext
    {
        public static void AddTask(TASK task)
        {
            try
            {
                db.TASKs.InsertOnSubmit(task);
                db.SubmitChanges();
            }
            catch (Exception ex)
            {
                throw ex;
            }
        }

        public static List<TaskDetailDTO> GetTasks()
        {
            try
            {
                List<TaskDetailDTO> taskList = new List<TaskDetailDTO>();

                var list = (from t in db.TASKs
                            join s in db.TASKSTATEs on t.TaskState equals s.ID
                            join e in db.EMPLOYEEs on t.EmployeeID equals e.ID
                            join d in db.DEPARTMENTs on e.DepartmentID equals d.ID
                            join p in db.POSITIONs on e.PositionID equals p.ID
                            select new
                            {
                                employeeID = t.EmployeeID,
                                userNo = e.UserNo,
                                name = e.Name,
                                surname = e.Surname,
                                departmentName = d.DepartmentName,
                                positionName = p.PositionName,
                                departmentID = e.DepartmentID,
                                positionID = e.PositionID,
                                taskID = t.ID,
                                title = t.TaskTitle,
                                content = t.TaskContent,
                                taskStateName = s.StateName,
                                startDate = t.TaskStartDate,
                                deliveryDate = t.TaskDeliveryDate,
                                taskStateID = t.TaskState
                            }).OrderBy(x => x.startDate).ToList();

                return taskList;
            }
            catch (Exception ex)
            {

                throw;
            }
        }

        public static List<TASKSTATE> GetTaskStates()
        {
            return db.TASKSTATEs.ToList();
        }
    }
}
