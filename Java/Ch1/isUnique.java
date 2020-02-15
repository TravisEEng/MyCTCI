/**
 * Sorting based upon the ASCII values of chars
 */
import java.util.*;

class isUnique {

    boolean CheckForDups(String dupString){
        char[] charArray = dupString.toCharArray();

        //Sort - Arrays.sort() uses binarySort

        Arrays.sort(charArray);

        for( int i = 0; i < charArray.length - 1; i++){
            //if the adjacent elements are not equal, move

            if(charArray[i] != charArray[i+1])
                continue;

            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        isUnique obj = new isUnique();
        String dupString = "abcd";
        boolean unique = obj.CheckForDups(dupString);
        
        System.out.println("The following string does " + (unique ? "" : "not ") + "contain all unique characters");
        
    }
}