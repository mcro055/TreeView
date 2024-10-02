package com.example.ejemplo;

import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class HelloController {

    @FXML
    private TreeView<String> treeView;

    @FXML
    public void initialize() {
        TreeItem<String> rootItem = new TreeItem<>("Deportes");
        rootItem.setExpanded(true);

        TreeItem<String> soccerItem = new TreeItem<>("Fútbol");
        TreeItem<String> basketballItem = new TreeItem<>("Baloncesto");

        TreeItem<String> realMadridItem = new TreeItem<>("Real Madrid");
        TreeItem<String> barcelonaItem = new TreeItem<>("FC Barcelona");
        soccerItem.getChildren().addAll(realMadridItem, barcelonaItem);

        TreeItem<String> lakersItem = new TreeItem<>("Los Angeles Lakers");
        TreeItem<String> bullsItem = new TreeItem<>("Chicago Bulls");

        basketballItem.getChildren().addAll(lakersItem, bullsItem);
        rootItem.getChildren().addAll(soccerItem, basketballItem);

        treeView.setRoot(rootItem);
    }
}