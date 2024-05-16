import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce tu nombre:");
        String nombre = scanner.nextLine();
        System.out.println("!Hola " + nombre + ", perteneces a la generación del futuro");
    }
}