public class Reptil extends Animal{
//objetos de la clase
    private String tipoEscama;
    private String regulacionTemperatura;
    //constructor 
    public Reptil(String nombre, int edad, double  peso, TipoDieta dieta, String TipoEscama, String regulacionTemperatura){
        super(nombre, edad, peso, dieta);
        this.regulacionTemperatura = regulacionTemperatura;
        this.tipoEscama = tipoEscama;
    }
    
 // implementacion del metodo vacunar para la clase
    @Override
    public void vacunar(){
        System.out.println(getNombre() + " no puede ser vacunado");
    }
    //metodo para representar la clase
    @Override
    public String toString(){
        return super.toString()+", tipo de escama: "+tipoEscama+", regulacion de temperatura: "+regulacionTemperatura;
    }
}
