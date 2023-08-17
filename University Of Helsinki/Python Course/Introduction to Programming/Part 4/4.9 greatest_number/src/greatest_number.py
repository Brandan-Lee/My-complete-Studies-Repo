#Please write a function named greatest_number, which takes three arguments. The function returns the
#  greatest in value of the three.

# Write your solution here
def greatest_number(int1, int2, int3):
    #check which one of the ints is the greatest
    if int1 >= int2 and int1 >= int3:
        return int1
    elif int2 >= int1 and int2 >= int3:
        return int2
    elif int3 >= int1 and int3 >= int2:
        return int3
    else:
        return None

# You can test your function by calling it within the following block
if __name__ == "__main__":
    greatest = greatest_number(5, 4, 8)
    print(greatest)
    print(greatest_number(3, 4, 1))
    print(greatest_number(99, -4, 7))
    print(greatest_number(0, 0, 0))

#examples of output
# 8
# 4
# 99
# 0