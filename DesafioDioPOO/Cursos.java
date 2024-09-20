package DesafioDioPOO;

public class Cursos extends Conteudo {

	private int cargaHoraria;

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Cursos(String titulo, String descricao, int cargaHoraria) {
		super(titulo, descricao);
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Cursos [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria
				+ "]";
	}

	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria;
	}

}
