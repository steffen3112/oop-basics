package decoratorPattern.javaIO;

import java.io.*;
import java.nio.charset.StandardCharsets;

/*
 * This class just shows how the decorator pattern is used in java.io.*
 */
public class IoTest {

    public static void main(String[] args){
        try {
            InputStream myInput = new FileInputStream(".gitignore");
            BufferedInputStream myBufferedInput = new BufferedInputStream(myInput);

            BufferedReader myReader = new BufferedReader(new InputStreamReader(myBufferedInput, StandardCharsets.UTF_8));
            String line;
            while((line = myReader.readLine()) != null){
                System.out.println(line);
                //myReader.close();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            PrintWriter myOutput = new PrintWriter(new FileOutputStream(".gitignore"));
            myOutput.print("node_modules");
            myOutput.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println("working");
    }
}
