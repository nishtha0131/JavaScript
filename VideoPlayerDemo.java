import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class VideoPlayerDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Absolute path to your video file
        String videoPath = "D:/javafx_programs/javafx_project/bin/Nature.mp4";
        
        // Convert file path to URI string (this works on all OS)
        Media media = new Media(new File(videoPath).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);


        // Play and Pause buttons
        Button playButton = new Button("Play");
        playButton.setOnAction(e -> mediaPlayer.play());

        Button pauseButton = new Button("Pause");
        pauseButton.setOnAction(e -> mediaPlayer.pause());

        // Layout
        HBox controls = new HBox(10, playButton, pauseButton);
        VBox root = new VBox(10, mediaView, controls);

        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("JavaFX Video Player");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
