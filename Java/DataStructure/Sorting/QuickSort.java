package DataStructure.Sorting;

public class QuickSort {
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivotPosition = doPartition(arr, start, end);
            quickSort(arr, start, pivotPosition - 1);
            quickSort(arr, pivotPosition + 1, end);
        }
    }

    public static int doPartition(int[] arr, int left, int right) {
        int pivotValue = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] < pivotValue) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 7, 8, 9, 1, 5,55};
        int n = numbers.length;

        quickSort(numbers, 0, n - 1);

        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

