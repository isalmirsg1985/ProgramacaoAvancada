package aula01programacaoavancada;

import java.util.Scanner;

public class Aula01ProgramacaoAvancada {

    public static void main(String[] args) {
        System.out.println("Ola Mundo!");
        
        int var = 10;
        int resultado = var + 5;
        System.out.println(resultado);
        
        String nome = "isalmir da silva goncalves";
        System.out.println(nome);
        
        System.out.print("Qual é o seu nome?");
        Scanner ler = new Scanner(System.in);
        String n = ler.next();
        
        System.out.println("O nome digitado foi " + n);
        
    }
        
}
    

