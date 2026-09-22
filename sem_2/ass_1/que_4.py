def two_pointer_palimdrom(s):
    left, right = 0, len(s) - 1
    while left < right:
        if s[left] != s[right]:
            return False
        left += 1
        right -= 1
    return True
if two_pointer_palimdrom("racecar"):
    print("two_pointer check : palimdrom")
else:
    print("two_pointer check : not palimdrom")


def is_palimdrom(s):
    for i in range (len(s)//2):
        if s[i]!=s[len(s)-1-i]:
            return False
    return True
if is_palimdrom("racecar"):
    print("for loop check : palimdrom")
else:
    print("for loop check : not palimdrom")
