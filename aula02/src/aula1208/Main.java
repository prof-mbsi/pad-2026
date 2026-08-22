package aula1208;

public class Main {

	public static void main(String[] args) {
		
		Motor m1 = new Motor();
		m1.setPotencia(110);
		
		Carro c1 = new Carro();
		c1.setModelo("Celta");
		c1.setMotor(m1);
		
		System.out.println(m1.getPotencia());
		System.out.println(c1.getModelo() + ", " + c1.getMotor().getPotencia());
		System.out.println(m1);
		
		Professor p1 = new Professor("Marlon");
		Disciplina d1 = new Disciplina("Padrões de Projeto", p1);
		System.out.println(p1.getNome());
		System.out.println(d1.getNome() + ", " + d1.getProfessor().getNome());
		
		Aluno[] alunos = new Aluno[5];
		Aluno a1 = new Aluno("Vinícius");
		Aluno a2 = new Aluno("Anna");
		
		alunos[0] = a1;
		alunos[1] = a2;
		alunos[2] = new Aluno("Luana");
		alunos[3] = new Aluno("Mariele");
		alunos[4] = new Aluno("Maria");
/*
		System.out.println(alunos[0].getNome());
		System.out.println(alunos[1].getNome());
		System.out.println(alunos.length);
*/
		for(int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i].getNome());
		}
		
		Cliente cli1 = new Cliente("Marlon", "marlon@email");
		Cliente cli2 = new Cliente("Cidadão", "cidadao@email");
		
		Pedido ped1 = new Pedido(1, 10.9, cli2);
		Pedido ped2 = new Pedido(2, 11.8, cli1);
	}

}
