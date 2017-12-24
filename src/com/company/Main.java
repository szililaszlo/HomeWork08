package com.company;

public class Main {

    public static void main(String[] args) {
	    //1
        FileOperation.fileMaker("E:\\","alma.txt");

        //2
        FileOperation.fileMaker("E:\\",3,"macska.txt");

        //3
        FileOperation.fileMakerWithContent("E:\\","Hello World","welcome.txt");

        //4
        FileOperation.fileMakerWithContent("E://",4,"Created By: Laszlo Szili", "part.txt");

        //5
        //új 2d tömb létrehozás
        int [] [] matrix = new int[3][5];
        // mátrix inicializálás
        initMatrix(matrix);
        FileOperation.printMatrixIntoFile(matrix);
       // printMatrix(matrix);

    }

    // mátrix feltöltése random 0 és 1 értékekkel
    public static void initMatrix(int [] [] mtx) {
        for (int i = 0; i<mtx.length;i++) {
            for (int j = 0; j<mtx[i].length;j++) {
                mtx[i][j] = (int)(Math.random() * 2);
            }
        }
    }

    // mátrix konzolra történő kiíratása ellenőrzés céljából
    public static void printMatrix(int [] [] mtx) {
        for (int i = 0; i<mtx.length;i++) {
            for (int j = 0; j<mtx[i].length;j++) {
                System.out.println(mtx[i][j]);
            }
        }
    }

}
