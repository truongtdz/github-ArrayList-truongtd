import java.util.ArrayList;
import java.util.Scanner;

public class bai814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> tmp = new ArrayList<>();
        char c;
        while(sc.hasNext()){
            c = sc.next().charAt(0);
            if(Character.isUpperCase(c)) c = Character.toLowerCase(c);
            else if(Character.isLowerCase(c)) c = Character.toUpperCase(c);
            tmp.add(c);
        }
        for(Character x : tmp){
            System.out.print(x + " ");
        }
        sc.close();
    }
}
