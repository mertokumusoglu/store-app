import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Brand> brands = new TreeSet<>();
        ArrayList<MobilePhone> phones = new ArrayList<>();

        brands.add(new Brand(1,"Samsung"));
        brands.add(new Brand(2,"Lenovo"));
        brands.add(new Brand(3,"Apple"));
        brands.add(new Brand(4,"Huawei"));
        brands.add(new Brand(5,"Casper"));
        brands.add(new Brand(6,"Asus"));
        brands.add(new Brand(7,"HP"));
        brands.add(new Brand(8,"Xiaomi"));
        brands.add(new Brand(9,"Monster"));



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

                            break;
                        case 2:
                            System.out.println("Phone List");
                            System.out.println("--------------------------");

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