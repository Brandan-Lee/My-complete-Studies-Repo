#Please write a program which asks the user for a string and then prints it out so that exactly 20 characters
#  are displayed. If the input is shorter than 20 characters, the beginning of the line is filled in with *
#  characters.

#You may assume the input string is at most 20 characters long.

# Write your solution here
string = input("Please type in a string: ")
#needed variable. find out how many stars is needed
stars = 20 - len(string)
#check if input is less than 20 characters long
if len(string) < 20:
    print("*" * stars + string)
else:
    print(string)

#examples of output
#Please type in a string: python
# **************python

#Please type in a string: alongerstring
# *******alongerstring

#Please type in a string: averyverylongstring
# *averyverylongstring
    