import java.util.ArrayList;
import java.util.Scanner;

public class bai817 {
    public static ArrayList<Character> doiNhiPhan(long n){
        ArrayList<Character> tmp = new ArrayList<>();
        while (n >= 1) {
            char x ;
            long t = n % 2;
            if(t == 0) {
                x = '0';
                tmp.add(0, x);
            }
            else if(t == 1){
                x = '1';
                tmp.add(0, x);
            }
            n /= 2;
        }
        return tmp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Character>> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            long tmp = sc.nextLong();
            list.add(doiNhiPhan(tmp));
        }
        
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < 64 - list.get(i).size(); j++){
                System.out.print("0");
            }
            for(int j = 0; j < list.get(i).size(); j++){
                System.out.print(list.get(i).get(j));
            }
            System.out.println();
        }
        sc.close();
    }
}
