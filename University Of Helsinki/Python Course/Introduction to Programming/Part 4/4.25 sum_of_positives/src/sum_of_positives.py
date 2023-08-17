#Please write a function named sum_of_positives, which takes a list of integers as its argument. The
#  function returns the sum of the positive values in the list.

# Write your solution here
def sum_of_positives(lst):
    #create needed variables
    sum = 0
    #loop through list
    for i in lst:
        #check if i is positive
        if i > 0:
            sum += i
    return sum

#main method
if __name__ == "__main__":
    my_list = [1, -2, 3, -4, 5]
    result = sum_of_positives(my_list)
    print(f"The result is {result}")

#examples of output
# The result is 9