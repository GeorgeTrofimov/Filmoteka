class FilmCreator {
    int count = 1;

    public Studio getFilmProducer(String name) {
        Studio fp = new Studio();
        fp.id = count++;
        fp.titleName = name;
        return fp;
    }
}