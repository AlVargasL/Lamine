module mx.edu.utez.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens mx.edu.utez.javafx to javafx.fxml;
    exports mx.edu.utez.javafx;
}