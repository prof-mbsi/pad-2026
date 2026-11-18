package minhaqueridaA1;

public class ClA0 {

    private static ClA0 atA;

    private String atB;

    private ClA0() {

        atB = "VALOR";

    }

    public static ClA0 meA() {

        if(atA == null) {

            atA = new ClA0();

        }

        return atA;

    }

    public String meB() {

        return atB;

    }

}