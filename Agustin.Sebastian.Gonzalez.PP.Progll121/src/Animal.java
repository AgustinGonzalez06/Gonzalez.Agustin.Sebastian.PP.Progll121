public abstract class Animal {
    private String nombre;
    private int edad;
    private double peso;
    private TipoDieta dieta;
    
    
    public Animal(String nombre, int edad, double peso, TipoDieta dieta){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.dieta = dieta;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public abstract void vacunar();
    


    
}
