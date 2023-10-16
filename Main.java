
public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        ConsoleView view = new ConsoleView();
        NotebookPresenter presenter = new NotebookPresenter(notebook, view);
        presenter.start();
    }
}
