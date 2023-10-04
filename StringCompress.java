public class StringCompress {
    
    public static void main (String args[]){
        String str ="aaabbbccc";
        
      //  System.out.println(str);
        System.out.println(compress(str));

    }

    public static String compress(String str){

       StringBuilder sb =new StringBuilder("");
    // String newstr  = "";

        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
         // newstr += str.charAt(i);
            if(count > 1){
                sb.append(count.toString());
                //newstr += count.toString();
            }
        }
        return sb.toString();

    }

}
