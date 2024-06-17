import java.util.ArrayList;
import java.util.Scanner;

public class bai811 {
    public static boolean xetNT(int n){
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static ArrayList<Integer> timNT(ArrayList<Integer> list){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int x : list){
            if(xetNT(x)) arr.add(x);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            list.add(tmp);
        }
        ArrayList<Integer> arr = timNT(list);
        for(int x : arr){
            System.out.print(x + " ");
        }
        sc.close();
    }
}
