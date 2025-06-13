package ExceptionHandling;

public class ExceptionHand {
    public static void main(String[] args){
        int[] arr = {1,2,3,5,6,7};
        try {
            System.out.println(arr[3]);
            System.out.println(arr[9]);
            System.out.println(arr[2]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("Please enter index between %d and %d ", 0, arr.length);
        }
        finally {
            System.out.println("this is finally block and below is your array \n");
            int i=0;
            for(int e : arr) {
                System.out.println("element : " + e+"- index - "+i++);
            }
        }
    }
}
