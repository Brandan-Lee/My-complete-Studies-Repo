#Please write a program which asks for the hourly wage, hours worked, and the day of the week. The program 
# should then print out the daily wages, which equal hourly wage multiplied by hours worked, except on Sundays
#  when the hourly wage is doubled.

# Write your solution here
hourly_wage = float(input("Hourly wage: "))
hours_worked = int(input("Hours worked: "))
day_of_the_week = input("Day of the week: ")

#check to see if the day is Sunday. If it is, then hourly wage has to be doubled when working out the daily wages
if day_of_the_week == "Sunday":
    total = (hourly_wage * 2) * hours_worked
else:
    total = hourly_wage * hours_worked

print(f"Daily wages: {total} euros")

#examples of outputs
#if day is not sunday
#Hourly wage: 8.5
# Hours worked: 3
# Day of the week: Monday
# Daily wages: 25.5 euros

#if day of the week is Sunday
#Hourly wage: 12.5
# Hours worked: 10
# Day of the week: Sunday
# Daily wages: 250.0 euros