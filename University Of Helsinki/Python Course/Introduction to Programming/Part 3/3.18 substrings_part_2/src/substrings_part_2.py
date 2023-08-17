#Please write a program which asks the user to type in a string. The program then prints out all the substrings
#  which end with the last character, from the shortest to the longest.

# Write your solution here
#create interface
string = input("Please type in a string: ")
#create iterator variable
i = len(string) - 1
#loop through string while i is greater and equal to 0
while i >= 0:
    print(string[i:])
    i -= 1

#examples of output
#Please type in a string: test
# t
# st
# est
# test
