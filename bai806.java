import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class bai806 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        long sum = 0;
        for(int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            list.add(tmp);
        }
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        for(int x : list){
            sum += x;
        }
        System.out.println(sum);
        sc.close();
   }
}
