import java.util.Scanner;

public class SOma {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, insira seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá," + nome + "! Que nome lindo");
        scanner.close();
        System.out.println("Tudo bem com voce?");
        scanner.close();
    }
}
