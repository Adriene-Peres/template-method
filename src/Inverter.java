
public class Inverter extends TransformarString {
    @Override
    public String transformarString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}