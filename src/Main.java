import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1

        LinkedList<String> listaString = new LinkedList<String>();

        listaString.add("Hola");
        listaString.add("chau");
        listaString.add("otro texto");

        for (String l: listaString){
            System.out.println(l);
        }




    }
}