def validate_password(password):
    upper = False
    lower = False
    digit = False
    special = False
    space = False
    for ch in password:
        if ch >= 'A' and ch <= 'Z':
            upper = True
        elif ch >= 'a' and ch <= 'z':
            lower = True
        elif ch >= '0' and ch <= '9':
            digit = True
        elif ch in "!@#$%":
            special = True
        elif ch == " ":
            space = True
    errors = []
    if len(password) < 8:
        errors.append("At least 8 characters required")
    if not upper:
        errors.append("At least one uppercase letter required")
    if not lower:
        errors.append("At least one lowercase letter required")
    if not digit:
        errors.append("At least one digit required")
    if not special:
        errors.append("At least one special character required")
    if space:
        errors.append("Password must not contain spaces")
    if len(errors) == 0:
        return True,errors
    else:
        return False, errors
password = input("Enter password: ")

valid, errors = validate_password(password)

if valid:
    print("Password is valid")
else:
    print("Password is invalid")

    for error in errors:
        print(error)