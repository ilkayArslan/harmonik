import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı Giriniz : ");
        int sayi = input.nextInt();
        double sum = 0;
        for (double i = 1;i<=sayi;i++){
            sum += 1/i;

        }
        System.out.print(sum);
    }
}