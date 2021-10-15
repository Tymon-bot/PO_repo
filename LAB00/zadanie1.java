public class zadanie1 {

    public static void main(String arg[]){
        double poczatkowe_saldo = 1000;
        double oprocentowanie = 0.06;
        double pierwszy_rok = 1000 + (1000 * 0.06);
        double drugi_rok = pierwszy_rok + (pierwszy_rok * 0.06);
        double trzeci_rok = drugi_rok + (drugi_rok * 0.06);

        System.out.println("Pierwszy rok: " + pierwszy_rok);
        System.out.println("Drugi rok: " + drugi_rok);
        System.out.println("Trzeci rok: " + trzeci_rok);
    }
}
