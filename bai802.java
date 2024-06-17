import java.util.ArrayList;
import java.util.Scanner;

public class bai802 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list =  new ArrayList<>();
        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            int tmp = sc.nextInt();
            list.add(tmp);
        }
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int lc = sc.nextInt();
            if(lc == 1){
                int viTri = sc.nextInt();
                int tmp = sc.nextInt();
                list.add(viTri, tmp);
            }
            if(lc == 2){
                int viTri = sc.nextInt();
                list.remove(viTri);
            }
        }
        for(int x : list){
            System.out.print(x + " ");
        }
        sc.close();
    }
}
