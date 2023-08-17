#Please write a program which asks the user for a string. The program then prints out the input string in
#  reversed order, from end to beginning. Each character should be on a separate line.

# Write your solution here
#create interface
input_string = input("Please type in a string: ")
#find length of input_string
len_string = len(input_string)
#print input_string from the last letter to the first letter
while len_string > 0:
    print(input_string[len_string - 1])
    len_string -= 1

#examples of output
#Please type in a string: hiya
# a
# y
# i
# h