#Please write a function named chessboard, which prints out a chessboard made out of ones and zeroes. The
#  function takes an integer argument, which specifies the length of the side of the board.

# Write your solution here
#create chessboard function
def chessboard(length):
    #create count variable
    count = 0
    #loop while count < length
    while count < length:
        if count % 2 == 0:
            row = "10" * length
        else:
            row = "01" * length
        #Remove extra characters at the end of the row
        print(row[0:length])
        count += 1

# Testing the function
if __name__ == "__main__":
    chessboard(3)
    print()
    chessboard(6)

#examples of output
#101
# 010
# 101

#101010
# 010101
# 101010
# 010101
# 101010
# 010101
