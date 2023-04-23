import java.util.Scanner;

public class Converter {
    public static int convertDecToBinary(int decimal){
        int resto;
        double pot = 1;
        int binario = 0;
        while (true ) {
            resto = decimal % 2;
            binario += resto * pot;
            if(decimal == 0)
                break;
            pot *= 10;
            decimal = decimal / 2;
        }
        return binario;
    }
    public static double convertDecToBinary(double decimal) {
        double pot = Math.pow(10, -1);
        double binario = 0;
        int conter = -1;
        while (decimal != 0 || conter > -100) {
            decimal *= 2;
            int parteInteira = (int) decimal;
            binario += pot * (parteInteira);
            pot = Math.pow(10, --conter);
            decimal -= parteInteira;
        }
        return binario;
    }

}
