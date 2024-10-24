import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    //atributos de la clase
   private List<Animal> animales;
   
//constructor de la clase zoologico
   public Zoologico(){
       animales = new ArrayList<>(); //inicia la lista de animales
   }
//metodo para agregar animales   
   public void agregarAnimal(Animal nuevoAnimal) throws AnimalDuplicException{
       //verofoca si existe algun animal con el mismo nombre y edad
       for (Animal a : animales){
           if (a.getNombre().equals(nuevoAnimal.getNombre()) && a.getEdad() == nuevoAnimal.getEdad()) {
               throw new AnimalDuplicException("Ya existe un animal con el mismo nombre y edad.");
           }
       }
       animales.add(nuevoAnimal); //una vez que se verifica que no este en la lista, se agrega
   }
//metodo que se usa para mostrar a los animales en el zoologico
   
   public void mostrarAnimales(){
       for (Animal a : animales) {
           System.out.println(a);
       }
   }
//metodo para vacunar a los animales dentro del zoologico
   public void vacunarAnimales() {
       for (Animal a : animales) {
           a.vacunar();
       }
   }
   
}
