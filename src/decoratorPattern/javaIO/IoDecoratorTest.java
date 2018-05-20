package decoratorPattern.javaIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IoDecoratorTest {

    public static void main(String[] args) throws IOException {

        int c;

        InputStream in = new CapitalLetterInputStream(new BufferedInputStream(new FileInputStream("input.text")));

        while((c=in.read()) >= 0){
            System.out.print((char)c);
        }

        in.close();

    }
}
