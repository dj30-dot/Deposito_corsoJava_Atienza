import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        //creazione oggetto scanner lettura
        Scanner myObj = new Scanner(System.in);

        // 4 input numerici
        System.out.println("Inserisci il primo numero:");
        int num1 = myObj.nextInt();

        System.out.println("Inserisci il secondo numero:");
        int num2 = myObj.nextInt();

        System.out.println("Inserisci il terzo numero:");
        int num3 = myObj.nextInt();

        System.out.println("Inserisci il quarto numero:");
        int num4 = myObj.nextInt();

        // confronto tra i numeri utilizzando AND, OR e NOT (operatori logici)
        
        boolean risultatoAND = (num1 > 21 && num2 > 21 && num3 > 21 && num4 > 21);
        System.out.println("Tutti i numeri sono maggiori di 21? " + risultatoAND);
     
        boolean risultatoOR = (num1 == 7 || num2 == 7 || num3 == 7 || num4 == 7);
        System.out.println("Almeno uno dei numeri è uguale a 7? " + risultatoOR);

        boolean risultatoNOT = !(num1 == num2 && num2 == num3 && num3 == num4);
        System.out.println("I numeri sono tutti diversi? " + risultatoNOT);
    
    }

}