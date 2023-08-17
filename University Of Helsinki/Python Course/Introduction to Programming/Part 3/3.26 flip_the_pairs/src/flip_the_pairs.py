#Please write a program which asks the user to type in a number. The program then prints out all the positive
#  integer values from 1 up to the number. However, the order of the numbers is changed so that each pair or
#  numbers is flipped. That is, 2 comes before 1, 4 before 3 and so forth.

# Write your solution here
#create interface
number = int(input("Please type in a number: "))
#create helper variable
a = 1
#loop while number > 0
while a <= number:
    if a + 1 <= number:
        print(a + 1)
    print(a)
    a = a + 2

#examples of output
#Please type in a number: 5
# 2
# 1
# 4
# 3
# 5

#Please type in a number: 6
# 2
# 1
# 4
# 3
# 6
# 5

