#Please change the program from the previous exercise so that the user gets to input also the base which is
#  multiplied (in the previous program the base was always 2).

# Write your solution here
#create interface
upper_limit = int(input("Upper limit: "))
base = int(input("Base: "))
#create iterator variable
count = 1
#loop only when count is less than upper limit and times count with base
while count <= upper_limit:
    print(count)
    count *= base

#examples of output
#Upper limit: 27
# Base: 3
# 1
# 3
# 9
# 27

#Upper limit: 1234567 
# Base: 10
# 1
# 10
# 100
# 1000
# 10000
# 100000
# 1000000