import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        for(int i = 0; i < n - 1; i++){
            if(!list.get(i).equals(list.get(i + 1)))
                list2.add(list.get(i));
        }
        list2.add(list.get(n - 1));
        if(list.size() == 1){
            System.out.println(list.get(0));
        } else{
            for(int x : list2){
            System.out.print(x + " ");
            }
        }
        
        sc.close();
    }
}
