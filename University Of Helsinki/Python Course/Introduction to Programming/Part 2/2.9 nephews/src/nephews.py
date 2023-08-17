#Please write a program which asks for the user's name. If the name is Huey, Dewey or Louie, the program should
#  recognise the user as one of Donald Duck's nephews.

#In a similar fashion, if the name is Morty or Ferdie, the program should recognise the user as one of Mickey
#  Mouse's nephews.

# Write your solution here
#create interface
name = input("Please type in your name: ")

#check to see if name is Morty or Ferdie. Mickey Mouse's nephews
if name == "Morty" or name == "Ferdie":
    print("I think you might be one of Mickey Mouse's nephews.")
#check to see if name is Huey, Dewey or Louie. Donald Duck's nephews
elif name == "Huey" or name == "Dewey" or name == "Louie":
    print("I think you might be one of Donald Duck's nephews.")
#not a nephew of any character
else:
    print("You're not a nephew of any character I know of.")

#examples of output
#Please type in your name: Morty
#I think you might be one of Mickey Mouse's nephews.

#Please type in your name: Huey
# I think you might be one of Donald Duck's nephews.

#Please type in your name: Ken
# You're not a nephew of any character I know of.