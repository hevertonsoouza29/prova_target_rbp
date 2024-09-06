package prova_target_rbp;
import java.util.Scanner;

public class LetraAVerificacao {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String entrada = scanner.nextLine();

        
        int contador = 0;

        
        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        
        if (contador > 0) {
            System.out.println("A letra 'a' ocorre " + contador + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não ocorre na string.");
        }

        scanner.close();
    }
}
