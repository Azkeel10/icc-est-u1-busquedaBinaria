import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------Programa iniciado----------");

        Persona[] personas = new Persona[9];

        personas[0] = new Persona("Juan",4);
        personas[1] = new Persona("Maria",5);
        personas[2] = new Persona("Carlos",18);
        personas[3] = new Persona("Ana",60);
        personas[4] = new Persona("Luis",25);
        personas[5] = new Persona("Sofia",12);
        personas[6] = new Persona("Pedro",8);
        personas[7] = new Persona("Martin",9);
        personas[8] = new Persona("Luis",40);

        BusquedaBinario mB = new BusquedaBinario(personas);

        mB.imprimirArreglo(personas);

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nIngrese la edad a buscar: ");
        int edadBuscar = scanner.nextInt();

        mB.showPersonaByEdad(edadBuscar);

    }
}
