public class Main {
    public static void main(String[] args) {
        DataStructure manager = new DataStructure();

        Product p1 = new Product(1, "Mobile", 8, 12000);
        Product p2 = new Product(2, "Laptop", 3, 70000);
        Product p3 = new Product(3, "Earbuds", 10, 800);
        manager.add(p1);
        manager.add(p2);
        manager.add(p3);

        System.out.println("\nAll Products");
        manager.displayInventory();

        System.out.println("\nUpdating product with ID 1");
        manager.update(1, 10, 12500);  

        System.out.println("\nDeleting product with ID 2");
        manager.delete(2);

        System.out.println("\nFinal Inventory:");
        manager.displayInventory();
    }
}
