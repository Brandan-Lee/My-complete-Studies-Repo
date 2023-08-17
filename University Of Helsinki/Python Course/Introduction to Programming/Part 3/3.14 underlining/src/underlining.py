#Please write a program which asks the user for strings using a loop. The program prints out each string
#  underlined as shown in the examples below. The execution ends when the user inputs an empty string - that
#  is, just presses Enter at the prompt.

# Write your solution here
#iterator variable
count = 1
#loop through program until user enters an empty string
while count > 0:
    #create interface
    string = input("Please type in a string: ")
    #check to see if string is empty, else print string and underline it
    if string == "":
        break
    else: 
        print(string)
        print("-" * len(string))
    #increment count variable
    count += 1

#examples of output
#Please type in a string: Hi there!
# Hi there!
# ---------
# Please type in a string: This is a test
# This is a test
# --------------
# Please type in a string: a
# a
# -
# Please type in a string: