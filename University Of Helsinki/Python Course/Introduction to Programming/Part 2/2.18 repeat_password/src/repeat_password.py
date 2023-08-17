#Please write a program which asks the user for a password. The program should then ask the user to type in
#  the password again. If the user types in something else than the first password, the program should keep on
#  asking until the user types the first password again correctly.

# Write your solution here
#create interface
password = input("Password: ")

# if password doesn't match, run loop. break if passwords match
while True:
    repeat_password = input("Repeat password: ")

    if password == repeat_password:
        print("User account created!")
        break
    else:
        print("They do not match!")

#examples of output\
#Password: sekred
# Repeat password: secret
# They do not match!
# Repeat password: cantremember
# They do not match!
# Repeat password: sekred
# User account created!