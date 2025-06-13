package ExceptionHandling;

public class NestedTry06 {
    public static void main(String[] args) {
        try{
            int[] a=new int[2];
            System.out.println(a[2]);
//            System.out.println(a[2]);
            try{
                int b=1;
                int c=0/b;
            }
            catch (ArithmeticException e){
                System.out.println("Exception in nested block : "+ e);
            }

        }catch (IndexOutOfBoundsException e){
            System.out.println("Main try block executed");
        }
    }
}
