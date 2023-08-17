#Please write a program which asks the user for a positive integer number. The program then prints out a list
#  of multiplication operations until both operands reach the number given by the user. See the examples below
#  for details:

# Write your solution here
number = int(input("Please type in a number: "))
#helper variables
a = 1
b = 1
#loop while b <= number
while a <= number:
    #nested loop: while a <= number
    while b <= number:
        print(f"{a} x {b} = {a * b}")
        b += 1
    a += 1
    b = 1

#examples of output
#Please type in a number: 2
# 1 x 1 = 1
# 1 x 2 = 2
# 2 x 1 = 2
# 2 x 2 = 4

#Please type in a number: 3
# 1 x 1 = 1
# 1 x 2 = 2
# 1 x 3 = 3
# 2 x 1 = 2
# 2 x 2 = 4
# 2 x 3 = 6
# 3 x 1 = 3
# 3 x 2 = 6
# 3 x 3 = 9