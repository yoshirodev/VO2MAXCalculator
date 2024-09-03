

weight = float(input("Enter your Weight: "))
age = int(input("Enter your Age: "))
print("Are you a Male or Female?")
gender = int(input("Enter 1 if Male, Enter 0 if Female: "))
print("Time you completed the briskwalk")
time = float(input("For example: 4 Minutes and 30 seconds, put in decimal: 14.30: "))
heartrate = int(input("Heartrate in a minute: "))


calculations = (132.853 - (0.1692 * weight) - (0.3877 * age) + (6.315 * gender) - (3.2649 * time) - (0.156 * 100))

print(round(calculations))