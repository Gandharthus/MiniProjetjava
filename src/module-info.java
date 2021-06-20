module MiniProjetJava {
	requires javafx.controls;
	requires java.sql;
	requires javafx.fxml;
	
	
	
	opens controller to javafx.fxml;
	opens entities to java.sql,java.util,java.time;
	opens application to javafx.graphics, javafx.fxml;
}
