package java_projetos.converte_temperatura;
import java.util.Scanner;

public class converte_temperatura {
    
    public static void main(String [] args){

        converte();

    }

    static void converte(){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit que deseja converter para Celsius: ");
        Double temp_input = input.nextDouble();

        double celsius0 = temp_input - 32;
        double celsius1 = celsius0 / 1.8;

        System.out.println("A temperatura de Fahrenheit digitada para Celsius é de " + celsius1 + "\u00B0");

        input.close();


    }
}
