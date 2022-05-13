package Examenunidad1;

import java.util.Scanner;

/**
 * Ejercicio01
 */
public class Ejercicio01 {
    //comentario
    static Scanner leerteclado=new Scanner(System.in);
    public static void pregunta1JFCG(){
        //Definir variables
        double examencon, entrevistaper, testpsi, promedio;
        String nivel;
        //Datos de entrada
        System.out.println("Ingrese la nota de examen de conocimiento:");
        examencon=leerteclado.nextDouble();
        System.out.println("Ingrese la nota de la entrevista personal:");
        entrevistaper=leerteclado.nextDouble();
        System.out.println("Ingrese la nota del test psicologico:");
        testpsi=leerteclado.nextDouble();
        //Poceso
        promedio=examencon*0.40+entrevistaper*0.35+testpsi*0.25;
        /* 
        >=17 se encuentra en el cuarto nivel
        <17 y >=14 se encuentra en el tercer nivel
        <14 y >=11 se encuentra en el segundo nivel
        <11 se encuentra en el pimer nivel y ya no puede obtener la vacante
         */

         if (promedio>=17) {
             nivel="se encuentra en el cuarto nivel";
        }else if(promedio<17 && promedio>=14){
            nivel="se encuentra en el tercer nivel";
        }else if(promedio<14 && promedio>=11) {
            nivel="se encuentra en el segundo nivel";
        }else{
            nivel="se encuentra en el pimer nivel y ya no puede obtener la vacante";
        }
        //Datos de salida
        System.out.println(nivel);
    }

    public static void main(String[] args) {
        pregunta1JFCG();
    }
}