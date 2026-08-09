class Student {

    String name;
    int age;
    char section;
    char gender;
    int subject1;
    int subject2;
    int subject3;
    int total;
    double percentage;

    // Constructor for all 3 subjects
    Student(String name, int age, char section, char gender,
            int subject1, int subject2, int subject3) {

        this.name = name;
        this.age = age;
        this.section = section;
        this.gender = gender;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;

        calculate();
    }

    // Constructor for S2 and S3 (subject1 = 0)
    Student(String name, int age, char section, char gender,
            int subject2, int subject3) {

        this.name = name;
        this.age = age;
        this.section = section;
        this.gender = gender;
        this.subject1 = 0;
        this.subject2 = subject2;
        this.subject3 = subject3;

        calculate();
    }

    // Calculate Total and Percentage
    void calculate() {
        total = subject1 + subject2 + subject3;
        percentage = (total / 300.0) * 100;
    }

    // Display Student Details
    void display() {
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Section    : " + section);
        System.out.println("Gender     : " + gender);
        System.out.println("Subject1   : " + subject1);
        System.out.println("Subject2   : " + subject2);
        System.out.println("Subject3   : " + subject3);
        System.out.println("Total      : " + total);
        System.out.printf("Percentage : %.2f%%\n", percentage);
        System.out.println("-----------------------------------");
    }
}

public class Main {

    public static void main(String[] args) {

        // Creating 4 student objects

        Student s1 = new Student(
                "Rahul", 20, 'A', 'M',
                80, 75, 90);

        Student s2 = new Student(
                "Priya", 21, 'B', 'F',
                70, 85); // Subject1 = 0

        Student s3 = new Student(
                "Arjun", 22, 'A', 'M',
                65, 75); // Subject1 = 0

        Student s4 = new Student(
                "Sneha", 20, 'C', 'F',
                95, 88, 92);

        // Display all student details

        System.out.println("Student Details");
        System.out.println("================");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
