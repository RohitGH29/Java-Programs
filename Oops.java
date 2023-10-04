public class Oops{

    public static void main(String[] args){

        Student s1 = new Student();
        Student s2 = new Student("Rohit");
        Student s3 = new Student(10);
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.roll);

    }

}

class Student {
    String name;
    int roll;

      Student(){  //Non Parametersied constructor
       // this.name=name;
       System.out.println("Constructr is called");
    }

    Student(String name){   // Parameterised constructors
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }


}