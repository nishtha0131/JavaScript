import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComBoxExample extends Application {

    @Override
    public void start(Stage stage) {

        Label semLabel = new Label("Select Semester:");
        ComboBox<String> semBox = new ComboBox<>();

        Label subLabel = new Label("Subjects:");
        ListView<String> subjectList = new ListView<>();

        Label result = new Label();

        semBox.getItems().addAll("Sem 1", "Sem 2", "Sem 3", "Sem 4", "Sem 5", "Sem 6");

        semBox.setOnAction(e -> {
            String sem = semBox.getValue();
            subjectList.getItems().clear();

            switch (sem) {
                case "Sem 1":
                    subjectList.getItems().addAll("Critical Thinking ", "Mathematics", " Programming in C", "Networking", "Computre Fundametal");
                    break;
                case "Sem 2":
                    subjectList.getItems().addAll("Data Structure", "Web Programming", "SAD", "Modern Indian Language", "Computer Organization", "Environmental Science");
                    break;
                case "Sem 3":
                    subjectList.getItems().addAll("C++", "Oracle", "Wordpress", "Open Source Tools", "Network", "CVFD");
                    break;
                case "Sem 4":
                    subjectList.getItems().addAll("java", "Operating System", "SEO", "IOT", "C#", "Digital Empowerment");
                    break;
                case "Sem 5":
                    subjectList.getItems().addAll("Advance Java Programming", "Programming with ASP.NET", "Web Searching Technology & Search Engine Optimization ", "Project/Viva / Research Work");
                    break;
                case "Sem 6":
                    subjectList.getItems().addAll("Mobile Application Development ", "Python", "Cloud Computing / Internship","Additional Advanced Programming");
                    break;
            }
        });
    
        subjectList.setOnMouseClicked(e -> {
            String subject = subjectList.getSelectionModel().getSelectedItem();
            result.setText("Selected: " + semBox.getValue() + " - " + subject);
        });

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(semLabel, semBox, subLabel, subjectList, result);

        Scene scene = new Scene(vbox, 300, 300);

        stage.setTitle("Semester Subjects Display");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
