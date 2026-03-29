import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ImageDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub

        
        Image img1 = new Image("file:D:/javafx_programs/javafx_project/src/lion.jpg");
        Image img2 = new Image("file:D:/javafx_programs/javafx_project/src/tiger.jpg");
        Image img3 = new Image("file:D:/javafx_programs/javafx_project/src/dog.jpg");

       
        ImageView iv1 = new ImageView(img1);
        ImageView iv2 = new ImageView(img2);
        ImageView iv3 = new ImageView(img3);

    
        iv1.setFitWidth(100);
        iv1.setFitHeight(100);

        iv2.setFitWidth(100);
        iv2.setFitHeight(100);

        iv3.setFitWidth(100);
        iv3.setFitHeight(100);

    
        GridPane gridPane = new GridPane();

        
        gridPane.add(iv1, 0, 0); 
        gridPane.add(iv2, 1, 1);
        gridPane.add(iv3, 2, 2);


        Scene scene = new Scene(gridPane, 400, 400);

        stage.setTitle(" simple display Images Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

        
    }
    

