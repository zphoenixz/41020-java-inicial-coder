import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //IF-THEN ================================
        boolean yoSoy = true;
//        boolean yoNoSoy = false;
//        int variable = 12;
//        if (yoSoy==true) {
//            System.out.println("yoSoy es verdadero (true) por eso vez esto.");
//        }
//        if (!yoNoSoy) {// falso false = verdadero
//            System.out.println("yoSoy es verdadero (true) por eso vez esto.");
//        }
//        //IF-THEN-ELSE ================================
//        yoSoy = true;
//        //OPCION 1
//        if (yoSoy) {
//            System.out.println("yoSoy es verdadero (true) por eso ves esto.");
//        } else {
//            System.out.println("yoSoy es falso (false) por eso ves esto.");
//        }
//
//        //OPCION 2
//        if (yoSoy) {
//            System.out.println("yoSoy es verdadero (true) por eso ves esto.");
//        }
//        System.out.println("yoSoy es falso (false) por eso ves esto.");

//        //SWITCH-con-sinbreak ================================
//        int mes = 6;
//        switch (mes) {
//            case 1://mes == 1?
//                System.out.println("Enero");
//                break;
//            case 2://mes == 2?
//                System.out.println("Febrero");
//                break;
//            case 3://mes == 3?
//                System.out.println("Marzo");
//                break;
//            case 4://mes == 4?
//                System.out.println("Abril");
//                break;
//            case 5:
//                System.out.println("Mayo");
//                break;
//            case 6:
//                System.out.println("Junio");
//            case 7:
//                System.out.println("Julio");
//            case 8:
//                System.out.println("Agosto");
//            case 9:
//                System.out.println("Septiembre");
//            case 10:
//                System.out.println("Octubre");
//            case 11:
//                System.out.println("Noviembre");
//            case 12:
//                System.out.println("Diciembre");
//            default://true
//                System.out.println("Codigo no encontrado");
//        }
//        //Equivalente 1
//        mes = 6;
//        if (mes == 1) {
//
//        } else if (mes == 2) {
//
//        } else if (mes == 3) {
//
//        } else {
//
//        }
//        //Equivalente 1
//        if (mes == 1) {
//
//        }
//        if (mes == 2) {
//
//        }
//        if (mes == 3) {
//
//        }
//        //Que meses de invierno me sobran?
//        //Este mes es invieron?
//        String mesActual = "junio";
//        switch (mesActual) {
//            case "junio"://mesActual == junio?
//                System.out.println("Es invierno");
//                break;
//            case "julio"://mesActual == julio?
//                System.out.println("Es invierno");
//                break;
//            case "agosto"://mesActual == agosto?
//                System.out.println("Es invierno");
//                break;
//            default://true
//                System.out.println("No es invierno");
//                break;
//        }
//        //TRY-CATCH ================================
        int pos = 10;
        int[] numeros = {10, 2, -3, 100012};
        // numeros[0] = 10;
        // numeros[1] = 2;
        // numeros[2] = -3;
        // numeros[3] = 100012;

        // numeros[-1] = ?; error
        // numeros[1000] = ?; error
        // numeros[3] = ?; error
//        System.out.println("Todavia no empece");
//        try {
//            System.out.println("Estoy empezando");
//            int numero = numeros[4];
//            System.out.println("El núemro en la posición " + pos + " es " + numero);
//            System.out.println("El programa ejecutó satisfactoriamente");
//        } catch (Exception e) {
//            System.out.println("Hubo un error obteniendo el numero en la posición " + pos);
//            System.out.println("El error fue " + e);
//        }
//        //TRY-CATCH-FINALLY ================================
//        pos = 4;
//        try {
//            int numero = numeros[pos];
//            System.out.println("El núemro en la posición " + pos + " es " + numero);
//            System.out.println("El programa ejecutó satisfactoriamente");
//        } catch (Exception e) {
//            System.out.println("Hubo un error obteniendo el numero en la posición " + pos);
//        } finally {
//            System.out.println("Este bloque de código se ejecuta siempre");
//        }
//
//        //OPERADOR TERNARIO ================================
//        int valor1 = 1;
//        int valor2 = 2;
//        int resultado;
//        boolean algunaCondicion = true;
//        int ayuda = 0;
//        //OPCION 1 Clasico IF
////        if(algunaCondicion){
////            resultado = valor1;
////        }else{
////            resultado = valor2;
////        }
////        System.out.println("Resultado: " + resultado);
//        //OPCION 2 Operador ternario
//        resultado = algunaCondicion ? valor1 : valor2;
//        // condición ? then : else;
//        //OPCION 1 == OPCION 2
//        System.out.println("Resultado: " + resultado);
//        //RANDOM ================================
        double random = 0.0;
        // Prueba 1
        // Math.random() es siempre un número double entre 0 y 1 representando la probabilidad estadistica
        random = Math.random();
        System.out.println("Random Number:" + random);

//        // Prueba 2
//        double random2  = Math.random();
//        System.out.println("Random Number:" + random2);
//
//        // Prueba 3
//        random2 = Math.random();
//        System.out.println("Random Number:" + random2);
        // =============================================================
        //Objetivo es tener un numero aleatorio entre 1 y 12
        //rango = 12 -1 + 1 = 12
        int minimo = 1, maximo = 12, rango = maximo - minimo + 1;
//        int random = 0;
        // Prueba 1
        double random1 = Math.random() * 12.0;
        System.out.println("Double random1:" + random1);
        System.out.println("Int random1:" + (int)random1);
//        random = (int)random1 + minimo;
        // ramdon = (0 * 12) + 1 = 1
        // ramdon = (1 * 12) + 1 = 12
        System.out.println("Random Number:" + random);

//        // Prueba 2
//        random = (int)(Math.random() * rango) + minimo;
//        System.out.println("Random Number:" + random);
//
//        // Prueba 3
//        random = (int)(Math.random() * rango) + minimo;
//        System.out.println("Random Number:" + random);
    }
}