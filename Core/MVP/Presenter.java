public class Presenter {
    private Model model;
    private View view;

    public Presenter(View view, DataBase db) {
        this.view = view;
        model = new Model(db);
    }

    public void ListFilm() {
        view.getListFilms(model.getNumberOfFilms());
    }

    public void ListFilmThriller() {
        view.getListFilmsThriller(model.getNumberOfFilms());
    }

    public void ListFilmActionmovie() {
        view.getListFilmsActionmovie(model.getNumberOfFilms());
    }