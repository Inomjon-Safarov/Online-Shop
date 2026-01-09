import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1->Qushish 2->Ko'rish 3->Uchirish 4->Nomini uzgartirish 5-> Chiqish");
            System.out.print("Tanlang :");
            int tanlov = scanner.nextInt();
            scanner.nextLine(); 

            if (tanlov == 1) {
                System.out.print("Nomi");
                String name = scanner.nextLine();
                System.out.print("Narxi");
                double price = scanner.nextDouble();
                shop.addProduct(new Product(name, price));

            } else if (tanlov == 2) {
                shop.showProducts();

            } else if (tanlov == 3) {
                shop.showProducts();
                System.out.print("Uchirish uchun tartib raqamini kiriting");
                int index = scanner.nextInt();
                shop.deleteProduct(index);

            } else if (tanlov == 4) {
                shop.showProducts();
                System.out.print("Qaysi raqamdagi mahsulot nomi o'zgarsin? ");
                int index = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Yangi nomni kiriting: ");
                String newName = scanner.nextLine();
                shop.updateProductName(index, newName);

            } else if (tanlov == 5) {
                break;
            }
        }
        scanner.close();
    }
}