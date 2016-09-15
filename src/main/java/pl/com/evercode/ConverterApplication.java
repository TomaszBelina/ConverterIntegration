package pl.com.evercode;

import pl.com.evercode.integration.converter.Converter;
import pl.com.evercode.integration.converter.impl.ConverterToXmlImpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by macx on 12.09.16.
 */
public class ConverterApplication {

    public static void main(String[] args) throws Exception{
        Converter converter = new ConverterToXmlImpl();
        String path = "src\\main\\resources\\";
        String input = getInput(path);
        System.out.println(converter.convert(input));

    }

    private static String getInput(String path) throws Exception{
        File file = new File(path+"inputDataCorrect.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line = null;
        while((line = br.readLine()) != null){
            sb.append(line).append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }
}
