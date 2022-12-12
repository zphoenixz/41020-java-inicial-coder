import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Polimorfismo
        List a = new ArrayList<>();

        //Clase comun (Class) => Clase Abstracta que no se puede instanciar (new)
            //Clase Abstracta => Punto intermedio entre una Interface y una Clase Comun

        //Objetivos segun POO
        //Clase Comun:
        //      Es la de poder modelar la realidad atraves de instanciar nuevos objetivos
        //Interfaz:
        //      Es de darle las acciones (métodos) que una clase deba tener (deba implementar)
        //      no me dice como implementarlo pero si me dice que debe tener.
        //Abstracta:
        //      Es la de darme la forma inicial de una Clase Comun a traves del uso de herencia
        //      e implementacion de los metodos abstractos

        // ABSTRACT EJM ======================================================================
        //(Abstract) Concurso me puede dar todos los lineamientos que todo concurso debe tener
        // a. Un premio (atributos)
        // b. competidores (atributos)
        // c. fecha (atributos)
        // d. (metodos)

        //Cuando haga el ConcursoDeLiteratura extends Concurso
        //Cuando haga el ConcursoDeMatematicas extends Concurso
        //Cuando haga el ConcursoDeBaile extends Concurso

        // INTERFAZ EJM ======================================================================
        //(Interfaz) AccionesDelControlador
        // a. moverHaciaArriba (metodos)
        // b. botonDeAccion (metodos)
        // c. getAltura(metodos)

        //(Abstract) Mando implementar AccionesDelControlador
        // a. tamaño (atributos)
        // b. color (atributos)
        // c. marca (atributos)

        //(Clase Comun) Joystick extends Mando
        //

        //(Clase Comun) MandoDePlay implementa AccionesDelControlador
        // a. moverHaciaArriba (metodos)
    }
}