import java.util.Arrays;
public class Bubblesort { 
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }}
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7, 6};
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        bubbleSortDescending(numbers);
        System.out.println("After sorting (Descending): " + Arrays.toString(numbers));
    }
}