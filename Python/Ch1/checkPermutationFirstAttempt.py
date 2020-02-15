

def checkPermutations(str1, str2):
    str1 = sorted(list(str1))
    str2 = sorted(list(str2))

    if (len(str1) != len(str2)):
       return False 

    if(str1 != str2 ):
        return False
    else:
        return True


if __name__ == "__main__" :
    if( checkPermutations("abc","cbc")):
        print("\nstrings are a permutation of the other")
    else:
        print("\nNo permutations")


    