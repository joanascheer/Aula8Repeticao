public class Exercicio1Repeticao {
    public static void main(String[] args) {
        int i = 1;

        do {
            int verifica = i % 2;
            if (verifica == 0) {
                
                System.out.println(i);
            }
        
            i++;
        }while (i <= 100);
    }
    
}
/* 
Faça um programa que mostra os números pares até 100
*/
