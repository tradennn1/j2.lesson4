import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            A.add(scanner.nextLine());
        }
        System.out.println(A);
        for (int i = 0; i < 5; i++) {
            B.add(scanner.nextLine());
        }
        System.out.println(B);
        Collections.reverse(B);
        System.out.println(B);

        Integer x = 0;
        while (C.size() < A.size()) {
            C.add(A.get(x));
            C.add(B.get(x));
            x++;
        }
        C.add(A.get(0));
        C.add(B.get(1));
        System.out.println(C);
        Collections.sort(C, new Comparator<String>() {
            @Override
            public int compare(String t1, String t2) {
                return t1.length() - t2.length();
            }
        });
        System.out.println(C);
    }
}
