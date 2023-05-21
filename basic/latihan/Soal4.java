package latihan;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int hasil[][] = new int[2][2];
        int i, j;

        System.out.println("Masukan Matriks A :");
        for (i = 0; i < 2; i++){
            for (j = 0; j < 2; j++){
                A[i][j] = sc.nextInt();
            }   
        }
        
        System.out.println("Masukan Matriks B :");
        for (i = 0; i < 2; i++){
            for (j = 0; j < 2; j++){
                B[i][j] = sc.nextInt();
            }  
        }

        System.out.println("\nMatriks A");
        for (i = 0; i < 2; i++){
            for (j = 0; j < 2; j++){
                System.out.print(A[i][j]+" ");
            }  
            System.out.println(" ");
        }
        
        System.out.println("Matriks B");
        for (i = 0; i < 2; i++){
            for (j = 0; j < 2; j++){
                System.out.print(B[i][j]+" ");
            }  
            System.out.println(" ");
        }
        
        System.out.println("Matriks A + Matriks B = ");
        for (i = 0; i < 2; i++){
            for (j = 0; j < 2; j++){
                hasil[i][j] = A[i][j] + B[i][j];
                System.out.print(hasil[i][j]+" ");
            }
            System.out.println(" ");
        }
        
    }
    
}
