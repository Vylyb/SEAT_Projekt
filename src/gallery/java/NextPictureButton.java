package gallery.java;

import java.awt.event.ActionEvent;

public class NextPictureButton extends GalleryControlButton {

	private PictureGallery gallery;

	public NextPictureButton(String text, PictureGallery gallery) {
		super(text);
		this.gallery=gallery;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		gallery.showNextPicture();
	}

}
