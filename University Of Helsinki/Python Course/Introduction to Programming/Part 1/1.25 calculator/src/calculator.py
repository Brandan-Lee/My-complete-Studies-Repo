#Please write a program which asks the user for two numbers and an operation. If the operation is add, multiply
#  or subtract, the program should calculate and print out the result of the operation with the given numbers.
#  If the user types in anything else, the program should print out nothing.

# Write your solution here
num1 = int(input("Number 1: "))
num2 = int(input("Number 2: "))
operation = input("Operation: ")

#check to see if operation is add (add num1 and 2 together), multiply (multiply num1 and 2 with each other),
#subtract (subtract num1 from 2)
if operation == "add":
    add = num1 + num2
    print(f"{num1} + {num2} = {add}")
elif operation == "multiply":
    multiply = num1 * num2
    print(f"{num1} * {num2} = {multiply}")
elif operation == "subtract":
    subtract = num1 - num2
    print(f"{num1} - {num2} = {subtract}")

#examples of output
#add
#Number 1: 10
# Number 2: 17
# Operation: add
# 10 + 17 = 27

#multiply
# Number 1: 4
# Number 2: 6
# Operation: multiply
# 4 * 6 = 24

#subtract
#Number 1: 4
# Number 2: 6
# Operation: subtract
# 4 - 6 = -2