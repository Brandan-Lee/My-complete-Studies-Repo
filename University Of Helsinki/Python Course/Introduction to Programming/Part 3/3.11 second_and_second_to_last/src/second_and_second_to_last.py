#Please write a program which asks the user for a string. The program then prints out a message based on
#  whether the second character and the second to last character are the same or not.

# Write your solution here
#create interface
input_string = input("Please type in a string: ")
#needed variable
character = ""
#check if second character is the same as the second last character in input_string. if not, print that they 
# are different
if len(input_string) > 1 and input_string[1] == input_string[-2]:
    character = input_string[1]
    print(f"The second and the second to last characters are {character}")
else:
    print("The second and the second to last characters are different")

#examples of output
#Please type in a string: python
# The second and second to last characters are different

#Please type in a string: pascal
# The second and the second to last characters are a