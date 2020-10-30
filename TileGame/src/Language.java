import java.io.*;
import java.io.BufferedReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class Language {

    public static HashMap<String, String> languageInit(String language) throws IOException {
        Path path;
        switch (language.toLowerCase()) {
            case "danish":
                path = Paths.get("Danish.txt");
            break;
            default: path = Paths.get("English.txt");
        }
        BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(path.toAbsolutePath())));

        HashMap<String, String> langList = new HashMap<>();

        for (int i = 0; i < 2; i++) {
            langList.put(reader.readLine(), reader.readLine()); // langList.put(keyWord, Data)

        }
        return langList;
    }

    public static String[] tileDescriptions(HashMap<String, String> stringList){
        String[] descriptions = new String[13];
        for (int i = 1 ; i < 13; i++) {
            descriptions[i] = stringList.get("description"+i);
        }
        return descriptions;
    }

}
