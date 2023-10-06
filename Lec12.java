
public class  Lec12{

    public static void main(String args[]){

        //concatenation
        String firstName = "Rohit";
        String lastName = "Maurya";
        String fullName = firstName + " "+ lastName;
        System.out.println(fullName);

        // length 
        System.out.println(fullName.length());

        //charAt
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

        //compare  the strings
        String name1="Rohit";
        String name2="Rohit";

        //1 s1 > s2 : +ve value
        //2 s1 = s2 : 0
        //3 s1 < s2 : -ve value

        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings doesn't equal");
        }


        // substring 
        String sentence = "RohitMaurya";
        String sub = sentence.substring(0, 5);
        System.out.println(sub);



    }

}