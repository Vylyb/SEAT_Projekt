package gallery.java;

import java.awt.event.ActionEvent;

public class PreviousPictureButton extends GalleryControlButton {

	private PictureGallery gallery;

	public PreviousPictureButton(String text, PictureGallery gallery) {
		super(text);
		this.gallery=gallery;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		gallery.showPreviousPicture();
	}

}
