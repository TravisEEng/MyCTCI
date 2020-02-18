def stringCompress(stringValue):
    stringTotal = {}
    finalCompress = ""

    for char in stringValue:
        if stringTotal.get(char) == None:#if string does not exist in dictionary
            stringTotal[char] = 1
        else: #string exists
            stringTotal[char] +=1


    for key,value in stringTotal.items():
        finalCompress+= str(key)+str(value)    
        
    return finalCompress


if __name__ == "__main__":
    ty = "abbccccddddeeeefff"
    ty = stringCompress(ty)
    print(ty)