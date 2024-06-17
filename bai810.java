import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class bai810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String tmp = sc.next();
            if(map.containsKey(tmp)){
                map.put(tmp, map.get(tmp) + 1);
            } else 
                map.put(tmp, 1);
        }
        System.out.println(map.size());
        for(Map.Entry<String, Integer> x : map.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
        sc.close();
    }
}
