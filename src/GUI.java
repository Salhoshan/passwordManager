
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class GUI extends Application {
    
    @Override
    public void start(Stage primaryStage)  {
        //Pane creation
        GridPane main = new GridPane();
        main.setHgap(6);
        main.setVgap(6);
        main.setPadding(new Insets(10, 10, 10, 10));
        main.setStyle("-fx-border-color: black; -fx-background-color: lightgray;");
        //Name of program 
        Text password_manager = new Text("Password Manager");
        password_manager.setFont(Font.font("Helvetica",40));
        main.add(password_manager, 0, 0);
        
        //+ Button1
        Button plus1 = new Button("Password1");
        plus1.setFont(Font.font("Helvetica",30));
        plus1.setShape(new Rectangle(10,10));
        main.add(plus1,0, 20);
        
        plus1.setOnAction((ActionEvent e)->{
        addPassword1(main);
    });
        try {
            read1(plus1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //+ Button2
        Button plus2 = new Button("Password2");
        plus2.setFont(Font.font("Helvetica",30));
        plus2.setShape(new Rectangle(10,10));
        main.add(plus2,1, 20);
        
        plus2.setOnAction((ActionEvent e)->{
        addPassword2(main);
    });
        
        //+ Button3
         Button plus3 = new Button("Password3");
        plus3.setFont(Font.font("Helvetica",30));
        plus3.setShape(new Rectangle(10,10));
        main.add(plus3,0, 30);
        
        plus3.setOnAction((ActionEvent e)->{
        addPassword3(main);
    });
        
        //+ Button4
        Button plus4 = new Button("Password4");
        plus4.setFont(Font.font("Helvetica",30));
        plus4.setShape(new Rectangle(10,10));
        main.add(plus4,1, 30);
        
        plus4.setOnAction((ActionEvent e)->{
        addPassword4(main);
    });
        
        //Adding Scene
        Scene scene = new Scene(main, 600 , 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Password Manager");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    
    //Add New Password1 Screen
    public void addPassword1(GridPane original){
        Password password = new Password();
        char[] characters = password.passwordGenerator();
        String str = new String(characters);
        Stage addNewScreen = new Stage();
        GridPane paneNew = new GridPane();
        paneNew.setHgap(5);
        paneNew.setVgap(10);
        Text nameNew = new Text("New Password");
        nameNew.setFont(Font.font("Helvetica",25));
        GridPane.setHalignment(nameNew, HPos.LEFT);
        Label nameOfPassword = new Label("Name Of Password: ");
        Label generatedPassword = new Label("Generated Password: ");
        TextField nameOfPasswordT = new TextField();
        TextField GeneratedPassword = new TextField(str);
        Button save = new Button("Save");
         GridPane.setHalignment(save, HPos.RIGHT);
        paneNew.add(nameNew, 0, 0);
        paneNew.add(nameOfPassword, 0, 1);
        paneNew.add(nameOfPasswordT, 1, 1);
        paneNew.add(generatedPassword, 0, 2);
        paneNew.add(GeneratedPassword, 1, 2);
        paneNew.add(save, 1, 3);
        Scene scene2 = new Scene(paneNew,350,250);
        addNewScreen.setTitle("New Password");
        addNewScreen.setScene(scene2);
        addNewScreen.show();
        
        save.setOnAction((ActionEvent e)->{
        
            try {
                File x = new File("passwords1.txt");
                PrintWriter w = new PrintWriter(x);
                w.println(nameOfPasswordT.getText());
                w.println(GeneratedPassword.getText());
                w.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
           addNewScreen.close();
    });
      
        
    }
    
    public void addPassword2(GridPane original){
        Password password = new Password();
        char[] characters = password.passwordGenerator();
        String str = new String(characters);
        Stage addNewScreen = new Stage();
        GridPane paneNew = new GridPane();
        paneNew.setHgap(5);
        paneNew.setVgap(10);
        Text nameNew = new Text("New Password");
        nameNew.setFont(Font.font("Helvetica",25));
        GridPane.setHalignment(nameNew, HPos.LEFT);
        Label nameOfPassword = new Label("Name Of Password: ");
        Label generatedPassword = new Label("Generated Password: ");
        TextField nameOfPasswordT = new TextField();
        TextField GeneratedPassword = new TextField(str);
        Button save = new Button("Save");
         GridPane.setHalignment(save, HPos.RIGHT);
        paneNew.add(nameNew, 0, 0);
        paneNew.add(nameOfPassword, 0, 1);
        paneNew.add(nameOfPasswordT, 1, 1);
        paneNew.add(generatedPassword, 0, 2);
        paneNew.add(GeneratedPassword, 1, 2);
        paneNew.add(save, 1, 3);
        Scene scene2 = new Scene(paneNew,350,250);
        addNewScreen.setTitle("New Password");
        addNewScreen.setScene(scene2);
        addNewScreen.show();
        
        save.setOnAction((ActionEvent e)->{
        
            try {
                File x = new File("passwords2.txt");
                PrintWriter w = new PrintWriter(x);
                w.println(nameOfPasswordT.getText());
                w.println(GeneratedPassword.getText());
                w.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
           addNewScreen.close();
    });
           
        
    }
    
    public void addPassword3(GridPane original){
        Password password = new Password();
        char[] characters = password.passwordGenerator();
        String str = new String(characters);
        Stage addNewScreen = new Stage();
        GridPane paneNew = new GridPane();
        paneNew.setHgap(5);
        paneNew.setVgap(10);
        Text nameNew = new Text("New Password");
        nameNew.setFont(Font.font("Helvetica",25));
        GridPane.setHalignment(nameNew, HPos.LEFT);
        Label nameOfPassword = new Label("Name Of Password: ");
        Label generatedPassword = new Label("Generated Password: ");
        TextField nameOfPasswordT = new TextField();
        TextField GeneratedPassword = new TextField(str);
        Button save = new Button("Save");
         GridPane.setHalignment(save, HPos.RIGHT);
        paneNew.add(nameNew, 0, 0);
        paneNew.add(nameOfPassword, 0, 1);
        paneNew.add(nameOfPasswordT, 1, 1);
        paneNew.add(generatedPassword, 0, 2);
        paneNew.add(GeneratedPassword, 1, 2);
        paneNew.add(save, 1, 3);
        Scene scene2 = new Scene(paneNew,350,250);
        addNewScreen.setTitle("New Password");
        addNewScreen.setScene(scene2);
        addNewScreen.show();
        
        save.setOnAction((ActionEvent e)->{
        
            try {
                File x = new File("passwords3.txt");
                PrintWriter w = new PrintWriter(x);
                w.println(nameOfPasswordT.getText());
                w.println(GeneratedPassword.getText());
                w.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
           addNewScreen.close();
    });
        
        
    }
    
    public void addPassword4(GridPane original){
        Password password = new Password();
        char[] characters = password.passwordGenerator();
        String str = new String(characters);
        Stage addNewScreen = new Stage();
        GridPane paneNew = new GridPane();
        paneNew.setHgap(5);
        paneNew.setVgap(10);
        Text nameNew = new Text("New Password");
        nameNew.setFont(Font.font("Helvetica",25));
        GridPane.setHalignment(nameNew, HPos.LEFT);
        Label nameOfPassword = new Label("Name Of Password: ");
        Label generatedPassword = new Label("Generated Password: ");
        TextField nameOfPasswordT = new TextField();
        TextField GeneratedPassword = new TextField(str);
        Button save = new Button("Save");
         GridPane.setHalignment(save, HPos.RIGHT);
        paneNew.add(nameNew, 0, 0);
        paneNew.add(nameOfPassword, 0, 1);
        paneNew.add(nameOfPasswordT, 1, 1);
        paneNew.add(generatedPassword, 0, 2);
        paneNew.add(GeneratedPassword, 1, 2);
        paneNew.add(save, 1, 3);
        Scene scene2 = new Scene(paneNew,350,250);
        addNewScreen.setTitle("New Password");
        addNewScreen.setScene(scene2);
        addNewScreen.show();
        
        save.setOnAction((ActionEvent e)->{
        
            try {
                File x = new File("passwords4.txt");
                PrintWriter w = new PrintWriter(x);
                w.println(nameOfPasswordT.getText());
                w.println(GeneratedPassword.getText());
                w.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
           addNewScreen.close();
    });
        
        
        
        
        
    }
    
    public void read1(Button button) throws FileNotFoundException{
            File x = new File("passwords1.txt");
            Scanner y = new Scanner(x);
            String s1 = null;
            String s2 = null;
            while(y.hasNext()){
                 s1 = y.nextLine();
                 s2 = y.nextLine();
        }
            button.setText(s1);
            
        }
}
