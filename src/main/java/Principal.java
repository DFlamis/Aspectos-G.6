import javafx.application.Application;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class Principal extends Application {

    @Override
    public void start(Stage principal)
    {
        Directory.st.setTitle("Observers");
        Directory.st.setScene(Directory.sc);
        Directory.st.show();
    }

    public static void main(String[] args) {
        launch();
    }

}