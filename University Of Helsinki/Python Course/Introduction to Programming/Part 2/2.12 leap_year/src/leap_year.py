#Generally, any year that is divisible by four is a leap year. However, if the year is additionally divisible
#  by 100, it is a leap year only if it also divisible by 400.

#Please write a program which asks the user for a year, and then prints out whether that year is a leap year or
#  not.

# Write your solution here
year = int(input("Please enter a year: "))

#if year is divible by 100 and then after divisible by 400. it is a leap year 
if year % 100 == 0:
    if year % 400 == 0:
        print("That year is a leap year")
    #not a leap year
    else:
        print("That year is not a leap year")
#if year is divisible by 4. it is a leap year
elif year % 4 == 0:
    print("That year is a leap year")
#not a leap year
else:
    print("That year is not a leap year")


#examples of output
#Please type in a year: 2011
# That year is not a leap year.

#Please type in a year: 2020
# That year is a leap year.

#Please type in a year: 1800
# That year is not a leap year.