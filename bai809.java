import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class bai809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            if(map.containsKey(tmp)){
                map.put(tmp, map.get(tmp) + 1);
            } else 
                map.put(tmp, 1);
        }
        for(Map.Entry<Integer, Integer> x : map.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
        sc.close();
    }
}
