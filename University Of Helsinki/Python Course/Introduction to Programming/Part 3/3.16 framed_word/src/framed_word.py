#Please write a program which asks the user for a string and then prints out a frame of * characters with the
#  word in the centre. The width of the frame should be 30 characters. You may assume the input string will
#  always fit inside the frame.

#If the length of the input string is an odd number, you may print out the word in either of the two possible
#  centre locations.

# Write your solution here
#create interface
word = input("Word: ")
#space variable needed to find out space needed to get word in the middle of the frame
start = (28 - len(word)) // 2
#check if the length of word is odd or even
if len(word) % 2 == 0:
    end = start
else:
    end = start + 1

#print frame
print("*" * 30)
print(f"*{' ' * start}{word}{' ' * end}*")
print("*" * 30)

#examples of output
#Word: testing
# ******************************
# *          testing           *
# ******************************

#Word: python
# ******************************
# *           python           *
# ******************************