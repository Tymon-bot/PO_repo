
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Zadanie 1 a

        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj n");
        Integer n = myObj.nextInt();

        System.out.println(n);

        int i = 0;
        int suma = 0;

        while (i<=n){

            suma += myObj.nextInt();
            i++;


        System.out.println(suma);





    }
}



