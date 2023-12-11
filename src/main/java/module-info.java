module es.ieslosmontecillos.micontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.micontrol to javafx.fxml;
    exports es.ieslosmontecillos.micontrol;
}