#Please write a program which asks the user to type in a limit. The program then calculates the sum of
#  consecutive numbers (1 + 2 + 3 + ...) until the sum is at least equal to the limit set by the user.

# Write your solution here
#create interface
limit = int(input("Limit: "))
#create iterator variable
count = 1
sum = 0
#run loop while count is less than limit
while count <= limit:
    #check if the total of sum is less than the limit
    if sum < limit:
        sum += count
    #increment count
    count += 1
    
print(sum)

#examples of output
#Limit: 2
# 3

#Limit: 10
# 10

#Limit: 18
# 21