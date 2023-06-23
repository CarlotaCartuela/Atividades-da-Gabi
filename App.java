import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Boa tarde, escolha um número de 1 a 100.");

        Scanner number = new Scanner(System.in);

        int numero = number.nextInt();
        
        if (numero%2 == 0){
            System.out.println("O número é par!!!");
        }

        else{
            System.out.println("O número é impar!!!");
        }

        numero *= 2;
        
        System.out.println("O dobro dele é " + numero);

        numero /= 2;

        numero /= 10;

        System.out.println("1 decimo dele é " + numero);

        numero *= 10;
        if (numero > 10){
            System.out.println(" é maior que 10");
        }

        else{
        System.out.println(" é menor que 10");

        }

        System.out.println("Escolha outro número");

        Scanner number2 = new Scanner(System.in);
        
        int numero2 = number2.nextInt();

        if (numero == numero2){
            System.out.println(" os dois são iguais");
        }

        else {
            System.out.println(" os dois são diferentes");
        }

        number.close();
        number2.close();
    }
}
