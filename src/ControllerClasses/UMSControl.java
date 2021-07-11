package ControllerClasses;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class UMSControl {
    @FXML
    public JFXButton CrUserBTN;
    @FXML
    public JFXButton ManageUserBTN;
    @FXML
    public JFXButton UMSbutton;

    @FXML
    public void UserCreate(ActionEvent evt) throws IOException {
        Parent AdminBoard = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/pageDesigns/UMS/UserAdd.fxml")));
        Scene AdminBoardScene = new Scene(AdminBoard);
        Stage userStage = (Stage) ((Node) evt.getSource()).getScene().getWindow();
        userStage.setScene(AdminBoardScene);
        userStage.setTitle("Creating New User");
        userStage.show();
    }

    @FXML
    public void ManageUser(ActionEvent evt) throws IOException{
        Parent AdminBoard = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/pageDesigns/ManageUser.fxml")));
        Scene AdminBoardScene = new Scene(AdminBoard);
        Stage userStage = (Stage) ((Node) evt.getSource()).getScene().getWindow();
        userStage.setScene(AdminBoardScene);
        userStage.setTitle("Creating New User");
        userStage.show();
    }
    @FXML
    public void IncomingOpenAction(ActionEvent evt) throws IOException {
        Parent AdminBoard = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/pageDesigns/Incoming/IncomingMenu.fxml")));
        Scene AdminBoardScene = new Scene(AdminBoard);
        Stage userStage = (Stage) ((Node) evt.getSource()).getScene().getWindow();
        userStage.setScene(AdminBoardScene);
        userStage.setTitle("Incoming");
        userStage.show();
    }
    @FXML
    public void OutgoingOpenAction(ActionEvent evt) throws IOException {
        Parent AdminBoard = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/pageDesigns/Outgoing/Outgoing.fxml")));
        Scene AdminBoardScene = new Scene(AdminBoard);
        Stage userStage = (Stage) ((Node) evt.getSource()).getScene().getWindow();
        userStage.setScene(AdminBoardScene);
        userStage.setTitle("Incoming");
        userStage.show();
    }
    @FXML
    public void BackHome(ActionEvent evt) throws Exception {
        Parent userAdd = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/pageDesigns/AdminBoard.fxml")));
        Scene userAddScene = new Scene(userAdd);
        Stage userStage = (Stage) ((Node) evt.getSource()).getScene().getWindow();
        userStage.setScene(userAddScene);
        userStage.show();
    }
}
