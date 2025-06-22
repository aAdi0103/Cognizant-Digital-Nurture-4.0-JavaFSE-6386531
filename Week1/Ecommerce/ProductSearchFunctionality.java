import java.util.Arrays;

public class ProductSearchFunctionality {
    private static final Products[] products = new Products[10];
    private static int index = 0;

     public void addProduct(Products product) {
        if (index < products.length) {
            products[index++] = product;
        } else {
            System.out.println("Product list is full");
        }
    }

    private void sortById() {
        Arrays.sort(products, 0, index, (a, b) -> a.getProductId() - b.getProductId());
    }

    public Products linearSearch(int productId) {
        for (int i = 0; i < index; i++) {
            if (products[i].getProductId() == productId) {
                return products[i];
            }
        }
        return null;
    }


    public Products binarySearch(int productId) {
        sortById(); // As we know binary search requires sorted array 
        int low = 0, high = index - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].getProductId() == productId) {
                return products[mid];
            } else if (products[mid].getProductId() > productId) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }

  // Time Complexity of Linear Search: O(n)
// Time Complexity of Binary Search: O(log n)

// When we have a Sorted Data then we must use Binary Search Algo as it can only search in O(logn) time hence it is more efficient than Linear Search which takes O(n) time.

// But if we have Unsorted Data then we must use Linear Search Algo as it can search in O(n) time and Binary Search requires Sorted Data to work. ANd Sorting takes O(n log n) time, which is more than Linear Search in worst case.

    public Products[] getProducts() {
        return Arrays.copyOf(products, index);
    }
}


