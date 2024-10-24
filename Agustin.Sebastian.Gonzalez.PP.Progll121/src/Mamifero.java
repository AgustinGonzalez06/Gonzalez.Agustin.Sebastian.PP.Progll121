public class Mamifero extends Animal {
        public Mamifero(String nombre, int edad, double peso, TipoDieta dieta){
            super(nombre, edad, peso, dieta);
        }
// implementacion del metodo vacunar para la clase
        @Override
        public void vacunar(){
            System.out.println(getNombre() + " ha sido vacunado");
        }
//metodo para representar la clase
        @Override
        public String toString(){
            return super.toString();
        }
    
}
