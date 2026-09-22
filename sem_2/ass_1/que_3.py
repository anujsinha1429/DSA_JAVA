month_days={
    "January": 31,
    "February": 28,
    "March": 31,
    "April": 30,
    "May": 31,
    "June": 30,
    "July": 31,
    "August": 31,
    "September": 30,
    "October": 31,
    "November": 30,
    "December": 31
}
month = input("Enter the month: ")
if month == "February":
    year= int (input (" enter the year :"))
    if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
        print(f"{month} {year} has 29 days.")
    else:
        print(f"{month} {year} has 28 days.")
elif month in month_days:
    print(f"{month} has {month_days[month]} days.")
else:
    print("Invalid month name. Please enter a valid month.")

