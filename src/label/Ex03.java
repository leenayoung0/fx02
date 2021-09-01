package label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex03 extends Application{
	static int i =0;
	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		
		Label lbl = new Label("A label that needs to be wrapped");
		
//		FlowPane fp = new FlowPane();
//		fp.getChildren().add(lbl);
//		fp.setPrefSize(100, 100);
//		
		hbox.getChildren().add(lbl);
		hbox.setPrefSize(100, 100);
		
		lbl.setWrapText(true);
		lbl.setFont(new Font(20));
		lbl.setRotate(48);
		lbl.setTranslateY(50); //내려주는거
		
		lbl.setOnMouseClicked(e->{
			if(i==0) {
				
				i=1;
			}else {
				lbl.setRotate(45);
				lbl.setTranslateY(50);
				i=0;
			}	
		});
		
		lbl.setOnMouseClicked(e->{  // 클릭을 하면 어떻게 되게 해라~
			lbl.setRotate(0);
			lbl.setTranslateY(0);
		});
		
		
		arg0.setScene(new Scene(hbox));
		
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
