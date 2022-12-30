public class ConsoleView implements View {
    @Override
    public void getAllInfoBy(int id) {
        Cinema c = Config.db.films.get(id - 1);
        System.out.printf("№ %d, " +
                        "Название фильма: %s, " +
                        "Жанр: %s, " +
                        "Студия: %s\n",
                c.id,
                c.name,
                Config.db.genres.get(c.genreId - 1).name,
                Config.db.studios.get(c.creatorId - 1).titleName);
    }

    @Override
    public void getListFilms(int number) {
        for (int i = 1; i <= number ; i++) {
            getAllInfoBy(i);
        }
    }

    @Override
    public void getListFilmsThriller(int numberOfFilms) {
        for (int i = 1; i <= numberOfFilms ; i++) {
            Cinema c = Config.db.films.get(i - 1);
            if (Config.db.genres.get(c.genreId-1).id==3){
                getAllInfoBy(i);
            }
        }
    }

    @Override
    public void getListFilmsActionmovie(int numberOfFilms) {
        for (int i = 1; i <= numberOfFilms ; i++) {
            Cinema c = Config.db.films.get(i - 1);
            if (Config.db.genres.get(c.genreId-1).id==1){
                getAllInfoBy(i);
            }
        }
    }