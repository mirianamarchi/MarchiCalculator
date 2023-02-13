package it.mirianamarchi.marchicalculator;

import java.util.Scanner;

public class MarchiCalculator {
    public static void print(){
        System.out.println("Quale operazione vuoi eseguire?");
        System.out.println("1. Somma");
        System.out.println("2. Sottrazione");
        System.out.println("3. Moltiplicazione");
        System.out.println("4. Divisione");
        System.out.println("5. Logaritmo in base n");
        System.out.println("6. Radice n-esima");
        System.out.println("7. Potenza n-esima");
        System.out.println("8. Exit");
    }
    public static Double somma(Scanner input){
        System.out.println("Inserisci primo addendo:");
        Double a=input.nextDouble();
        System.out.println("Inserisci secondo addendo:");
        Double b=input.nextDouble();
        Double res= a+b;
        return res;
    }

    public static Double sottrazione(Scanner input){
        System.out.println("Inserisci minuendo:");
        Double a=input.nextDouble();
        System.out.println("Inserisci sottraendo:");
        Double b=input.nextDouble();
        Double res= a-b;
        return res;
    }

    public static Double moltiplicazione(Scanner input){
        System.out.println("Inserisci primo fattore:");
        Double a=input.nextDouble();
        System.out.println("Inserisci secondo fattore:");
        Double b=input.nextDouble();
        Double res= a*b;
        return res;
    }

    public static Double divisione(Scanner input){
        System.out.println("Inserisci dividendo:");
        Double a=input.nextDouble();
        System.out.println("Inserisci divisore:");
        Double b=input.nextDouble();
        if(b==0){
            System.out.println("Impossibile effettuare la divisione per 0");
            return 0.0;
        }else{
            Double res= a/b;
            return res;}
    }
    public static Double logaritmo(Scanner input){
        System.out.println("Inserire il numero di cui si vuole calcolare la radice:");
        Double x = input.nextDouble();
        if(x<=0){
            System.out.println("Impossibile effettuare il calcolo del logaritmo per una base minore/uguale di 0");
            return 0.0;
        }
        else{
            System.out.println("Inserire la base:");
            Double n = input.nextDouble();
            Double log = Math.log(x) / Math.log(n);
            return log;}
    }

    public static Double potenza(Scanner input){
        System.out.println("Calcolo potenza n-esima");
        System.out.println("Inserire la base:");
        Double x = input.nextDouble();
        System.out.println("Inserire esponente n:");
        Double n = input.nextDouble();
        Double potenza = Math.pow(x,n);
        return potenza;
    }

    public static Double radice(Scanner input){
        System.out.println("Calcolo della radice n-esima");
        System.out.println("Inserire la base:");
        Double x = input.nextDouble();
        System.out.println("Inserire il valore di n:");
        Double n = input.nextDouble();
        if(n==0){
            System.out.println("Impossibile effettuare la radice di 0");
            return 0.0;
        }
        else{
            Double root = Math.pow(x, 1.0 / n);
            return root;}
    }


    public static void main(String[] args) {
        System.out.println("Calcolatrice di Miriana Marchi");


        Scanner input = new Scanner(System.in);

        System.out.println("Ciao!");
        do {
            print();
            switch (input.nextLine()) {
                case "1":
                    System.out.println("Risultato: " + somma(input));
                    print();
                    break;
                case "2":
                    System.out.println("Risultato: " + sottrazione(input));
                    print();
                    break;
                case "3":
                    System.out.println("Risultato: " + moltiplicazione(input));
                    print();
                    break;
                case "4":
                    System.out.println("Risultato: " + divisione(input));
                    print();
                    break;
                case "5":
                    System.out.println("Risultato:" + logaritmo(input));
                    print();
                    break;
                case "6":
                    System.out.println("Risultato:" + radice(input));
                    print();
                    break;
                case "7":
                    System.out.println("Risultato:" + potenza(input));
                    print();
                    break;
                case "8":
                    System.out.println("Alla prossima operazione!");
                    return;
                default:
                    System.out.println("Invalid operator");
                    break;
            }
        }while(input.hasNext());
    }

}