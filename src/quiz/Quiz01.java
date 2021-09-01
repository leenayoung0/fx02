package quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Quiz01 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hbox = new HBox();
		BorderPane bp = new BorderPane();
		Label labelHome = new Label();
		labelHome.setText("홈");
		Label labelSocie = new Label("사회");
		Label labelEcono = new Label("경제");
		Label labelGlob = new Label("국제");
		Label labelCult = new Label("문화");
		
		Label labelCateg = new Label("카테고리");
		Label labelPc = new Label("노트북/pc");
		Label labelCar = new Label("자동차용품");
		Label labelMobi = new Label("휴대폰");
		Label labelCamp = new Label("캠핑/낚시");
		
		FlowPane topPane = new FlowPane();
		topPane.getChildren().addAll(labelHome,labelSocie,labelEcono,labelGlob,labelCult);
		topPane.setAlignment(Pos.CENTER_RIGHT);
		topPane.setHgap(20);
		topPane.setPadding(new Insets(10,30,0,0));
		topPane.setPrefSize(500, 50);
		bp.setTop(topPane);
		
		FlowPane leftPane = new FlowPane(Orientation.VERTICAL);
		leftPane.getChildren().addAll(labelCateg, labelPc, labelCar, labelMobi, labelCamp);
		leftPane.setAlignment(Pos.CENTER_LEFT);
		leftPane.setPadding(new Insets(20))
		bp.setLeft(leftPane);
		
		hbox.getChildren().addAll(bp);
		hbox.setPrefSize(500, 200);
		
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
