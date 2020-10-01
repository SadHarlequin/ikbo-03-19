package lab_8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileMenu {
    final String path = "texts.txt";

    public void write(boolean append){
        if (append) System.out.println("Дополните текст");
        else System.out.println("Перепишите текст");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        try (FileWriter writer = new FileWriter(path, append)) {
            writer.write(text + "\n");
            writer.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void read(){
        try (FileReader reader = new FileReader(path)){
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

