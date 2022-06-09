package Practice.exercise1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner sc = new Scanner(System.in);


        String value = sc.nextLine();
        client.doUnchecked(value);
        client.doChecked();
    }
}
