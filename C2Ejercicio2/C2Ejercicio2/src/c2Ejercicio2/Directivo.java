package c2Ejercicio2;

public class Directivo extends Empleado{

   /* public Directivo() {
    }*/
   
    public Directivo(String nombre) {
        super(nombre);
        System.out.println("Constructor de Directivo");                                                           
    }
   
    @Override
    public String toString() {
        return super.toString() + " -> Directivo";
    }
}
