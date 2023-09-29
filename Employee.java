import java.util.Scanner;
import java.util.UUID;
public class Employee extends Showroom implements utility {
   String empName;
   int empId;
   int empAge;
   String empDepartment;

    @Override
    public void getdetails() {
        System.out.println("ID:  "+ empId);
        System.out.println("Name: "+ empName);
        System.out.println("Age: "+ empAge);
        System.out.println("Department:  "+ empDepartment);

    }

    @Override
    public void setdetails() {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        empId = Integer.parseInt(String.valueOf(uuid));
        System.out.println("Enter Name: ");
        empName = sc.nextLine();
        System.out.println("Enter Age: ");
        empAge= sc.nextInt();
        System.out.println("Enter Department:  ");
        empDepartment = sc.nextLine();


    }
}
