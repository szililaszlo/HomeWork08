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
    }

}
