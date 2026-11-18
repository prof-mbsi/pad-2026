package minhaqueridaA1;

public class ClA implements InC {

    private String atA;

    public ClA(String atA) {

        this.atA = atA;

    }

    public String meA() {

        return atA;

    }

    @Override
    public ClA meC() {

        return new ClA(atA);

    }

}