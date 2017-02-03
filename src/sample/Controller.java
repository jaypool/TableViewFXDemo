package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class Controller {
    /**
     * Here we access the FXML variables
     */
    @FXML
    private TableView peopleTable;
    @FXML
    private TableColumn firstNameCol;
    @FXML
    private TableColumn lastNameCol;
    @FXML
    private TableColumn ageCol;

    /**
     * Just the exit button.
     * @param actionEvent
     */
    public void closeApp(ActionEvent actionEvent) {
        System.exit(0);
    }

    /**
     * Here we create an ObservableList which we have to use to populate
     * the TableView. Within this method we call the peopleModel class
     * which is a data structure to hold the data.
     * @return
     */
    public ObservableList<peopleModel> returnPeople() {
        ObservableList<peopleModel> people = FXCollections.observableArrayList();
        people.add(new peopleModel("Jim", "Falcon", 32));
        people.add(new peopleModel("Bob", "Thimson", 65));
        people.add(new peopleModel("Carl", "Acusto", 47));
        people.add(new peopleModel("Steven", "Ban", 34));
        people.add(new peopleModel("Derp", "Derpina", 72));
        return people;
    }

    /**
     * This will be called when you press the button 'Show Data!'.
     * At first i didn't get this, but its simple: use setCellValueFactory to set
     * the value of the columns. the PropertyValueFactory name should be identical
     * to the variable names within the peopleModel class.
     * @param actionEvent
     */
    public void showData(ActionEvent actionEvent) {

        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        ageCol.setCellValueFactory(new PropertyValueFactory<>("age"));

        peopleTable.setItems(returnPeople());
    }
}
