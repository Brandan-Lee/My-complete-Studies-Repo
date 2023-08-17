#The program below has some syntactic issues:

# Fix the program
#print("Are you ready?")
#number = int(input("Please type in a number: "))
#while number = 0: 
#print(number)
#print("Now!")

#create interface
print("Are you ready?")
number = int(input("Please type in a number: "))
#set count = number because we're counting down from number to 0
count = number

#loop through on condition that count is greater than 0
while count > 0:
    print(count)
    count -= 1

print("Now!")

#examples of output
#Are you ready?
# Please type in a number: 5
# 5
# 4
# 3
# 2
# 1
# Now!

