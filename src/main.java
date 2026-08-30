package src;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[15];

        for (int i = 0; i < 15; ) { //Se repite el ciclo hasta alcanzar el limite de valores dentro del vector
            System.out.print("\nIngresa un numero para la posicion [" + i + "] (entre 10 y 100) \n");
            int numero = teclado.nextInt(); //Solicitamos en ingresamos numero al vector

            if(numero >= 10 && numero <= 100) { //Evaluamos que se encuentre en el rango
                boolean existencia = false;
                for (int r = 0; r < i; r++){ // recorremos el vector en busca de semejantes
                    if (numeros[r] == numero ){
                        existencia = true;
                        break;
                    }
                }
                //Se condiciona la existencia o no de un numero en el vector
                if (existencia){
                    System.out.print("Error: El numero ingresado ya se encuentra en el vector");
                } else {
                    numeros[i] = numero;
                    System.out.print("\nNumero agregado con exito!\n" + "=".repeat(60)); // se ingresa cumpliendo todas las condiciones
                    i++; 
                }
            } else {
                System.out.print("\nError: El numero esta fuera del rango (10 - 100)n\n" + "=".repeat(60));
            }
            
        }

        //Busqueda de numero en el vector
        while (true){
            System.out.print("\nIngrese el numero que desea buscar (Escribir -1 para salir)\n\n ");
            int search = teclado.nextInt();
            boolean encontrado = false;
            int posicion = -1;

            if (search == -1){
                break;
            } else {
                for (int i = 0; i < 15; i++){
                    if (numeros[i] == search){
                        posicion = i;  
                        encontrado = true; 
                        break;
                    }       
                }

                if (encontrado){ 
                    System.out.print("\nEl numero que buscas esta en la posicion [" + posicion + "] del vector");
                } else {
                    System.out.print("\nEl numero no se encuentra en el vector");
                }

            }





        }

        



    }
}