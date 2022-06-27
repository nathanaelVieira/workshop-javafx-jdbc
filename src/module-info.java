module workshop {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;

//	add modularização
	opens application to javafx.graphics, javafx.fxml;
	opens gui to javafx.graphics, javafx.fxml;
}
