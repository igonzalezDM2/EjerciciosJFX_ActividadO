module Takumi {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens com.takumi.productolabelwidget to javafx.graphics, javafx.fxml;
	exports com.takumi.productolabelwidget;
}
