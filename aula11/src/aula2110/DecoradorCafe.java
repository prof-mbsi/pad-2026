package aula2110;

public abstract class DecoradorCafe implements Cafe{
	
	protected Cafe cafe;

	public DecoradorCafe(Cafe cafe) {
		this.cafe = cafe;
	}
	
	@Override
	public String getDescricao() {
		return cafe.getDescricao();
	}
	
	@Override
	public double getPreco() {
		return cafe.getPreco();
	}
}
