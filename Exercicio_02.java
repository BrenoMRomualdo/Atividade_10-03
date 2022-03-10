import javax.swing.JOptionPane;
import java.util.*;
public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.printf ("Vamos fazer uma equação de segundo grau\n Qual o valor de A?");
        double a = leitor.nextDouble();
        System.out.printf ("Qual o valor de B?");
        double b = leitor.nextDouble();
        System.out.printf ("Qual o valor de c?");
        double c = leitor.nextDouble();
        double delta, raiz_1, raiz_2;
        delta = (b*b) - (4*a*c);

        if (delta >0){
            raiz_1 = (-b + Math.sqrt(delta))/2*a;
            raiz_2 = (-b - Math.sqrt(delta))/2*a;
            String s = String.format(
                "Seu delta é maior que zero, então você tem 2 raizes: \n raiz 1 = %.0f \n raiz 2 = %.0f.",
                raiz_1, raiz_2
                );
            JOptionPane.showInputDialog(null, s);
        }
        else if (delta = 0){
            raiz_1 = (-b + Math.sqrt(delta))/2*a;
            String r = String.format("Seu delta é igual a zero, ou seja, só tem 1 raiz:\n raiz = %.0f.",
            raiz_1
            );
            JOptionPane.showInputDialog(null, r);
        }
        else {
            JOptionPane.showInputDialog(null, "Seu delta é menor que zero, então não existe raiz real!");
        }
    }
}