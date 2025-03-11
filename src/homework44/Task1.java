package homework44;
/*
Дан файл text.txt:

Lorem ipsum dolor sit amet, consectetur adipisicing.
Lorem ipsum dolor sit amet.
Lorem ipsum dolor sit amet, consectetur adipisicing elit.
Lorem, ipsum dolor.
Lorem ipsum dolor sit amet consectetur adipisicing elit. Officia.
Lorem, ipsum.
Lorem ipsum dolor sit amet consectetur adipisicing elit.
Lorem ipsum dolor sit.
Lorem ipsum dolor sit amet consectetur adipisicing elit. Nemo!
Copy
Ваша задача используя классы пакета java.io создать файл с именем
'copy.txt' и скопировать в него все данные из файла 'text.txt'
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Task1 {
    public static void main(String[] args) {
        File fileText = new File("text.txt");
        try {
            System.out.println("Создаем файл  'text.txt'" + fileText.createNewFile());
            FileWriter fileWriter = new FileWriter(fileText);
            fileWriter.write("Lorem ipsum dolor sit amet, consectetur adipisicing.\n" +
                    "Lorem ipsum dolor sit amet.\n" +
                    "Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n" +
                    "Lorem, ipsum dolor.\n" +
                    "Lorem ipsum dolor sit amet consectetur adipisicing elit. Officia.\n" +
                    "Lorem, ipsum.\n" +
                    "Lorem ipsum dolor sit amet consectetur adipisicing elit.\n" +
                    "Lorem ipsum dolor sit.\n" +
                    "Lorem ipsum dolor sit amet consectetur adipisicing elit. Nemo!");
            fileWriter.close();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileText));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Файл 'text.txt' создан");
        File fileCopy = new File("copy.txt");
        try {
            System.out.println("Создаем файл  'copy.txt'" + fileCopy.createNewFile());
            FileWriter fileWriter = new FileWriter(fileCopy);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileText));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                fileWriter.write(line + "\n");
            }
            fileWriter.close();
            bufferedReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
