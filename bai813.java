import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bai813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j = 0; j < m; j++){
                arr.add(sc.nextInt());
            }
            list.add(arr);
        }
        for(ArrayList<Integer> x : list){
            Collections.reverse(x);
        }
        for(int i = 0; i < n; i++){
            System.out.println();
            for(Integer x : list.get(i)){
                System.out.print(x + " ");
            }
        }
        sc.close();
    }
}
