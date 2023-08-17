#Please write a program which asks the user for an integer number. The program should then print out the
#  magnitude of the number

# Write your solution here
number = int(input("Please enter a number: "))

#check to see if number is less than 1000
if number < 1000:
    print("This number is smaller than 1000")
#check to see if number is less than 100 
if number < 100:
    print("This number is smaller than 100")
#check to see if number is less than 10
if number < 10:
    print("This number is smaller than 10")

print("Thank you!")

#examples of output
#if number is less than 1000
#Please enter a number: 950
# This number is smaller than 1000
#Thank you!

#if number is less than 100
#Please enter a number: 59
# This number is smaller than 1000
# This number is smaller than 100
#Thank you!

#if number is less than 10
#Please enter a number: 2
# This number is smaller than 1000
# This number is smaller than 100
# This number is smaller than 10
#Thank you!

#if number is greater than 1000
#Please enter a number: 1123
# Thank you!