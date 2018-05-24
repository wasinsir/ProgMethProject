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


public class WinPage extends StackPane {
	
	private Button backBtn;
	private Pane p;
	


	public WinPage() {
		
		Image imgBG = new Image(getClass().getResourceAsStream("winBG.jpg"),500,600, false, false);
		p= new Pane (new ImageView(imgBG));
		p.setPrefSize(500, 600);
		getChildren().add(p);
		BorderPane a = new BorderPane();
		a.setPadding(new Insets(20));
		
		//Top Bar 
		VBox topBar = new VBox();
		Text title = new Text("Congraturation");
		title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
		title.setFill(Color.RED);
		topBar.getChildren().addAll(title);
		topBar.setAlignment(Pos.CENTER);
		a.setTop(topBar);
		
		//Center Bar
		VBox centerBar = new VBox();
		Text content = new Text("You're the Winner of this Game \n Your Score is "+main.Main.startPage.getPlayer().getMoney()+" Your Life is "+main.Main.startPage.getPlayer().getLife());
		//Text life = new Text("   Life : " + this.getPlayer().getLife()+"   Money : " );
		//life.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
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
