import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Kairat";
        student1.age = 19;
        student1.group = "Java-9";


        Student student2 = new Student();
        student2.name = "Aizat";
        student2.age = 19;
        student2.group = "Java-9";


        Student student3 = new Student();
        student3.name = "Keldibek";
        student3.age = 19;
        student3.group = "Java-9";


        Student student4 = new Student();
        student4.name = "Sanjar";
        student4.age = 20;
        student4.group = "Java-9";


        Student student5 = new Student();
        student5.name = "Anara";
        student5.age = 23;
        student5.group = "Javascrip - 9";


        Student student6 = new Student();
        student6.name = "Kanykkey";
        student6.age = 19;
        student6.group = "Javascrip - 9";

        Student[] students = {student1, student2, student3, student4, student5, student6};
        double java = 0;
        double j = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i].group.equals("Java-9")) {
                java += students[i].age;
                j++;
                System.out.print("Java group");
                System.out.println(students[i].name);
            }
        }
        System.out.println(java / j);


       Scanner sc = new Scanner(System.in);
        Seasons seasons =new Seasons();
        seasons.season(sc.nextInt());




        Pasport pasport = new Pasport();
        pasport.id = 1438162;
        pasport.firstName = "Ernazar";
        pasport.lastName = "Tilek uulu";
        pasport.gender = "Male";
        pasport.countryOfBirth  = "KYRGYZ RESPUBLICASY";
        pasport.getinfo();
    }}