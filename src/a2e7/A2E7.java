import java.util.Random;

public class A2E7 {

    public static void main(String[] args) {

        // definir variables
        int Num;
        int contador = 0;
        int contador2 = 0;
        int contador3 = 0;
        //pasar los 15 numeros para ver si son pares, impares o ceros
        for (int i = 0; i < 15; i++) {
            Random Aleatoreo = new Random();
            Num = Aleatoreo.nextInt(37);
            if (Num != 0 & Num % 2 == 0) {
                contador = contador + 1;
            }
            if (Num != 0 & Num % 2 != 0) {
                contador2 = contador2 + 1;
            }
            if (Num == 0) {
                contador3 = contador3 + 1;
            }
        }
        System.out.println("El porcentaje de numeros pares es: %" + (float)(contador * 100) / 15);
        System.out.println("El porcentaje de numeros impares es: %" + (float)(contador2 * 100) / 15);
        System.out.println("El porcentaje de ceros es: %" + (float)(contador3 * 100) / 15);
    }

}
