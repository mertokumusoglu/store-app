import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static TreeSet<Brand> brands = new TreeSet<>();
    private static ArrayList<Product> products = new ArrayList<>();

    public static int productIdCounter = 1;
    public static void main(String[] args) {
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
                    System.out.print("1 - Add notebook \n2 - List notebooks \n3 - Delete Notebook\n4 - Return\nEnter action: ");
                    int subChoiceNotebook = sc.nextInt();
                    switch (subChoiceNotebook) {
                        case 1:

                            System.out.println("Brand:");
                            displayBrands();
                            int brandID = sc.nextInt();
                            Brand selectedBrand = getBrandById(brandID);

                            System.out.print("Model name: ");
                            String modelName = sc.next();

                            System.out.print("Unit price: ");
                            Double unitPriceNotebook = sc.nextDouble();

                            System.out.print("Discount rate: ");
                            Double discountRateNotebook = sc.nextDouble();

                            System.out.print("stock: ");
                            int notebookStock = sc.nextInt();

                            System.out.print("Ram: ");
                            int ram = sc.nextInt();

                            System.out.print("Storage (GB): ");
                            String storage = sc.next();

                            System.out.print("Screen Size : ");
                            double screenSize = sc.nextDouble();
                            Notebook newNotebook = new Notebook(productIdCounter, unitPriceNotebook,discountRateNotebook,notebookStock,modelName,
                                    selectedBrand,ram,storage,screenSize);
                            if(newNotebook != null) {
                                products.add(newNotebook);
                                productIdCounter++;
                                System.out.println(newNotebook.brand.getTitle() + " " + newNotebook.modelName + " added succesfully.");
                            }
                            else {
                                System.out.print("ERROR!");
                            }
                            break;
                        case 2:
                            System.out.println("Notebook List \n------------");
                            for (Product product : products) {
                                if (product instanceof Notebook) {
                                    product.displayDetails();
                                    System.out.println("----------------------------");
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Enter id you want to delete");
                            int productId = sc.nextInt();
                            Product productToDelete = getProductById(productId);
                            if(productToDelete != null) {
                                products.remove(productToDelete);
                                System.out.println("DELETED SUCCESFULLY.");
                            }
                            else {
                                System.out.println("INVALID ID");
                            }
                            break;
                        case 4:
                            System.out.println("Returning");
                            break;
                        default:
                            System.out.println("Invalid input");
                    }
                    break;
                case 2:
                    System.out.print("1 - Add Mobile Phone \n2 - List Mobile phones \n3 - Delete Mobile Phone\n4 - Return\nEnter action: ");
                    int subChoicePhone = sc.nextInt();
                    switch (subChoicePhone) {
                        case 1:
                            System.out.println("Brand:");
                            displayBrands();
                            int brandID = sc.nextInt();
                            Brand selectedBrand = getBrandById(brandID);

                            System.out.print("Model name: ");
                            String modelName = sc.next();

                            System.out.print("Unit price: ");
                            Double unitPriceMobilePhone = sc.nextDouble();

                            System.out.print("Discount rate: ");
                            Double discountRateMobilePhone = sc.nextDouble();

                            System.out.print("stock: ");
                            int MobilePhoneStock = sc.nextInt();

                            System.out.print("Memory (GB): ");
                            String memory = sc.next();

                            System.out.print("Screen Size: ");
                            double screenSize = sc.nextDouble();

                            System.out.print("Battery Power: ");
                            int batteryPower = sc.nextInt();

                            System.out.print("RAM (GB): ");
                            int ram = sc.nextInt();

                            System.out.print("Color: ");
                            String color = sc.next();

                            MobilePhone newMobilePhone = new MobilePhone(productIdCounter, unitPriceMobilePhone, discountRateMobilePhone, MobilePhoneStock,
                                    modelName, selectedBrand, memory, screenSize, batteryPower, ram, color);
                            if(newMobilePhone != null) {
                                products.add(newMobilePhone);
                                productIdCounter++;
                                System.out.println(newMobilePhone.brand.getTitle() + " " + newMobilePhone.modelName + " added succesfully.");
                            }
                            else {
                                System.out.print("ERROR!");
                            }
                            break;
                        case 2:
                            System.out.println("Mobile Phone List \n------------");
                            for (Product product : products) {
                                if (product instanceof MobilePhone) {
                                    product.displayDetails();
                                    System.out.println("----------------------------");
                                }
                            }

                            break;
                        case 3:
                            System.out.println("Enter id you want to delete");
                            int productId = sc.nextInt();
                            Product productToDelete = getProductById(productId);
                            if(productToDelete != null) {
                                products.remove(productToDelete);
                                System.out.println("DELETED SUCCESFULLY.");
                            }
                            else {
                                System.out.println("INVALID ID");
                            }
                            break;
                        case 4:
                            System.out.println("Returning");
                            break;
                        default:
                            System.out.println("Invalid input");
                    }
                    break;
                case 3:
                    displayBrands();
                    System.out.println("press any number for return");
                    int exit = sc.nextInt();
                    break;
                default:
                    System.out.println("İnvalid input");
            }
        }
    }
    public static Brand getBrandById(int BrandId) {
        for(Brand brand : brands) {
            if(brand.getBrandID() == BrandId) {
                return brand;
            }
        }
        return null;
    }

    public static void displayBrands() {
        System.out.println("Our brands \n------------");
        for (Brand brand : brands) {
            System.out.println(brand.getBrandID() + " - " + brand.getTitle());
        }
    }
    private static Product getProductById(int productId) {
        for (Product product : products) {
            if (product.id == productId) {
                return product;
            }
        }
        return null;
    }
}