public class Teste {
    public static void main(String[] args) {
        TransformarString ts;
        System.out.println("### Transformar para maiuscula ###");
        ts = new ParaMaiuscula();
        ts.executarTransformacao();

        System.out.println("### Inverter ###");
        ts = new Inverter();
        ts.executarTransformacao();

    }
}