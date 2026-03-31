import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ArithmeticDemo extends Application {

    @Override
    public void start(Stage stage) {

        TextField t1 = new TextField();
        TextField t2 = new TextField();

        // Buttons
        Button add = new Button("Add");
        Button sub = new Button("Subtract");
        Button mul = new Button("Multiply");
        Button div = new Button("Divide");

        // Labels near buttons
        Label l1 = new Label();
        Label l2 = new Label();
        Label l3 = new Label();
        Label l4 = new Label();

        // Add
        add.setOnAction(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            l1.setText(" = " + (a + b));
        });

        // Subtract
        sub.setOnAction(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            l2.setText(" = " + (a - b));
        });

        // Multiply
        mul.setOnAction(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            l3.setText(" = " + (a * b));
        });

        // Divide
        div.setOnAction(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            l4.setText(" = " + (a / b));
        });

        // Layout (button + result side by side)
        HBox h1 = new HBox(10, add, l1);
        HBox h2 = new HBox(10, sub, l2);
        HBox h3 = new HBox(10, mul, l3);
        HBox h4 = new HBox(10, div, l4);

        VBox box = new VBox(10, t1, t2, h1, h2, h3, h4);

        Scene scene = new Scene(box, 350, 300);
        stage.setScene(scene);
        stage.setTitle("Arithmetic");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
