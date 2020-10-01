package lab_8;

import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWork {

    public static void main(String[] args) {
        fileMenu fileWR = new fileMenu();

        fileWR.read();
        fileWR.write(false);
        fileWR.write(true);
        fileWR.read();
    }
}
