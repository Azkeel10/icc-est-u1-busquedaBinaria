public class BusquedaBinario {
//-------------------------------------------------------------------------------------------------------------
    private Persona[] people;

    public BusquedaBinario(Persona[] people) {
        this.people = people;
        
    }
//-------------------------------------------------------------------------------------------------------------
    public Persona[] ordenar(){
        int tam = people.length;

        for (int i = 0; i < tam - 1; i++){

            for (int j = 0; j < tam - 1 - i; j++){

                if (people[j].getEdad() > people[j + 1].getEdad()){

                    Persona aux = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = aux;
                    }
                }
            }
            return people;
        }
//-------------------------------------------------------------------------------------------------------------
    private int findPersonaByEdad(int edad) {
        ordenar();

        int bajo = 0;
        int alto = people.length - 1;

        while (alto >= bajo) {

            //for (int i = bajo; i < alto; i++) {
                //System.out.print(people[i].getEdad() + " | ");
            //}

            int central = (alto + bajo) / 2;

            for (int i = bajo; i <= alto; i++) {
                if (i == central) {
                    System.out.print( people[i].getEdad() + " | ");
                } else {
                    System.out.print(people[i].getEdad() + " | ");
                }
            }

            System.out.print("\nbajo = " + bajo + "   alto = " + alto 
                                + "   centro = " + central + "   edad en el centro = " 
                                + people[central].getEdad() + "    --> ");

            if (people[central].getEdad() == edad) {

                System.out.println("Encontrado\n");
                return central;
            }
            if (people[central].getEdad() > edad) {

                System.out.println("Izquierda\n");

                alto = central - 1;
            }else{

                System.out.println("Derecha\n");
                bajo = central + 1;
            }
        }
        return -1;
    }
//-------------------------------------------------------------------------------------------------------------
    public void showPersonaByEdad(int edadBusca){
        int indexPersona = findPersonaByEdad(edadBusca);

        if (indexPersona == -1){
            System.out.println("\nPersona con Edad " + edadBusca + " no encontrada");
        } else {
            System.out.println("\nPersona con Edad " + edadBusca + " es " + people[indexPersona].getNombre());
            System.out.println();
            System.out.println(people[indexPersona].toString());
        }
    }

//-------------------------------------------------------------------------------------------------------------
    public void imprimirArreglo(Persona[] arreglo){
    int tam = arreglo.length;

        for (int i = 0; i < tam; i++) {
            System.out.println(arreglo[i]);
        }
        System.out.println("\nEl tamaño de la lista es de= " + tam);
    }
}
