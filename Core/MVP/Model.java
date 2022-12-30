public class Model {
    DataBase db;
    public Model(DataBase db) {
        this.db = db;
    }

    public int getNumberOfFilms() {
        return db.films.size();
    }
}