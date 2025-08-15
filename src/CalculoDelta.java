import java.util.Scanner;

//Exibição
public class CalculoDelta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Equacao nome = new Equacao();

        System.out.println("Digite o primeiro: ");
        nome.a = entrada.nextInt();

        System.out.println("Digite o segundo: ");
        nome.b = entrada.nextInt();

        System.out.println("Digite o terceiro: ");
        nome.c = entrada.nextInt();

        nome.CalcDelta();

        System.out.println(nome.raiz());

    }
}
