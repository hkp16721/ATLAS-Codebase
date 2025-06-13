package Java;
public class Task20 {
    public static void main(String[] args){
        char[] name={'H','e','m','a','n','t'};
        System.out.println(name);
        int n =name.length;
        System.out.printf("Total %d letters in my name \n",n);
//        for(int i=0;i<n;i++){
//            System.out.println(name[i]);
//        }
        for (char c : name) {
            System.out.println(c);
        }
        SuperClass s1= new SuperClass();

    }
}

