package aula2110;

public class ComLeite extends DecoradorCafe{

	public ComLeite(Cafe cafe) {
		super(cafe);
	}
	
	@Override
	public String getDescricao() {
		return cafe.getDescricao() + ", com leite";
	}
	
	@Override
	public double getPreco() {
		return cafe.getPreco() + 2.0;
	}
}
