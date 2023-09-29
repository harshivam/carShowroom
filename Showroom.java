import java.util.Scanner;
public class Showroom implements utility {
    String showroomName;
    String showroomAddress;
    int totalEmployees;
    int totalCarsinStock;
    String managerName;
    @Override
    public void getdetails() {
        System.out.println("Showroom Name: "+ showroomName);
        System.out.println("Showroom Address: "+ showroomName);
        System.out.println("Showroom Employees: "+ showroomName);
        System.out.println("Showroom Car in Stock: "+ showroomName);
        System.out.println("Manager Name: "+ showroomName);

    }

    @Override
    public void setdetails() {
        System.out.println("======================= ***ENTER SHOWROOM DETAILS*** =======================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Showroom name: ");
        showroomName = sc.nextLine();
        System.out.println("Enter Address: ");
        showroomAddress = sc.nextLine();
        System.out.println("Enter Manager's Name: ");
        managerName = sc.nextLine();
        System.out.println("Total no of Employees: ");
        totalEmployees = sc.nextInt();
        System.out.println("Total Cars in Stock: ");
        totalCarsinStock = sc.nextInt();


    }
}
