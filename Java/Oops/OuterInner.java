package Oops;

class Outer {
    int x=10;
//    class InnerClass{
//    private class InnerClass{
    static class InnerClass{
        static int y=5;
//        public int innerMethod(){
//            return x;
//        }

    }
//    InnerClass in = new InnerClass();
//    int z=in.y;
}
public  class OuterInner {
    public static void main(String[] args) {
        Outer out=new Outer();
//        Outer.InnerClass inn=out.new InnerClass();
        Outer.InnerClass newInn = new Outer.InnerClass();
//        System.out.println(out.x + out.z);
//        System.out.println(inn.innerMethod());
        System.out.println(newInn.y);
    }
}
