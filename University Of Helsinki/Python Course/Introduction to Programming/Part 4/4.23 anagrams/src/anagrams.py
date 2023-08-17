#Please write a function named anagrams, which takes two strings as arguments. The function returns True if the
#  strings are anagrams of each other. Two words are anagrams if they contain exactly the same characters.

#Hint: the function sorted can be used on strings as well.

# Write your solution here
def anagrams(text1, text2):
    #sort text 1 and 2
    sorted1 = sorted(text1)
    sorted2 = sorted(text2)
    #check if text1 has the same characters as text2 which will make the texts anagrams of each other
    if sorted1 == sorted2:
        return True
    else: 
        return False

#main method
if __name__ == "__main__":
    print(anagrams("tame", "meta"))
    print(anagrams("tame", "mate"))
    print(anagrams("tame", "team"))
    print(anagrams("tabby", "batty"))
    print(anagrams("python", "java"))

#examples of output
# True
# True
# True
# False
# False