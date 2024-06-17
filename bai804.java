import java.util.ArrayList;
import java.util.Scanner;

public class bai804 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            list.add(tmp);
        }
        int a = sc.nextInt(), b = sc.nextInt();
        for(int i = a; i <= b; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for(int i = b; i >= a; i--){
            System.out.print(list.get(i) + " ");
        }
        sc.close();
    }
}
