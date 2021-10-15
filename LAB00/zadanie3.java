public class zadanie3 {
    public static void main(String[] args) {
        int wynik = 1;
        for(int i = 1; i <= 10; i++){
            wynik *= i;
        }
        System.out.print("Iloczyn pierwszych 10 liczb: " + wynik);
    }
}
