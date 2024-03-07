import java.util.Scanner;

public abstract class TransformarString {

    public final void executarTransformacao() {
        String s;
        s = lerString();
        s = transformarString(s);
        imprimirString(s);
    }

    public abstract String transformarString(String s);

    public String lerString() {
        Scanner ent = new Scanner(System.in);
        System.out.print(" Entre com uma String: ");
        return ent.nextLine();
    }

    public void imprimirString(String s) {
        System.out.println(s);
    }

}