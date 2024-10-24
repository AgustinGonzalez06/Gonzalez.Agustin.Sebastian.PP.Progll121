import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Zoologico para manejar los animales
        Zoologico zoologico = new Zoologico();
        // Crear un objeto Scanner para recibir entradas del usuario
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú del zoológico
            System.out.println("\nMenu del Zoologico");
            System.out.println("1. Agregar Animal");
            System.out.println("2. Mostrar Animales");
            System.out.println("3. Vacunar Animales");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt(); // Leer la opción elegida por el usuario
            scanner.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                case 1: // Opción para agregar un nuevo animal
                    try {
                        // Solicitar información del nuevo animal al usuario
                        System.out.print("Ingrese el nombre del animal: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese la edad del animal: ");
                        int edad = scanner.nextInt();
                        System.out.print("Ingrese el peso del animal: ");
                        double peso = scanner.nextDouble();
                        System.out.print("Ingrese la dieta (HERBIVORO, CARNIVORO, OMNIVORO): ");
                        TipoDieta dieta = TipoDieta.valueOf(scanner.next().toUpperCase());
                        scanner.nextLine(); // Consumir el salto de línea

                        // Solicitar el tipo de animal
                        System.out.print("Ingrese el tipo de animal (Ave, Mamifero, Reptil): ");
                        String tipo = scanner.nextLine();
                        
                        Animal nuevoAnimal = null; // Variable para almacenar el nuevo animal
                        // Crear el animal basado en el tipo ingresado
                        if (tipo.equalsIgnoreCase("Ave")) {
                            System.out.print("Ingrese la envergadura de las alas: ");
                            double envergadura = scanner.nextDouble();
                            nuevoAnimal = new Ave(nombre, edad, peso, dieta, envergadura);
                        } else if (tipo.equalsIgnoreCase("Mamifero")) {
                            nuevoAnimal = new Mamifero(nombre, edad, peso, dieta);
                        } else if (tipo.equalsIgnoreCase("Reptil")) {
                            System.out.print("Ingrese el tipo de escama: ");
                            String tipoEscama = scanner.nextLine();
                            System.out.print("Ingrese la regulación de temperatura: ");
                            String regulacion = scanner.nextLine();
                            nuevoAnimal = new Reptil(nombre, edad, peso, dieta, tipoEscama, regulacion);
                        }

                        // Agregar el nuevo animal al zoológico
                        if (nuevoAnimal != null) {
                            zoologico.agregarAnimal(nuevoAnimal);
                            System.out.println("Animal agregado exitosamente.");
                        }
                    } catch (AnimalDuplicException e) {
                        // Manejar excepción por animal duplicado
                        System.out.println(e.getMessage());
                    } catch (IllegalArgumentException e) {
                        // Manejar excepción por dieta o tipo de animal no válido
                        System.out.println("Dieta o tipo de animal no válido.");
                    }
                    break;

                case 2: // Opción para mostrar todos los animales en el zoológico
                    zoologico.mostrarAnimales();
                    break;

                case 3: // Opción para vacunar a todos los animales
                    zoologico.vacunarAnimales();
                    break;

                case 4: // Opción para salir del menú
                    System.out.println("Saliendo...");
                    break;

                default:
                    // Manejar opción no válida
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4); // Continuar el ciclo hasta que el usuario elija salir
        
        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
