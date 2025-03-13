package homework44;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;

public class Task2_1 {
    public static void main(String[] args) {
        File receiptOfMoney = new File("src/homework44/receiptOfMoney.txt");
        try {
            FileWriter fileWriter = new FileWriter("src/homework44/less.txt");
            fileWriter.write("user1:2050\n" +
                    "user2:1200\n" +
                    "user1:1700\n" +
                    "user3:1800\n" +
                    "user1:1300\n" +
                    "user4:2100\n" +
                    "user2:750");
            fileWriter.close();
            BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(receiptOfMoney));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(":");
                int sum = Integer.parseInt(split[1]);
                if (sum < 2000) {
                    FileWriter fileWriter1 = new FileWriter("src/homework44/less.txt");
                    fileWriter1.write(line + "\n");
                    fileWriter1.close();
                } else {
                    FileWriter fileWriter2 = new FileWriter("src/homework44/more.txt");
                    fileWriter2.write(line + "\n");
                    fileWriter2.close();
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
}
