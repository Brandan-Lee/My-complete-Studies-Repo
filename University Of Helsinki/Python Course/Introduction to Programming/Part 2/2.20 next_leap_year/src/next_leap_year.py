#Please write a program which asks the user for a year, and prints out the next leap year.

# Write your solution here
#create interface
year = int(input("Year: "))
#helper variable
next_year = year + 1


#run loop, if year is a leap year add 4. if not find the next leap year
while True:
    #determine that next year is a leap year
    if next_year % 100 == 0:
        if next_year % 400 == 0:
            break
    elif next_year % 4 == 0:
        break
    #not a leap year. add a leap year by next year
    next_year += 1

#print output
print(f"The next leap year after {year} is {next_year}")

#examples of output
#Year: 2023
# The next leap year after 2023 is 2024

#Year: 2024
# The next leap year after 2024 is 2028


