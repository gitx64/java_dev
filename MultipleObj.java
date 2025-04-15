class Student{

     int rollno;
     String name;
     int marks;
      
}


public class MultipleObj {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 21;
        s1.name = "Krishna";
        s1.marks = 99;

        Student s2 = new Student();
        s2.rollno = 22;
        s2.name = "Astik";
        s2.marks = 67;

        Student s3 = new Student();
        s3.rollno = 23;
        s3.name = "Sampa";
        s3.marks = 87;

        Student s4 = new Student(); // Different objects to store different values
        s4.rollno = 24;
        s4.name = "Rinku";
        s4.marks = 67;


        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3; // storing all the student objects into an array.

        // for (int i = 0; i < students.length; i++) {
        //     System.out.println(students[i]);
        // }

        for(Student n : students){
            System.out.println(n.name);
        }
    }
}
