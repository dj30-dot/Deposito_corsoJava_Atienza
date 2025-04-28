
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        //creazione oggetto scanner
        Scanner scanner = new Scanner(System.in);

        //Input per ogni tipo primitivo
        System.out.print("Inserisci un intero: ");
        int intero = scanner.nextInt();

        System.out.print("Inserisci un double: ");
        double d = scanner.nextDouble();

        System.out.print("Inserisci un float:");
        float f = scanner.nextFloat();

        System.out.print("Inserisci un booleano: ");
        boolean b = scanner.nextBoolean();

        System.out.print("Inserisci una stringa: ");
        String s = scanner.nextLine();

        //Stampa di tutti i valori inseriti
        System.out.println("Interi: " + intero);
        System.out.println("Double: " + d);
        System.out.println("Float: " + f);
        System.out.println("Booleano: " + b);
        System.out.println("Stringa: " + s);
        
    }
};