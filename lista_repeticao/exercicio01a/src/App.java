import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite uma nota entre 0 e 10");

        Scanner sc = new Scanner(System.in);

        int nota = 11;


        while (nota < 0 || nota > 10) {
            nota = sc.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida, digite novamente");
            }
        }

        sc.close();

        System.out.println("Nota válida: " + nota);


    }
}
