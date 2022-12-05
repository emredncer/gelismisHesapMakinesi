import java.util.Scanner;

public class gelismisHesapMakinesi {
    static int total(int a, int b) {
        int result = a + b;
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.print("Sayılar sıfıra bölünemez!");
            return 0;
        }
        int result = a / b;
        return result;
    }

    static int pow(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        return result;
    }

    static void rectangle(int a, int b) {
        int alan = a * b;
        int cevre = (a + b) * 2;
        System.out.println("Alan= " + alan);
        System.out.println("Çevre= " + cevre);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = "1=> Toplama\n" + "2=> Çıkarma\n" + "3=> Çarpma\n" + "4=> Bölme\n" + "5=> Üs alma\n" + "6=> Mod alma\n" + "7=> Dikdörtgen alan ve çevre hesabı\n" + "0=> Çıkış";
        System.out.println(menu);
        while (true) {
            System.out.print("Lütfen bir işlem seçin: ");
            int select = input.nextInt();
            System.out.print("Birinci sayıyı giriniz: ");
            int a = input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            int b = input.nextInt();
            switch (select) {
                case 1:
                    System.out.println("sonuç: " + total(a, b));
                    break;
                case 2:
                    System.out.println("sonuç: " + minus(a, b));
                    break;
                case 3:
                    System.out.println("sonuç: " + times(a, b));
                    break;
                case 4:
                    System.out.println("sonuç: " + divided(a, b));
                    break;
                case 5:
                    System.out.println("sonuç: " + pow(a, b));
                    break;
                case 6:
                    System.out.println("sonuç: " + mod(a, b));
                    break;
                case 7:
                    rectangle(a, b);
                    break;
                default:
                    System.out.print("Hatalı tuşlama yaptınız!");
                    break;
            }
            break;
        }
    }
}
