import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class bai803 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            list.add(tmp);
        }
        list.sort(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2){
                return o1 - o2;
            }
        });
        list.forEach((x) -> System.out.print(x + " "));
        list.sort(new Comparator<Integer>() {
           public int compare(Integer o1, Integer o2){
               return o2 - o1;
           } 
        });
        System.out.println();
        list.forEach((x) -> System.out.print(x + " "));
        sc.close();
    }
}
