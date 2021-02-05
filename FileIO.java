//package Assignment22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class FileIO {

    /*File reader*/

    int satirlen;

    public static String[] words;

    public String[] readFile(String path) {
        try {
            int i = 0;
            int length = Files.readAllLines(Paths.get(path)).size();
            String[] results = new String[length];
            for (String line : Files.readAllLines(Paths.get(path))) {
                results[i++] = line;
            }
            return results;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /*Creating Array*/

    public ArrayList<Personel> personelreader(String file) {
        ArrayList<Personel> list = new ArrayList<>();
        String[] lines = readFile(file);
        satirlen = filelength(file);
        for (String line : lines) {
            words = line.split("\t");
            Pattern pattern = Pattern.compile("\t");
            words = pattern.split(line);
            list.add(new Personel(words[0].split(" ")[0], words[1], words[2], Integer.parseInt(words[3]), Double.parseDouble("0"), words[0].split(" ")[1]));
        }
        return list;
    }

    public ArrayList<WorkingHours> workingHoursreader(String file) {
        ArrayList<WorkingHours> list = new ArrayList<>();
        String[] lines = readFile(file);
        satirlen = filelength(file);
        for (String line : lines) {
            words = line.split("\t");
            Pattern pattern = Pattern.compile("\t");
            words = pattern.split(line);
            list.add(new WorkingHours(words[0], Integer.parseInt(words[1]), Integer.parseInt(words[2]), Integer.parseInt(words[3]), Integer.parseInt(words[4])));
        }

        return list;
    }

    /*Here we find file lines*/

    public int filelength(String file) {
        String[] lines = readFile(file);
        int satirlen = lines.length;
        return satirlen;
    }
}
