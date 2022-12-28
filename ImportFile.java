import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ImportFile<T extends JournalEntry> {

    public void importFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
