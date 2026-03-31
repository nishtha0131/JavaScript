import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxDemo extends Application {

    @Override
    public void start(Stage stage) {

        CheckBox c1 = new CheckBox("Cricket");
        CheckBox c2 = new CheckBox("Hockey");
        CheckBox c3 = new CheckBox("Kabaddi");

        Label label = new Label("Selected: ");

        // One method for all
        c1.setOnAction(e -> update(label, c1, c2, c3));
        c2.setOnAction(e -> update(label, c1, c2, c3));
        c3.setOnAction(e -> update(label, c1, c2, c3));

        VBox vbox = new VBox(10, c1, c2, c3, label);

        Scene scene = new Scene(vbox, 300, 200);

        stage.setScene(scene);
        stage.setTitle("Checkbox Demo");
        stage.show();
    }

    // Simple method
    private void update(Label label, CheckBox c1, CheckBox c2, CheckBox c3) {
        String text = "Selected: ";

        if (c1.isSelected()) text += c1.getText() + " ";
        if (c2.isSelected()) text += c2.getText() + " ";
        if (c3.isSelected()) text += c3.getText() + " ";

        label.setText(text);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
