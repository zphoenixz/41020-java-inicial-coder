import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        //ARRAYS ================================
//        //ARRAYS-VECTORES ================================
//        System.out.println("//ARRAYS-VECTORES ================================");
//        byte[] arrayDeBytes;
//        short[] arrayDeShorts;
//        long[] arrayDeLongs;
//        float[] arrayDeFloats;
//        double[] arrayDeDoubles;
//        boolean[] arrayDeBooleans;
//        char[] arrayDeChars;
//        String[] arrayDeStrings;
//
//        arrayDeBytes = new byte[4];// pos=0, 1, 2, 3
//        arrayDeBytes[0] = 125;
//        arrayDeBytes[1] = 126;
//        arrayDeBytes[2] = 127;
//        arrayDeBytes[3] = arrayDeBytes[2];
////        arrayDeBytes[23] = 127;
////        arrayDeBytes[4] = 127;
//        System.out.println(arrayDeBytes[0]);
//        System.out.println(arrayDeBytes[1]);
//        System.out.println(arrayDeBytes[2]);
//        System.out.println(arrayDeBytes[3]);
////        System.out.println(arrayDeBytes[4]);
//
//        arrayDeBooleans = new boolean[4];
//        System.out.println(arrayDeBooleans[0]);
//
//        arrayDeChars = new char[4];
//        arrayDeChars[0] = 'c';
//        System.out.println(arrayDeChars[0]);
//        System.out.println(arrayDeChars[1]);
//
//        arrayDeStrings = new String[4];
//        arrayDeStrings[0] = "c";
//        System.out.println(arrayDeStrings[0]);
//        System.out.println(arrayDeStrings[1]);

        //ARRAYS-LISTAS DINÁMICAS ================================
        System.out.println("//ARRAYS-LISTAS DINÁMICAS ================================");
        List<Byte> listaDeBytes = new ArrayList<>();
        listaDeBytes.add((byte) 125);//Pos 0
        listaDeBytes.add((byte) 126);//Pos 1
        listaDeBytes.add((byte) 127);//Pos 2
        System.out.println("agrego 1: " + listaDeBytes.get(0));
        System.out.println("agrego 2: " + listaDeBytes.get(1));
        System.out.println("agrego 3: " + listaDeBytes.get(2));
        System.out.println("tamaño: " + listaDeBytes.size());

        List<Boolean> listaDeBoolean = new ArrayList<>();
        listaDeBoolean.add(true);
        System.out.println(listaDeBoolean.get(0));
//        System.out.println(listaDeBoolean.get(1));

        List<Character> listaDeChar = new ArrayList<>();
        listaDeChar.add('c');
        System.out.println(listaDeChar.get(0));
//        System.out.println(listaDeChar.get(1));

        List<String> listaDeStrings = new ArrayList<>();
        listaDeStrings.add("c");
        System.out.println(listaDeStrings.get(0));
//        System.out.println(listaDeStrings.get(1));

        //ARRAYS-LISTAS DINÁMICAS-MÉTODOS QUE NOS AYUDAN ================================
        System.out.println("//ARRAYS-LISTAS DINÁMICAS-MÉTODOS QUE NOS AYUDAN ================================");
        List<String> listaDestino = new ArrayList<>();
        listaDestino.add("Celeste");
        listaDestino.add("Blanco");
        listaDestino.add("Rosado");

        List<String> listaOrigen = new ArrayList<>();
        listaOrigen.add("Celeste");
        listaOrigen.add("Blanco");
        listaDestino.add("Negro");

        System.out.println("Lista Origen: " + listaOrigen);
        System.out.println("Lista Destino: " + listaDestino);

        System.out.println("La lista destino contiene la lista origen?: " + listaDestino.containsAll(listaOrigen));
        listaDestino.addAll(listaOrigen);
        System.out.println("añadamos la lista origen a la lista destino: " + listaDestino);
        listaDestino.removeAll(listaOrigen);
        System.out.println("removamos la lista origen para que la lista destino" + listaDestino);

        System.out.println("Lista Origen: " + listaOrigen);
        System.out.println("Lista Destino: " + listaDestino);

        listaOrigen.clear();
        System.out.println("Lista Origen: " + listaOrigen);
        System.out.println("Lista Destino: " + listaDestino);

        //get, set, add y remove
        listaOrigen.add("Celeste");
        listaOrigen.add("Blanco");
        System.out.println("get pos cero: " + listaOrigen.get(0));
        System.out.println(listaOrigen);

        listaOrigen.set(1, "Rosado");// intArr[0] = 2;
        System.out.println("get pos cero: " + listaOrigen.get(0));
        System.out.println(listaOrigen);

        listaOrigen.remove(0);
        System.out.println("get pos cero: " + listaOrigen.get(0));
        System.out.println(listaOrigen);

        listaOrigen.add("Azul");
        System.out.println(listaOrigen);
        System.out.println("En que pos esta el Azul?: " + listaOrigen.indexOf("Azul"));
        listaOrigen.add("Azul");
        listaOrigen.add("Azul");
        listaOrigen.add("Azul");
        System.out.println(listaOrigen);
        System.out.println("En que pos esta el Azul?: " + listaOrigen.lastIndexOf("Azul"));

        //ARRAYS-LISTAS DINÁMICAS-ITERADORES ================================
        List<Integer> listaDeNumerosHastaEl20 = new ArrayList<>();
        listaDeNumerosHastaEl20.add(1);
        listaDeNumerosHastaEl20.add(2);
        listaDeNumerosHastaEl20.add(3);
        listaDeNumerosHastaEl20.add(4);
        listaDeNumerosHastaEl20.add(5);
        listaDeNumerosHastaEl20.add(6);
        listaDeNumerosHastaEl20.add(7);
        listaDeNumerosHastaEl20.add(8);
        listaDeNumerosHastaEl20.add(9);
        listaDeNumerosHastaEl20.add(10);
        listaDeNumerosHastaEl20.add(11);
        listaDeNumerosHastaEl20.add(12);
        listaDeNumerosHastaEl20.add(13);
        listaDeNumerosHastaEl20.add(14);
        listaDeNumerosHastaEl20.add(15);
        listaDeNumerosHastaEl20.add(16);
        listaDeNumerosHastaEl20.add(17);
        listaDeNumerosHastaEl20.add(18);
        listaDeNumerosHastaEl20.add(19);
        listaDeNumerosHastaEl20.add(20);

        Iterator<Integer> iteratorDeListaDeNumerosHastaEl20 = listaDeNumerosHastaEl20.iterator();
        System.out.println("listaDeNumerosHastaEl20: " + listaDeNumerosHastaEl20);
//        System.out.println("1er valor " + iteratorDeListaDeNumerosHastaEl20);
        System.out.println("Tiene un sgte valor?: " + iteratorDeListaDeNumerosHastaEl20.hasNext());


        System.out.println("Dame el sgte valor: " + iteratorDeListaDeNumerosHastaEl20.next());
        System.out.println("Dame el sgte valor de nuevo: " + iteratorDeListaDeNumerosHastaEl20.next());
        iteratorDeListaDeNumerosHastaEl20.remove();
        System.out.println("Removimos el último valor mostrado, ahora como estamos?: " + listaDeNumerosHastaEl20);

//        //CICLOS/BUCLES ================================
//        //WHILE
        int contador = 1;
        int limite = 20;
        listaDeNumerosHastaEl20.clear();
        while (contador <= limite) {
            listaDeNumerosHastaEl20.add(contador);
            contador++;
        }
        System.out.println("Llenado con bucle while: " + listaDeNumerosHastaEl20);
//
        //DO WHILE
        contador = 1;
        limite = 0;
        listaDeNumerosHastaEl20.clear();
        do {
            listaDeNumerosHastaEl20.add(contador);
            contador++;
        } while (contador <= limite);
        System.out.println("Llenado con bucle do while: " + listaDeNumerosHastaEl20);

        //FOR
        listaDeNumerosHastaEl20.clear();
        limite = 10;
        for (int i = 1; i <= limite; i++) {
            listaDeNumerosHastaEl20.add(i);
        }
        System.out.println("Llenado con bucle for: " + listaDeNumerosHastaEl20);

        //Recorrer el array con for
        for (int numero : listaDeNumerosHastaEl20) {
            System.out.println("numero: " + numero);
        }
        //Recorrer el array con foreach
        listaDeNumerosHastaEl20.forEach(numero -> { //funcion flecha, arrow function, lambdas
            System.out.println("numero: " + numero);
        });

        //OPERADORES LOGICOS ================================
        int valor1 = 1;
        int valor2 = 2;
        if((valor1 == 1) && (valor2 == 2)) {//Verdad o Falso?
            //TRUE AND TRUE = TRUE
            System.out.println("valor1 es 1 AND valor2 es 2");
        }
        if((valor1 == 1) || (valor2 == 1)) {
            //TRUE OR FALSE = TRUE
            System.out.println("valor1 es 1 OR valor2 es 1");
        }

        if((valor1 == 1) && (valor2 == 1)) {//Verdad o Falso?
            //TRUE AND FALSE = FALSE
            System.out.println("valor1 es 1 AND valor2 es 2");
        }
        if((valor1 == 1) && !(valor2 == 1)) {//Verdad o Falso?
            //TRUE AND not(FALSE)
            //TRUE AND TRUE = TRUE
            System.out.println("valor1 es 1 AND valor2 es 2");
        }
        if(!(valor1 == 1) && !(valor2 == 1)) {//Verdad o Falso?
            //not(TRUE) AND not(FALSE)
            //FALSE AND TRUE = FALSE
            System.out.println("valor1 es 1 AND valor2 es 2");
        }
        if(!(valor1 == 1) || !(valor2 == 1)) {//Verdad o Falso?
            //not(TRUE) OR not(FALSE)
            //FALSE OR TRUE = TRUE
            System.out.println("valor1 es 1 AND valor2 es 2");
        }
    }
}