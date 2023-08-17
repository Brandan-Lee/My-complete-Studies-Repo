#Please write a program which asks the user for an integer number. If the number is less than zero, the program
#  should print out the number multiplied by -1. Otherwise the program prints out the the number as is.

# Write your solution here
number = int(input("Please type in a number: "))

#check to see if number is less than 0. If so, multiply by -1
if number < 0:
    print(f"The absolute value of this number is {number * -1}")
else:
    print(f"The absolute value of this number is {number}")

#examples of output
#negative value given
#Please type in a number: -99
# The absolute value of this number is 99

#positive value given
#Please type in a number: 1
#The absolute value of this number is 1