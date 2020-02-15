def checkIsUnique(stringVal):
    stringDiction = {}

    for char in stringVal:
        if(stringDiction.get(char) == None):
            stringDiction[char] = 1
        else:
            stringDiction[char] += 1
        
    for key, value in stringDiction.items():
        if (value > 1) in stringDiction.values():
            print("\nDuplicate is found")
        
if __name__ == "__main__":
    checkIsUnique("abcdefgh")