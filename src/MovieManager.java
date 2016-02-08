import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;

public class MovieManager {

    static final String FILENAME = "result.xml";

    public static void main(String[] args) {
        Person actor = new Person("Leonardo", "Di Caprio", Gender.MALE, false, true);
        Person actress = new Person("Kate", "Winslet", Gender.FEMALE, true, true);
        Movie movie = new Movie("Titanic", Genre.ROMANTIC, 200, 4.8);
        movie.getCast().add(actress);
        movie.getCast().add(actor);
        toXMLFile(movie.toXMLString()); }

    public static void toXMLFile(String xmlString) {
        try {
            File file = new File(FILENAME);
            FileWriter filewriter = new FileWriter(file);
            BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
            bufferedwriter.write(xmlString);
            bufferedwriter.close(); }
        catch (IOException e) {e.printStackTrace();} }
}