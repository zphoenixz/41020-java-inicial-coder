public class Main {
    //camelCase
    //snake_case
    final static int VARIABLE_CONSTANTE = 2;

    public static void main(String[] args) {
//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        System.out.println("4");
//        System.out.println("5");
//        System.out.println("6");
        //For, while, do while
        for (int i = 1; i <= 6; i++) {
            System.out.println(i);
        }
        // Bloque condicional
        if (false) {//"a".equals("a") = true, "a".equals("b") = false
            System.out.println("6.5");
        } else {
            System.out.println("6.9");
        }
        System.out.println(VARIABLE_CONSTANTE);
        //Camel case
        int variableDePrueba = 4;
        int variableDePrueba2 = 4;
        int variableDePrueba3 = 4;
        System.out.println(metodoParaDevolverUnNumber());

//        int variableDePrueba15;
//        variableDePrueba15 = "";

        int variableDePrueba15 = 4;
        Integer variableDePrueba16;
        variableDePrueba16 = variableDePrueba15;

//        int y = 1000;
//        byte x = -129;
//        System.out.println(x );
//        int x = 24;
//        byte b = x;
//        System.out.println("El valor de la variable es: " + b);

//        int x = 4;
//        int y = 2;
//        System.out.println(x+y);//6
//        System.out.println(x-y);//2
//        System.out.println(x/y);//2
//        System.out.println(x%y);//0

        int x = 2;
        int y = 3;
        System.out.println(x / y);//0
        System.out.println(x % y);//2
        y++;//y = y + 1
        ++x;
        y--;//y = y - 1
        --x;
        System.out.println(y);
        System.out.println(x);
        //----------------------
        System.out.println(y == x);//false
        System.out.println(y != x);//true
        System.out.println(x < y);//true
        System.out.println(x > y);//false
        //<=, >=
        //--------------------------------------
        if(y == x){//&&, ||
            System.out.println("Y igual a X");
        }else{
            System.out.println("Y diferente de X");
        }
        //obtenerNumeroDeEstudiantes
        //obtenerNumberDeEstudiantesQueSeInscribieronEsteDia
//        int intDePrueba = 2.6;
        double doubleDePrueba = 2.6;
        double doubleDePrueba2 = 2;
    }

    public static int metodoParaDevolverUnNumber() {
        return 12;
    }
}