class URLify{

    public String Urlify(String s1, int lengthOfStr){
        char s1CharArr[] = s1.toCharArray();
        
        for(int i = 0; i < lengthOfStr; i++){
            if(Character.isWhitespace(s1CharArr[i])){
                s1CharArr[i] = '%';
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch: s1CharArr){
            sb.append(ch);
        }
       

        return  sb.toString().replace("%","%20");
    }
    public static void main(String[] args) {
        URLify obj = new URLify();

        System.out.println(obj.Urlify("Mr John Smith ",13));
    }
}