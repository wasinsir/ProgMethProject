package ui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class MainPage extends StackPane {

	private Button startBtn;
	private Button exitBtn;
	private Button creditBtn;
	private Pane p;

	public MainPage() {

		Image imgBG = new Image(getClass().getResourceAsStream("bg.jpg"), 500, 600, false, false);
		p = new Pane(new ImageView(imgBG));
		p.setPrefSize(500, 600);
		getChildren().add(p);
		BorderPane a = new BorderPane();
		a.setPadding(new Insets(20));

		// Top Bar
		VBox topBar = new VBox();
		Text gameTitle = new Text("Black Panther");
		gameTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
		Text gameSubTitle = new Text("The Hunting Game");
		gameSubTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 25));
		gameSubTitle.setFill(Color.RED);

		topBar.getChildren().addAll(gameTitle, gameSubTitle);
		topBar.setAlignment(Pos.BOTTOM_CENTER);

		a.setTop(topBar);

		// Center Bar
		VBox centerBar = new VBox();

		startBtn = new Button("Start");
		startBtn.setPrefWidth(400);
		startBtn.setPrefHeight(60);
		startBtn.setAlignment(Pos.CENTER);

		centerBar.getChildren().addAll(startBtn);

		centerBar.setAlignment(Pos.CENTER);
		a.setCenter(centerBar);

		// Bottom Bar
		VBox bottomBar = new VBox(20);

		creditBtn = new Button("Credit");
		creditBtn.setPrefWidth(400);
		creditBtn.setPrefHeight(60);
		creditBtn.setAlignment(Pos.CENTER);

		exitBtn = new Button("Exit");
		exitBtn.setPrefWidth(400);
		exitBtn.setPrefHeight(60);
		exitBtn.setAlignment(Pos.CENTER);
		bottomBar.setAlignment(Pos.CENTER);
		bottomBar.getChildren().addAll(creditBtn, exitBtn);
		a.setBottom(bottomBar);

		getChildren().addAll(a);

	}

	public Button getStartBtn() {
		return startBtn;
	}

	public Button getExitBtn() {
		return exitBtn;
	}

	public Button getCreditBtn() {
		return creditBtn;
	}

}
