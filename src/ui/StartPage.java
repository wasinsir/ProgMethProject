package ui;


import data.Animal;
import data.Field;
import data.Player;
import data.Police;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;


public class StartPage extends BorderPane {

	private Button backBtn;
	private Field f = new Field();
	private Player player;
	private Police police;
	private Animal panther1;
	private Animal panther2;
	public Canvas playerCanvas,fieldCanvas;
	public GraphicsContext gc,fc;
	public Image imgPlayer = new Image(getClass().getResourceAsStream("player.jpg"),50,50, false, false);
	public Image imgPanther = new Image(getClass().getResourceAsStream("panther.jpg"),50,50, false, false);
	public Image imgPolice = new Image(getClass().getResourceAsStream("police.png"),50,50, false, false);
	public Image imgWin = new Image(getClass().getResourceAsStream("win.jpeg"),50,50, false, false);
	

	public Field getF() {
		return f;
	}

	public Player getPlayer() {
		return player;
	}

	public Police getPolice() {
		return police;
	}

	public Animal getPanther1() {
		return panther1;
	}

	public Animal getPanther2() {
		return panther2;
	}

	public StartPage() {

		//setPadding(new Insets(20));
		setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));
		
		Image imgStart = new Image(getClass().getResourceAsStream("bush.png"),50,50, false, false);
		
		

		Image imageBG = new Image(getClass().getResourceAsStream("ground.jpg"),500,500, false, false);
		BackgroundSize backgroundSize = new BackgroundSize(500, 500, true, true, true, false);
		BackgroundImage backgroundImage = new BackgroundImage(imageBG, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
		Background background = new Background(backgroundImage);
		
		
		
		Field f = new Field();
		player = new Player(f, 0, 0, 1, 0);
		police = new Police(f, 3, 5, 1, 0);
		panther1 = new Animal(f, 4, 1, 1, 0, 100);
		panther2 = new Animal(f, 9, 3, 1, 0, 50);
		
		//Top Bar
		HBox topBar = new HBox();
		backBtn = new Button("Back");
		backBtn.setPrefWidth(60);
		backBtn.setPrefHeight(50);
		backBtn.setAlignment(Pos.CENTER);
		
		//this.tLife = this.getPlayer().getLife();
		
		
		
		topBar.getChildren().addAll(backBtn);
		topBar.setAlignment(Pos.CENTER_LEFT);
		
		setTop(topBar);
		
		//Center Bar
		GridPane gridPane = new GridPane();
		gridPane.setPrefSize(500, 500);
		gridPane.setBackground(background);
		int i,j;
		fieldCanvas = new Canvas(500,500);
		fc = fieldCanvas.getGraphicsContext2D();
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				if(f.getTerrainAt(i, j) == -1) {
					fc.drawImage(imgStart, i*50, j*50);
				}
			}
		}
		playerCanvas = new Canvas(500,500);
		gc = playerCanvas.getGraphicsContext2D();
		gridPane.getChildren().addAll(fieldCanvas,playerCanvas);
		
		setCenter(gridPane);
		

	}

	public Button getBackBtn() {
		return backBtn;
	}


}
