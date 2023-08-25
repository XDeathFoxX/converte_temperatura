package java_projetos.converte_temperatura;
import java.util.Scanner;


public class converte_temperatura {
    
    public static void main(String [] args){

        converte();

    }

    static void converte(){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número da conversão que deseja fazer: ");
        System.out.println(" 1 - Fahrenheit / Celsius \n 2 - Celsius / Kelvin \n 3 - Fahrenheit / Kelvin \n 4 - Kelvin / Celsius"+
        "\n 5 - Celsius / Fahrenheit \n 6 - Kelvin / Fahrenheit");
        
        String operacao = input.nextLine();
        operacao = operacao.trim();
        
        Integer conver = Integer.parseInt(operacao); 

        
        switch(conver){
            case 1:
                System.out.println("Digite a temperatura em Fahrenheit que deseja converter para Celsius: ");
                Double temp_fahrenheit0 = input.nextDouble();

                double celsius0 = temp_fahrenheit0 - 32;
                double celsius1 = celsius0 / 1.8;

                System.out.printf("A temperatura de %.2f Fahrenheit convertida para Celsius é de %.2f \u00B0",temp_fahrenheit0,celsius1);
                System.out.println();
                break;

            case 2:
                System.out.println("Digite a temperatura em Celsius que deseja converter para Kelvin: ");
                Double temp_celsius0 = input.nextDouble();

                double kelvin0 = temp_celsius0 + 273.15;

                System.out.printf("A temperatura de %.2f Celsius convertida para Kelvin é de %.2f K", temp_celsius0,kelvin0);
                System.out.println();
                break;

            case 3:
                System.out.println("Digite a temperatura em Fahrenheit que deseja converter para Kelvin: ");
                Double temp_fahrenheit1 = input.nextDouble();


                double kelvin1 = temp_fahrenheit1 + 459.67;
                double kelvin2 = kelvin1 * 0.555555556;

                System.out.printf("A temperatura de %.2f Fahrenheit convertida para Kelvin é de %.2f K",temp_fahrenheit1,kelvin2);
                System.out.println("");
                break;

            case 4:
                System.out.println("Digite a temperatura em Kelvin que deseja converter para Celsius");
                Double temp_kelvin0 = input.nextDouble();

                double celsius2 = temp_kelvin0 - 273.15;

                System.out.printf("A temperatura de %.2f Kelvin convertida pra Celsius é de %.2f \u00B0C",temp_kelvin0,celsius2);
                System.out.println("");
                break;
            
            case 5:
                System.out.println("Digite a temperatura em Celsius que deseja converter para Fahrenheit: ");
                Double temp_celsius1 = input.nextDouble();

                double fahrenheit0 = temp_celsius1 * 1.8;
                double fahrenheit1 = fahrenheit0 + 32;

                System.out.printf("A temperatura de %.2f Celsius convertida para Fahrenheit é de %.2f \u00B0F",temp_celsius1,fahrenheit1);
                System.out.println("");
                break;

            case 6:
                System.out.println("Digite a temperatura em Kelvin que deseja converter para Fahrenheit: ");
                Double temp_kelvin1 = input.nextDouble();

                double fahrenheit2 = temp_kelvin1 - 273;
                double fahrenheit3 = fahrenheit2 * 1.8;
                double fahrenheit4 = fahrenheit3 + 32;

                System.out.printf("A temperatura de %.2f Kelvin convertira para Fahrenheit é de %.2f \u00B0F",temp_kelvin1,fahrenheit4);
                System.out.println("");
                break;
                
            default:
                System.out.println("Opção inválida! ");
        }
        input.close();
    }
}
