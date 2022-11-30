import Animales.Animal;
import Animales.Delfin;
import Animales.Gato;
import Animales.Monitor;
import Animales.Perro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Perro perrito = new Perro("Chihuaua");
        // Paso 1 mes
        perrito.setNombre("Messi");
        perrito.setTamanio(20);//20 cm

//        perrito.setRaza("Chihuaua");
//        perrito.raza = "Doberman Pura raza";
//        perrito.setRaza("Doberman Pura raza");



        System.out.println("Se llama " + perrito.getNombre());
        System.out.println("Tiene " + perrito.getTamanio());

        // Paso 1 año
        perrito.setTamanio(50);//50cm
        //Viene mi vecino, que lindo tu perro como se llama?
        //Mi ex, que tamaño tiene ahora?
        System.out.println("Se llama " + perrito.getNombre());
        System.out.println("Tiene " + perrito.getTamanio());

        //Lo sacamos a pasear por primera vez, y que hace?
        perrito.hacerSonido();
        perrito.correr();
        perrito.ponerApodo("dibu");
        //Me pregunta, y tiene apodo?
        System.out.println("Su apodo es " + perrito.getApodo());

        Perro perrito1 = new Perro("Bulldog");
        perrito1.setNombre("Ochoa");
        Perro perrito2 = new Perro("Bulldog");
        perrito2.setNombre("Chuky lozano");
        Perro perrito3 = new Perro("Bulldog");
        perrito3.setNombre("Tata");


        Animal perritoA = new Perro("raza");
        Animal gatoA = new Gato("raza");
        Animal delfinA = new Delfin("raza");

        List<Animal> animalesVariados = new ArrayList<>();

        animalesVariados.add(perritoA);
        animalesVariados.add(gatoA);
        animalesVariados.add(delfinA);

        System.out.println("El perro hace: ");
        perritoA.hacerSonido();
        System.out.println("El gato hace: ");
        gatoA.hacerSonido();
        System.out.println("El delfin hace: ");
        delfinA.hacerSonido();
        System.out.println(perritoA.equals(gatoA));

        System.out.println(perrito1.equals(perrito2));

        System.out.println(perrito2.equals(perrito2));

        Monitor monitor1 = new Monitor(2, 4);
        Monitor monitor2 = new Monitor(2, 4);

        Monitor monitor3 = new Monitor(3, 5);

        //1 == 1 -> verdadero
        // objeto == objeto -> ???
        System.out.println(monitor1.equals(monitor2));
        System.out.println(monitor1.equals(monitor3));

        System.out.println(monitor1 == monitor2);
        System.out.println(monitor2 == monitor3);
//        System.out.println(monitor1.hashCode());
//        System.out.println(monitor2.hashCode());
//        System.out.println(monitor3.hashCode());
        Monitor monitorA = new Monitor();
        Monitor monitorB = new Monitor(2);
        Monitor monitorC = new Monitor(2,4);
    }
}