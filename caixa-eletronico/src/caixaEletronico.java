import java.util.Scanner;

import javax.swing.JOptionPane;

public class caixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 300.75;
        double valorSolicitado;

        valorSolicitado = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor do saque"));
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
             JOptionPane.showMessageDialog(null, "O valor do saldo atual é de " + saldo );
        
            
        }     
        else
        JOptionPane.showMessageDialog(null,"Saldo insuficiente" );


    }
}
