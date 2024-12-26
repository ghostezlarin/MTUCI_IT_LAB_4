import java.io.*;
public class FileCopy {
        public static void main(String[] args) {
            String sourceFile = "source.txt";
            String destFile = "destination.txt";

            try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
                 BufferedWriter bw = new BufferedWriter(new FileWriter(destFile))) {


                String line;
                while ((line = br.readLine()) != null) {
                    bw.write(line);
                    bw.newLine();
                }
                System.out.println("Копирование завершено.");




            } catch (FileNotFoundException e) {
                System.out.println("Ошибка: файл не найден.");
            } catch (IOException e) {
                System.out.println("Ошибка: ошибка ввода-вывода.");
            } finally {
                System.out.println("Попытка копирования завершена.");
            }
        }
}
