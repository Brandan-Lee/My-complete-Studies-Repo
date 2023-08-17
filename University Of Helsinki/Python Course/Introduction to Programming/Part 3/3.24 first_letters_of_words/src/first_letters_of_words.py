#Please write a program which asks the user to type in a sentence. The program then prints out the first
#  letter of each word in the sentence, each letter on a separate line.

# Write your solution here
sentence = input("Please type in a sentence: ")
#print first letter of the first word
print(sentence[0])
#loop while sentence contains spaces
while sentence.find(" ") != -1:
    sentence = sentence[sentence.find(" ") + 1:]
    print(sentence[0])

#example of output
#Please type in a sentence: Humpty Dumpty sat on a wall
# H
# D
# s
# o
# a
# w
