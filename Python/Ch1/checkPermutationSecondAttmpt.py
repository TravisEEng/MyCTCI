def arePerm(str1, str2):
    #Initialize all values as 0
    countStr1 = [0] * 256
    countStr2 = [0] * 256

    #for each char inc count in count arr
    for char in str1:
        countStr1[ord(char)]+=1
    for char in str2:
        countStr2[ord(char)]+=1

    #check for length
    if len(str1) != len(str2):
        return False

    #compare counted arrs
    for char in range(256):
        if countStr1[char] != countStr2[char]:
            return False

    return True

if __name__ == "__main__":
    if (arePerm("dac","cad")):
       print("Yes perm")
    else:
        print("No perm")
