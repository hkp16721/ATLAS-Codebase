package DataStructure.Sorting;

public class InsertionSort {
    public static void insertionSort(int[] x){
        int length = x.length;
        if(length>0){
            for(int i=1;i<length-1;i++){
                int next = x[i];
                int j = i-1;
                while (j>=0 && x[j]>next){
                    x[j+1] = x[j];
                    j=j-1;
                }
                x[j+1] = next;
            }

        }
        printArray(x);
    }
    static void printArray(int[] x) {
        for (int value : x) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] x = {1,2,4,3,5,67,43,76,88};
        insertionSort(x);
    }
}
