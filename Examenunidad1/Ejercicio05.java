package Examenunidad1;

import java.util.Scanner;

/**
 * EjercicioCondMult
 */
public class Ejercicio05 {
    public static void profesor() {
     System.out.println("La funcion del docente es enseñar");   
    }
    public static void estudiante() {
     System.out.println("La funcion del estudiante es aprender");   
    }
    public void maquinaPC() {
    System.out.println("La funcion de la PC es procesar informacion");    
    }
    public void proyector() {
    System.out.println("Proyectar una imagen, informacion");    
    }


   public static void main(String[] args) {
     

    Ejercicio05 objx=new Ejercicio05();
       
       Scanner lt=new Scanner(System.in);
       System.out.println("Ingrese el algoritmo que desea probar\n1=profesor"+
       "\n2=estudiante"+"\n3=maquina"+"\n4=proyector");
       int opcMet=lt.nextInt();
       
       switch (opcMet) {
           case 1:{ profesor(); } break;
           case 2: estudiante(); break;
           case 3: objx.maquinaPC(); break;
           case 4: objx.proyector(); break;
       
           default: System.err.println("opcion no exixte"); break;
       }
   }
        
    }
