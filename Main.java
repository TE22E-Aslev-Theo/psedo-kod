import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        String namn = s.nextLine();
        String lösenord = s.nextLine();

        if (namn == "root" && lösenord == "pass") {
            System.out.println("Ditt bankkonto har 0 kr");
        } else {System.out.println("Fel namn eller lösenord");}

        s.close();

    }

}
