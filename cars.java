import java.util.Scanner;
public class cars extends Showroom implements utility {
    String carName;
    String carColor;
    String carFueltype;
    int carPrice;
    String carType;
    String carTransmission;

    @Override
    public void getdetails() {
        System.out.println("Name: "+ carName);
        System.out.println("Name: "+ carColor);
        System.out.println("Age: "+ carType);
        System.out.println("Fuel type:  "+carFueltype );
        System.out.println("Department:  "+ carPrice);
        System.out.println("Car Transmission: "+carTransmission);



    }

    @Override
    public void setdetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car Name: ");
        carName = sc.nextLine();
        System.out.println("Enter car color : ");
        carColor = sc.nextLine();
        System.out.println("Enter car Type: ");
        carType = sc.nextLine();
        System.out.println("Enter carPrice:  ");
        carPrice = sc.nextInt();
        System.out.println("Enter car Fuel type:  ");
        carFueltype = sc.nextLine();
        System.out.println("Enter car Transmission:  ");
        carTransmission = sc.nextLine();
        totalCarsinStock++;
    }
}

