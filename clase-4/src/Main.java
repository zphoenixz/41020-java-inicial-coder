import java.util.ArrayList;
import java.util.List;

public class Main {
    static int VARIABLE_1 = 10;


    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println(factorial(5));
        System.out.println("-------------------");
        //Metodo void
        restaMetodo(100, 45);
//        restaMetodo(90, 45);
//        restaMetodo(0, 45);
//        restaMetodo(10, 10);
        imprimirSeparacion();
        //Metodo return
        int a = 100;
        int b = 45;
        int resultado = restaFuncion(a, b);
        imprimirResultado("La resta es: ", resultado);
        imprimirSeparacion();

        imprimirNombreEdadColaborativo();
        imprimirNombreEdadColaborativo("Juan");
        imprimirNombreEdadColaborativo("Juan", 28);
        imprimirCantidadDeAlumnosColaborativo(57, "Java Inicial");

        //Paso por valor: cuando solo mandamos un valor no la variable en si - ejm pasa con la mayoria de los tipos de variables
        //Paso por referencia: cuando no mando solo el valor sino que tambien la variable en si - ejm puede pasar con las listas
        int c = 100;
        System.out.println("El valor actual de c es: " + c);
        intentarCambiarElValordeC(c);
        System.out.println("El valor de c es: " + c);

        int argumento1 = 10;
        int argumento2 = 5;
        Calculadora calcularNumeros = new Calculadora(argumento1, argumento2);
        calcularNumeros.resta();

        calcularNumeros.setNumero1(15);
        calcularNumeros.setNumero2(30);
        calcularNumeros.resta();

        System.out.println("El valor actual del numero1 de la Clase/objeto Calculadora es: " + calcularNumeros.getNumero1());
        System.out.println("El valor actual del numero2 de la Clase/objeto Calculadora es: " + calcularNumeros.getNumero2());

        Calculadora calcularNumeros2 = new Calculadora(1000, 1200);
        System.out.println(calcularNumeros2.PI);
        System.out.println(Calculadora.PI);
    }

    static void imprimirNombreEdadColaborativo() {
        System.out.println("nombre: " + "Juan");
        System.out.println("edad: " + "28");
    }

    static void imprimirNombreEdadColaborativo(String nombre) {
        System.out.println("nombre: " + nombre);
    }

    static void imprimirNombreEdadColaborativo(String nombre, int edad) {
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
    }

    static void imprimirCantidadDeAlumnosColaborativo(int cantidad, String nombreDelCurso) {
        System.out.println("Cantidad de alumnos: " + cantidad);
        System.out.println("Nombre del curso: " + nombreDelCurso);
    }

    static void restaMetodo(int a, int b) {
        int resultado = a - b;
        imprimirResultado("La resta es: ", resultado);
    }

    static void restaInversaMetodo(int a, int b) {
        int resultado = b - a;
        imprimirResultado("La resta es: ", resultado);
    }

    static int restaFuncion(int a, int b) {
        int aAux = a;
        int bAux = b;
        int resultado = aAux - bAux;
        return resultado;
    }

    static void imprimirResultado(String mensaje, int valor) {
        System.out.println(mensaje + ":  " + valor);
    }

    static void imprimirSeparacion() {
        System.out.println("=============================================");
        System.out.println("=============================================");
        System.out.println("=============================================");
        System.out.println("=============================================");
    }

    static void intentarCambiarElValordeC(int c){
        c = 0;
    }

    static long factorial(int n){
        long total = 1;
        for(int i = 1; i <= n; i++){
            total *= i;
        }
        return total;
    }

    static long factorialRecursivo(long n){
        if(n == 0){
            return 1;
        }
        return n * factorialRecursivo(n - 1);
    }

    //getters
    static int getVariableUno(){
        return VARIABLE_1;
    }
    //setters
    static void setVariableUno(int nuevaVariableUno){
        VARIABLE_1 = nuevaVariableUno;
    }
}