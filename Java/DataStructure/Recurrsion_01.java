package DataStructure;

public class Recurrsion_01 {
    public static int sumOfSquires(int m, int n){
        if(m==n) return m*n;
        else{
            int middle = (m+n)/2;
            return (sumOfSquires(m,middle)+sumOfSquires(middle+1,n));
        }
    }

    public static void main(String[] args) {

        System.out.println(sumOfSquires(5,9));
    }
}
