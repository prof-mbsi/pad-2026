package minhaqueridaA1;

import java.util.ArrayList;
import java.util.List;

public class ClD implements InD {

    private List<InA> atA =
            new ArrayList<>();

    @Override
    public void meD(InA atB) {

        atA.add(atB);

    }

    @Override
    public void meE(InA atB) {

        atA.remove(atB);

    }

    @Override
    public void meF(String atB) {

        for(InA atC : atA) {

            atC.meA();

        }

    }

}