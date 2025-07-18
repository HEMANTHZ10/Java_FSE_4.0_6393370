package Week1_EngineeringConcepts.Module2_DataStructuresAndAlgorithms.EcommercePlatformSearchFunction;
/*
Big O Notation :
-> Big O Notation describes how the runtime or space requirements of an algorithm grow with input size n.
-> It gives the upper bound (worst-case) performance of an algorithm.

Linear Search : Sequentially checks each element in the array until the desired element is found or the end is reached.
Time Complexity Analysis of Linear Search
    - Best case : O(1) -> Required element is at first position
    - Average case : O(N)
    - Worst case : O(N)

Binary Search : Assumes the array is sorted, and then repeatedly divides the search interval in half. Compares the target with the middle element to decide which half to search next.
Time Complexity Analysis of Binary Search
    - Best case : O(1) -> Required element is exactly at the middle of the array
    - Average case : O(logN)
    - Worst case : O(logN)

-> Linear Search is best suited for 'smaller datasets where the data is unsorted'
-> Binary Search is best suited for 'larger datasets where the data is already sorted'
 */
public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Shoes", "Footwear"),
                new Product(3, "Smartphone", "Electronics"),
                new Product(4, "T-shirt", "Clothing"),
                new Product(5, "Watch", "Accessories")
        };
        System.out.println("Linear Search for Laptop!");
        Product LS = SearchUtil.linearSearch(products,"Laptop");
        System.out.println(LS==null?"Product not found!":LS);

        System.out.println("Binary Search for Shoes!");
        Product BS = SearchUtil.binarySearch(products,"Shoes");
        System.out.println(BS==null?"Product not found!":BS);
    }
}
