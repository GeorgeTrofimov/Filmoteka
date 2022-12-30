import java.util.ArrayList;

public class DataBase {
    public ArrayList<Cinema> films = new ArrayList<>();
    public ArrayList<Studio> studios = new ArrayList<>();
    public ArrayList<Genre> genres = new ArrayList<>();
    public void addStudios(Studio producer) {
        studios.add(producer);
    }
}