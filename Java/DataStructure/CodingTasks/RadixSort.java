package DataStructure.CodingTasks;
import java.util.ArrayList;
import java.util.Collections;

public class RadixSort {
    public static ArrayList<Integer> radixSort(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return arr;

        int max = Collections.max(arr);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }

        return arr;
    }

    private static void countingSort(ArrayList<Integer> arr, int exp) {
        int n = arr.size();
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            int digit = (arr.get(i) / exp) % 10;
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr.get(i) / exp) % 10;
            output[count[digit] - 1] = arr.get(i);
            count[digit]--;
        }

        for (int i = 0; i < n; i++) {
            arr.set(i, output[i]);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(170);
        arr.add(45);
        arr.add(75);
        arr.add(90);
        arr.add(802);
        arr.add(24);
        arr.add(2);
        arr.add(66);

        System.out.println("Unsorted array: " + arr);
        ArrayList<Integer> sortedArr = radixSort(arr);
        System.out.println("Sorted array: " + sortedArr);
    }
}
