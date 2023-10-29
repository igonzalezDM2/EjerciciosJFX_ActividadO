package com.takumi.productolabelwidget;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class ProductoLabel extends GridPane {
	@FXML
	protected Label nombreProductoLabel;
	@FXML
	protected Label stockProductoLabel;
	@FXML
	private ImageView imagenProductoImageView;

	public ProductoLabel() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/takumi/productolabelwidget/fxml/ProductoLabel.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		try {
			fxmlLoader.load();
			this.getStylesheets().add(getClass().getResource("styles/estilos.css").toExternalForm());
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}

	public void setStock(double cantidad) {
		String style;
		if (cantidad > 100) {
			style = "verde";
		} else if (cantidad > 20) {
			style = "azul";
		} else {
			style = "rojo";
		}
		stockProductoLabel.setText(cantidad + "");
		this.getStyleClass().clear();
		this.getStyleClass().add(style);
	}

	public void setImage(Image imagen) {
		imagenProductoImageView.setImage(imagen);
	}

	public void setName(String nombre) {
		nombreProductoLabel.setText(nombre + "");
	}
}
