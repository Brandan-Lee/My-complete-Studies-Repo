#Please write a program which asks the user for a number. The program then prints out all integer numbers
#  greater than zero but smaller than the input.

# Write your solution here
#create interface
upper_limit = int(input("Upper limit: "))
#create iterator variable
count = 1
#loop through only when count is less than upper_limit
while count > 0 and count < upper_limit:
    print(count)
    #increment iterator variable to not end up in an infinite loop
    count += 1

#examples of output
#Upper limit: 5
# 1
# 2
# 3
# 4