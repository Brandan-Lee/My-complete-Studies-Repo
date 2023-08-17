#Please write a program which asks for the user's name. If the name is anything but "Jerry", the program then
#  asks for the number of portions and prints out the total cost. The price of a single portion is 5.90.

# Write your solution here
name = input("Please tell me your name: ")

#check to see if the person is Jerry. if it is jerry, ask for the next person. if not, ask for the amount of
#portions of soup and display total cost
if name == "Jerry":
    print("Next please!")
else:
    portions_soup = int(input("How many portions of soup? "))
    total = portions_soup * 5.90 #1 portion of soup is 5.90
    print(f"The total cost is {total}")
    print("Next please!")

#examples of output
#if input is Jerry
#Please tell me your name: Jerry
# Next please!

#if input is not Jerry
#Please tell me your name: Kraner
# How many portions of soup? 2
# The total cost is 11.8
# Next please!