package ExceptionHandling;

public class Exception02zeroDiv {
    public static void main(String[] args){
        try{
            int[] a = new int[2];
            int b = 0;
            int c=1/b;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bount ");
        }
        catch (Exception e){
            System.out.println("Exception triggered "+e);
        }
        finally {
            System.out.println("Finally printed");
        }
        System.out.println("Everything executed");

    }
}
