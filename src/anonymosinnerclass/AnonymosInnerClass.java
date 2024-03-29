/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymosinnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class AnonymosInnerClass extends Application {

    @Override
    public void start(Stage primaryStage) {
        
  
        Button btn1 = new Button("new");
        Button btn2 = new Button("Open");
        Button btn3 = new Button("Save");
        Button btn4 = new Button("Print");
     
        
        btn1.setOnAction((ActionEvent event) -> {
            System.out.println("Nuevo Proceso");
        });
        
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Abrir Proceso");
            }
        });
        
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Guardar Proceso");
            }
        });
        
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Imprimir Proceso");
            }
        });
        
        
        HBox root = new HBox();
        
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(btn4);
        
        root.setAlignment(Pos.CENTER);
        root.setSpacing(5);
        
        
        
        Scene scene = new Scene(root, 200, 150);
        primaryStage.setTitle("AnonymousHandlerDemos");
        primaryStage.setScene(scene); 
        primaryStage.show();
    }
 
       
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            launch(args);


    }
    
    
    
}


