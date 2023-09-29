import java.util.*;
import java.lang.*;
interface utility{
    public void getdetails();
    public void setdetails();
        }



public class Main {
    static void main_menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[6];
        Employee employee[] = new Employee[6];
        cars car[] = new cars[6];
        int showroom_counter = 0;
        int car_counter = 0;
        int employee_counter = 0;
        int choice = 100;
        while(choice!=0){
            main_menu();
            choice = sc.nextInt();
            while (choice!=9&&choice!=0){

                switch (choice){
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].setdetails();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1] ADD NEW SHOWROOM");
                        System.out.println("9] GO TO THE MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employee[employee_counter] = new Employee();
                        employee[employee_counter].setdetails();
                        employee_counter++;
                        System.out.println();
                        System.out.println("1] ADD NEW EMPLOYEE");
                        System.out.println("9] GO TO THE MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        car[car_counter] = new cars();
                        car[car_counter].setdetails();
                        car_counter++;
                        System.out.println();
                        System.out.println("1] ADD NEW SHOWROOM");
                        System.out.println("9] GO TO THE MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < showroom_counter; i++) {
                            showroom[i].getdetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("1] ADD NEW SHOWROOM");
                        System.out.println("9] GO TO THE MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < employee_counter; i++) {
                            employee[i].getdetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("1] ADD NEW SHOWROOM");
                        System.out.println("9] GO TO THE MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < car_counter; i++) {
                            car[i].getdetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("1] ADD NEW SHOWROOM");
                        System.out.println("9] GO TO THE MAIN MENU");
                        choice = sc.nextInt();
                        break;



                }



            }








        }



    }
}