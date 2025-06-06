public class Task017 {
    public static void main(String[] args){
        Person p = new Person();
        System.out.println(p.getName());
        p.setName("HemantKumar");
        System.out.println(p.getName());
        //p.name ="john" - this will throw error as variable is private and won't be directly accessible
    }
}
