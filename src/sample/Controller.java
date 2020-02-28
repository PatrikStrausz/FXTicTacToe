package sample;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Controller {
    public Button btnRestart;
    public Button btnExitGame;
    public Button btnNewGame;
    public Button btn0;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn10;
    public Button btn11;
    public Button btn12;
    public Button btn13;
    public Button btn14;
    public Button btn15;
    private Game game;

    public Controller() {
        game = new Game();
    }

    public void initialize() {
        btnRestart.setDisable(true);
        btn0.setDisable(true);
        btn1.setDisable(true);
        btn2.setDisable(true);
        btn3.setDisable(true);
        btn4.setDisable(true);
        btn5.setDisable(true);
        btn6.setDisable(true);
        btn7.setDisable(true);
        btn8.setDisable(true);
        btn9.setDisable(true);
        btn10.setDisable(true);
        btn11.setDisable(true);
        btn12.setDisable(true);
        btn13.setDisable(true);
        btn14.setDisable(true);
        btn15.setDisable(true);

    }

    public void clickBtn(ActionEvent event) {

        String id = ((Button) event.getSource()).getId().substring(3);
        int intId = Integer.parseInt(id);

        game.nextMove(intId);
        if (game.getField() != null) {
            rePaint();
        }


    }

    public void clickNewGame(ActionEvent event) {
        game.start();
        btnNewGame.setDisable(true);
        btnRestart.setDisable(false);
        btn0.setDisable(false);
        btn1.setDisable(false);
        btn2.setDisable(false);
        btn3.setDisable(false);
        btn4.setDisable(false);
        btn5.setDisable(false);
        btn6.setDisable(false);
        btn7.setDisable(false);
        btn8.setDisable(false);
        btn9.setDisable(false);
        btn10.setDisable(false);
        btn11.setDisable(false);
        btn12.setDisable(false);
        btn13.setDisable(false);
        btn14.setDisable(false);
        btn15.setDisable(false);
        rePaint();


    }

    public void clickRestartGame(ActionEvent event) {
        game.reset();

        btnNewGame.setDisable(false);
        btnRestart.setDisable(true);

    }

    public void clickExitGame(ActionEvent event) {
        game.end();
        Stage stage = (Stage) btnExitGame.getScene().getWindow();
        stage.close();

    }

    public void rePaint() {
        Tile[][] arr = game.getField().getArr();
        btn0.setText(arr[0][0].isValue() ? "X" : "O");
        btn4.setText(arr[0][1].isValue() ? "X" : "O");
        btn8.setText(arr[0][2].isValue() ? "X" : "O");
        btn12.setText(arr[0][3].isValue() ? "X" : "O");

        btn1.setText(arr[1][0].isValue() ? "X" : "O");
        btn5.setText(arr[1][1].isValue() ? "X" : "O");
        btn9.setText(arr[1][2].isValue() ? "X" : "O");
        btn13.setText(arr[1][3].isValue() ? "X" : "O");

        btn2.setText(arr[2][0].isValue() ? "X" : "O");
        btn6.setText(arr[2][1].isValue() ? "X" : "O");
        btn10.setText(arr[2][2].isValue() ? "X" : "O");
        btn14.setText(arr[2][3].isValue() ? "X" : "O");

        btn3.setText(arr[3][0].isValue() ? "X" : "O");
        btn7.setText(arr[3][1].isValue() ? "X" : "O");
        btn11.setText(arr[3][2].isValue() ? "X" : "O");
        btn15.setText(arr[3][3].isValue() ? "X" : "O");

        changeBackgroundColor();

    }

    public void changeBackgroundColor() {
        Tile[][] arr = game.getField().getArr();

        if (arr[0][0].isValue()) {
            btn0.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            btn0.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }

        if (arr[0][1].isValue()) {
            btn4.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            btn4.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if (arr[0][2].isValue()) {
            btn8.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            btn8.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if (arr[0][3].isValue()) {
            btn12.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            btn12.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if (arr[1][0].isValue()) {
            btn1.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            btn1.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if (arr[1][1].isValue()) {
            btn5.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            btn5.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if (arr[1][2].isValue()) {
            btn9.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            btn9.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if (arr[1][3].isValue()) {
            btn13.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            btn13.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if (arr[2][0].isValue()) {
            btn2.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            btn2.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if (arr[2][1].isValue()) {
            btn6.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            btn6.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if (arr[2][2].isValue()) {
            btn10.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            btn10.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if (arr[2][3].isValue()) {
            btn14.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            btn14.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if (arr[3][0].isValue()) {
            btn3.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            btn3.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if (arr[3][1].isValue()) {
            btn7.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            btn7.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        if (arr[3][2].isValue()) {
            btn11.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            btn11.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }

        if (arr[3][3].isValue()) {
            btn15.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            btn15.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }


}
