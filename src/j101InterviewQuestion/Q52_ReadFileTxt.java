import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q52_ReadFileTxt {
       /*
    1)Create a text file inside this package
    2)Type the following text inside the text file
       Java is easy to learn.
       Learn Java, earn money?
       Java is easy if you study well.
       To learn Java, type codes.
    3)Type code to print every word is used how many times in the text.
   */

    public static void main(String[] args) throws IOException {
        Path dosya=Path.of("src/j101InterviewQuestion/Q52_FileText");
        Stream<String>dosyaYolu=Files.lines(dosya);
        dosyaYolu.forEach(System.out::println);
        System.out.println("Files.lines(dosya).map(t -> t.replaceAll(\"[.!,:)\\\\-]\", \"\").split(\" \"))\n                .flatMap(Arrays::stream)\n                .distinct()\n                .count() = " + Files.lines(dosya).map(t -> t.replaceAll("[.!,:)\\-]", "").split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .count());

    }
}
