import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RadioButtonDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub

        Image image = new Image("File:D:/javafx_programs/javafx_project/src/Lion.jpg");
        Image image1 = new Image("File:D:/javafx_programs/javafx_project/src/Dog.jpg");
        Image image2 = new Image("File:D:/javafx_programs/javafx_project/src/Tiger.jpg");
        Image image3 = new Image("File:D:/javafx_programs/javafx_project/src/Cow.jpg");

        ImageView imageView = new ImageView();
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);

        GridPane gridPane = new GridPane();

        ToggleGroup group = new ToggleGroup();
        RadioButton box1 = new RadioButton("Lion");
        RadioButton box2 = new RadioButton("Dog");
        RadioButton box3 = new RadioButton("Tiger");
        RadioButton box4 = new RadioButton("Cow");

        box1.setToggleGroup(group);
        box2.setToggleGroup(group);
        box3.setToggleGroup(group);
        box4.setToggleGroup(group);

        gridPane.add(imageView,0,0);
        gridPane.add(box1,0,1);
        gridPane.add(box2,1,1);
        gridPane.add(box3,0,2);
        gridPane.add(box4,1,2);

        box1.setOnAction(e->{
            imageView.setImage(image);
        });

         box2.setOnAction(e->{
            imageView.setImage(image1);
        });

         box3.setOnAction(e->{
            imageView.setImage(image2);
        });

         box4.setOnAction(e->{
            imageView.setImage(image3);
        });

        Scene scene =  new Scene (gridPane, 400, 400);
        stage.setTitle("Radio Button With Image Example");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
