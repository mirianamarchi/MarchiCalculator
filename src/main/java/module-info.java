module it.mirianamarchi.marchicalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.mirianamarchi.marchicalculator to javafx.fxml;
    exports it.mirianamarchi.marchicalculator;
}