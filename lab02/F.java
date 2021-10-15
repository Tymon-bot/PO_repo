import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //F

        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = myObj.nextInt();

        int wynik = 0;
        int i = 0;


        while (i<n) {

            wynik+=Math.pow(myObj.nextInt(),2);
            i++;
        }
         System.out.println(wynik);
    }
}
