public class Pollymorphism {
    void add(int x, int y){
        System.out.println(x+y);
    }
    void add(int x, int y, int z){
        System.out.println(x*y*z);
    }
    void add(int x, char y){
        System.out.println(x*y);
    }
    void add(int x, String y){
        System.out.println(x+y);
    }
    public static void main(String[] args){
        Pollymorphism p1 = new Pollymorphism();
        p1.add(2,3);
        p1.add(2,2,2);
        p1.add(2,'A');
        p1.add(2, "_hemant");
    }
}
