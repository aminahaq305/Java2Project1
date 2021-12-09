import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToe extends Application {
	Board myBoard = new Board();
	ComputerPlayer player = new ComputerPlayer();
	int location;
	Button but1 = new Button("");
	Button but2 = new Button("");
	Button but3 = new Button("");
	Button but4 = new Button("");
	Button but5 = new Button("");
	Button but6 = new Button("");
	Button but7 = new Button("");
	Button but8 = new Button("");
	Button but9 = new Button("");
	int i = -1;
	Alert winner = new Alert(AlertType.INFORMATION);
	Button reset = new Button("RESET");
	Label xwins = new Label("0");
	Label owins = new Label("0");

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Tic Tac Toe");
			
		Alert alert = new Alert(AlertType.ERROR); 
		alert.setTitle("Invalid Move"); 
		alert.setHeaderText(null); 
		alert.setContentText("Please choose an empty location"); 

		winner.setTitle("Game over!");
		winner.setHeaderText(null); 
		
		GridPane gameGrid = new GridPane();
		gameGrid.setGridLinesVisible(false);
		
		but1.setPrefHeight(100);
		but1.setPrefWidth(100);
		GridPane.setConstraints(but1, 0, 0);
		gameGrid.getChildren().add(but1);
	
		but2.setPrefHeight(100);
		but2.setPrefWidth(100);
		GridPane.setConstraints(but2, 1, 0);
		gameGrid.getChildren().add(but2);
		
		but3.setPrefHeight(100);
		but3.setPrefWidth(100);
		GridPane.setConstraints(but3, 2, 0);
		gameGrid.getChildren().add(but3);
		
		but4.setPrefHeight(100);
		but4.setPrefWidth(100);
		GridPane.setConstraints(but4, 0, 1);
		gameGrid.getChildren().add(but4);
		

		but5.setPrefHeight(100);
		but5.setPrefWidth(100);
		GridPane.setConstraints(but5, 1, 1);
		gameGrid.getChildren().add(but5);
		
		but6.setPrefHeight(100);
		but6.setPrefWidth(100);
		GridPane.setConstraints(but6, 2, 1);
		gameGrid.getChildren().add(but6);
		
		
		but7.setPrefHeight(100);
		but7.setPrefWidth(100);
		GridPane.setConstraints(but7, 0, 2);
		gameGrid.getChildren().add(but7);
		
		but8.setPrefHeight(100);
		but8.setPrefWidth(100);
		GridPane.setConstraints(but8, 1, 2);
		gameGrid.getChildren().add(but8);
	
		but9.setPrefHeight(100);
		but9.setPrefWidth(100);
		GridPane.setConstraints(but9, 2, 2);
		gameGrid.getChildren().add(but9);
	
		reset.setPrefHeight(100);
		reset.setPrefWidth(100);
		GridPane.setConstraints(reset, 3, 1);
		gameGrid.getChildren().add(reset);
		reset.setOnAction(e -> {
			myBoard.resetBoard();
			i = -1;
			but1.setText("");
			but1.setStyle(null);
			but2.setText("");
			but2.setStyle(null);
			but3.setText("");
			but3.setStyle(null);
			but4.setText("");
			but4.setStyle(null);
			but5.setText("");
			but5.setStyle(null);
			but6.setText("");
			but6.setStyle(null);
			but7.setText("");
			but7.setStyle(null);
			but8.setText("");
			but8.setStyle(null);
			but9.setText("");
			but9.setStyle(null);
		});
		
		
			but1.setOnAction(e -> {
				winner();
					if (but1.getText() == "") {
						but1.setText("X");
						but1.setStyle("-fx-background-color: MediumSeaGreen");
						myBoard.setLocation('X', 1);
						i++;
						if (lastturn(i) == false && winner() == false) {
						oturn();
						}
						else if (winner() == false && lastturn(i) == true) {
							winner.setContentText("It's a draw!");
							winner.showAndWait();
							reset.fire();
						}
						else {
							winner();
						}
					}
					else {
						alert.showAndWait();
					}
				
			});
			
			but2.setOnAction(e -> {
				winner();
				if (but2.getText() == "") {
					but2.setText("X");
					but2.setStyle("-fx-background-color: MediumSeaGreen");
					myBoard.setLocation('X', 2);
					i++;
					if (lastturn(i) == false && winner() == false) {
					oturn();
					}
					else if (winner() == false && lastturn(i) == true) {
						winner.setContentText("It's a draw!");
						winner.showAndWait();
						reset.fire();
					}
					else {
						winner();
					}
				}
				else {
					alert.showAndWait();
				}
			});
			but3.setOnAction(e -> {
				winner();
				if (but3.getText() == "") {
					but3.setText("X");
					but3.setStyle("-fx-background-color: MediumSeaGreen");
					myBoard.setLocation('X', 3);
					i++;
					if (lastturn(i) == false && winner() == false) {
					oturn();
					}
					else if (winner() == false && lastturn(i) == true) {
						winner.setContentText("It's a draw!");
						winner.showAndWait();
						reset.fire();
					}
					else {
						winner();
					}
				}
				else {
					alert.showAndWait();
				}
			});
			but4.setOnAction(e -> {
				winner();
				if (but4.getText() == "") {
					but4.setText("X");
					but4.setStyle("-fx-background-color: MediumSeaGreen");
					myBoard.setLocation('X', 4);
					i++;
					if (lastturn(i) == false && winner() == false) {
					oturn();
					}
					else if (winner() == false && lastturn(i) == true){
						winner.setContentText("It's a draw!");
						winner.showAndWait();
						reset.fire();
					}
					else {
						winner();
					}
				}
				else {
					alert.showAndWait();
				}
			});
			but5.setOnAction(e -> {
				winner();
				if (but5.getText() == "") {
					but5.setText("X");
					but5.setStyle("-fx-background-color: MediumSeaGreen");
					myBoard.setLocation('X', 5);
					i++;
					if (lastturn(i) == false && winner() == false) {
					oturn();
					}
					else if (winner() == false && lastturn(i) == true) {
						winner.setContentText("It's a draw!");
						winner.showAndWait();
						reset.fire();
					}
					else {
						winner();
					}
				}
				else {
					alert.showAndWait();
				}
			});
			but6.setOnAction(e -> {
				winner();
				if (but6.getText() == "") {
					but6.setText("X");
					but6.setStyle("-fx-background-color: MediumSeaGreen");
					myBoard.setLocation('X', 6);
					i++;
					if (lastturn(i) == false && winner() == false) {
					oturn();
					}
					else if (winner() == false && lastturn(i) == true) {
						winner.setContentText("It's a draw!");
						winner.showAndWait();
						reset.fire();
					}
					else {
						winner();
					}
				}
				else {
					alert.showAndWait();
				}
			});
			but7.setOnAction(e -> {
				winner();
				if (but7.getText() == "") {
					but7.setText("X");
					but7.setStyle("-fx-background-color: MediumSeaGreen");
					myBoard.setLocation('X', 7);
					i++;
					if (lastturn(i) == false && winner() == false) {
					oturn();
					}
					else if (winner() == false && lastturn(i) == true){
						winner.setContentText("It's a draw!");
						winner.showAndWait();
						reset.fire();
					}
					else {
						winner();
					}
				}
				else {
					alert.showAndWait();
				}
			});
			but8.setOnAction(e -> {
				winner();
				if (but8.getText() == "") {
					but8.setText("X");
					but8.setStyle("-fx-background-color: MediumSeaGreen");
					myBoard.setLocation('X', 8);
					i++;
					if (lastturn(i) == false && winner() == false) {
					oturn();
					}
					else if (winner() == false && lastturn(i) == true) {
						winner.setContentText("It's a draw!");
						winner.showAndWait();
						reset.fire();
					}
					else {
						winner();
					}
				}
				else {
					alert.showAndWait();
				}
			});
			but9.setOnAction(e -> {
				winner();
				if (but9.getText() == "") {
					but9.setText("X");
					but9.setStyle("-fx-background-color: MediumSeaGreen");
					myBoard.setLocation('X', 9);
					i++;
					if (lastturn(i) == false && winner() == false) {
					oturn();
					}
					else if (winner() == false && lastturn(i) == true) {
						winner.setContentText("It's a draw!");
						winner.showAndWait();
						reset.fire();
					}
					else {
						winner();
					}
				}
				else {
					alert.showAndWait();
				}
			});
			
		Label head = new Label("No of wins");
		Label playerx = new Label("Player X: ");
		Label playero = new Label("Player O: ");
		
		
		GridPane.setConstraints(head, 0, 4);
		gameGrid.getChildren().add(head);
		
		GridPane.setConstraints(playerx, 1, 3);
		gameGrid.getChildren().add(playerx);
		
		GridPane.setConstraints(playero, 2, 3);
		gameGrid.getChildren().add(playero);
		
		GridPane.setConstraints(xwins, 1, 4);
		gameGrid.getChildren().add(xwins);
		
		GridPane.setConstraints(owins, 2, 4);
		gameGrid.getChildren().add(owins);
		
		Scene scene = new Scene(gameGrid, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public void oturn() {
		location = player.computerTurn();
		while (myBoard.locationinuse(location) == true) {
			location = player.computerTurn();
		}
		switch (location) {
		case 1:
			if (winner() == false) {
				but1.setText("O");
				but1.setStyle("-fx-background-color: Red");
				i++;
				myBoard.setLocation('O', 1);
				if (winner() == false) {
					return;
				}
				else {
					winner();
					break;
				}
				}
				else {
					winner();
					break;
				}
		case 2:
			if (winner() == false) {
				but2.setText("O");
				but2.setStyle("-fx-background-color: Red");
				i++;
				myBoard.setLocation('O', 2);
				if (winner() == false) {
					return;
				}
				else {
					winner();
					break;
				}
				}
				else {
					winner();
					break;
				}
		case 3:
			if (winner() == false) {
				but3.setText("O");
				but3.setStyle("-fx-background-color: Red");
				i++;
				myBoard.setLocation('O', 3);
				if (winner() == false) {
					return;
				}
				else {
					winner();
					break;
				}
				}
				else {
					winner();
					break;
				}
		case 4:
			if (winner() == false) {
				but4.setText("O");
				but4.setStyle("-fx-background-color: Red");
				i++;
				myBoard.setLocation('O', 4);
				if (winner() == false) {
					return;
				}
				else {
					winner();
					break;
				}
				}
				else {
					winner();
					break;
				}
			
		case 5:
			if (winner() == false) {
				but5.setText("O");
				but5.setStyle("-fx-background-color: Red");
				i++;
				myBoard.setLocation('O', 5);
				if (winner() == false) {
					return;
				}
				else {
					winner();
					break;
				}
				}
				else {
					winner();
					break;
				}
			
		case 6:
			if (winner() == false) {
				but6.setText("O");
				but6.setStyle("-fx-background-color: Red");
				i++;
				myBoard.setLocation('O', 6);
				if (winner() == false) {
					return;
				}
				else {
					winner();
					break;
				}
				}
				else {
					winner();
					break;
				}
			
		case 7:
			if (winner() == false) {
				but7.setText("O");
				but7.setStyle("-fx-background-color: Red");
				i++;
				myBoard.setLocation('O', 7);
				if (winner() == false) {
					return;
				}
				else {
					winner();
					break;
				}
				}
				else {
					winner();
					break;
				}
			
		case 8:
			if (winner() == false) {
				but8.setText("O");
				but8.setStyle("-fx-background-color: Red");
				i++;
				myBoard.setLocation('O', 8);
				if (winner() == false) {
					return;
				}
				else {
					winner();
					break;
				}
				}
				else {
					winner();
					break;
				}
		case 9:
			if (winner() == false) {
				but9.setText("O");
				but9.setStyle("-fx-background-color: Red");
				i++;
				myBoard.setLocation('O', 9);
				if (winner() == false) {
					return;
				}
				else {
					winner();
					break;
				}
				}
				else {
					winner();
					break;
				}
			
		}
	
		}
	public boolean lastturn(int count) {
		if (count == 8) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public boolean winner() {
		if (myBoard.hasWon() == ' ') {
			return false;
		}
		else {
			if (myBoard.hasWon() == 'X') {
				winner.setContentText("You won!");
				winner.showAndWait();
				reset.fire();
			}
				else {
					winner.setContentText("You lost!");
					winner.showAndWait();
					reset.fire();	
				}
			xwins.setText(myBoard.xwins());
			owins.setText(myBoard.owins());
			return true;
		}
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}