package es.dsw.models;

public class Alumno {

	private String Nom, Apell, Genero, Modulos, Turno, Situaciones;
	private String Resultado;
	private int Edad;
	
	public Alumno() {
		this.Nom = "";
		this.Apell = "";
		this.Edad = -1;
	}
	
	public Alumno(String nom, String apell, int edad) {
		this.Nom = nom;
		this.Apell = apell;
		this.Edad = edad;
	}

	public String getNom() {
		return Nom;
	}

	public String getApell() {
		return Apell;
	}

	public int getEdad() {
		return Edad;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public void setApell(String apell) {
		Apell = apell;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getModulos() {
		return Modulos;
	}

	public void setModulos(String modulos) {
		Modulos = modulos;
	}

	public String getTurno() {
		return Turno;
	}

	public void setTurno(String turno) {
		Turno = turno;
	}

	public String getSituaciones() {
		return Situaciones;
	}

	public void setSituaciones(String situaciones) {
		Situaciones = situaciones;
	}

	public String getResultado() {
		return Resultado;
	}

	public void setResultado(String resultado) {
		Resultado = resultado;
	}
	
}
