package operators;

public class Multiply extends Operator {
    @Override
    public String result(String v1, String v2) {
        try {
            return Integer.toString(Integer.parseInt(v1) * Integer.parseInt(v2));
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
