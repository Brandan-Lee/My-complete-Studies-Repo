#Please write a function named palindromes, which takes a string argument and returns True if the string
#  is a palindrome. Palindromes are words which are spelled exactly the same backwards and forwards.

#Please also write a main function which asks the user to type in words until they type in a palindrome:

# Write your solution here
# Note, that at this time the main program should not be written inside
# if __name__ == "__main__":
# block!
def palindromes(word: str):
    #create empty list
    lst = []
    reverse_lst = []
    #input text into list
    for i in range(0, len(word), 1):
        lst.append(word[i])
    #input reverse text into reverse_lst
    for j in range(len(word) - 1, -1, -1):
        reverse_lst.append(word[j])
    #check to see if the two lists are the same
    if lst == reverse_lst:
        return True
    else:
        return False
    
while True:
    input_palindrome = input("Please type in a palindrome: ")
    #continue if text was not a palindrome, else break
    if palindromes(input_palindrome) == True:
        print(f"{input_palindrome} is a palindrome!")
        break
    else:
        print("that wasn't a palindrome")
    
#examples of output
# Please type in a palindrome: python
# that wasn't a palindrome
# Please type in a palindrome: java
# that wasn't a palindrome
# Please type in a palindrome: oddoreven
# that wasn't a palindrome
# Please type in a palindrome: neveroddoreven
# neveroddoreven is a palindrome!
