import java.util.Scanner;

// Custom Exception Class
class SalaryException extends Exception {
    public SalaryException(String message) {
        super(message);
    }
}

public class SalaryChecker {

    public static void checkSalary(int salary) throws SalaryException {

        if (salary < 2100) {
            throw new SalaryException("You need to work hard");
        } else if (salary >= 2100 && salary <= 5000) {
            throw new SalaryException("Your salary is somehow good");
        } else if (salary >= 5100 && salary <= 9000) {
            throw new SalaryException("Salary is very good");
        } else {
            System.out.println("Excellent salary!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        try {
            checkSalary(salary);
        } catch (SalaryException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
