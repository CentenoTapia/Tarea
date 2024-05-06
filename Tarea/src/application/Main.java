package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		AnchorPane anchorPane = new AnchorPane();
        TextField textField = new TextField();
        TextField textField2 = new TextField("Adrian Centeno");
        TextField textField3 = new TextField("Andres Sornoza");
        TextField textField4 = new TextField("Daniel Jaya");
        TextField textField5 = new TextField("Johann Santana");
        TextField textField6 = new TextField("Ricardo Piza");
        
        ListView<String> listView = new ListView<>();
        
        Label label1 = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();
        Label label5 = new Label();

        
        Image image1 = new Image("file:///C:/Users/adria/eclipse-workspace/Tarea/src/Nueva%20carpeta/kura.jpg"); 
        Image image2 = new Image("file:///C:/Users/adria/eclipse-workspace/Tarea/src/Nueva%20carpeta/kura.jpg"); 
        Image image3 = new Image("file:///C:/Users/adria/eclipse-workspace/Tarea/src/Nueva%20carpeta/kura.jpg"); 
        Image image4 = new Image("file:///C:/Users/adria/eclipse-workspace/Tarea/src/Nueva%20carpeta/kura.jpg"); 
        Image image5 = new Image("file:///C:/Users/adria/eclipse-workspace/Tarea/src/Nueva%20carpeta/kura.jpg");
        
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitWidth(50);
        imageView1.setFitHeight(50); 
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitWidth(50); 
        imageView2.setFitHeight(50); 
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitWidth(50); 
        imageView3.setFitHeight(50); 
        ImageView imageView4 = new ImageView(image4);
        imageView4.setFitWidth(50); 
        imageView4.setFitHeight(50); 
        ImageView imageView5 = new ImageView(image5);
        imageView5.setFitWidth(50); 
        imageView5.setFitHeight(50); 
        
        label1.setGraphic(imageView1);
        label2.setGraphic(imageView2);
        label3.setGraphic(imageView3);
        label4.setGraphic(imageView4);
        label5.setGraphic(imageView5);
        
        textField.setPrefWidth(247); 
        textField.setPrefHeight(50); 
        textField2.setPrefWidth(247); 
        textField2.setPrefHeight(50);
        textField3.setPrefWidth(247); 
        textField3.setPrefHeight(50); 
        textField4.setPrefWidth(247); 
        textField4.setPrefHeight(50); 
        textField5.setPrefWidth(247); 
        textField5.setPrefHeight(50); 
        textField6.setPrefWidth(247); 
        textField6.setPrefHeight(50); 
       
        
        anchorPane.getChildren().addAll(textField,textField2,textField3,textField4,textField5,textField6,listView, label1, label2, label3, label4, label5);
   
        
        AnchorPane.setTopAnchor(listView, 10.0);
        AnchorPane.setRightAnchor(listView, 10.0);
        AnchorPane.setBottomAnchor(listView, 70.0);
        
        AnchorPane.setBottomAnchor(textField, 10.0);
        AnchorPane.setRightAnchor(textField, 10.0);
        AnchorPane.setTopAnchor(textField2, 10.0);
        AnchorPane.setLeftAnchor(textField2, 150.0);
        AnchorPane.setTopAnchor(textField3, 80.0);
        AnchorPane.setLeftAnchor(textField3, 150.0);
        AnchorPane.setTopAnchor(textField4, 150.0);
        AnchorPane.setLeftAnchor(textField4, 150.0);
        AnchorPane.setTopAnchor(textField5, 220.0);
        AnchorPane.setLeftAnchor(textField5, 150.0);
        AnchorPane.setTopAnchor(textField6, 290.0);
        AnchorPane.setLeftAnchor(textField6, 150.0);
        
        AnchorPane.setTopAnchor(label1, 10.0);
        AnchorPane.setLeftAnchor(label1, 100.0);
        AnchorPane.setTopAnchor(label2, 80.0);
        AnchorPane.setLeftAnchor(label2, 100.0);
        AnchorPane.setTopAnchor(label3, 150.0);
        AnchorPane.setLeftAnchor(label3, 100.0);
        AnchorPane.setTopAnchor(label4, 220.0);
        AnchorPane.setLeftAnchor(label4, 100.0);
        AnchorPane.setTopAnchor(label5, 290.0);
        AnchorPane.setLeftAnchor(label5, 100.0);
        
        Scene scene = new Scene(anchorPane, 800, 600);

        primaryStage.setTitle("Tarea");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


