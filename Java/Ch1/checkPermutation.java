import java.util.*;

class checkPermutation{

    public boolean isPerm(String s1, String s2){
        int count1[] = new int [256];
        int count2[] = new int [256];

        char s1CharArr[] = s1.toCharArray();
        char s2CharArr[] = s2.toCharArray();

        Arrays.fill(count1,0);
        Arrays.fill(count2,0);

        if(s1CharArr.length != s2CharArr.length){
            return false;
        }

        for(int i = 0; i < s1CharArr.length && i < s2CharArr.length; i++ ){
            count1[s1CharArr[i]]++;
            count2[s2CharArr[i]]++;
        }

        for( int i = 0; i < 256; i++){
            if (count1[i] != count2[i])
            return false;
        }

        return true;
        

    }

    public static void main(String[] args) {
        
        checkPermutation obj = new checkPermutation();
        String s1 = "dac";
        String s2 = "cad";

        System.out.println(obj.isPerm(s1, s2));
    }
}