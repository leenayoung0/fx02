package lambda;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex04 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		AnchorPane anch = new AnchorPane();
		Label lbl = new Label("Value");
		
		lbl.setFont(new Font(32));
		lbl.setRotate(48);
		lbl.setTranslateX(100);
		lbl.setTranslateY(70);
		
		//람다식 없을때
		EventHandler<MouseEvent> entered = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				lbl.setScaleX(1.5); //1.5배 키워줌
				lbl.setScaleY(1.5); //1.5배
			}		
		};
		
		lbl.setOnMouseEntered(entered);//마우스가 들어왔을때
		
		lbl.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				lbl.setScaleX(1.5); //1.5배 키워줌
				lbl.setScaleY(1.5); //1.5배
			}	
		});//마우스가 빠져나왔을때
		
		lbl.setOnMousePressed(e->{ // 람다식 : 이게 위에보다 훨씬더 간편함
			lbl.setRotate(0);
		});
		
		anch.getChildren().add(lbl);
		anch.setPrefSize(300, 200);
		
//		Scene s = new Scene(anch);
//		arg0.setScene(s);
		arg0.setScene(new Scene(anch));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
