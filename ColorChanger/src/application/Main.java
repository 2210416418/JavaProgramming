package application;
	
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Rectangle rect = new Rectangle(550,100, Color.WHITE);
        rect.setStroke(Color.BLACK);

        Label rCode = new Label("R: 0 ");
        Label gCode = new Label("G: 0 ");
        Label bCode = new Label("B: 0 ");

        Slider slider = new Slider(0,255,0);
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        slider.setPrefWidth(400);
        slider.setMajorTickUnit(10);
        slider.setBlockIncrement(10);
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                int r;
                int g;
                int b;
                r = ((int)slider.getValue());
                g = ((int)slider.getValue());
                b = ((int)slider.getValue());

                rect.setFill(Color.rgb(r,g,b));
                rCode.setText("R: " + Integer.toString(r));
                gCode.setText("G: " + Integer.toString(g));
                bCode.setText("B: " + Integer.toString(b));
            }
        });


        FlowPane root = new FlowPane(rect, slider,rCode, gCode, bCode);
        root.setAlignment(Pos.CENTER);
        root.getChildren();
        root.setVgap(30);
        root.setHgap(30);



        Scene scene = new Scene(root,700,300);


        primaryStage.setTitle("Color Changer");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
