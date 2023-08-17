#Please write a program which asks the user to type in a string. The program then prints out all the substrings
#  which begin with the first character, from the shortest to the longest.

# Write your solution here
#create interface
string = input("Please type in a string: ")
#create iterator variable
count = 0
#loop through string
while count < len(string):
    print(string[0:count + 1])
    count += 1

#examples of output
#Please type in a string: test
# t
# te
# tes
# test