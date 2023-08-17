using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _2.Using_List_Class
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        List<int> numberList = new List<int>();
        List<string> textList = new List<string>();
        List<Employee> employeeList = new List<Employee>();

        public List<Employee> FillList()
        {
            /*numberList.Add(1);
            numberList.Add(2);
            numberList.Add(3);*/

            employeeList.Clear();

            Employee employee1 = new Employee();
            employee1.ID = 1;
            employee1.Name = "Brandan-Lee";
            employee1.Surname = "Sherbrooke";
            employeeList.Add(employee1);

            Employee employee2 = new Employee();
            employee2.ID = 2;
            employee2.Name = "Angelique";
            employee2.Surname = "Sherbrooke";
            employeeList.Add(employee2);

            Employee employee3 = new Employee();
            employee3.ID = 3;
            employee3.Name = "Maggie";
            employee3.Surname = "Sherbrooke";
            employeeList.Add(employee3);

            return employeeList;
        }

        List<days> comboList = new List<days>();

        private void Form1_Load(object sender, EventArgs e)
        {
            days day1 = new days();
            day1.ID = 1;
            day1.textValue = "Sunday";
            comboList.Add(day1);
            days day2 = new days();
            day2.ID = 2;
            day2.textValue = "Monday";
            comboList.Add(day2);
            days day3 = new days();
            day3.ID = 3;
            day3.textValue = "Tuesday";
            comboList.Add(day3);
            days day4 = new days();
            day4.ID = 4;
            day4.textValue = "Wednesday";
            comboList.Add(day4);
            days day5 = new days();
            day5.ID = 5;
            day5.textValue = "Thursday";
            comboList.Add(day5);
            days day6 = new days();
            day6.ID = 6;
            day6.textValue = "Friday";
            comboList.Add(day6);
            comboList.Add(new days()
            {
                ID = 7,
                textValue = "Saturday"
            });

            cmbDays.DataSource = comboList;
            cmbDays.ValueMember= "ID";
            cmbDays.DisplayMember = "textValue";

            dayList.DataSource = comboList;
        }

        private void btnFillList_Click(object sender, EventArgs e)
        {
            FillList();

            foreach (var item in employeeList)
            {
                txtNumber.Text += item.ID + " " + item.Name + " " + item.Surname + Environment.NewLine;
            }
        }

        private void cmbDays_SelectedIndexChanged(object sender, EventArgs e)
        {
            /*MessageBox.Show(cmbDays.SelectedValue.ToString());*/
        }
    }
}
