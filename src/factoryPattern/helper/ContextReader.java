package factoryPattern.helper;

import java.io.*;

public class ContextReader implements Context{

    InputStream in;

    @Override
    public String getContext() {

        String myContext = "";

        {
            try {
                in = new FileInputStream("Context.txt");
                BufferedInputStream bufferedInputStream = new BufferedInputStream(in);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream));
                String line;
                while((line = bufferedReader.readLine()) != null){
                    myContext += line;
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return myContext;
    }
}
