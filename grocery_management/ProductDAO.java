package grocery_management;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class ProductDAO {
	public void addProduct(String name,double price,int quantity) {
			try {
				Connection conn=DBConnection.getConnection();
				String query="Insert into products(name,price,quantity) values (?, ? ,?)";
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setString(1,name);
				ps.setDouble(2, price);
				ps.setInt(3, quantity);
				
				int rows=ps.executeUpdate();
				if(rows>0) {
					System.out.println("Product added Sucessfully");
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	public void updateProduct(int id,double price,int quantity) {
		try {
			Connection conn=DBConnection.getConnection();
			String query="Update products set price=?,quantity=? where  id=?";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setDouble(1, price);
			ps.setInt(2, quantity);
			ps.setInt(3,id);
			int rows=ps.executeUpdate();
			if(rows>0) {
				System.out.println("Product updated sucessfully");
			}
			else {
				System.out.println("Product not found");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void deleteProduct(int id) {
		try {
			Connection conn=DBConnection.getConnection();
			String query="Delete from products where id=?";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setInt(1, id);
			int rows=ps.executeUpdate();
			if(rows>0) {
				System.out.println("Product deleted Sucessfully");
			}
			else {
				System.out.println("Product not found");
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public List<Product> getAllProducts() {

	    List<Product> list = new ArrayList<>();

	    try {
	        Connection conn = DBConnection.getConnection();

	        String query = "SELECT * FROM products";

	        PreparedStatement ps = conn.prepareStatement(query);

	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {

	            int id = rs.getInt("id");
	            String name = rs.getString("name");
	            double price = rs.getDouble("price");
	            int quantity = rs.getInt("quantity");

	            Product p = new Product(id, name, price, quantity);

	            list.add(p);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return list;
	}
}
