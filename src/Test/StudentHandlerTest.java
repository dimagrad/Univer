import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;
import java.util.regex.Pattern;

public class StudentHandlerTest {

    @Test
    public void validation() throws IOException {
        String[] a;
        Pattern p = Pattern.compile("'");
        File file = new File("src/resources/Test_Student_add.txt");
        List<String> lines = Files.readAllLines(file.toPath(), Charset.forName("cp1251"));

        for (String string: lines) {

            a = p.split(string);
            try {
                if ((a[0].contains("Студент: Имя - ")) & (a[2].contains("Возраст: ")) & (a[4].contains("Номер телефона: "))) {

                    System.out.println(true);

                } else {

                    System.out.println(false);

                }
            }
            catch(ArrayIndexOutOfBoundsException r){

                System.out.println("Неверный формат данных");
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("Неверный формат данных");
            }
        }
    }
}