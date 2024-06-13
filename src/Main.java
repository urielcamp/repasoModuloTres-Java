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
        System.out.println("---------------------");

        //Ejercicio 2

        boolean m = listaString.contains("chau");
        System.out.println(m);
        System.out.println("---------------------");

        //Ejercicio 3

        listaString.remove("chau");
        for (String l: listaString){
            System.out.println(l);
        }
        System.out.println("---------------------");

        //Ejercicio 4



    }
}