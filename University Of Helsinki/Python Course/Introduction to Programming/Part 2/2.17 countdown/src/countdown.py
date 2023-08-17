#This program should print out a countdown.

#number = 5
# print("Countdown!")
# while True:
#   print(number)
#   number = number - 1
#   if number > 0: #must be at the top of code block. if num < 0
#     break

#print("Now!")

#Write your solution here
#declare countdown number
number = 5
#create interface
print("Countdown!")
#create loop to iterate while condition is true
while True:
  #if num <= 0 break, else print number and - 1 from number 
  if number <= 0:
    print("Now!")
    break
  else:
    print(number)
    number -= 1
  
#examples of output
#Countdown!
# 5
# 4
# 3
# 2
# 1
# Now!
