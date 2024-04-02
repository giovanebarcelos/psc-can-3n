package aula12;

import java.util.Arrays;
import java.util.Scanner;

public class Utl {
    public static int getInt(String rotulo) {
        Scanner ler = new Scanner(System.in);
        System.out.print(rotulo);
        return ler.nextInt();
    }

    public static String getString(String rotulo) {
        Scanner ler = new Scanner(System.in);
        System.out.print(rotulo);
        return ler.nextLine();
    }

    public static String getString(
            String rotulo, String[] opcoes,
            String msgErro) {
        while (true) {
            String str = Utl.getString(rotulo);
            if (Arrays.stream(opcoes).anyMatch(str::equals)){
                return str;
            } else {
                System.out.println(msgErro);
            }
        }
    }
}
