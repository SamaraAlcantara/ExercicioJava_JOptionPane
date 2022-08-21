/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;
import javax.swing.JOptionPane;

/**
 *
 * @author Samara
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, total = 0, pares = 0, impares = 0, acima = 0, media = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html>"));
            if (n != 0){
                total += 1;
            }
            s += n;
            media = s/2;
            if (n % 2 == 0 && n != 0){
                pares += 1;
            }else if (n % 2 != 0){
                impares += 1;
            }
            if (n > 100){
                acima += 1;
            }
        }while (n != 0);
            JOptionPane.showMessageDialog(null, "<html> Resultado Final<hr>" + "<br> Total de valores: " +total+ "<br> Numeros impares: "+impares+"<br>Números pares: "+pares+"<br>Acima de 100: "+ acima+ "<br>Média: "+media+"</html>");
    }
    
}
