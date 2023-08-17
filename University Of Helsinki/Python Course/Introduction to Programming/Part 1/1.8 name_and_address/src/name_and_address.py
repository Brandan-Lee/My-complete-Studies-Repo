#Please write a program which asks for the user's name and address. The program should also print out the given information, as follows:

#Sample output
# Given name: Steve
# Family name: Sanders
# Street address: 91 Station Road
# City and postal code: London EC05 6AW
# Steve Sanders
# 91 Station Road
# London EC05 6AW

# Write your solution here
#recieve input
name = input("Given name: ")
surname = input("Family name: ")
street_address = input("Street address: ")
city_and_postal_code = input("City and postal code: ")
#display input
print(name + " " + surname)
print(street_address)
print(city_and_postal_code)

#example of output
#Given name: Brandan-Lee
# Family name: Sherbrooke
# Street address: 21 Anfield Rupee Street
# City and postal code: Johannesburg 0003
# Brandan-Lee Sherbrooke
# 21 Anfield Rupee Street
# Johannesburg 0003