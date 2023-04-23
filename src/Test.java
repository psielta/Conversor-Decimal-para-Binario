import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Digite um número decimal: ");
        double decimal = new Scanner(System.in).nextDouble();
        int parteInteira = (int) decimal;
        double parteDecimal = decimal - parteInteira;
        System.out.printf("%.36f", Converter.convertDecToBinary(parteInteira) + Converter.convertDecToBinary(parteDecimal));
    }
}
