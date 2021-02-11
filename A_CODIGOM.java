/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_codigom;

import java.util.Scanner;

/**
 *
 * @author ESTEFANIA TAMAY
 */
public class A_CODIGOM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        String[][] letras;
        letras = new String[27][2];
        
        letras[0][0] = "Letra";
        letras[0][1] = " Codigo";
        
        letras[1][0] = "A";
        letras[1][1] = "    .-";
        
        letras[2][0] = "B";
        letras[2][1] = "    -...";
        
        letras[3][0] = "C";
        letras[3][1] = "    -.-.";
        
        letras[4][0] = "D";
        letras[4][1] = "    -..";
        
        letras[5][0] = "E";
        letras[5][1] = "    .";
        
        letras[6][0] = "F";
        letras[6][1] = "    ..-.";
        
        letras[7][0] = "G";
        letras[7][1] = "    --.";
        
        letras[8][0] = "H";
        letras[8][1] = "    ...";
        
        letras[9][0] = "I";
        letras[9][1] = "    ..";
        
        letras[10][0] = "J";
        letras[10][1] = "    .---";
        
        letras[11][0] = "K";
        letras[11][1] = "    -.-";
        
        letras[12][0] = "L";
        letras[12][1] = "    .-..";
        
        letras[13][0] = "M";
        letras[13][1] = "    --";
        
        letras[14][0] = "N";
        letras[14][1] = "    -.";
        
        letras[15][0] = "O";
        letras[15][1] = "    ---";
        
        letras[16][0] = "P";
        letras[16][1] = "    .--.";
        
        letras[17][0] = "Q";
        letras[17][1] = "    --.-";
        
        letras[18][0] = "R";
        letras[18][1] = "    .-.";
        
        letras[19][0] = "S";
        letras[19][1] = "    ...";
        
        letras[20][0] = "T";
        letras[20][1] = "    -";
        
        letras[21][0] = "U";
        letras[21][1] = "    ..-";
        
        letras[22][0] = "V";
        letras[22][1] = "    ...-";
        
        letras[23][0] = "W";
        letras[23][1] = "    .--";
        
        letras[24][0] = "X";
        letras[24][1] = "    -..-";
        
        letras[25][0] = "Y";
        letras[25][1] = "    -.--";
        
        letras[26][0] = "Z";
        letras[26][1] = "    --.."; 
        
 
        System.out.println("Ingresar Caracter: ");
        char caractere= entrada.next().charAt(0);
        int ascii = (int)caractere;
        System.out.println("El caractere : " + "tiene el codigo ascii : " + (ascii) );
     
        
        
        //Imprimir todos los datos
       
        for (int i=0;i<26;i++) {
             for (int j=0;j<2;j++) {
            System.out.print(letras[i][j]);
            }
             System.out.println("");
           }
        }
    }

        
    
    
