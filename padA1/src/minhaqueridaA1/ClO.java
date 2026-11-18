package minhaqueridaA1;

public class ClO {

	private InE atA;

	private ClE atB;

	private InD atC;

	public ClO(InE atA, ClE atB, InD atC) {

		this.atA = atA;
		this.atB = atB;
		this.atC = atC;
	}

	public void meA() {

		ClA atD = atA.meG();

		ClB atE = atA.meH();

		InB atF = atB.meA();

		atF = new ClK(atF);

		atF.meB();

		atC.meF(atD.meA() + atE.meA());

	}

}