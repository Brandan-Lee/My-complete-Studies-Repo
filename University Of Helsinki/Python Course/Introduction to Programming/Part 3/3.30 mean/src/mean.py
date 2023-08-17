#Please write a function named mean, which takes three integer arguments. The function should print out the
#  arithmetic mean of the three arguments.

# Write your code here
def mean(int1, int2, int3):
    #create sum variable to store the sum of all parameters
    sum = int1 + int2 + int3
    #print mean of all the parameters
    print(sum / 3)
# Testing the function
if __name__ == "__main__":
    mean(1, 2, 3)
    mean(5, 3, 1)
    mean(10, 1, 1)

#examples of output
#2.0
# 3.0
# 4.0