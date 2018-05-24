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
import javafx.scene.text.TextAlignment;

public class CreditPage extends StackPane {

	private Button backBtn;
	private Pane p;

	public CreditPage() {

		Image imgBG = new Image(getClass().getResourceAsStream("creditBG.jpg"), 500, 600, false, false);
		p = new Pane(new ImageView(imgBG));
		p.setPrefSize(500, 600);
		getChildren().add(p);
		BorderPane a = new BorderPane();
		a.setPadding(new Insets(20));

		// Top Bar
		VBox topBar = new VBox();
		Text title = new Text("Credit");
		title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
		title.setFill(Color.WHITE);
		topBar.getChildren().addAll(title);
		topBar.setAlignment(Pos.CENTER);
		a.setTop(topBar);

		// Center Bar
		VBox centerBar = new VBox();
		Text content = new Text(
				"This project is created by : Wasin Sirichai-ekawat \n\n A part of 2110205 Programing Methodology");
		content.setTextAlignment(TextAlignment.CENTER);
		content.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		content.setFill(Color.WHITE);
		centerBar.getChildren().addAll(content);
		centerBar.setAlignment(Pos.CENTER);
		a.setCenter(centerBar);

		// Buttom Bar
		VBox buttomBar = new VBox();
		backBtn = new Button("Back");
		backBtn.setPrefWidth(400);
		backBtn.setPrefHeight(60);
		backBtn.setAlignment(Pos.CENTER);
		buttomBar.getChildren().addAll(backBtn);
		buttomBar.setAlignment(Pos.CENTER);
		a.setBottom(buttomBar);

		getChildren().add(a);

	}

	public Button getBackBtn() {
		return backBtn;
	}

}
