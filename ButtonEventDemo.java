import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ButtonEventDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub

        Button b1 = new Button("Click me");
        Label label = new Label();

        
         b1.setOnAction(e -> {
        label.setText("Clicked");
        b1.setDisable(true);
        });
        GridPane gridPane = new GridPane();
        gridPane.add(b1, 0, 0);
        gridPane.add(label, 0, 1);

        Scene scene = new Scene(gridPane, 400, 400);

        stage.setTitle("Disable Button Demo");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
        
    
    

