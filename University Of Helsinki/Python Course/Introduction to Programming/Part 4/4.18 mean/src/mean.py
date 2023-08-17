#Please write a function named mean, which takes a list of integers as an argument. The function returns
#  the arithmetic mean of the values in the list.

# Write your solution here
def mean(lst : list):
    #mean means average
    return sum(lst) / len(lst)
# You can test your function by calling it within the following block
if __name__ == "__main__":
    my_list = [3, 6, -4]
    result = mean(my_list)
    print(result)
    my_list2 = [1, 2, 3, 4, 5]
    result2 = mean(my_list2)
    print(f"mean value is {result2}")

#examples of output
# 1.6666666666666667
# mean value is 3.0