package DesafioDioPOO;

import java.time.LocalDate;

public class Mentorias extends Conteudo{
	

	private LocalDate cargaHoraria;
	
	public Mentorias(String titulo, String descricao, LocalDate cargaHoraria) {
		super(titulo,descricao);
		this.cargaHoraria = cargaHoraria;
	}
	
	public LocalDate getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(LocalDate cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Mentorias [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return 20;
	}
	

}
