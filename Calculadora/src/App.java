import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.geometry.Pos; 
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        Rectangle outerRectangle = new Rectangle(1000, 500);
        outerRectangle.setFill(Color.BLACK);

        Rectangle innerRectangle = new Rectangle(950, 450);
        innerRectangle.setFill(Color.web("#191C24"));

        Label welcomeLabel = new Label("Developed by TeamFX\n Felix\nLuz\nCristian\nMaria la Furra\nKatherine");
        welcomeLabel.setTextFill(Color.WHITE);
        welcomeLabel.setFont(new Font(20));

        TextField textField = new TextField();
        textField.setMaxWidth(200);

        // Crear un teclado numérico
        Button[] numButtons = new Button[10];
        for (int i = 0; i < 10; i++) {
            final int index = i; // Necesario para el manejo de eventos
            numButtons[i] = new Button(String.valueOf(i));
            numButtons[i].setOnAction(e -> textField.setText(textField.getText() + index));
        }

        // Crear botones de operación
        Button addButton = new Button("+");
        addButton.setOnAction(e -> textField.setText(textField.getText() + " + "));
        
        Button subtractButton = new Button("-");
        subtractButton.setOnAction(e -> textField.setText(textField.getText() + " - "));
        
        Button multiplyButton = new Button("*");
        multiplyButton.setOnAction(e -> textField.setText(textField.getText() + " * "));
        
        Button divideButton = new Button("/");
        divideButton.setOnAction(e -> textField.setText(textField.getText() + " / "));
        
        Button enterButton = new Button("ENTER");
        enterButton.setOnAction(e -> {
        });        
        
        Button decimalButton = new Button(".");
        decimalButton.setOnAction(e -> textField.setText(textField.getText() + "."));

        Button backspaceButton = new Button("Borrar");
        backspaceButton.setOnAction(e -> {
        String text = textField.getText();
        if (text.length() > 0) {
        textField.setText(text.substring(0, text.length() - 1));
        }
    });



        // Organizar los botones en un GridPane
        GridPane gridPane = new GridPane();
        
        gridPane.add(divideButton, 1, 0);
        gridPane.add(multiplyButton, 2, 0);
        gridPane.add(subtractButton, 3, 0);
        gridPane.add(backspaceButton, 3, 1);

        for (int i = 1; i <= 9; i++) {
            gridPane.add(numButtons[i], (i-1) % 3, (i-1) / 3 + 1);
        }
        
        gridPane.add(numButtons[0], 0, 4);
        
        gridPane.add(addButton, 3, 2);
        
        gridPane.add(decimalButton, 2, 4);
        
        gridPane.add(enterButton, 3, 3);

       VBox vBox = new VBox(10, textField, gridPane); // Organiza el TextField y el teclado numérico verticalmente
       vBox.setAlignment(Pos.CENTER);

       FadeTransition ft = new FadeTransition(Duration.millis(3000), welcomeLabel);
       ft.setFromValue(1.0);
       ft.setToValue(0.0);
       
       ft.setOnFinished(event -> {
           outerRectangle.setFill(Color.BLACK);
           welcomeLabel.setTextFill(Color.web("#191C24"));
           vBox.setVisible(true);
           
           vBox.setSpacing(10); // Añade espacio entre el TextField y el GridPane
           VBox.setMargin(gridPane, new Insets(10)); // Centra el GridPane en el VBox
           gridPane.setAlignment(Pos.CENTER); // Centra los botones en el GridPane
           gridPane.setHgap(10); // Añade espacio horizontal entre los botones
           gridPane.setVgap(10); // Añade espacio vertical entre los botones
           gridPane.setPadding(new Insets(10)); // Añade espacio alrededor del GridPane
      });
      
      ft.play();

      vBox.setVisible(false);

      StackPane root = new StackPane();
      root.getChildren().addAll(outerRectangle, innerRectangle, welcomeLabel, vBox);

      Scene scene = new Scene(root, 1000, 500);

      primaryStage.setTitle("Java Calculadora");
      primaryStage.setScene(scene);
      primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}