operation=input("Enter the operation you want to perform (add, subtract, multiply, divide, modulus): ")
num1=float(input("Enter the first number: "))
num2=float(input("Enter the second number: "))
operation = operation.lower() 
if operation == "add":
    result = num1 + num2
    print(f"The result of addition is: {result}")
elif operation == "subtract":
    result = num1 - num2
    print(f"The result of subtraction is: {result}")
elif operation == "multiply":
    result = num1 * num2
    print(f"The result of multiplication is: {result}")
elif operation == "divide":
    if num2 != 0:
        result = num1 / num2
        print(f"The result of division is: {result}")
    else:
        print("Error: Division by zero is not allowed.")
elif operation == "modulus":
    if num2 != 0:
        result = num1 % num2
        print(f"The result of modulus is: {result}")
    else:
        print("Error: Division by zero is not allowed.")
else:
    print("Invalid operation. Please choose from add, subtract, multiply, divide, or modulus.")