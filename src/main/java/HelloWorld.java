import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Jip on 9-5-2017.
 */
public class HelloWorld extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/FXML/graphControl.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 1365, 768);

        stage.setTitle("Hello, yFiles for JavaFX");
        stage.setScene(scene);
        stage.show();
    }
}
