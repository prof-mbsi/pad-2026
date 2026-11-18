package minhaqueridaA1;

public class ClC implements InA {

    private String atA;

    public ClC(String atA) {

        this.atA = atA;

    }

    @Override
    public void meA() {

        System.out.println(atA);

    }

    public void meB(String atB) {

        System.out.println(
                atA + " -> " + atB
        );

    }

}
