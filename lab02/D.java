import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //D

        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = myObj.nextInt();

        int wynik = 0;
        int i = 0;


        while (i<n) {

            wynik+= Math.sqrt(Math.abs((myObj.nextInt())));
            i++;
        }
         System.out.println(wynik);
    }
}
