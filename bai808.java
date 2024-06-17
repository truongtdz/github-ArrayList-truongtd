import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Long> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            long tmp = x + y + z;
            list.add(tmp);
        }
        for(long x : list){
            System.out.print(x + " ");
        }
        sc.close();
    }
}
