import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total =1,n,k;
        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı giriniz: ");
        n = input.nextInt();
        System.out.print("Üs giriniz: ");
        k = input.nextInt();

        for (int i = 1; i <=k; i++) {
            total*=n;
        }
        System.out.print("Cevap: " +total);
    }
}
