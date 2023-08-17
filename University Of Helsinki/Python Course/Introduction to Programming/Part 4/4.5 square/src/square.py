#Please write a function named square, which prints out a square of characters, and takes two arguments.
#  The first parameter specifies the length of the side of the square. The second parameter specifies the
#  character used to draw the square.

#The function should call the function line from the exercise above for the actual printing out. Copy your
#  solution to that exercise above the code for this exercise. Please don't change anything in the line
#  function.

# Copy here code of line function from previous exercise
def line(size, text):
    #check if text is an empty string
    if text == "":
        print("*" * size)
    else: 
        print(text[0] * size)

def square(size, character):
    # You should call function line here with proper parameters
    #create count variable
    i = 0
    #loop while i < size
    while i < size:
        line(size, character)
        i += 1

# You can test your function by calling it within the following block
if __name__ == "__main__":
    square(5, "x")
    print()
    square(5, "*")
    print()
    square(3, "o")

#examples of output
# xxxxx
# xxxxx
# xxxxx
# xxxxx
# xxxxx

# *****
# *****
# *****
# *****
# *****

# ooo
# ooo
# ooo