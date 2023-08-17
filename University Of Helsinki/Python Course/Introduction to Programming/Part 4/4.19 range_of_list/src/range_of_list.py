#Please write a function named range_of_list, which takes a list of integers as an argument. The function
#  returns the difference between the smallest and the largest value in the list.

# Write your solution here
def range_of_list(lst: list):
    smallest = min(lst)
    largest = max(lst)
    difference = largest - smallest
    return difference
# You can test your function by calling it within the following block
if __name__ == "__main__":
    my_list = [3, 6, -4]
    result = range_of_list(my_list)
    print(result)
    my_list2 = [1, 2, 3, 4, 5]
    result2 = range_of_list(my_list2)
    print(f"The range of the list is {result2}")

#examples of output
# 10
# The range of the list is 4