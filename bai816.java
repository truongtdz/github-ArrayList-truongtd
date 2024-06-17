import java.util.ArrayList;
import java.util.Scanner;

public class bai816 {
    public static Integer timKiem(ArrayList<ArrayList<Integer>> list, int t, int l){
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.get(i).size(); j++){
                if(i + 1 == t && j + 1 ==l) return list.get(i).get(j);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n = sc.nextInt(), m = sc.nextInt();
        for(int i = 0; i < n; i++){
            ArrayList<Integer> arr = new ArrayList<>();
            int y = sc.nextInt();
            for(int j = 0; j < y; j++){
                arr.add(sc.nextInt());
            }
            list.add(arr);
        }
        for(int m1 = 0; m1 < m; m1++){
            int t = sc.nextInt(), l = sc.nextInt();
            System.out.print(timKiem(list, t, l) + " "); 
        }
        sc.close();
    }
}
