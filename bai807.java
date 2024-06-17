import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int  x = sc.nextInt();
            int y = sc.nextInt();
            double tmp = Math.sqrt(x * x + y * y);
            list.add(tmp);
        }
        for(double x : list){
            System.out.printf("%.2f", x);
            System.out.print(" ");
        }
        sc.close();
    }
}
