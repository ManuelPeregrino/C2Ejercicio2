package c2Ejercicio2;

public class Oficial extends Operario{

    /*public Oficial() {
    }*/

    public Oficial(String nombre) {
        super(nombre);
        System.out.println("Constructor de Oficial");                                                             
    }
   
    @Override
    public String toString() {
        return super.toString() + " -> Oficial";
    }
}