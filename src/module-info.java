module MiniProjetJava {
	requires javafx.controls;
	requires java.sql;
	
	opens entities to java.sql,java.util;
	opens application to javafx.graphics, javafx.fxml;
}
