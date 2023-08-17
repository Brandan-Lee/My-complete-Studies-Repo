#Please write a new version of the program in the previous exercise. In addition to the result it should also
#  print out the calculation performed:

# Write your solution here
#create interface
limit = int(input("Limit: "))
#needed variables
count = 1
sum = 1
equation = ""
#loop through program while count smaller to limit and sum smaller than limit
while count < limit and sum < limit:
    count += 1
    sum += count
    equation += f" + {count}"     

print(f"The consecutive sum: 1{equation} = {sum}")

#examples of output
#Limit: 2
# The consecutive sum: 1 + 2 = 3

#Limit: 10
# The consecutive sum: 1 + 2 + 3 + 4 = 10

#Limit: 18
# The consecutive sum: 1 + 2 + 3 + 4 + 5 + 6 = 21
