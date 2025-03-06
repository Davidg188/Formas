package com.mycompany.main;

abstract class Formas {
    protected String color;

    public void establecerColor(String color) {
        this.color = color;
    }
    
    public abstract void dibujar();
}

class Circulo extends Formas {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void calcularRadio() {
        System.out.println("El radio del circulo es: " + radio);
    }

    public void dibujar() {
        System.out.println("Dibujando un Circulo");
    }
}

class Linea extends Formas {
    private double largo;

    public Linea(double largo) {
        this.largo = largo;
    }

    public void dibujar() {
        System.out.println("Dibujando una Linea");
    }
}

class Triangulo extends Formas {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        double area = (base * altura) / 2;
        System.out.println("El area del Triangulo es: " + area);
    }

    public void dibujar() {
        System.out.println("Dibujando un Triangulo");
    }
}

class Cuadrado extends Formas {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public void calcularArea() {
        double area = lado * lado;
        System.out.println("El area del Cuadrado es: " + area);
    }

    public void dibujar() {
        System.out.println("Dibujando un Cuadrado");
    }
}

public class Main {
    public static void main(String[] args) {
        Formas[] figuras = {
            new Circulo(20),
            new Linea(10),
            new Triangulo(5, 8),
            new Cuadrado(6)
        };
        
        for (Formas figura : figuras) {
            figura.dibujar();
            if (figura instanceof Circulo) {
                ((Circulo) figura).calcularRadio();
            } else if (figura instanceof Triangulo) {
                ((Triangulo) figura).calcularArea();
            } else if (figura instanceof Cuadrado) {
                ((Cuadrado) figura).calcularArea();
            }
        }
    }
}
