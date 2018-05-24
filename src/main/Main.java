package main;

import java.io.File;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import ui.CreditPage;
import ui.MainPage;
import ui.StartPage;
import ui.WinPage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Main extends Application {

	private Scene mainScene;
	public static Scene startScene;
	private Scene creditScene;
	private Scene winScene;
	public static StartPage startPage;

	@Override
	public void start(Stage primaryStage) {

		MainPage mainPage = new MainPage();
		mainScene = new Scene(mainPage, 500, 550);
		Button startBtn = mainPage.getStartBtn();
		Button creditBtn = mainPage.getCreditBtn();
		Button exitBtn = mainPage.getExitBtn();

		String songDir = "song.mp3";
		Media music = new Media(new File(songDir).toURI().toString());
		MediaPlayer mPlayer = new MediaPlayer(music);
		mPlayer.setAutoPlay(true);
		mPlayer.play();  

		
		startBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				startPage = new StartPage();
				startScene = new Scene(startPage, 500, 550);
				primaryStage.setScene(startScene);

				Button backBtn = startPage.getBackBtn();
				backBtn.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent arg0) {
						primaryStage.setScene(mainScene);
					}
				});

				startPage.gc.drawImage(startPage.imgPlayer, startPage.getPlayer().getX() * 50,
						startPage.getPlayer().getY() * 50);
				startPage.gc.drawImage(startPage.imgPanther, startPage.getPanther1().getX() * 50,
						startPage.getPanther1().getY() * 50);
				startPage.gc.drawImage(startPage.imgPanther, startPage.getPanther2().getX() * 50,
						startPage.getPanther2().getY() * 50);
				startPage.gc.drawImage(startPage.imgPolice, startPage.getPolice().getX() * 50,
						startPage.getPolice().getY() * 50);
				startPage.gc.drawImage(startPage.imgWin, 9 * 50, 9 * 50);

				startScene.setOnKeyPressed(new EventHandler<KeyEvent>() {

					@Override
					public void handle(KeyEvent e) {
						// TODO Auto-generated method stub
						if (e.getCode() == KeyCode.UP) {
							startPage.gc.clearRect(0, 0, 500, 500);
							startPage.getPlayer().moveUp();
							startPage.getPolice().moveP();
							startPage.getPanther1().moveP();
							startPage.getPanther2().moveP();
							startPage.getPanther2().update();
							startPage.getPanther1().update();
							startPage.getPolice().update();
							startPage.getPlayer().update();
							startPage.gc.drawImage(startPage.imgPlayer, startPage.getPlayer().getX() * 50,
									startPage.getPlayer().getY() * 50);
							startPage.gc.drawImage(startPage.imgPanther, startPage.getPanther1().getX() * 50,
									startPage.getPanther1().getY() * 50);
							startPage.gc.drawImage(startPage.imgPanther, startPage.getPanther2().getX() * 50,
									startPage.getPanther2().getY() * 50);
							startPage.gc.drawImage(startPage.imgPolice, startPage.getPolice().getX() * 50,
									startPage.getPolice().getY() * 50);
							startPage.gc.drawImage(startPage.imgWin, 9 * 50, 9 * 50);

						}
						if (e.getCode() == KeyCode.DOWN) {
							startPage.gc.clearRect(0, 0, 500, 500);
							startPage.getPlayer().moveDown();
							startPage.getPolice().moveP();
							startPage.getPanther1().moveP();
							startPage.getPanther2().moveP();
							startPage.getPanther2().update();
							startPage.getPanther1().update();
							startPage.getPolice().update();
							startPage.getPlayer().update();
							startPage.gc.drawImage(startPage.imgPlayer, startPage.getPlayer().getX() * 50,
									startPage.getPlayer().getY() * 50);
							startPage.gc.drawImage(startPage.imgPanther, startPage.getPanther1().getX() * 50,
									startPage.getPanther1().getY() * 50);
							startPage.gc.drawImage(startPage.imgPanther, startPage.getPanther2().getX() * 50,
									startPage.getPanther2().getY() * 50);
							startPage.gc.drawImage(startPage.imgPolice, startPage.getPolice().getX() * 50,
									startPage.getPolice().getY() * 50);
							startPage.gc.drawImage(startPage.imgWin, 9 * 50, 9 * 50);
						}
						if (e.getCode() == KeyCode.RIGHT) {
							startPage.gc.clearRect(0, 0, 500, 500);
							startPage.getPlayer().moveRight();
							startPage.getPolice().moveP();
							startPage.getPanther1().moveP();
							startPage.getPanther2().moveP();
							startPage.getPanther2().update();
							startPage.getPanther1().update();
							startPage.getPolice().update();
							startPage.getPlayer().update();
							startPage.gc.drawImage(startPage.imgPlayer, startPage.getPlayer().getX() * 50,
									startPage.getPlayer().getY() * 50);
							startPage.gc.drawImage(startPage.imgPanther, startPage.getPanther1().getX() * 50,
									startPage.getPanther1().getY() * 50);
							startPage.gc.drawImage(startPage.imgPanther, startPage.getPanther2().getX() * 50,
									startPage.getPanther2().getY() * 50);
							startPage.gc.drawImage(startPage.imgPolice, startPage.getPolice().getX() * 50,
									startPage.getPolice().getY() * 50);
							startPage.gc.drawImage(startPage.imgWin, 9 * 50, 9 * 50);
						}
						if (e.getCode() == KeyCode.LEFT) {
							startPage.gc.clearRect(0, 0, 500, 500);
							startPage.getPlayer().moveLeft();
							startPage.getPolice().moveP();
							startPage.getPanther1().moveP();
							startPage.getPanther2().moveP();
							startPage.getPanther2().update();
							startPage.getPanther1().update();
							startPage.getPolice().update();
							startPage.getPlayer().update();
							startPage.gc.drawImage(startPage.imgPlayer, startPage.getPlayer().getX() * 50,
									startPage.getPlayer().getY() * 50);
							startPage.gc.drawImage(startPage.imgPanther, startPage.getPanther1().getX() * 50,
									startPage.getPanther1().getY() * 50);
							startPage.gc.drawImage(startPage.imgPanther, startPage.getPanther2().getX() * 50,
									startPage.getPanther2().getY() * 50);
							startPage.gc.drawImage(startPage.imgPolice, startPage.getPolice().getX() * 50,
									startPage.getPolice().getY() * 50);
							startPage.gc.drawImage(startPage.imgWin, 9 * 50, 9 * 50);
						}
						
						try {
							startPage.getPlayer().isWin();
						} catch (MyException ee) {
							WinPage winPage = new WinPage();
							winScene = new Scene(winPage, 500, 550);
							primaryStage.setScene(winScene);
							Button backBtn = winPage.getBackBtn();
							
							String ssongDir = "winSound.mp3";
							Media wMusic = new Media(new File(ssongDir).toURI().toString());
							MediaPlayer wPlayer = new MediaPlayer(wMusic);
							wPlayer.play();
							
							
							backBtn.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
								@Override
								public void handle(MouseEvent arg0) {
									primaryStage.setScene(mainScene);
									wPlayer.pause();
								}
							});
						}
					}

				});

			}

		});

		creditBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				CreditPage creditPage = new CreditPage();
				creditScene = new Scene(creditPage, 500, 550);
				primaryStage.setScene(creditScene);

				Button backBtn = creditPage.getBackBtn();
				backBtn.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent arg0) {

						primaryStage.setScene(mainScene);
					}
				});
			}

		});

		exitBtn.setOnAction(e -> Platform.exit());

		primaryStage.setTitle("Back Panter : The Hunting Game");
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
