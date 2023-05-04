import java.util.Scanner;

public class ConversorTemp {
    /**
     * @param args
     */
    //Kauã Lira
     public static void main(String[] args) {
        
        //Declaração de Variavel
        Double f, c;
        int e;

        //Criação e Instancia do Objeto de Entrada
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("\n\t\t\t Conversor de Temperatura \n");

            System.out.println("1. Celcius para Fahrenheit");
            System.out.println("2. Fahrenheit para Celcius");
            System.out.println("3. Saída");

            System.err.print("Opção: ");
            e = entrada.nextInt();

            if (e == 1){
                System.out.println("\n\t\t\t -- Celsius para Fahreinheit -- \n");

                //Entrada
                System.out.print("Informe Celcius: ");
                c = entrada.nextDouble();
                
                //Processamento 
		        f = 9 * c/5 + 32;

                //Saída 
		        System.out.println("\nFahrenheit= " + f + "\n\n");
            } else if (e == 2) {
                //Laura Perez
                System.out.println("\n\t\t\t -- Fahrenheint para Celcius -- \n");

                //Entradas
                System.out.print("Informe Fahrenheit: ");
                f = entrada.nextDouble();

                //Processamento
                c = f - 32 / 1.8;

                //Saída
                System.out.println("\nCelcius= ");
            } else if (e == 3) {
            //Kauã Lira
                System.out.println("\n\t\t\t Adeus! \n");
            } else {
                System.out.println("Opção " + e + " Incorreta");
            }
        }while (e!=3);

    }
}