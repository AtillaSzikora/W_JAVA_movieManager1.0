import java.util.List;
import java.util.HashMap;

public class Tools {
    public static String toXMLTag(String myTag, String myValue) {
        return "<" + myTag + ">" + myValue + "</" + myTag + ">"; }

    /*
    Tools class should contain a method (countMoviesPerPerson) which gets a List of Movies
    and returns with a java.util.HashMap where the keys are the Persons in the Movies
    and the values mean the quantity how many movies they are starred in.

    public static HashMap<Person, Integer> countMoviesPerPerson(List<Movie> moviesList) {
        return HashMap<Person, Integer>; }
    */

    public static String[] getMovieTitles(List<Movie> moviesList) {
        return moviesList.toArray(new String[moviesList.size()]); }
}