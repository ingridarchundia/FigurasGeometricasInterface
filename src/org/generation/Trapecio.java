package org.generation;

public class Trapecio implements FiguraGeometrica{
	private String nombre;
	private double lado;
	private double baseMayor;
	private double baseMenor;
	private double altura;
	
	
	public Trapecio(String nombre, double lado, double baseMayor, double baseMenor, double altura) {
		this.nombre = nombre;
		this.lado = lado;
		this.baseMayor = baseMayor;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	public double getBaseMayor() {
		return baseMayor;
	}


	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}


	public double getBaseMenor() {
		return baseMenor;
	}


	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public double calcularArea() {
		return ( altura * (baseMayor+baseMenor) )/2;
	}

	public double calcularPerimetro() {
		return lado*4;
	}

	@Override
	public String toString() {
		return "Romboide [nombre=" + nombre + ", lado=" + lado + ", baseMayor=" + baseMayor + ", baseMenor=" + baseMenor
				+ ", altura=" + altura + "]";
	}

}
