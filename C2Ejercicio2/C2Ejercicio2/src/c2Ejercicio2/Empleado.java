package c2Ejercicio2;

public class Empleado {
    
    private String nombre;
    
     public Empleado(String nombre) {
        this.nombre = nombre;
        System.out.println("Constructor de Empleado " + nombre);
    }
   
     
    //métodos get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
                            
    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
    
        public static String leerdatos(String nom){
        return "Escribe el nombre del " + nom + ":";
    }
    
    public static void Main (String[] args){
        Empleado E1 = new Empleado(leerdatos("Empleado"));
        Directivo D1 = new Directivo(leerdatos("Directivo"));
        Operario OP1 = new Operario(leerdatos("Operario"));                                                                           
        Oficial OF1 = new Oficial(leerdatos("Oficial"));
        Tecnico T1 = new Tecnico(leerdatos("Técnico"));
    }


}
