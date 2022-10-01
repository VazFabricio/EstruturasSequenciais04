import java.util.Scanner;
class Main {

    static final int TOTAL_AVALIACOES = 4;

    public static void main(String[] args) {

        float n1, n2, n3, n4, total, media;

        Scanner sc = new Scanner(System.in);

        System.out.println("--Media de tres notas--");

        System.out.print("Digite sua primeira nota: ");
        n1 = sc.nextFloat();

        System.out.print("Digite sua segunda nota: ");
        n2 = sc.nextFloat();

        System.out.print("Digite sua terceira nota: ");
        n3 = sc.nextFloat();

        System.out.print("Digite sua quarta nota: ");
        n4 = sc.nextFloat();

        System.out.println("-----------------------");

        total = n1+n2+n3+n4;
        media = total / TOTAL_AVALIACOES;
        System.out.printf("A media e: %.2f",  media);
    }
}