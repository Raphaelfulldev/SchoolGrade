import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, total;
        System.out.print("1 st grade: ");
        nota1 = sc.nextDouble();
        System.out.print("2 nd grade: ");
        nota2 = sc.nextDouble();
        total = nota1 + nota2;
        System.out.println("higher than 60 points Aproved and low it's Denied.");
        System.out.println();

        if (total >= 60.00){
            System.out.printf("FINAL GRADE: %.1f\n", total);
            System.out.println("APROVED! Congratulations!");
        }
        else {
            System.out.printf("NOTA FINAL: %.1f\n", total);
            System.out.println("DENIED! Do better next time");
        }
        sc.close();
    }
}

