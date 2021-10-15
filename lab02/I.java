import java.util.Scanner;
public class Main {
    public static int silnia( int f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * silnia(f - 1);
        }
    }

    public static void main(String[] args) {
        //I

        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = myObj.nextInt();

        float wynik = 0;
        int i = 1;




            while (i <= n) {

                wynik += (Math.pow(-1,i)*myObj.nextInt())/silnia(i);

                i++;
            }
            System.out.println(wynik);

    }


        }

