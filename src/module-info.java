module MiniProjetJava {
	requires javafx.controls;
	requires java.sql;
	requires javafx.fxml;
	
	opens Controller to javafx.fxml;
	opens entities to java.sql,java.util;
	opens application to javafx.graphics, javafx.fxml;
}
