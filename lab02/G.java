import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //G

        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = myObj.nextInt();

        int wynik = 0;
        int wynik1 = 1;
        int i = 0;
        int z = 0;


        while (i<n) {

            z = myObj.nextInt();
            wynik+=z;
            wynik1*=z;
            i++;
        }
         System.out.println(wynik);
         System.out.println(wynik1);
    }
}
