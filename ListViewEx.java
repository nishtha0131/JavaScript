import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewEx extends Application {

    @Override
    public void start(Stage stage) {
        // Create ListView and add items
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Apple", "Banana", "Cherry", "Mango", "Orange");

        // Label to display selected item
        Label selectedLabel = new Label("Selected item: ");

        // Listener to update label when selection changes
        listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                selectedLabel.setText("Selected item: " + newValue);
            }
        });

        // Layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(listView, selectedLabel);

        // Scene
        Scene scene = new Scene(layout, 300, 200);

        stage.setTitle("ListView Demo");
        stage.setScene(scene);  // Use instance 'stage', not 'Stage'
        stage.show();           // Use instance 'stage', not 'Stage'
    }

    public static void main(String[] args) {
        launch(args);
    }
}
