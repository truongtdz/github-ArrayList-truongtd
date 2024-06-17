import java.util.ArrayList;
import java.util.Scanner;

public class bai812 {
    public static ArrayList<Integer> latNguoc(ArrayList<Integer> list){
        ArrayList<Integer> arr = new ArrayList<>();
        int n = list.size();
        for(int i = 0; i < n; i++){
            arr.add(list.get(n - i - 1));
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
        list = latNguoc(list);
        for(int x : list){
            System.out.print(x + " ");
        } 
        sc.close();
    }
}
