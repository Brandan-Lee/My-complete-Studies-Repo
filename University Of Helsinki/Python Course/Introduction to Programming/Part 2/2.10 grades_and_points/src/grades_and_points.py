#The table below outlines the grade boundaries on a certain university course. Please write a program which
#  asks for the amount of points received and then prints out the grade attained according to the table.

#points	grade
# < 0	impossible!
# 0-49	fail
# 50-59	1
# 60-69	2
# 70-79	3
# 80-89	4
# 90-100	5
# > 100	impossible!

# Write your solution here
#create interface
points = int(input("How many points [0-100]: "))
grade = ""

# =0 - 49
if points >= 0 and points <= 49:
    grade = "fail"
#50 - 59
elif points >= 50 and points <= 59:
    grade = "1"
#60 - 69
elif points >= 60 and points <= 69:
    grade = "2"
#70 - 79
elif points >= 70 and points <= 79:
    grade = "3"
#80 - 89
elif points >= 80 and points <= 89:
    grade = "4"
#90 - 100
elif points >= 90 and points <= 100:
    grade = "5"
#anything that isn't possible
else:
    grade = "impossible!"

#print output
print(f"Grade: {grade}")

#examples of output
#How many points [0-100]: 37
# Grade: fail

#How many points [0-100]: 76
# Grade: 3

#How many points [0-100]: -3
# Grade: impossible!