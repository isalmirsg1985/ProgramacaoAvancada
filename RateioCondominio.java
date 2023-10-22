package aula01programacaoavancada;

import javax.swing.JOptionPane;

public class Aula01ProgramacaoAvancada {

    public static void main(String[] args) {
        
        String totalfaturaString = JOptionPane.showInputDialog("Digite o valor total da fatura: ");
        int totalfatura = Integer.parseInt(totalfaturaString);

        String consumoaguaString = JOptionPane.showInputDialog("Digite a quantidade de agua em m3 consumida: ");
        int consumoagua = Integer.parseInt(consumoaguaString);
        
        String quantidadeString = JOptionPane.showInputDialog("Digite a quantidade de apartamentos: ");
        int quantidade = Integer.parseInt(quantidadeString);
        
        int consumo = 0;
        
                do{
                
                for(int i = 1; i <= quantidade; i++){
                String apartString = JOptionPane.showInputDialog(" Digite a quantidade consumida do apartamento " + i);
                int apart = Integer.parseInt(apartString);
                int total = (totalfatura * apart) / consumoagua;
                
                consumo = apart + consumo;
                
                if (consumo > consumoagua){
                    JOptionPane.showMessageDialog(null,"Consumo dos apartamento maior que consumo da fatura, repetir contagem");
                    return;
                }else{
                    JOptionPane.showMessageDialog(null,"O apartamento " + i + " pagara " + total);
                    }
                
                }
                }while(consumo < consumoagua);
                
    }
        
}