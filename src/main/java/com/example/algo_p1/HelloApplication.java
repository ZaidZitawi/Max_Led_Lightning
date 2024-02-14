package com.example.algo_p1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.util.*;

public class HelloApplication extends Application {
    String btnStyle = "-fx-min-width: 100; -fx-border-color: red; -fx-text-fill: red; -fx-border-width: 3; -fx-border-radius: 5; -fx-font-weight: bold;";
    String btnStyle2 = "-fx-min-width: 100; -fx-border-color: purple; -fx-text-fill: purple; -fx-border-width: 3; -fx-border-radius: 5; -fx-font-weight: bold;";
    String ButtonStyle2 = "-fx-background-color:#0598ff; -fx-background-color:transparent; -fx-font-size: 13; -fx-font-weight: bold;";
    String LabelStyle = "-fx-font-size: 18; -fx-font-weight: bold;";
    Image start = new Image("C:\\Users\\DELL\\IdeaProjects\\Algo_P1\\src\\main\\java\\images\\img_6.png");
    Image choseFile = new Image("C:\\Users\\DELL\\IdeaProjects\\Algo_P1\\src\\main\\java\\images\\img.png");
    Image promptUser = new Image("C:\\Users\\DELL\\IdeaProjects\\Algo_P1\\src\\main\\java\\images\\img_1.png");
    Image rand = new Image("C:\\Users\\DELL\\IdeaProjects\\Algo_P1\\src\\main\\java\\images\\img_2.png");
    Image dptable = new Image("C:\\Users\\DELL\\IdeaProjects\\Algo_P1\\src\\main\\java\\images\\img_4.png");
    Image close = new Image("C:\\Users\\DELL\\IdeaProjects\\Algo_P1\\src\\main\\java\\images\\img_5.png");
    Image icon = new Image("C:\\Users\\DELL\\IdeaProjects\\Algo_P1\\src\\main\\java\\images\\img_3.png");
    Image light = new Image("C:\\Users\\DELL\\IdeaProjects\\Algo_P1\\src\\main\\java\\images\\img_7.png");
    Image light2 = new Image("C:\\Users\\DELL\\IdeaProjects\\Algo_P1\\src\\main\\java\\images\\img_8.png");
    int[][] c ;
    char[][] b;
    boolean flage=false;


    @Override
    public void start(Stage stage) throws IOException {

        ImageView choseFileView = new ImageView(choseFile);
        ImageView promptUserView = new ImageView(promptUser);
        ImageView randView = new ImageView(rand);
        ImageView dptableView = new ImageView(dptable);
        ImageView closeView = new ImageView(close);
        ImageView IconView = new ImageView(icon);
        ImageView startView = new ImageView(start);



        Label Welcome = new Label("Welcome To Max Led Lightning Project, Lets Get Started!");
        Welcome.setStyle(LabelStyle);
        Button cFile = new Button("Start", startView);
        Button userInput = new Button("Close", closeView);
        cFile.setStyle(btnStyle);
        userInput.setStyle(btnStyle2);
        userInput.setOnAction(e->{
            stage.close();
        });


        cFile.setPrefSize(200, 100);
        userInput.setPrefSize(200, 100);
        choseFileView.setFitHeight(80);
        choseFileView.setFitWidth(80);
        promptUserView.setFitHeight(80);
        promptUserView.setFitWidth(80);
        randView.setFitHeight(80);
        randView.setFitWidth(80);
        startView.setFitHeight(80);
        startView.setFitWidth(80);
        closeView.setFitHeight(80);
        closeView.setFitWidth(80);

        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(1, 1, 10, 1));

        BorderPane borderPane = new BorderPane(vBox);
        borderPane.setCenter(vBox);
        borderPane.setBackground(new Background(new BackgroundFill(Color.LIGHTGOLDENRODYELLOW, new CornerRadii(0), Insets.EMPTY)));
        Scene scene = new Scene(borderPane, 800, 700);
        vBox.getChildren().addAll(Welcome, cFile, userInput);


        //=====================Main Window Scene=================//

        //main Anchor
        AnchorPane mainAnchorPane = new AnchorPane();
        //Left Anchor put the left Anchor pane on the left side of scene and extends from the bottom to the top of the scene
        AnchorPane lap = new AnchorPane();
        lap.setPrefWidth(200);
        lap.setPrefHeight(500);
        lap.setStyle("-fx-background-color: #ADD8E6");
        AnchorPane.setLeftAnchor(lap, 0.0);
        AnchorPane.setTopAnchor(lap, 0.0);
        AnchorPane.setBottomAnchor(lap, 0.0);

        //Inner Anchor Put the inner anchor in the top left
        AnchorPane innerPane = new AnchorPane();
        innerPane.setPrefWidth(200);
        innerPane.setPrefHeight(100);
        innerPane.setStyle("-fx-background-color:#0598ff");
        AnchorPane.setLeftAnchor(innerPane, 0.0);
        AnchorPane.setTopAnchor(innerPane, 0.0);
        Label pineAdministration = new Label("Max Led Lightning");
        pineAdministration.setStyle(LabelStyle);
        AnchorPane.setTopAnchor(pineAdministration, 0.0);
        AnchorPane.setBottomAnchor(pineAdministration, 0.0);
        AnchorPane.setLeftAnchor(pineAdministration, 25.0);
        AnchorPane.setRightAnchor(pineAdministration, 0.0);

        innerPane.getChildren().add(pineAdministration);
        //The Right big anchor pane put it right of lap with the following sizes and layout
        AnchorPane lap1 = new AnchorPane(randView);
        lap1.setPrefWidth(600);
        lap1.setPrefHeight(500);
        AnchorPane.setLeftAnchor(lap1, 200.0);
        AnchorPane.setTopAnchor(lap1, 100.0);
        AnchorPane.setRightAnchor(lap1, 0.0);
        AnchorPane.setBottomAnchor(lap1, 0.0);

        //put it above lap1 at the top of the scene on the right of inner pane
        AnchorPane lap2 = new AnchorPane();
        lap2.setPrefWidth(600);
        lap2.setPrefHeight(100);
        lap2.setStyle("-fx-background-color: #0598ff");
        AnchorPane.setLeftAnchor(lap2, 200.0);
        AnchorPane.setTopAnchor(lap2, 0.0);
        AnchorPane.setRightAnchor(lap2, 0.0);
        Label l = new Label("Zaid Zitawi-1203101");
        l.setStyle(LabelStyle);
        TextField textField = new TextField();
        textField.setEditable(false);
        textField.setPromptText("Number Of Lights");
        textField.setAlignment(Pos.CENTER);
        textField.setPrefSize(250, 65);
        HBox hBox = new HBox(IconView, l);
        AnchorPane.setLeftAnchor(hBox, 100.0);
        AnchorPane.setTopAnchor(hBox, 10.0);
        AnchorPane.setRightAnchor(hBox, 0.0);
        AnchorPane.setLeftAnchor(textField, 80.0);
        AnchorPane.setTopAnchor(textField, 10.0);
        IconView.setFitWidth(50);
        IconView.setFitHeight(50);
        hBox.setAlignment(Pos.CENTER);


        Separator separator1 = new Separator();
        separator1.setStyle("-fx-background-color: black");
        separator1.setPrefWidth(200);
        AnchorPane.setLeftAnchor(separator1, 0.0);
        AnchorPane.setTopAnchor(separator1, 100.0);
        AnchorPane.setRightAnchor(separator1, 0.0);
        lap.getChildren().add(separator1);

        Separator separator2 = new Separator();
        separator2.setOrientation(Orientation.VERTICAL);
        separator2.setPrefHeight(100);
        separator2.setStyle("-fx-background-color: black");
        AnchorPane.setLeftAnchor(separator2, 200.0);
        AnchorPane.setTopAnchor(separator2, 0.0);
        AnchorPane.setBottomAnchor(separator2, 0.0);
        mainAnchorPane.getChildren().add(separator2);

        VBox v = new VBox();
        v.setAlignment(Pos.CENTER_LEFT);
        v.setSpacing(20);
        AnchorPane.setTopAnchor(v, 110.0);


        Button choseFilebtn = new Button("Read From File", choseFileView);
        choseFilebtn.setPrefSize(200, 30);
        choseFilebtn.setStyle(ButtonStyle2);
        choseFileView.setFitWidth(50);
        choseFileView.setFitHeight(50);
        dropShadwo(choseFilebtn);

        Button input = new Button("Enter Ur Data", promptUserView);
        input.setPrefSize(200, 30);
        input.setStyle(ButtonStyle2);
        promptUserView.setFitHeight(50);
        promptUserView.setFitWidth(50);
        dropShadwo(input);


        Button r = new Button("Random Input", randView);
        r.setPrefSize(200, 30);
        r.setStyle(ButtonStyle2);
        randView.setFitWidth(50);
        randView.setFitHeight(50);
        dropShadwo(r);

        Button dp = new Button("Show DP Table", dptableView);
        dp.setPrefSize(200, 30);
        dp.setStyle(ButtonStyle2);
        dptableView.setFitWidth(50);
        dptableView.setFitHeight(50);
        dropShadwo(dp);

        Button ExitButton = new Button("Back To Home Page", closeView);
        ExitButton.setPrefSize(200, 30);
        ExitButton.setStyle(ButtonStyle2);
        closeView.setFitHeight(50);
        closeView.setFitWidth(50);
        dropShadwo(ExitButton);
        ExitButton.setOnAction(e->{
            stage.setScene(scene);
        });



        //Toggle Buttons//
        ToggleButton toggleButton1 = new ToggleButton("Whole Data");
        ToggleButton toggleButton2 = new ToggleButton("Result Data");
        toggleButton1.setSelected(true);

        // add buttons to toggle group
        ToggleGroup toggleGroup = new ToggleGroup();
        toggleButton1.setToggleGroup(toggleGroup);
        toggleButton1.setStyle("-fx-background-radius: 50; -fx-text-fill: black;");
        toggleButton2.setToggleGroup(toggleGroup);
        toggleButton2.setStyle("-fx-background-radius: 50; -fx-text-fill: black;");
        // set first button as selected
        // add buttons to HBox
        HBox hbox2 = new HBox(toggleButton1, toggleButton2);
        hbox2.setSpacing(10);
        AnchorPane.setTopAnchor(hbox2, 30.0);
        AnchorPane.setRightAnchor(hbox2, 50.0);




        v.getChildren().addAll(choseFilebtn, input, r, dp, ExitButton);
        lap.getChildren().add(v);
        lap.getChildren().add(innerPane);
        lap2.getChildren().addAll(hBox, textField, hbox2);
        mainAnchorPane.getChildren().addAll(lap, lap1, lap2);
        Scene zaid = new Scene(mainAnchorPane, 1100, 650);//Primary Scene
        stage.setTitle("Main Window");
        stage.getIcons().add(icon);

        cFile.setOnAction(e -> stage.setScene(zaid));

        //=======================Read Data from file================//

        choseFilebtn.setOnAction(e -> {
            flage=true;
            FileChooser fileChooser = new FileChooser();
            File fileselected = fileChooser.showOpenDialog(stage);
            if (fileselected != null) {
                int []x = ReadData(fileselected);
                int []y = new int[x.length];

                int minInedx = findMinElement(x);
                int maxIndex=findMaxElement(x);
                int count=0;
                while (minInedx<maxIndex){
                    y[count]=minInedx;
                    count++;
                    minInedx++;
                }

                c = new int[x.length + 1][y.length + 1];
                b = new char[x.length + 1][y.length + 1];

                for (int i = 1; i <= x.length; i++) {
                    c[i][0] = 0;
                }

                for (int j = 1; j <= y.length; j++) {
                    c[0][j] = 0;
                }

                for (int i = 1; i <= x.length; i++) {
                    for (int j = 1; j <= y.length; j++) {
                        if (x[i - 1] == y[j - 1]) {
                            c[i][j] = c[i - 1][j - 1] + 1;
                            b[i][j] = 'd'; // 'd' denotes diagonal arrow
                        } else if (c[i][j - 1] >= c[i - 1][j]) {
                            c[i][j] = c[i][j - 1];
                            b[i][j] = 'l'; // 'l' denotes left arrow
                        } else {
                            c[i][j] = c[i - 1][j];
                            b[i][j] = 'u'; // 'u' denotes up arrow
                        }
                    }
                }

                int[] MLL = getMLL(b, x, x.length, y.length);
                System.out.print("Output from reading file is: \n");
                for (int i=0;i<MLL.length;i++){
                    System.out.print(MLL[i] +" || ");
                }
                System.out.println("\n============================\n");
                if (toggleButton1.isSelected()) {
                    TableView<Connections> TableView = setTable();
                    ObservableList<Connections> observableList;
                    List<Connections> List = new ArrayList<>();
                    for (int j = 0; j < x.length; j++) {
                        if (linearSearch(MLL, x[j])) {
                            ImageView lightView = new ImageView(light);
                            List.add(new Connections(x[j], x[j], true, lightView));
                            lightView.setFitWidth(30);
                            lightView.setFitHeight(30);
                        }
                        else {
                            ImageView lightView2 = new ImageView(light2);
                            List.add(new Connections(x[j], x[j], false, lightView2));
                            lightView2.setFitWidth(30);
                            lightView2.setFitHeight(30);
                        }
                    }
                    observableList = FXCollections.observableArrayList(List);
                    TableView.setItems(observableList);

                    AnchorPane.setLeftAnchor(TableView, 10.0);
                    AnchorPane.setTopAnchor(TableView, 0.0);
                    AnchorPane.setRightAnchor(TableView, 0.0);
                    AnchorPane.setBottomAnchor(TableView, 0.0);
                    lap1.getChildren().add(TableView);

                }else if(toggleButton2.isSelected()){
                    TableView<Connections> TableView = setTable();
                    ObservableList<Connections> observableList;
                    List<Connections> List = new ArrayList<>();
                    for(int j=0;j<MLL.length;j++){
                        ImageView lightView = new ImageView(light);
                        List.add(new Connections(MLL[j], MLL[j], true, lightView));
                        lightView.setFitWidth(30); // Adjust the width as needed
                        lightView.setFitHeight(30); // Adjust the height as needed
                    }
                    observableList = FXCollections.observableArrayList(List);
                    TableView.setItems(observableList);

                    AnchorPane.setLeftAnchor(TableView, 10.0);
                    AnchorPane.setTopAnchor(TableView, 0.0);
                    AnchorPane.setRightAnchor(TableView, 0.0);
                    AnchorPane.setBottomAnchor(TableView, 0.0);
                    lap1.getChildren().add(TableView);
                }
                String s = MLL.length + "";
                String ledsnum=x.length+"";
                textField.setText("Leds Number:"+ ledsnum + " ||" + " Leds Lighted " + s);
            } else {
                System.out.println("File selection canceled by the user.");
            }


        });


        //======================Enter Your input================//
        Stage s = new Stage();

        GridPane gridPane1 = new GridPane();
        BorderPane borderPane2 = new BorderPane();
        gridPane1.setAlignment(Pos.CENTER);
        borderPane2.setCenter(gridPane1);
        Scene inputScene = new Scene(borderPane2, 500, 400);
        borderPane2.setBackground(new Background(new BackgroundFill(Color.LIGHTGOLDENRODYELLOW, new CornerRadii(0), Insets.EMPTY)));
        Label numLabel = new Label("Please Enter The Numbers With COMMA ( , )" +"\n" +"Between Numbers");
        numLabel.setStyle(LabelStyle);
        TextArea inputTextArea = new TextArea();
        inputTextArea.setPrefSize(100, 150);
        Button inputButton = new Button("Print");
        gridPane1.add(numLabel, 1, 0);
        gridPane1.add(inputTextArea, 1, 2);
        gridPane1.add(inputButton, 1, 3);

        input.setOnAction(e -> {
            s.setScene(inputScene);
            s.show();
        });


        inputButton.setOnAction(e->{
            String text = inputTextArea.getText();
            int[] x = ReadInputData(text);

            int []y = new int[x.length];
            int minInedx = findMinElement(x);
            int maxIndex=findMaxElement(x);
            int count=0;
           while (minInedx<maxIndex){
               y[count]=minInedx;
               count++;
               minInedx++;
           }

            c = new int[x.length + 1][y.length + 1];
            b = new char[x.length + 1][y.length + 1];

            for (int i = 1; i <= x.length; i++) {
                c[i][0] = 0;
            }

            for (int j = 1; j <= y.length; j++) {
                c[0][j] = 0;
            }

            for (int i = 1; i <= x.length; i++) {
                for (int j = 1; j <= y.length; j++) {
                    if (x[i - 1] == y[j - 1]) {
                        c[i][j] = c[i - 1][j - 1] + 1;
                        b[i][j] = 'd'; // 'd' denotes diagonal arrow
                    } else if (c[i][j - 1] >= c[i - 1][j]) {
                        c[i][j] = c[i][j - 1];
                        b[i][j] = 'l'; // 'l' denotes left arrow
                    } else {
                        c[i][j] = c[i - 1][j];
                        b[i][j] = 'u'; // 'u' denotes up arrow
                    }
                }
            }

            int[] MLL = getMLL(b, x, x.length, y.length);
            System.out.print("Output from User Input is: \n");
            for (int i=0;i<MLL.length;i++){
                System.out.print(MLL[i]+" || ");

            }
            System.out.println("\n");
            for (int i=0;i<x.length;i++){
                System.out.print(x[i]);

            }
            System.out.println("\n============================\n");
            if (toggleButton1.isSelected()) {
                TableView<Connections> TableView1 = setTable();
                ObservableList<Connections> observableList1;
                List<Connections> list = new ArrayList<>();
                for (int j = 0; j < x.length; j++) {
                    ImageView lightView = new ImageView(light);
                    ImageView lightView2 = new ImageView(light2);
                    if (linearSearch(MLL, x[j])) {
                        list.add(new Connections(x[j], x[j], true, lightView));
                        lightView.setFitHeight(30);
                        lightView.setFitWidth(30);
                    }
                    else{
                        list.add(new Connections(x[j], x[j], false, lightView2));
                        lightView2.setFitWidth(30);
                        lightView2.setFitHeight(30);
                    }
                }
                observableList1 = FXCollections.observableArrayList(list);
                TableView1.setItems(observableList1);

                AnchorPane.setLeftAnchor(TableView1, 10.0);
                AnchorPane.setTopAnchor(TableView1, 0.0);
                AnchorPane.setRightAnchor(TableView1, 0.0);
                AnchorPane.setBottomAnchor(TableView1, 0.0);
                lap1.getChildren().add(TableView1);

            }else if(toggleButton2.isSelected()){
                TableView<Connections> TableView1 = setTable();
                ObservableList<Connections> observableList1;
                List<Connections> list = new ArrayList<>();
                for(int j=0;j<MLL.length;j++){
                    ImageView lightView = new ImageView(light);
                    list.add(new Connections(MLL[j], MLL[j], true, lightView));
                    lightView.setFitHeight(30);
                    lightView.setFitWidth(30);
                }
                observableList1 = FXCollections.observableArrayList(list);
                TableView1.setItems(observableList1);

                AnchorPane.setLeftAnchor(TableView1, 10.0);
                AnchorPane.setTopAnchor(TableView1, 0.0);
                AnchorPane.setRightAnchor(TableView1, 0.0);
                AnchorPane.setBottomAnchor(TableView1, 0.0);
                lap1.getChildren().add(TableView1);
            }
            String s2 = MLL.length + "";
            String ledsnum=x.length+"";
            textField.setText("Leds Number:"+ ledsnum + " ||" + " Leds Lighted " + s2);
            s.close();
        });
        s.setTitle("User Input Window");
        s.getIcons().add(icon);


        //=======================Random=============================//
        Stage s2 = new Stage();
        s2.setTitle("Random Input Window");
        s2.getIcons().add(icon);

        GridPane gridPane2 = new GridPane();
        BorderPane borderPane3 = new BorderPane();
        gridPane2.setAlignment(Pos.CENTER);
        borderPane3.setCenter(gridPane2);
        Scene randscene = new Scene(borderPane3, 500, 400);
        borderPane3.setBackground(new Background(new BackgroundFill(Color.LIGHTGOLDENRODYELLOW, new CornerRadii(0), Insets.EMPTY)));
        Label randLabel = new Label("Enter The Rang of numbers and they will be generated");
        randLabel.setStyle(LabelStyle);
        TextField randText = new TextField();
        TextField randText2 = new TextField();
        randText.setPromptText("Minimum Value");
        randText2.setPromptText("Maximum Value");
        TextArea randTextArea = new TextArea();
        randTextArea.setPrefSize(200, 150);
        Button rButton= new Button("print");
        Button randButton = new Button("Calculate");
        randButton.setStyle(btnStyle);
        gridPane2.add(randLabel, 1, 0);
        gridPane2.add(randText, 1, 1);
        gridPane2.add(randText2, 1, 2);
        gridPane2.add(rButton, 1, 3);
        gridPane2.add(randTextArea, 1, 4);
        gridPane2.add(randButton, 1, 5);

        r.setOnAction(e->{
            s2.setScene(randscene);
            s2.show();
        });

        rButton.setOnAction(e->{
            String randomString="";
            int[] randomArray = generateRandomArray(Integer.parseInt(randText.getText()),Integer.parseInt(randText2.getText()));
            for (int i=0;i<randomArray.length;i++){
                randomString += randomArray[i]+",";
            }
            randTextArea.setText(randomString);
        });

        randButton.setOnAction(e->{
            String text = randTextArea.getText();
            int[] x = ReadInputData(text);
            int []y = new int[x.length];

            int minInedx = findMinElement(x);
            int maxIndex=findMaxElement(x);
            int count=0;
            while (minInedx<maxIndex){
                y[count]=minInedx;
                count++;
                minInedx++;
            }

            c = new int[x.length + 1][y.length + 1];
            b = new char[x.length + 1][y.length + 1];

            for (int i = 1; i <= x.length; i++) {
                c[i][0] = 0;
            }

            for (int j = 1; j <= y.length; j++) {
                c[0][j] = 0;
            }

            for (int i = 1; i <= x.length; i++) {
                for (int j = 1; j <= y.length; j++) {
                    if (x[i - 1] == y[j - 1]) {
                        c[i][j] = c[i - 1][j - 1] + 1;
                        b[i][j] = 'd'; // 'd' denotes diagonal arrow
                    } else if (c[i][j - 1] >= c[i - 1][j]) {
                        c[i][j] = c[i][j - 1];
                        b[i][j] = 'l'; // 'l' denotes left arrow
                    } else {
                        c[i][j] = c[i - 1][j];
                        b[i][j] = 'u'; // 'u' denotes up arrow
                    }
                }
            }

            int[] MLL = getMLL(b, x, x.length, y.length);
            System.out.print("Output from Random Data is: \n");
            for (int i=0;i<MLL.length;i++){
                System.out.print(MLL[i] +" || ");
            }
            System.out.println("\n============================\n");
            if (toggleButton1.isSelected()) {
                TableView<Connections> TableView2 = setTable();
                ObservableList<Connections> observableList2;
                List<Connections> list2 = new ArrayList<>();
                for (int j = 0; j < x.length; j++) {
                    ImageView lightView = new ImageView(light);
                    ImageView lightView2 = new ImageView(light2);
                    if (linearSearch(MLL, x[j])) {
                        list2.add(new Connections(x[j], x[j], true, lightView));
                        lightView.setFitWidth(30);
                        lightView.setFitHeight(30);
                    }else{
                        list2.add(new Connections(x[j], x[j], false, lightView2));
                        lightView2.setFitHeight(30);
                        lightView2.setFitWidth(30);
                    }
                }
                observableList2 = FXCollections.observableArrayList(list2);
                TableView2.setItems(observableList2);

                AnchorPane.setLeftAnchor(TableView2, 10.0);
                AnchorPane.setTopAnchor(TableView2, 0.0);
                AnchorPane.setRightAnchor(TableView2, 0.0);
                AnchorPane.setBottomAnchor(TableView2, 0.0);
                lap1.getChildren().add(TableView2);

            }else if(toggleButton2.isSelected()){
                TableView<Connections> TableView2 = setTable();
                ObservableList<Connections> observableList2;
                List<Connections> list2 = new ArrayList<>();
                for(int j=0;j<MLL.length;j++){
                    ImageView lightView = new ImageView(light);
                    list2.add(new Connections(MLL[j], MLL[j], true, lightView));
                    lightView.setFitWidth(30);
                    lightView.setFitHeight(30);
                }
                observableList2 = FXCollections.observableArrayList(list2);
                TableView2.setItems(observableList2);

                AnchorPane.setLeftAnchor(TableView2, 10.0);
                AnchorPane.setTopAnchor(TableView2, 0.0);
                AnchorPane.setRightAnchor(TableView2, 0.0);
                AnchorPane.setBottomAnchor(TableView2, 0.0);
                lap1.getChildren().add(TableView2);
            }
            String random = MLL.length + "";
            String ledsnum=x.length+"";
            textField.setText("Leds Number:"+ ledsnum + " ||" + " Leds Lighted " + random);
            s2.close();
        });



        //=======================Display DP Scene=========================//
        GridPane gridPane = new GridPane();
        BorderPane borderPane1 = new BorderPane();
        gridPane.setAlignment(Pos.CENTER);
        borderPane1.setCenter(gridPane);
        Scene scene1 = new Scene(borderPane1, 1100, 650);
        borderPane1.setBackground(new Background(new BackgroundFill(Color.LIGHTGOLDENRODYELLOW, new CornerRadii(0), Insets.EMPTY)));
        Label DPLabel = new Label("This is The DP Table ");
        DPLabel.setStyle("-fx-font-size: 18; -fx-font-weight: bold;");
        TextArea textArea = new TextArea();
        textArea.setPrefSize(500, 400);
        Button DPButton = new Button("Back");
        DPButton.setStyle(btnStyle);
        DPButton.setOnAction(e -> stage.setScene(zaid));
        gridPane.add(DPLabel, 1, 0);
        gridPane.add(textArea, 1, 1);
        gridPane.add(DPButton, 1, 2);

        //dp Button which opens new stage that shows dp table
        dp.setOnAction(e -> {
            stage.setScene(scene1);
            String str= "";
            String str2= "";
            String str3="";
            for (int i=0;i<c.length;i++){
                str= str + "\n";
                for (int j=0;j<c[i].length;j++){
                    str= str+ "\t" + c[i][j];
                }
            }
            for (int i=0;i<b.length;i++){
                str2= str2 +"\n";
                for (int j=0;j<b[i].length;j++){
                    str2= str2 + "\t" + b[i][j]+" ";
                }
            }
            str3 = str + str2;
            textArea.setText(str3);
        });


        stage.setScene(scene);
        stage.show();
    }


    //Add Effects to the Buttons
    public void dropShadwo(Button btn) {
        // Add an effect to the button
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setRadius(10);
        dropShadow.setColor(Color.rgb(0, 0, 0, 0.5));
        // Set the effect to the button
        btn.setEffect(dropShadow);
        // Increase the opacity of the shadow when the mouse is over the button
        btn.addEventHandler(MouseEvent.MOUSE_ENTERED, event -> dropShadow.setColor(Color.rgb(0, 0, 0, 1)));
        // Decrease the opacity of the shadow when the mouse is not over the button
        btn.addEventHandler(MouseEvent.MOUSE_EXITED, event -> dropShadow.setColor(Color.rgb(0, 0, 0, 0.5)));
    }

    // Read Data from file which is chosen by user using FileChooser
    public int[] ReadData(File filename) {
        int[] arr = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename.getPath()))) {
            String line = reader.readLine();
            if (line != null) {
                // Assuming the data is a comma-separated string, split it into an array of strings
                String[] dataArray = line.split(",");

                // Convert the array of strings to an array of integers
                arr = Arrays.stream(dataArray).mapToInt(Integer::parseInt).toArray();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr;
    }
    private int[] ReadInputData(String text) {
        String[] tokens = text.split(",");
        int[] array = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            array[i] = Integer.parseInt(tokens[i].trim());
        }

        return array;
    }

    //return an array holds the leds number which satisfy the maximum led lightning algorithm
    public int[] getMLL(char[][] b, int[] x, int i, int j) {
        List<Integer> mllList = new ArrayList<>();

        while (i > 0 && j > 0) {
            if (b[i][j] == 'd') {
                mllList.add(x[i - 1]);
                i--;
                j--;
            } else if (b[i][j] == 'l') {
                j--;
            } else {
                i--;
            }
        }

        // Convert the list to an array
        int[] resArray = new int[mllList.size()];
        for (int k = 0; k < mllList.size(); k++) {
            resArray[k] = mllList.get(mllList.size() - k - 1);
        }

        return resArray;
    }

    //Creat table view with 4 columns specified below
    public TableView<Connections> setTable(){
        TableView<Connections> TableView = new TableView<>();

        TableColumn<Connections, Integer> ledNumberColumn = new TableColumn<>("LED Number");
        ledNumberColumn.setCellValueFactory(new PropertyValueFactory<>("ledNum"));

        TableColumn<Connections, Integer> powerSupplyNumberColumn = new TableColumn<>("Power Supply Number");
        powerSupplyNumberColumn.setCellValueFactory(new PropertyValueFactory<>("powerNum"));

        TableColumn<Connections, Boolean> connectedColumn = new TableColumn<>("Connected");
        connectedColumn.setCellValueFactory(new PropertyValueFactory<>("connected"));

        TableColumn<Connections, ImageView> light = new TableColumn<>("Image");
        light.setCellValueFactory(new PropertyValueFactory<>("imageView"));

        TableView.getColumns().addAll(ledNumberColumn, powerSupplyNumberColumn, connectedColumn, light);
        ledNumberColumn.setPrefWidth(200); // Adjust the width as needed
        powerSupplyNumberColumn.setPrefWidth(200); // Adjust the width as needed
        connectedColumn.setPrefWidth(200); // Adjust the width as needed
        light.setPrefWidth(200); // Adjust the width as needed

        return TableView;

    }
    //Generate random array with the min and max value entered from user, and all the values between them are autogenerated randomly without reception
    public static int[] generateRandomArray(int minValue, int maxValue) {
        if (maxValue < minValue) {
            throw new IllegalArgumentException("maxValue must be greater than or equal to minValue");
        }

        int arraySize = maxValue - minValue + 1;
        int[] randomArray = new int[arraySize];

        // Fill the array with consecutive values from minValue to maxValue
        for (int i = 0; i < arraySize; i++) {
            randomArray[i] = minValue + i;
        }

        // Shuffle the array to get random order
        Random rand = new Random();
        for (int i = arraySize - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            // Swap random index with the current element
            int temp = randomArray[index];
            randomArray[index] = randomArray[i];
            randomArray[i] = temp;
        }

        return randomArray;
    }
    //Linear Search is used to determine the data entered to the observable list, if the target variable is found in the array MLL which is the
    //result leds lighted then specific data is inserted to the observable list
        public static boolean linearSearch(int[] arr, int target) {
            for (int element : arr) {
                if (element == target) {
                    return true;
                }
            }
            return false;
        }
    //To Find the initial value of the array "First Index", saved from file, user input data and Random
    public static int findMinElement(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
//To Find the Final value of the array "Last Index", saved from file, user input data and Random
    public static int findMaxElement(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
    public int[] removeDuplicates(int[] inputArray) {
        Set<Integer> set = new HashSet<>();

        // Adding elements to the set will remove duplicates
        for (int number : inputArray) {
            set.add(number);
        }

        // Converting the set back to an array
        int[] resultArray = new int[set.size()];
        int i = 0;
        for (int number : set) {
            resultArray[i++] = number;
        }

        return resultArray;
    }



    public static void main(String[] args) {
        launch();
    }
}