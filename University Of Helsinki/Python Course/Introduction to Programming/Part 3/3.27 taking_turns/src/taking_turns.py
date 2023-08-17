#Please write a program which asks the user to type in a number. The program then prints out the positive
#  integers between 1 and the number itself, alternating between the two ends of the range 

# Write your solution here
#create interface
number = int(input("Please type in a number: "))
#create helper variable
a = 1
b = number
#loop while a <= number and when number is greater than a
while a != b and b > a:
    print(a)
    print(b)
    a += 1
    b -= 1
#if number has an uneven number... only print out number that is left when b is not greater than a
if number % 2 != 0:
    print(a) 

#examples of output
#Please type in a number: 5
# 1
# 5
# 2
# 4
# 3

#Please type in a number: 6
# 1
# 6
# 2
# 5
# 3
# 4