#Please write a program which estimates a user's typical food expenditure.

#The program asks the user how many times a week they eat at the student cafeteria. Then it asks for the price
#  of a typical student lunch, and for money spent on groceries during the week.

#Based on this information the program calculates the user's typical food expenditure both weekly and daily.

# Write your solution here
amount_eat_cafeteria = int(input("How many times a week do you eat at the student cafeteria?" ))
price_lunch = float(input("The price of a typical student lunch? "))
money_spend_groceries_week = float(input("How much money do you spend on groceries in a week? "))

#multiply the amount that you eat at the cafeteria with the price of one lunch and add the total money spent
#on groceries to that amount
weekly = (amount_eat_cafeteria * price_lunch) + money_spend_groceries_week
#divide weekly expenditure with 7 to get daily expenditure
daily = weekly / 7

#print output
print("Average food expenditure: ")
print(f"Daily: {daily} euros")
print(f"Weekly: {weekly} euros")

#examples of output
#How many times a week do you eat at the student cafeteria?4
# The price of a typical student lunch? 2.5
# How much money do you spend on groceries in a week? 28.5
# Average food expenditure: 
# Daily: 5.5 euros
# Weekly: 38.5 euros
