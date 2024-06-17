import java.util.ArrayList;
import java.util.Scanner;

public class bai801{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int lc = sc.nextInt();
            if(lc == 1) {
                int tmp = sc.nextInt();
                arr.add(tmp);
            }
            if(lc == 2){
                if(arr.isEmpty()) continue;
                else arr.remove(arr.size() - 1);
            }
        }
        if(arr.isEmpty()) System.out.print("EMPTY");
        else{
            for(int x : arr){
            System.out.print(x + " ");
            }
        }
        
        sc.close();
    }
}