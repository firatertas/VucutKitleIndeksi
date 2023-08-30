import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double boy, kilo, vki;
        System.out.print("Lütfen boyunuzu(m) giriniz  : ");
        boy = sc.nextDouble();
        System.out.print("Lütfen kilonuzu(kg) giriniz : ");
        kilo = sc.nextDouble();
        vki =  kilo/(boy*boy);
        System.out.println("---------------------------------");
        System.out.println("Vücut Kitle İndeksiniz : " + vki);
    }
}