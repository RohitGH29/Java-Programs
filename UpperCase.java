public class UpperCase {

    public static void main(String args[]){
        String str = "i am a good";
        System.out.print(upperCase(str));

    }

    public static String upperCase(String str){
      StringBuilder sd = new StringBuilder("");

      char ch = Character.toUpperCase(str.charAt(0));
      sd.append(ch);

      for(int i=1;i<str.length();i++){
        if(str.charAt(i) == ' ' && i<str.length()-1){
             sd.append(str.charAt(i));
             i++;
             sd.append(Character.toUpperCase(str.charAt(i)));
        }else{
            sd.append(str.charAt(i));
        }
      }
     return sd.toString();

    }

    
}
