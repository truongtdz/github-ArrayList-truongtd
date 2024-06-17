import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class bai805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            list.add(tmp);
        }
        int a = sc.nextInt(), b = sc.nextInt();
        Collections.reverse(list);
        for(int x : list){
            System.out.print(x + " ");
        }
        System.out.println();
        List<Integer> list2 = list.subList(a, b + 1);
        Collections.reverse(list2);
        for(int x : list){
            System.out.print(x + " ");
        }
        sc.close();
    }
}
