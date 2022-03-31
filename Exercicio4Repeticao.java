import java.util.Scanner;

public class Exercicio4Repeticao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número maior que 0: ");
        int n = leitor.nextInt();

        if(n == 0) {
            System.out.println("Número inválido. Digite outro número");
        } else {
            for (int contador = 0; contador <= n; contador ++) {
                if(contador % 2 == 0){
                    System.out.println(contador);
                }
            }
        }
    }
    
}

/* Ler um valor N e imprimir todos os valores pares entre 1 (inclusive) e
N (inclusive). Considere que o N será sempre maior que ZERO */
