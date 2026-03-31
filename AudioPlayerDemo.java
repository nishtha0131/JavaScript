import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class AudioPlayerDemo extends Application {

    private MediaPlayer mediaPlayer;
    private Label statusLabel;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple Audio Player");

        Button playButton = new Button("Play");
        Button pauseButton = new Button("Pause");

        statusLabel = new Label("No file loaded");

        // Open file chooser immediately
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Audio Files", "*.mp3", "*.wav")
        );
        File file = fileChooser.showOpenDialog(primaryStage);
        if (file != null) {
            Media media = new Media(file.toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            statusLabel.setText("Loaded: " + file.getName());
        } else {
            statusLabel.setText("No file selected");
        }

        // Play button
        playButton.setOnAction(e -> {
            if (mediaPlayer != null) {
                mediaPlayer.play();
                statusLabel.setText("Playing: " + mediaPlayer.getMedia().getSource()
                        .substring(mediaPlayer.getMedia().getSource().lastIndexOf("/") + 1));
            }
        });

        // Pause button
        pauseButton.setOnAction(e -> {
            if (mediaPlayer != null) {
                mediaPlayer.pause();
                statusLabel.setText("Paused: " + mediaPlayer.getMedia().getSource()
                        .substring(mediaPlayer.getMedia().getSource().lastIndexOf("/") + 1));
            }
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(playButton, pauseButton, statusLabel);

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
