import java.util.ArrayList;
import java.util.Scanner;

public class bai813 {
    public static ArrayList<ArrayList<Integer>> nhap(ArrayList<ArrayList<Integer>> list, int n, int m){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> tmp = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j = 0; j < m; j++){
                int x = sc.nextInt();
                arr.add(x);
            }
            tmp.add(arr);
        }
        sc.close();
        return tmp;
    }

    public static void xuat(ArrayList<ArrayList<Integer>> list, int n, int m){
        for(int i = 0; i < n; i++){
            System.out.println();
            for(int j = 0; j < m; j++){
                System.out.print(list.get(i).get(j) + " ");
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> latNguoc(ArrayList<ArrayList<Integer>> list, int n, int m){
        ArrayList<ArrayList<Integer>> tmp = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j = 0; j < m; j++){
                arr.add(list.get(i).get(m - j - 1));
            }
            tmp.add(arr);
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        list = nhap(list, n, m);
        list = latNguoc(list,n , m);
        xuat(list, n, m);
        sc.close();
    }
}
