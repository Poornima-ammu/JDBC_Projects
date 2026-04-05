package grocery_management;

import java.util.List;

public class ProductService {

    private ProductDAO dao = new ProductDAO();

    // ✅ Add Product with validation
    public void addProduct(String name, double price, int quantity) {

        if (name == null || name.trim().isEmpty()) {
            System.out.println("Product name cannot be empty ❌");
            return;
        }

        if (price <= 0) {
            System.out.println("Price must be greater than 0 ❌");
            return;
        }

        if (quantity < 0) {
            System.out.println("Quantity cannot be negative ❌");
            return;
        }

        dao.addProduct(name, price, quantity);
    }

    // ✅ View Products
    public void viewProducts() {
        List<Product> list = dao.getAllProducts();

        if (list.isEmpty()) {
            System.out.println("No products available 📭");
            return;
        }

        for (Product p : list) {
            System.out.println(
                p.getId() + " | " +
                p.getName() + " | " +
                p.getPrice() + " | " +
                p.getQuantity()
            );
        }
    }

    // 🔍 Helper method (VERY IMPORTANT)
    private Product findProductById(int id) {

        List<Product> list = dao.getAllProducts();

        for (Product p : list) {
            if (p.getId() == id) {
                return p;
            }
        }

        return null;
    }

    // ✅ Update Product with existence check
    public void updateProduct(int id, double price, int quantity) {

        Product p = findProductById(id);

        if (p == null) {
            System.out.println("Product not found ❌");
            return;
        }

        if (price <= 0 || quantity < 0) {
            System.out.println("Invalid data ❌");
            return;
        }

        dao.updateProduct(id, price, quantity);
    }

    // ✅ Delete Product with check
    public void deleteProduct(int id) {

        Product p = findProductById(id);

        if (p == null) {
            System.out.println("Product not found ❌");
            return;
        }

        dao.deleteProduct(id);
    }

    // 🔥 Purchase Product (STRONG LOGIC)
    public void purchaseProduct(int id, int buyQty) {

        Product p = findProductById(id);

        if (p == null) {
            System.out.println("Product not found ❌");
            return;
        }

        if (buyQty <= 0) {
            System.out.println("Invalid quantity ❌");
            return;
        }

        if (p.getQuantity() < buyQty) {
            System.out.println("Not enough stock ❌");
            return;
        }

        int newQty = p.getQuantity() - buyQty;

        dao.updateProduct(id, p.getPrice(), newQty);

        System.out.println("Purchase successful ✅");

        if (newQty < 5) {
            System.out.println("⚠ Low stock alert!");
        }
    }
    public void generateBill(int id, int buyQty) {

        List<Product> list = dao.getAllProducts();
        boolean found = false;

        for (Product p : list) {

            if (p.getId() == id) {
                found = true;

                if (p.getQuantity() >= buyQty) {

                    double price = p.getPrice();
                    double total = price * buyQty;

                    System.out.println("------ BILL ------");
                    System.out.println("Product: " + p.getName());
                    System.out.println("Price: " + price);
                    System.out.println("Quantity: " + buyQty);
                    System.out.println("Total Amount: " + total);

                    int newQty = p.getQuantity() - buyQty;
                    dao.updateProduct(id, price, newQty);

                } else {
                    System.out.println("Not enough stock ❌");
                }

                break;
            }
        }

        if (!found) {
            System.out.println("Product not found ❌");
        }
    }
}