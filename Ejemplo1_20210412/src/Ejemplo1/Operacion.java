package Ejemplo1;

public class Operacion {
    // Atributos
    private int a, b;
    //Constructor

    public Operacion(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public int suma(){
        return this.a + this.b;
    }
    public int resta(){
        return this.a - this.b;
    }
    public int multiplica(){
        return this.a * this.b;
    }
    public int divide(){
        return (int) this.a / this.b;
    }
}
