#Please write a function named spruce, which takes one argument. The function prints out the text a spruce!,
#  and the a spruce tree, the size of which is specified by the argument.

# Write your solution here
def spruce(num):
    print("a spruce!")
    characters = 1
    spaces = num - 1
    #create count variable
    i = 1
    #loop while i <= num
    while i <= num:
        print(" " * spaces + "*" * characters + " " * spaces)
        spaces -= 1
        characters += 2
        i += 1
    print(" " * (num - 1) + "*" + " " * (num - 1)) 
# You can test your function by calling it within the following block
if __name__ == "__main__":
    spruce(5)
    print()
    spruce(3)

#examples of output
# a spruce!
#     *    
#    ***
#   *****
#  *******
# *********
#     *

# a spruce!
#   *
#  ***
# *****
#   *