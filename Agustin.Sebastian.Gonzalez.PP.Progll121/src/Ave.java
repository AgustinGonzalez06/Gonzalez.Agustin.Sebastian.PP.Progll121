public class Ave extends Animal {
    //atributos de la clase
    private double envergaduraAlas;
    //constructor de la clsase
    public Ave(String nombre, int edad, double peso, TipoDieta dieta, double envergaduraAlas){
        super(nombre, edad, peso, dieta);
        this.envergaduraAlas = envergaduraAlas;
    }
// implementacion del metodo vacunar para la clase  
    @Override
    public void vacunar(){
        System.out.println(getNombre() + "ha sido vacunado");
    }
//Metodo para representar la clase
    @Override
    public String toString(){
        return super.toString() + ", Envergadura de Alas: " + envergaduraAlas;
    }
    
}
