#Please write a program which asks the user for a positive integer N. The program then prints out all
#  numbers between -N and N inclusive, but leaves out the number 0. Each number should be printed on a
#  separate line.

# Write your solution here
#create interface
num = int(input("Please type in a positive integer: "))
#start at negative num, end at num
for i in range(-num, num + 1):
    #this ensures that 0 is not printed
    if i != 0:
        print(i)

#example of output
# -4
# -3
# -2
# -1
# 1
# 2
# 3
# 4