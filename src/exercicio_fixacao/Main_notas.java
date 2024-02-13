package exercicio_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Main_notas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, soma, notaFinal = 60.0;



        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        soma = nota1 + nota2;

        if (soma >= notaFinal) {
            System.out.printf("NOTA FINAL: " + soma);
        }
        else {
            System.out.println("NOTA FINAL: " + soma );
            System.out.print("REPROVADO");
        }




        sc.close();
    }
}
