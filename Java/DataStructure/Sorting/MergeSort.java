package DataStructure.Sorting;

import java.security.spec.RSAOtherPrimeInfo;

public class MergeSort {
    public static int[] mergeSort(int[] x, int min, int max){
        //int length = x.length;
        if (min >= max) return new int[]{x[min]};
        int mid = (min + max)/2;
        int[] leftMerge = mergeSort(x,min, mid);
        int[] rightMerge = mergeSort(x,mid+1, max);

        return merge(leftMerge, rightMerge);
    }

    public static int[] merge(int[] left, int[] right){
        int[] final_merge = new int[left.length+right.length];
        int i=0, j=0, k=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]) final_merge[k++]=left[i++];
            else final_merge[k++] = right[j++];
        }
        while(i<left.length) final_merge[k++]=left[i++];
        while(j<right.length) final_merge[k++]=right[j++];
        return final_merge;

    }

    public static void main(String[] args) {
        int[] x = {1,23,3,4,54,45,56,52,65,55,66,55};
        x = mergeSort(x,0,x.length-1);
        for(int i:x) System.out.print(i+" ");
    }
}
