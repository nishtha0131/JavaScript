import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
        
       

        CheckBox Box1 = new CheckBox("Cricket");
        CheckBox Box2 = new CheckBox("Hokey");
        CheckBox Box3 = new CheckBox("kabbadi");
        CheckBox Box4 = new CheckBox("Baseball");

    

        VBox box = new VBox();
        box.getChildren().addAll(Box1, Box2, Box3, Box4);

        Scene scene = new Scene(box, 400, 400);

        stage.setTitle("Checkbox demo");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
