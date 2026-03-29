import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SliderExample extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        Slider slider = new Slider();
        slider.setMin(0);       // Minimum value
        slider.setMax(100);     // Maximum value
        slider.setValue(50);    // Initial value
        
        Label label = new Label("Slider Value: " + slider.getValue());

       
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            label.setText("Slider Value: " + String.format("%.2f", newValue));
        });

        
        VBox root = new VBox(10);
        root.getChildren().addAll(slider, label);

    
        Scene scene = new Scene(root, 300, 150);
        stage.setTitle("JavaFX Slider Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
