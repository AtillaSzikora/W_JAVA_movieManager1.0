import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private Genre genre;
    private long duration;
    private double rate;
    private List<Person> cast;

    public Movie(String title, Genre genre, long duration, double rate) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.rate = rate;
        this.cast = new ArrayList<>(); }

    public String getTitle() {return title;}
    public Genre getGenre() {return genre;}
    public long getDuration() {return duration;}
    public double getRate() {return rate;}
    public List<Person> getCast() {return cast;}

    public void setTitle(String title) {this.title = title;}
    public void setGenre(Genre genre) {this.genre = genre;}
    public void setDuration(long duration) {this.duration = duration;}
    public void setRate(double rate) {this.rate = rate;}
    public void setCast(List<Person> cast) {this.cast = cast;}

    public String toXMLString() {
        String result = "<movie>"
                      + "<title>" + this.title + "</title>"
                      + "<genre>" + this.genre + "</genre>"
                      + "<duration>" + this.duration + "</duration>"
                      + "<rate>" + this.rate + "</rate>"
                      + "<cast>";
        for(Person i:cast) {result += i.toXMLString();}
        result += "</cast>"
                + "</movie>";
        return  result; }
}