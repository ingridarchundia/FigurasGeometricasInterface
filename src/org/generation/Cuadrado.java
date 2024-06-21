package org.generation;

public class Cuadrado implements FiguraGeometrica {
	private String nombre;
	private double lado;
	public Cuadrado(String nombre, double lado) {
		this.nombre = nombre;
		this.lado = lado;
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
	
	public double calcularArea() {
		return Math.pow(lado, 2);
	}
	
	public double calcularPerimetro() {
		return  4*lado;
	}
	
	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	}
}
