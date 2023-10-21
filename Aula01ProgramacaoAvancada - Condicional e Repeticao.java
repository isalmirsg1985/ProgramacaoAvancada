package aula01programacaoavancada;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aula01ProgramacaoAvancada {

    public static void main(String[] args) {
        
        String idadeString = JOptionPane.showInputDialog("Digite a sua Idade: ");
        
        int idade = Integer.parseInt(idadeString);
        
        if (idade >= 18) {
        
            JOptionPane.showMessageDialog(null,"Bem-vindo você é maior de idade");
        }else{
            JOptionPane.showMessageDialog(null,"Você esta proibido de entra, pois você é menor de idade");
        }
        

            for(int i = 1; i <= 100; i++){
                System.out.println(i + " ola mundo!");
        }
        
    }
        
}
    

