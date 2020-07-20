package pe.edu.upeu.springMVC2.entity;

public class Escuela {
	private int idescuelas;
	private String nomescuela;
	public Escuela() {

	}
	public Escuela(int idescuelas, String nomescuela) {
		this.idescuelas = idescuelas;
		this.nomescuela = nomescuela;
	}
	public int getIdescuelas() {
		return idescuelas;
	}
	public void setIdescuelas(int idescuelas) {
		this.idescuelas = idescuelas;
	}
	public String getNomescuela() {
		return nomescuela;
	}
	public void setNomescuela(String nomescuela) {
		this.nomescuela = nomescuela;
	}
	
}
