import java.util.Scanner;

public class Exer_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a string desejada: ");
        String s = sc.nextLine();
        String stringInvertida = "";

        for (int i = s.length() - 1; i >= 0; i--) {

			stringInvertida += s.charAt(i);
		}
		System.out.println(stringInvertida);
	sc.close();

    }
}
