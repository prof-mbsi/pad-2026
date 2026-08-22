package aula1208;

public class Pedido {
	
	private int numero;
	private double valor;
	private Cliente cliente;
	
	//Getters e setters:
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	//Construtor:
	public Pedido(int numero, double valor, Cliente cliente) {
		super();
		this.numero = numero;
		this.valor = valor;
		this.cliente = cliente;
	}
}
