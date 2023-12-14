import java.util.Scanner;
public class BuyuktenKucuge {
    public static void main(String[] args) {
        // kullanıcıdan 3 tane tam sayı değeri istiyoruz.
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.print(" İlk sayıyı giriniz:  ");
        a = input.nextInt();

        System.out.print(" İkinci sayıyı giriniz:  ");
        b = input.nextInt();

        System.out.print(" Üçüncü sayıyı giriniz:  ");
        c = input.nextInt();

        if((a>b && a>c)){
           if(b>c) System.out.println("a>b>c");
           else System.out.println("a>c>b");
        }else{
            if(b>a && b>c ){
                if(a>c) System.out.println("b>a>c");
                else System.out.println("b>c>a");
            } else if (c>a && c>b) {
                if(a>b) System.out.println("c>a>b");
                else System.out.println("c>b>a");
            }
            // eğer hiçbiri doğru değilse geriye tek seçenek hepsinin değerinin birbnirine eşit olması kalıyor
            else System.out.println("a == b == c");
        }

    }
}
