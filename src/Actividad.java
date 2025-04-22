import java.util.Scanner;
import java.util.HashSet;

public class Actividad {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            HashSet<String> ciudad = new HashSet<>();
       
       boolean continuar = true;
       while (continuar) {
        System.out.println("-------------MENU-------------");
                System.out.println("1.Agregar una ciudad");
                System.out.println("2. Mostrar todas las ciudades");
                System.out.println("3.Buscar una ciudad");
                System.out.println("4.Eliminar una ciudad");
                System.out.println("5. Salir del programa");
                System.out.println("Elige una opción: ");
                int opcion = sc.nextInt();
                sc.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Introduce una ciudad:");
                     String nuevaCiudad = sc.nextLine();
                    if (ciudad.contains(nuevaCiudad)) {
                      System.out.println("La ciudad ya existe.");
                     } else {
                     ciudad.add(nuevaCiudad);
                     System.out.println("Ciudad agregada correctamente.");
                    }
                            break;

                   case 2:
                   System.out.println("Lista de ciudades");
                   if (ciudad.isEmpty()) {
                    System.out.println("No hay ciudades en la lista.");
                } else {
                    for (String c : ciudad) {
                        System.out.println(c);
                    }
                }
                break;

                case 3: System.out.print("Introduce el nombre de la ciudad a buscar: ");
                String nombreCiudad = sc.nextLine();
                
                if (ciudad.contains(nombreCiudad)) {
                    System.out.println("La ciudad \"" + nombreCiudad + "\" existe en la lista.");
                } else {
                    System.out.println("La ciudad \"" + nombreCiudad + "\" NO se encuentra en la lista.");
                }

                break;

                case 4: 
                System.out.println("Introduce la Tarea que quieres eliminar ");
                 String eliminarCiudad = sc.nextLine();
                if (ciudad.contains(eliminarCiudad)){

                 ciudad.remove(eliminarCiudad);
                 System.out.println("Ciudad eliminada");
                }else{

                System.out.println("Ciudad no encontrada");

                  }


                  case 5:

                  continuar= false;
                  break;


            }




       }
       
       
       
       
       
       
       
       
       
        }
}
