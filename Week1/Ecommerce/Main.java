public class Main {
    public static void main(String[] args) {
        ProductSearchFunctionality search = new ProductSearchFunctionality();

        search.addProduct(new Products(1, "Laptop", "Electronics", 6, 50000));
        search.addProduct(new Products(2, "Chair", "Furniture", 13, 1500));
        search.addProduct(new Products(3, "Computer", "Electronics", 9, 40000));

        System.out.println("Linear Search:");
        Products result1 = search.linearSearch(1); // want to find product having ID 1
        if (result1 != null) {
            System.out.println(result1);
        } else {
            System.out.println("Product not found");
        }

        System.out.println("\nBinary Search:");
        Products result2 = search.binarySearch(3); // what to find product having ID 3
        if (result2 != null) {
            System.out.println(result2);
        } else {
            System.out.println("Product not found");
        }
    }
}
