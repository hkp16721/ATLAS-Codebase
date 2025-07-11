package DataStructure.Sorting;

public class BubbleSort {
    public static boolean is_sorted(int[] x){
        int length = x.length;
        for(int i=0;i<length-2;i++){
            if(x[i] > x[i + 1]) return false;
        }
        return true;
    }

    public static void bubbleSort(int[] x){
        boolean isSorted = is_sorted(x);
        if(!isSorted){
            int length = x.length;
            boolean swaped;
            for(int i=0;i<length-1;i++){
                swaped = false;
                for(int j=0;j<length-i-1;j++){
                    if(x[j]>x[j+1]){
                        int temp = x[j];
                        x[j]=x[j+1];
                        x[j+1]=temp;
                        swaped = true;
                    }
                }
                if(!swaped){
                    break;
                }
            }
            printArray(x);
        }
        else{
            System.out.println("Array already sorted ");
            printArray(x);
        }

    }
    static void printArray(int[] x) {
        for (int value : x) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] ar = {12,76,53,44,56,65,77};
        bubbleSort(ar);
    }
}
