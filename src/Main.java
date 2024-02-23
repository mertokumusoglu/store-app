import brands.Brand;
import phones.Phone;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Brand> brands = new TreeSet<>();
        ArrayList<Phone> phones = new ArrayList<>();

        brands.add(new Brand(1,"Samsung"));
        brands.add(new Brand(2,"Lenovo"));
        brands.add(new Brand(3,"Apple"));
        brands.add(new Brand(4,"Huawei"));
        brands.add(new Brand(5,"Casper"));
        brands.add(new Brand(6,"Asus"));
        brands.add(new Brand(7,"HP"));
        brands.add(new Brand(8,"Xiaomi"));
        brands.add(new Brand(9,"Monster"));

        phones.add(new Phone(1,brands.first(),"iphone",2,2,3,4,5,128,"Black",4000));

        boolean session = true;
        while(session) {
            System.out.println("Welcome to store app \n" +
                    "1 - Notebooks \n" +
                    "2 - Phones \n" +
                    "3 - Brands \n" +
                    "0 - Quit");
            System.out.print("Enter the action you want to do: ");
            int action = sc.nextInt();
            switch (action) {
                case 0:
                    session = false;
                    break;
                case 1:
                    System.out.println("Notebook actions");
                    break;
                case 2:
                    System.out.print("1 - Add phone \n2 - List phones \nEnter action: ");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter phone features");
                            System.out.println("Phone ID (unique): ");
                            int phoneID = sc.nextInt();

                            System.out.println("Model name: ");
                            String phoneModelName = sc.nextLine();

                            System.out.println("Stock: ");
                            int phoneStock = sc.nextInt();

                            System.out.println("Phone's discount rate: ");
                            int discountRatePhone = sc.nextInt();

                            System.out.println("Screen size: ");
                            double screenSizePhone = sc.nextDouble();

                            System.out.println("Battery Capacity: ");
                            int batteryCapacity = sc.nextInt();

                            System.out.println("RAM : ");
                            int phoneRam = sc.nextInt();

                            System.out.println("Color: ");
                            String phoneColor = sc.nextLine();

                            System.out.println("Brand (Apple, Asus, Casper, HP, Huawei, Lenovo, Samsung, Xiaomi): ");
                            String brandName = sc.nextLine();

                            for (Brand brandObject : brands) {
                                if(brandObject.getTitle() == brandName) {
                                    Brand brand = brandObject;
                                    phones.add(new Phone(phoneID,brand,phoneModelName,phoneStock,discountRatePhone,screenSizePhone,batteryCapacity,phoneRam,256,phoneColor,5000));
                                    System.out.println("Phone created");
                                }
                            }

                            break;
                        case 2:
                            System.out.println("Phone List");
                            System.out.println("--------------------------");
                            System.out.println("| ID | Product Name \t\t| Price\t| Brand\t| Storage (GB)\t | Screen Size\t| RAM");
                            for (Phone phone : phones) {
                                System.out.println("| " + phone.getPhoneID() + "  | " + phone.getName() + "\t\t\t\t| " + phone.getPrice() +"| " + phone.getBrand().getTitle() + "\t| " + phone.getStorageCapacity() + "\t\t\t | " + phone.getScreenSize() + "\t\t\t| " + phone.getRam());
                            }
                            break;
                        default:
                            System.out.println("Invalid input");
                    }

                    break;
                case 3:
                    System.out.println("Our brands \n------------");
                    for (Brand brand : brands) {
                        System.out.println("- " + brand.getTitle());
                    }
                    System.out.println("press any number for return");
                    int exit = sc.nextInt();
                    break;
                default:
                    System.out.println("İnvalid input");
            }
        }
    }
}