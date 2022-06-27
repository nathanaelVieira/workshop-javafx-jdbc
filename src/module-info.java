module workshop {
	requires javafx.controls;
	requires javafx.fxml;

//	add modularização
	opens application to javafx.graphics, javafx.fxml;
	opens gui to javafx.graphics, javafx.fxml;
}
