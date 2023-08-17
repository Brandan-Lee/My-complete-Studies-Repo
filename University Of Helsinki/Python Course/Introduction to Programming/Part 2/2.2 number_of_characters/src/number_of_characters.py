#The function len can be used to find out the length of a string, among other things. The function returns the
#  number of characters in a string.

#Please write a program which asks the user for a word and then prints out the number of characters, if there
#  was more than one typed in.

# Write your solution here
word = input("Please type in a word: ")

if len(word) > 1:
    print(f"There are {len(word)} letters in the word {word}")
    
print("Thank you!")

#examples of output
#Please type in a word: hey
# There are 3 letters in the word hey
# Thank you!

#Please type in a word: banana
# There are 6 letters in the word banana
# Thank you!

#Please type in a word: b
# Thank you!