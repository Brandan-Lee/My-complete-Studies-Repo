#Please make an extended version of the previous program, which prints out all the substrings which are at
#  least three characters long, and which begin with the character specified by the user. You may assume the
#  input string is at least three characters long.

# Write your solution here
#create interface
word = input("Please type in a word: ")
character = input("Please type in a character: ")
#create iterator variable
i = 0
#loop through word
while i < len(word) - 2:
    if word[i] == character:
        print(word[i:i+3])
    #increment i
    i += 1

#examples of output
#Please type in a word: mammoth
# Please type in a character: m
# mam
# mmo
# mot

#Please type in a word: banana
# Please type in a character: n
# nan