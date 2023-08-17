#Please write a program which prints out all the even numbers between two and thirty, using a loop. Print each
#  number on a separate line.

# Write your solution here
#initialiser variable
count = 2

#loop executes and ends when count = 30
while count <= 30:
    #count must be divisible by 2 and printed to the terminal
    if count % 2 == 0:
        print(count)
    #increment count to avoid entering an infinite loop
    count += 1

#example of output
#2
# 4
# 6
# 8
# 10
# 12
# 14
# 16
# 18
# 20
# 22
# 24
# 26
# 28
#30

