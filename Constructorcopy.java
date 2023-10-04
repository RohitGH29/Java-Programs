public class Constructorcopy{

    public static void main (String args[]){

        Students s1= new Students();
        s1.password = "a";
        s1.name = "sad";
        s1.roll= 12;
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Students s2 = new Students(s1);
        s2.password="sa";
        s1.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }


    }

}

class Students{
    String password;
    int roll;
    String name;
    int marks[];

    // shallow copy constructor
  /*  Students(Students s1){
        marks = new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks= s1.marks;
    }*/

    // deep copy constructor
     Students(Students s1){
        marks = new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i = 0;i<3;i++){
            this.marks[i]=s1.marks[i];    
        }
        
    }

    Students(){
         marks = new int[3];
        System.out.println("chalo");
    }

}