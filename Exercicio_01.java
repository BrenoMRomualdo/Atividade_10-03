import java.util.*;
public class Exercicio_01{
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.printf ("Digite um número e eu farei uma magica!");
        int numero = leitor.nextInt();
        if (numero >0){
            System.out.printf ("Usando meus poderes eu concluo que seu número é positivo!");
        }
        else{ 
            if(numero <0){
            System.out.printf ("Utilizando minha magia mágica eu digo que seu número é negativo");
            }
                else{
                    if(numero =0)
                    System.out.printf ("Usando todas as minhas forças de mago eu AFIRMO que seu número é neutro");
            }
        }
    }
}