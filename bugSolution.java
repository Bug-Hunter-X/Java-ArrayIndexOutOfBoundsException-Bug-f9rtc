public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (arr.length > 0 && 0 <= 4 && 4 < arr.length) {
            arr[4] = 10; // Accessing a valid index
            System.out.println(arr[4]);
        } else {
            System.out.println("Invalid array index.");
        }
    }
}