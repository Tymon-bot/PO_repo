import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //H

        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = myObj.nextInt();

        int wynik = 0;
        int i = 1;



        while (i<=n) {

            wynik+=(myObj.nextInt()*Math.pow(-1,i+1));

            i++;
        }
         System.out.println(wynik);

    }
}
