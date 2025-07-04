package Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.util.stream.Stream;

public class Stream_task12 {
    public static void main(String[] args) {
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("Hemant");
//        arr.add("Hemant1");
//        arr.add("Hemant2");
//        arr.add("Hemant3");
//        arr.add("Hemant4");
//
//        List<String> firstname = new ArrayList<>();
//        firstname.add("Hemant, Kumar");
//        firstname.add("Sumant1, Singh");
//        firstname.add("Mahant2, Reddy");
//        firstname.add("Manhunt3, Naidu");
//        firstname.add("Hemant4, Pandey");
//
//        firstname.stream()
//                .filter((p)->p.startsWith("M"))
//                .map((p) -> p.toLowerCase())
//                .sorted()
//                .forEach((p) -> System.out.println(p));

        List<Integer> num = new ArrayList<Integer>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number for square or 'END' to end session");
        String input = null;
        while (true){
            input = sc.nextLine();
            if(!input.equals("END")){
                num.add(Integer.parseInt(input));
            }else{
                break;
            }
        }
        List<Integer> numSq = num.stream().map((n)->n*n).collect(Collectors.toList());
        List<Integer> oddNum = num.stream().filter((n)->(n%2!=0)).collect(Collectors.toList());
        List<Integer> unique = num.stream().distinct().collect(Collectors.toList());
        List<Integer> limit = num.stream().limit(num.size()-2).collect(Collectors.toList());
        Optional<Integer> sum = limit.stream().reduce((x, y)-> x+y);
        Optional<Integer> max = limit.stream().reduce((x, y)-> x>y?x:y);
//        numSq.forEach(x -> System.out.println("Square is "+ x));
//        oddNum.forEach(x -> System.out.println("Odd num are "+ x));
//        unique.forEach(x -> System.out.println("Unique "+ x));
//        limit.forEach(x -> System.out.println("limit "+ x));
        System.out.println("Square is : "+numSq);
        System.out.println("Odd num are : "+oddNum);
        System.out.println("Unique are : " +unique);
        System.out.println("Limit to size-2 : "+limit+" sum: "+sum+"Max: "+max);

        Stream<Integer> nums = Stream
                .iterate(1, n -> n+1)
                .limit(20);

        Stream<Integer> SkipNums = nums.skip(15);
        SkipNums.forEach(System.out::println);
    }
}
