import java.util.HashMap;

public class DataStructure {
    private HashMap<Integer, Product> inventory;

    public DataStructure() {
        inventory = new HashMap<>();
    }

    public void add(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            System.out.println("Product is already present");
        } else {
            inventory.put(product.getProductId(), product);
            System.out.println("Product added");
        }
    }

    public void update(int productId, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product updated");
        } else {
            System.out.println("Product not found");
        }
    }

    public void delete(int productId) {
        if (inventory.remove(productId) != null) {
            System.out.println("Product deleted");
        } else {
            System.out.println("Product not found");
        }
    }

    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product p : inventory.values()) {
                System.out.println(p);
            }
        }
    }
}
