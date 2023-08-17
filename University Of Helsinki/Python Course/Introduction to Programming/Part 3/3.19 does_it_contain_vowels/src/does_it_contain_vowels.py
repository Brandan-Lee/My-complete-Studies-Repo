#Please write a program which asks the user to input a string. The program then prints out different messages
#  if the string contains any of the vowels a, e or o.

#You may assume the input will be in lowercase entirely.

# Write your solution here
string = input("Please type in a string: ")
#create iterator variable
i = 0
#create vowels variable
vowels = "aeo"
#loop through string
while i < len(vowels):
    if vowels[i] in string:
        print(f"{vowels[i]} found")
    else:
        print(f"{vowels[i]} not found")
    #increment i
    i += 1

#examples of output
#Please type in a string: hello there
# a not found
# e found
# o found

#Please type in a string: hiya
# a found
# e not found
# o not found