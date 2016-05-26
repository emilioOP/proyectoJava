/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emilio
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(generarNumeros());
    }
    
    private static int comparar() {
        int aciertos = 0;
        //rescatar numeros sorteo
        String nSorteo = "1234";
        //rescatar numeros boleto
        String nBoleto = "1234";

        for (int i = 0; i < nBoleto.length(); i++) {
            char l = nBoleto.charAt(i);
            String ll = String.valueOf(l);
            if (nSorteo.contains(ll)) {
                aciertos++;
            }
        }

        return aciertos;
    }  
    
    private static void dividir() throws Exception{
        int pozo=10000;
            
            
            int ganadores=4;
            int dosaciertos=2;
            int tresaciertos=0;
            int cuatroaciertos=2;
            
            //4 aciertos:70%
            //3 aciertos: 20%
            //2 aciertos: 10%
            float pozo2Aciertos=(0.1f*(float)pozo)/(float)dosaciertos;            
            System.out.println("Pozo 2: "+pozo2Aciertos+" *"+dosaciertos);
            float pozo3Aciertos=(0.2f*(float)pozo)/(float)tresaciertos;            
            System.out.println("Pozo 3: "+pozo3Aciertos+" *"+tresaciertos);
            float pozo4Aciertos=(0.7f*(float)pozo)/(float)cuatroaciertos;            
            System.out.println("Pozo 4: "+pozo4Aciertos+" *"+cuatroaciertos);
    }
    
    private static String sortear() {
        Random rd=new Random();
        StringBuffer numeros= new StringBuffer();
        
        int n=0;
        for (int i = 1; i <=4; i++) {
            n=rd.nextInt(9);
            String numero=Integer.toString(n);
            numeros.append(numero);
        }
        
        String juego=numeros.toString();
        return juego;

    }
    
    private static void imprimir(){
        String numeros="3542";
        char n1=numeros.charAt(0);
        char n2=numeros.charAt(1);
        char n3=numeros.charAt(2);
        char n4=numeros.charAt(3);
        
        String sn1=Character.toString(n1);
        String sn2=Character.toString(n2);
        String sn3=Character.toString(n3);
        String sn4=Character.toString(n4);
        
        System.out.println("1°n:"+sn1+"");
        System.out.println("2°n:"+sn2+"");
        System.out.println("3°n:"+sn3+"");
        System.out.println("4°n:"+sn4+"");
    }
    
    private static String ordenar(String numeros){
        int[] arreglo=new int[4];
        
        for(int i=0; i<numeros.length(); i++){
            char c=numeros.charAt(i);
            String s=String.valueOf(c);
            int n=Integer.parseInt(s);
            arreglo[i]=n;
        }
        
        Arrays.sort(arreglo);
        String ordenado=arreglo[0]+""+arreglo[1]+""+arreglo[2]+""+arreglo[3];   
        
        return ordenado;
    }
    
    private static String generarNumeros(){
        Random rd=new Random();
        int[] numeros=new int[4];
        int i=0;
        
        int n=0;        
        while(i<4){
            n=rd.nextInt(9);
            if(n!=0 & n!=numeros[0] & n!=numeros[1] & n!=numeros[2] & n!=numeros[3]){
                numeros[i]=n;                                
                i++;                
            }            
        }
        
        Arrays.sort(numeros);
        String ordenado=numeros[0]+""+numeros[1]+""+numeros[2]+""+numeros[3];
        
        return ordenado;
    }
}
