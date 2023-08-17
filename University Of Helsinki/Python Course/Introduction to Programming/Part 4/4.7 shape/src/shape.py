#Please write a function named shape, which takes four arguments. The first two parameters specify a
#  triangle, as above, and the character used to draw it. The first parameter also specifies the width
#  of a rectangle, while the third parameter specifies its height. The fourth parameter specifies the
#  filler character of the rectangle. The function prints first the triangle, and then the rectangle
#  below it.

#The function should call the function line from the exercise above for the actual printing out. Copy your
#  solution to that exercise above the code for this exercise. Please don't change anything in the line
#  function.

# Copy here code of line function from previous exercise and use it in your solution
def line(size, text):
    #check if text is an empty string
    if text == "":
        print("*" * size)
    else: 
        print(text[0] * size)

def shape(tri_width, tri_character, rec_height, rec_filler_character):
    i = 1
    #loop while i < size
    while i <= tri_width:
        line(i, tri_character)
        i += 1
    j = 1
    #loop while j < rec_height
    while j <= rec_height:
        line(tri_width, rec_filler_character)
        j += 1
# You can test your function by calling it within the following block
if __name__ == "__main__":
    shape(5, "x", 2, "o")
    print()
    shape(2, "o", 4, "+")
    print()
    shape(3, ".", 0, ",")

#example of output
# x
# xx
# xxx
# xxxx
# xxxxx
# ooooo
# ooooo

# o
# oo
# ++
# ++
# ++
# ++

# .
# ..
# ...