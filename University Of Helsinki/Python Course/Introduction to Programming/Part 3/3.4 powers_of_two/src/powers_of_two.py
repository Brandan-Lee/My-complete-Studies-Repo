#Please write a program which asks the user to type in an upper limit. The program then prints out numbers so
#  that each subsequent number is the previous one doubled, starting from the number 1. That is, the program
#  prints out powers of two in order.

#The execution of the program finishes when the next number to be printed would be greater than the limit set
#  by the user. No numbers greater than the limit should be printed.

# Write your solution here
#create interface
upper_limit = int(input("Upper limit: "))
#create iterator variable
count = 1
#execute loop when each next number is the answer of the previous number to the power of two and that it is less
#than the upper limit
while count <= upper_limit:
    print(count)
    count *= 2

#examples of output
#Upper limit: 8
# 1
# 2
# 4
# 8

#Upper limit: 20
# 1
# 2
# 4
# 8
# 16

#Upper limit: 100
# 1
# 2
# 4
# 8
# 16
# 32
# 64
    