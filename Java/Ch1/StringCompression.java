
import java.util.*;


class StringCompression{

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String inpString = scan.nextLine();

        inpString = CompressString(inpString);

        System.out.println(inpString);
        scan.nextLine();
        scan.close();
    }

    private static String CompressString(String inpString) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        StringBuilder finalString = new StringBuilder();
        char[] inpStrings = inpString.toCharArray();

        for (int i = 0; i < inpStrings.length; i++){
            if(!map.containsKey(inpStrings[i])){
                map.put(inpStrings[i], 1);
            }else{
                int tempNum = map.get(inpStrings[i]);
                tempNum++;
                map.replace(inpStrings[i], tempNum);
            }
        }

        Iterator mapIter = map.entrySet().iterator();
        while(mapIter.hasNext()){
            Map.Entry element = (Map.Entry)mapIter.next();
            finalString.append((element.getKey() + "" + element.getValue()));
        }
       // for (int i = 0; i < map.size(); i++){

        //}

        return finalString.toString();
    }

}