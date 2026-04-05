package grocery_management;
import java.sql.*;
import java.util.Scanner;
public class Main {
		    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
		        ProductService service = new ProductService();
		        int choice;
		        do {
		            System.out.println("\n===== GROCERY MANAGEMENT SYSTEM =====");
		            System.out.println("1. Add Product");
		            System.out.println("2. View Products");
		            System.out.println("3. Update Product");
		            System.out.println("4. Delete Product");
		            System.out.println("5. Purchase Product");
		            System.out.println("6. Exit");
		            System.out.println("7. Generate Bill");
		            System.out.print("Enter your choice: ");

		            choice = sc.nextInt();

		            switch (choice) {

		                case 1:
		                    sc.nextLine(); // clear buffer
		                    System.out.print("Enter product name: ");
		                    String name = sc.nextLine();

		                    System.out.print("Enter price: ");
		                    double price = sc.nextDouble();

		                    System.out.print("Enter quantity: ");
		                    int quantity = sc.nextInt();

		                    service.addProduct(name, price, quantity);
		                    break;

		                case 2:
		                    service.viewProducts();
		                    break;

		                case 3:
		                    System.out.print("Enter product ID: ");
		                    int id = sc.nextInt();

		                    System.out.print("Enter new price: ");
		                    double newPrice = sc.nextDouble();

		                    System.out.print("Enter new quantity: ");
		                    int newQty = sc.nextInt();

		                    service.updateProduct(id, newPrice, newQty);
		                    break;

		                case 4:
		                    System.out.print("Enter product ID to delete: ");
		                    int deleteId = sc.nextInt();

		                    service.deleteProduct(deleteId);
		                    break;

		                case 5:
		                    System.out.print("Enter product ID: ");
		                    int pId = sc.nextInt();

		                    System.out.print("Enter quantity to purchase: ");
		                    int buyQty = sc.nextInt();

		                    service.purchaseProduct(pId, buyQty);
		                    break;

		                case 6:
		                    System.out.println("Exiting... Thank you! 👋");
		                    break;
		                case 7:
		                    System.out.print("Enter product ID: ");
		                    pId = sc.nextInt();

		                    System.out.print("Enter quantity: ");
		                    int qty = sc.nextInt();
		                    service.generateBill(pId, qty);

		                    
		                    break;

		                default:
		                    System.out.println("Invalid choice ❌");
		            }

		        } while (choice != 6);

		        sc.close();
		    }
		}
	


