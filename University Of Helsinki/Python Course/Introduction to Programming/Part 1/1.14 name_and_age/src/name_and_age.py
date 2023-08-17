#Please write a program which asks the user for their name and year of birth. The program then prints out a message as follows:

#Sample output
# What is your name? Frances Fictitious
# Which year were you born? 1990
# Hi Frances Fictitious, you will be 31 years old at the end of the year 2021

# Write your solution here
name = input("What is your name? ")
year = int(input("What year were you born? "))
#subtract current year from year that was born to get age
age = 2021 - year
print(f"Hi {name}, you will be {age} years old at the end of the year 2021")

#examples of output
#What is your name? Brandan
# What year were you born? 2001
# Hi Brandan, you will be 20 years old at the end of the year 2021