sentence=input("enter the  sentence u want ")
sentence=sentence.title()
a=0
e=0
i=0
o=0
u=0
for ele in sentence:
    if ele in ["A","a"]:
        a+=1
    elif ele in ["E","e"]:
        e+=1
    elif ele in ["I","i"]:
        i+=1
    elif ele in ["O","o"]:
        o+=1
    elif ele in ["U","u"]:
        u+=1
    else:
        pass
print("processed Text : ",sentence)
print(f"vowel count --> A: {a}, E: {e}, I: {i}, O: {o}, U: {u}")