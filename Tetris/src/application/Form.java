package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Form {
	Rectangle a;
	Rectangle b;
	Rectangle c;
	Rectangle d;
	Color color;
	private String name;
	public int form = 1;

	public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d, String name) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.name = name;

		switch (name) {
		case "j" -> color = Color.DARKCYAN;
		case "l" -> color = Color.GOLD;
		case "o" -> color = Color.ROYALBLUE;
		case "s" -> color = Color.GREENYELLOW;
		case "t" -> color = Color.GREY;
		case "z" -> color = Color.PEACHPUFF;
		case "i" -> color = Color.DARKTURQUOISE;

		}
		this.a.setFill(color);
		this.b.setFill(color);
		this.c.setFill(color);
		this.d.setFill(color);
	}


	public String getName() {
		return name;
	}


	public void changeForm() {
		if (form != 4) {
			form++;
		} else {
			form = 1;
		}
	}
}