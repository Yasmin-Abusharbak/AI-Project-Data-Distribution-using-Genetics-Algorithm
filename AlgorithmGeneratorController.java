
import javafx.fxml.FXML;

import javafx.scene.control.TreeTableColumn;

import javafx.scene.layout.AnchorPane;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;

public class AlgorithmGeneratorController {
	@FXML
	private AnchorPane StartPane;
	@FXML
	private  TableView <View> AllTable;
	@FXML
	private TableColumn <View,Integer> Chromosomeid;
	@FXML
	private TableColumn <View,Integer> Geneid;
	@FXML
	private TableColumn <View,Integer> Fittness;
	
	@FXML
	private Button View ;
	@FXML
	private  Label Gene ;
	 ObservableList<View> ChromosomeList = FXCollections.observableArrayList();

	public static ArrayList <Chromosome> k = new ArrayList<Chromosome>();
	public static ArrayList <Integer> kw = new ArrayList<Integer>();
	
	ObservableList<Integer> FitnessList = FXCollections.observableArrayList();
	public static ArrayList<Integer> Fitness = new ArrayList<Integer>();
	
	public void openlist() {
	//	Chromosome P1 = new Chromosome(kw , 1 ,3 ,4 ,5);
		

		Chromosome P1 = Main.F;
		ChromosomeList.clear();
         //for creating the table for comparison
        // for (int i = 0; i < P1.si; i++) {
        	 ChromosomeList.add(new View(P1.getGenes(),P1.getf1(),P1.getf2(),P1.getf3(),P1.getfitness()));
        //
        	 
     		System.out.println(ChromosomeList.get(0).getFittness());

		StringBuilder sb = new StringBuilder();
		Chromosomeid.setCellValueFactory(new PropertyValueFactory<View, Integer>("genes"));
		Geneid.setCellValueFactory(new PropertyValueFactory<View, Integer>("genes"));
		Fittness.setCellValueFactory(new PropertyValueFactory<View, Integer>("Fittness"));
		AllTable.setItems(ChromosomeList);
		System.out.println(":::::::");
		
//		for (Integer number : numbers) {
//		  sb.append(number != null ? number.toString() : "");
//		}
//		
//		
		//String Ge =Ge.join(",",P1.getGenes());
		//Gene.setText(Ge);
		
		
//		ObservableValue<Integer> obsInt = new SimpleIntegerProperty(P1.getf1()).asObject();
//
//		
//		Chromosomeid.setCellValueFactory(new PropertyValueFactory<Chromosome,Integer>("f1"));
//		
//		//Chromosomeid.setCellValueFactory(cellData -> new SimpleStringProperty(Chromosome.class.getSimpleName()));
//		System.out.println(ChromosomeList.get(0).getfitness());
//
//		Geneid.setCellValueFactory(new PropertyValueFactory<>("f1"));
//		Geneid.setCellValueFactory(cellData ->cellData.getValue().getfitness().as);
//
//		
//		
//		Fitnessidd.setCellValueFactory(new PropertyValueFactory<>("f2"));
		//AllTable.setItems(ChromosomeList);
		//Chromosomeid.setCellValueFactory(data -> new SimpleStringProperty(P1.getfitness()));
	}
public  Chromosome re (Chromosome d) {
	//openlist(d);
	return d;
	
}
}
