using DAL.DTO;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using DAL.DAO;
using DAL;

namespace BLL
{
    public class TaskBLL
    {
        public static void AddTask(TASK task)
        {
            TaskDAO.AddTask(task);
        }

        public static void DeleteTask(int taskID)
        {
            TaskDAO.DeleteTask(taskID);
        }

        public static TaskDTO GetAll()
        {
            TaskDTO taskDto = new TaskDTO();

            taskDto.Employees = EmployeeDAO.GetEmployees();
            taskDto.Departments = DepartmentDAO.GetDepartments();
            taskDto.Positions = PositionDAO.GetPositions();
            taskDto.TaskStates = TaskDAO.GetTaskStates();
            taskDto.Tasks = TaskDAO.GetTasks();

            return taskDto;
        }

        public static void UpdateTask(TASK task)
        {
            TaskDAO.UpdateTask(task);
        }

        public static void UpdateTask(int taskID, int approved)
        {
            TaskDAO.UpdateTask(taskID, approved);
        }

        public static void UpdateTaskNonAdmin(int taskID, int delivered)
        {
            TaskDAO.UpdateTaskNonAdmin(taskID, delivered);
        }
    }
}
