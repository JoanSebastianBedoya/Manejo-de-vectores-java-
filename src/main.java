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
                    System.out.print("\nError: El numero ingresado ya se encuentra en el vector\n" + "=".repeat(60));
                } else {
                    numeros[i] = numero;
                    System.out.print("\nNumero agregado con exito!\n" + "=".repeat(60)); // se ingresa cumpliendo todas las condiciones
                    i++; 
                }
            } else {
                System.out.print("\nError: El numero esta fuera del rango (10 - 100)n\n" + "=".repeat(60));
            }
            
        }

        System.out.print("\n");
        for (int i = 0; i < 15; i++) {
            System.out.print("[" + numeros[i] + "]\n");
        }
        System.out.print("\n" + "=".repeat(60));

        int mayor = numeros[0];
        int menor = numeros[0];
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
                    }
                    
                    if (numeros[i] < menor) {
                        menor = numeros[i];
                    }
                    
                    if (numeros[i] > mayor){
                        mayor = numeros[i];
                    }
                }

                if (encontrado){ 
                    System.out.print("\nEl numero que buscas esta en la posicion [" + posicion + "] del vector\n" + "=".repeat(60));
                } else {
                    System.out.print("\nEl numero no se encuentra en el vector\n" + "=".repeat(60));
                }

            }
        }

        System.out.print("\n" + "=".repeat(60) + "\nEl numero menor del vector es: [" + menor + "]\n" );
        System.out.print("El numero mayor del vector es: [" + mayor + "]\n" + "=".repeat(60));
       
        System.out.print("\nEscriba el numero al que desee encontrarle multiplos en el vector\n\n");
        int x = teclado.nextInt();

        System.out.print("\nlos multiplos de " + x +  " que se encuentran en el vector son: \n" + "=".repeat(60));
        int multiplos = 0;

        for (int i = 0; i < 15; i++){
            if (numeros[i] % x == 0){
                System.out.print("\n [" + numeros[i] + "]");
                multiplos++;
            }   
        }

        if (multiplos == 0 ) {
                System.out.print("\nNo se encontro ningun multiplo en el vector\n");
            }
        
        System.out.print("\n" + "=".repeat(60));

        int sumatotal = 0;

        for (int i = 0; i < 15; i++) {
            sumatotal += numeros[i];

        }
        

        double promedio = (double) sumatotal / numeros.length;
        

        System.out.print("\nEl promedio de los numeros del vector es: " + promedio );
        System.out.print("\nLa suma total de los numeros del vector es: " + sumatotal );
        System.out.print("\n" + "=".repeat(60) + "\n");

        int promediomayor = 0;

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > promedio) {
                promediomayor++;
            }
        }
            
        int[] numerosmayorpromedio = new int[promediomayor];
        int posicionpromedio = 0;
        
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > promedio) {
                numerosmayorpromedio[posicionpromedio] = numeros[i];
                posicionpromedio++;
            }
        }

        System.out.print("Los numeros mayores al promedio son: \n");

        for (int i = 0; i < numerosmayorpromedio.length; i++) {
            System.out.print("[" + numerosmayorpromedio[i] + "]\n");

        }

        System.out.print("=".repeat(60));

        


        
         

        



    }
}