import java.util.Scanner;

public class Main2 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n<10) {
            System.out.println("talet är mindre en 10");
        } else {

            System.out.println("talet är större än 10");

        }
        Boolean b = s.nextBoolean();
        System.out.println(b);
        s.close();
    }
}
