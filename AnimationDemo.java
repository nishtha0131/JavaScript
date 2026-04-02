import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationDemo extends Application {
     @Override
     public void start(Stage arg0) throws Exception {
         // TODO Auto-generated method stub

         Image image = new Image ("File:D:/javafx_programs/javafx_project/src/lion.jpg");
         ImageView imageView = new ImageView(image);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);

        Button TranslateButton = new Button("Translate");

        GridPane pane = new GridPane();
        pane. add(imageView, 0 ,0);
        pane.add(TranslateButton, 0, 1);

        TranslateTransition transition = new TranslateTransition();
        transition.setNode(imageView);
        transition.setByX(100);
        transition.setByZ(100);
        transition.setAutoReverse(true);
        transition.setCycleCount(2);
        transition.setDuration(Duration.seconds(2));

        TranslateButton.setOnAction(e->{
            transition.play();
        }); 

        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setNode(imageView);
        rotateTransition.setByAngle(160);
        rotateTransition.setAutoReverse(true);
        rotateTransition.setCycleCount(2);
        rotateTransition.setDuration(Duration.seconds(10));

        Button rotateButton = new Button("Rotate");
        pane.add(rotateButton,0, 2);
        rotateButton.setOnAction(e->{
            rotateTransition.play();
        });

        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.setToX(2);
        scaleTransition.setToY(50);
        scaleTransition.setNode(imageView);
        rotateTransition.setAutoReverse(true);
        rotateTransition.setCycleCount(2);
        rotateTransition.setDuration(Duration.seconds(10));

        Button scaleButton = new Button("Scale");
        pane.add(scaleButton,2, 2);
        scaleButton.setOnAction(e->{
            scaleTransition.play();
        });

        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setNode(imageView);
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.0);
        fadeTransition.setAutoReverse(true);
        fadeTransition.setCycleCount(2);
        rotateTransition.setDuration(Duration.seconds(5));

        Button fadButton = new Button("Fade");
        pane.add(fadButton,0, 3);
        fadButton.setOnAction(e->{
            fadeTransition.play();
        });

        ParallelTransition parallelTransition = new ParallelTransition(transition,rotateTransition);
        parallelTransition.setNode(imageView);
        Button ParallelTransition = new Button("parallel");
        pane.add(ParallelTransition,1,2);

        Button paralleButton = new Button("Parallel");
        pane.add(paralleButton,0, 4);
        paralleButton.setOnAction(e->{
            parallelTransition.play();
        });

        SequentialTransition sequential = new SequentialTransition(
            transition,
            rotateTransition,
            scaleTransition,
            fadeTransition
        );

        Button sequentialButton = new Button("Sequential");
        pane.add(sequentialButton, 0, 5);
        sequentialButton.setOnAction(e -> sequential.play());

        

        Scene scene = new Scene(pane, 300, 300);    
        arg0.setScene(scene);
        arg0.setTitle("Animation Demo");
        arg0.show();
     }
     
    public static void main(String[] args) {
        launch(args);
    }
}
