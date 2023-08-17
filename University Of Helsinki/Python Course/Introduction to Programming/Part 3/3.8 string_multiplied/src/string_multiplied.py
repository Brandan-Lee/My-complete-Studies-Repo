#Please write a program which asks the user for a string and an amount. The program then prints out the string
#  as many times as specified by the amount. The printout should all be on one line, with no extra spaces or
#  symbols added.

# Write your solution here
#create interface
string = input("Please type in a string: ")
amount = int(input("Please type in an amount: "))

#print the string the amount amount of times
print(string * amount)

#example of output
#Please type in a string: hiya
# Please type in an amount: 4
# hiyahiyahiyahiya