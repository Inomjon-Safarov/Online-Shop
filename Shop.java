import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Mahsulot qushildi");
    }

    public void showProducts() {
        if (products.isEmpty()) {
            System.err.println("Ruyxat bush");
        } else {
            for (int i = 0; i < products.size(); i++) {
                System.out.println(i + ". " + products.get(i).getName() + " - " + products.get(i).getPrice());
            }
        }
    }

    public void deleteProduct(int index) {
        if (index >= 0 && index < products.size()) {
            System.err.println(products.get(index).getName() + " uchirildi");
            products.remove(index);
        } else {
            System.out.println("Bunday raqamli mahsulot yuq");
        }
    }

    public void updateProductName(int index, String newName) {
        if (index >= 0 && index < products.size()) {
            products.get(index).setName(newName);
            System.out.println("Nomi o'zgartirildi");
        } else {
            System.err.println("Xatolik: Mahsulot topilmadi.");
        }
    }
}