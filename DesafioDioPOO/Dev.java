package DesafioDioPOO;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String nome;
	private Set<Conteudo> conteudoInscridos = new LinkedHashSet<>();
	private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudoInscridos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscridos().add(this);
	}

	public void progredir() {

		Optional<Conteudo> conteudo = this.conteudoInscridos.stream().findFirst();

		if(conteudo.isPresent()) {
			this.conteudoConcluido.add(conteudo.get());
			this.conteudoInscridos.remove(conteudo.get());
		}else {
			System.err.println("voçe não esta inscrito");
		}
	}

	public double calcularTotalXP() {
		return this.conteudoConcluido.stream().mapToDouble(Conteudo :: calcularXP).sum();

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoInscridos() {
		return conteudoInscridos;
	}

	public void setConteudoInscridos(Set<Conteudo> conteudoInscridos) {
		this.conteudoInscridos = conteudoInscridos;
	}

	public Set<Conteudo> getConteudoConcluido() {
		return conteudoConcluido;
	}

	public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
		this.conteudoConcluido = conteudoConcluido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudoConcluido, conteudoInscridos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudoConcluido, other.conteudoConcluido)
				&& Objects.equals(conteudoInscridos, other.conteudoInscridos) && Objects.equals(nome, other.nome);
	}

}
