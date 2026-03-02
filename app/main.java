import java.util.Scanner;

public static int receberOp (Scanner sc) {
    int op;
    try {
        op = Integer.parsenInt(sc.nextLine());
    } catch ( NumberFormaException e ) {
        System.out.printIn(x: "Digite uma opção inválida");
        op = -1
    }
}