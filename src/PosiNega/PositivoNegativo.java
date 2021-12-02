
package PosiNega;

import javax.swing.JOptionPane;

/*
Leer un numero e indicar si es positivo o negativo. 
El proceso se repetira hasta que se introduzca un 0.
*/
public class PositivoNegativo {
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero positivo o negativo"));
        
        while (numero != 0){
            
            if (numero > 0){
                JOptionPane.showMessageDialog(null, "Numero Positivo");
            }
            else if(numero < 0){
                JOptionPane.showMessageDialog(null, "Numero Negativo");
            }
        
            numero = Integer.parseInt(JOptionPane.showInputDialog(""));          
        }
        
        JOptionPane.showMessageDialog(null, "Error, Escribiste 0");       
    }
}