package radio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox(10);
		RadioButton rd1 = new RadioButton("rd1");
		RadioButton rd2 = new RadioButton("rd2");
		
		hbox.getChildren().addAll(rd1, rd2);
		hbox.setPrefSize(300, 200);
		
		//여러개중 하나만 선택할 수 있도록 그룹 만들기
		ToggleGroup tg = new ToggleGroup();
		rd1.setToggleGroup(tg);
		rd2.setToggleGroup(tg);
		
		rd1.setText("10대");
		rd1.setSelected(true);
		
		hbox.setPadding(new Insets(20)); //hbox기준으로 안쪽으로 여백을 줘라~
		//hbox.setStyle("-fx-background-color:red");
		
		HBox.setMargin(rd2, new Insets(50,20,20,50)); // rd2(객체)기준으로 바깥으로 여백을 줘라~
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
