package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {

    //1
    public static void fileMaker(String destination, String name_type) {
        // fout változó inicializálása
        FileOutputStream fout = null;
        try {
            // fájl mentési hely megadás és név+ típus megadás
            fout = new FileOutputStream(destination + name_type);

            // catch amely kezeli a hibát ha  a fájl nem található
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            //általános hiba elkapás
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            // if ág azért hogy ne legyen nullPointer hiba
            if (fout != null) {
                try {
                    //file kapcsolat lezárás
                    fout.close();
                } catch (IOException e) {
                    //ha hiba lépne fel lezárás során az itt kezelhető
                    e.printStackTrace();
                }
            }
        }
    }

    //2
    public static void fileMaker(String destination, int quantity, String name_type) {
        // fout változó inicializálása
        FileOutputStream fout = null;
        try {
            // fájl mentési hely megadás és név+ típus megadás
            //for ciklus a megfelelő mennyiségű fájl létrehozására
            for (int i = 1; i<= quantity; i++)
                // i változó segít eltérő fájlnevet generállni
            fout = new FileOutputStream(destination + i + name_type);

            // catch amely kezeli a hibát ha  a fájl nem található
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            //általános hiba elkapás
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            // if ág azért hogy ne legyen nullPointer hiba
            if (fout != null) {
                try {
                    //file kapcsolat lezárás
                    fout.close();
                } catch (IOException e) {
                    //ha hiba lépne fel lezárás során az itt kezelhető
                    e.printStackTrace();
                }
            }
        }
    }
}
