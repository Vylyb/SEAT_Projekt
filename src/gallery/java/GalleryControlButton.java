package gallery.java;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public abstract class GalleryControlButton extends JButton implements ActionListener{

	public GalleryControlButton(String text) {
		super(text);
		addActionListener(this);
	}
}
