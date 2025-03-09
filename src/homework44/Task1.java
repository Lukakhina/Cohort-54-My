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
Ваша задача используя классы пакета java.io создать файл с именем 'copy.txt'
 и скопировать в него все данные из файла 'text.txt'
 */

import java.io.File;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("text.txt");
        System.out.println(file.exists());


    }


}
