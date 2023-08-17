#Please modify the previous program so that it also asks for the height, and prints out a rectangle of hash
#  characters accordingly.

# Write your solution here
#create interface
width = int(input("Width: "))
height = int(input("Height: "))
#iterator variable
count = 1
#print rectangle
while height > 0 and count <= height:
    print("#" * width)
    count += 1

#example of output
#Width: 10
# Height: 3
# ##########
# ##########
# ##########