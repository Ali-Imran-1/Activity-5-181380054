package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
    TextField headingTF,nameTf,phnoTf,addressTf;
    Label nameLabel,phNoLabel,addressLabel,sizeLabel,crustLabel,toppingsLabel;
    RadioButton smallRb,mediumRb,largeRb,thinRb,thickRb;

    CheckBox pepperoniCb,sausageCb,linguicaCb,olivesCb,mushroomsCb,tomatoesCb,anchoviesCb;
    Button okBtn,cencleBtn;
    HBox headingHb,CustomerHb,pizzaHb;
    VBox labelsVb,textFieldsVb,detailsVb,sizeVb,crustVb;;
    FlowPane root;
        @Override
    public void start(Stage primaryStage) throws Exception{
        headingTF=new TextField("Order Your Pizza Now~!");
        headingTF.setFont(new Font(20));
        headingHb=new HBox(headingTF);
        headingHb.setPadding(new Insets(10));
        nameLabel=new Label("Name:");
        phNoLabel=new Label("Phone Number:");
        addressLabel=new Label("Address:");
        nameTf=new TextField();
        phnoTf=new TextField();
        addressTf=new TextField();
        labelsVb=new VBox(10,nameLabel,phNoLabel,addressLabel);
        textFieldsVb=new VBox(nameTf,phnoTf,addressTf);
        sizeLabel=new Label("Size");
        smallRb=new RadioButton("Small");
        mediumRb=new RadioButton("Medium");
        largeRb=new RadioButton("Large");
        ToggleGroup sizeTG=new ToggleGroup();
        smallRb.setToggleGroup(sizeTG);
        mediumRb.setToggleGroup(sizeTG);
        largeRb.setToggleGroup(sizeTG);
        sizeVb=new VBox(sizeLabel,smallRb,mediumRb,largeRb);
        sizeVb.setSpacing(10);
        crustLabel=new Label("Crust");
        thinRb=new RadioButton("Thin");
        thickRb=new RadioButton("Thick");
        ToggleGroup crustTG=new ToggleGroup();
        thinRb.setToggleGroup(crustTG);
        thickRb.setToggleGroup(crustTG);
        crustVb=new VBox(labelsVb,thinRb,thickRb);
        crustVb.setSpacing(10);
        crustVb.setPadding(new Insets(0,0,0,10));
            toppingsLabel=new Label("Tooping");
            pepperoniCb=new CheckBox("Pepperoni");
            sausageCb=new CheckBox("Sausage");
            linguicaCb=new CheckBox("Lingoica");
            olivesCb=new CheckBox("Olives");
            mushroomsCb=new CheckBox("Mushrooms");
            tomatoesCb=new CheckBox("Tomatoes");
            anchoviesCb=new CheckBox("Anchovies");
            root=new FlowPane(Orientation.VERTICAL,pepperoniCb,sausageCb,linguicaCb,olivesCb,mushroomsCb,tomatoesCb,anchoviesCb);

            root.setPadding(new Insets(10,0,10,0));
            root.setHgap(20);
            root.setVgap(10);
            root.setPrefWrapLength(100);
            VBox ToopingVB=new VBox(toppingsLabel,root);
            ToopingVB.setPadding(new Insets(0,0,0,15));

            pizzaHb=new HBox(sizeVb,crustVb,ToopingVB);

            VBox centerVB=new VBox(20,CustomerHb,pizzaHb);
            centerVB.setPadding(new Insets(0,10,0,10));
            cencleBtn=new Button("Cancle");
            okBtn=new Button("OK");
            okBtn.setPrefWidth(80);
            okBtn.setOnAction(e-> btnOK_Click() );

            cencleBtn.setPrefWidth(80);
            cencleBtn.setOnAction(e-> btnCancle_Click());
            Region spacer=new Region();
            HBox BtnHB=new HBox(10,spacer,okBtn,cencleBtn);

            BtnHB.setPadding(new Insets(20,10,20,10));
            BorderPane mainBP=new BorderPane();
            mainBP.setTop(headingHb);
            mainBP.setCenter(centerVB);
            mainBP.setBottom(BtnHB);
    }

    private void btnCancle_Click() {
    }

    private void btnOK_Click() {
    }


    public static void main(String[] args) {
        launch(args);
    }
}
