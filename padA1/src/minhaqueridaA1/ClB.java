package minhaqueridaA1;

public class ClB implements InC {

    private int atA;

    public ClB(int atA) {

        this.atA = atA;

    }

    public int meA() {

        return atA;

    }

    @Override
    public ClB meC() {

        return new ClB(atA);

    }

}