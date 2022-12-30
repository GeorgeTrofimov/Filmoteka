import java.util.Scanner;

public class App {
    public static void ButtonClick() {
        System.out.print("\033[H\033[J");
        Config.init();
        View view = new ConsoleView();
        Presenter presenter = new Presenter(view, Config.db);

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println(" 1 - Список всех фильмов  \n" +
                        " 2 - Список триллеров  \n" +
                        " 3 - Список боевиков");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        presenter.ListFilm();
                        break;
                    case "2":
                        presenter.ListFilmThriller();
                        break;
                    case "3":
                        presenter.ListFilmActionmovie();
                        break;

                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }

    }
}