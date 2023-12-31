package com.example.fxshell.app.comboBoxes.Impl;

import com.example.fxshell.app.comboBoxes.ComboBoxTemplate;
import javafx.scene.control.ComboBox;

import java.util.List;

public class ViewComboBoxTemplate extends ComboBoxTemplate {
    @Override
    protected ComboBox<String> createBaseMenu(List<String> views) {
        ComboBox<String> viewMenu = new ComboBox<>();
        viewMenu.getItems().addAll(views);
        viewMenu.setValue(views.get(0));
        return viewMenu;
    }

    // Надаємо додаткові налаштування для меню вида
    @Override
    protected void customizeMenu(ComboBox<String> menu) {
        menu.setPromptText("Select View");
    }
}
