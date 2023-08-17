#Please write a function named length which takes a list as its argument and returns the length of the list.

# Write your solution here
def length(my_list: list):
    return len(my_list)
# You can test your function by calling it within the following block
if __name__ == "__main__":
    my_list = [3, 6, -4]
    result = length(my_list)
    print(result)
    my_list2 = [1, 2, 3, 4, 5]
    result2 = length(my_list2)
    print(f"The length is {result2}")
    result3 = length([1, 1, 1, 1])
    print(f"The length is {result3}")

#examples of output
# 3
# The length is 5
# The length is 4