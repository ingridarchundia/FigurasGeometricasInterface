package org.generation;

public class Main {

	public static void main(String[] args) {
		
		Triangulo bermudas = new Triangulo("Bermudas", 20,10,15);
		Triangulo t = new Triangulo ("TrianguloTE", 250, 175, 145);
		imprimirCalculo(bermudas);
		imprimirCalculo(t);
		
		Cuadrado cuadrado = new Cuadrado("cuadrito", 3);
		imprimirCalculo(cuadrado);
		
		Rectangulo rectangulo = new Rectangulo("rectangulito", 10, 20);
		imprimirCalculo(rectangulo);		
		
		Rombo rombo = new Rombo("Rombito", 4, 3,7);
		imprimirCalculo(rombo);
		
		Romboide romboide = new Romboide("Romboicito", 20, 10);
		imprimirCalculo(romboide);
		
		Trapecio trapecio = new Trapecio("Trapecito", 2, 8, 4, 5);
		imprimirCalculo(trapecio);
				
	}//main
	
	public static void imprimirCalculo(FiguraGeometrica f) {
		System.out.println(f.toString());
		System.out.println("=============================");
		System.out.println("| El área de [" + f.getNombre()
				+ "] es: " + f.calcularArea());
		System.out.println("| El perimétro de [" +f.getNombre()
				+ "] es: " + f.calcularPerimetro());
		System.out.println("=============================");
	}

}//classMain
