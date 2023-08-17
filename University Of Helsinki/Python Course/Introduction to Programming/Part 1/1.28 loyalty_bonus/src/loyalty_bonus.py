#This program calculates the end of year bonus a customer receives on their loyalty card. The bonus is
# calculated with the following formula:

#If there are less than a hundred points on the card, the bonus is 10 %
# In any other case the bonus is 15 %

# Fix the program
#points = int(input("How many points are on your card? "))
#if points < 100:
 #   points *= 1.1
 #   print("Your bonus is 10 %")

#if points >= 100:
 #   points *= 1.15
  #  print("Your bonus is 15 %")

#print("You now have", points, "points")

points = int(input("How many points are on your card? "))

#check if points is more than 100. if not, 10% bonus is added. if it is, 15% bonus is added
if points < 100:
    points *= 1.1
    print("Your bonus is 10%")
elif points >= 100:
    points *= 1.15
    print("Your bonus is 15%")

print(f"You now have {points} points")

#examples of output
#points less than 100
#How many points are on your card? 55
# Your bonus is 10%
# You now have 60.50000000000001 points

#points more than 100
#How many points are on your card? 95
# Your bonus is 10%
# You now have 104.50000000000001 points