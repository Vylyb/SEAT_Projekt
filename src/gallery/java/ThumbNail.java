package gallery.java;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JEditorPane;

public class ThumbNail extends JEditorPane implements MouseListener{

	private Picture picture;
	private int index;

	public ThumbNail(Picture picture, int index) {
		this.picture=picture;
		this.index=index;

		setContentType("text/html");
		setEditable(false);

		if(picture!=null){
			//			setText("<table width=100% height=100% border=0><tr>" +
			//					"<td align=center valign=middle><img src=\"file:///"+picture.getPath()+
			//					"\" width=100 height=100 >" +
			//					"</td></tr><tr><td align=center valign=top>"+picture.getName()+
			//					"</td></tr></table>");
			setText("<font face=verdana size=3>"+picture.getName());
		}

		addMouseListener(this);
	}

	public int getIndex() {
		return index;
	}

	@Override
	public String toString() {
		return picture.getName();
	}

	public Picture getPicture() {
		return picture;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		PictureGallery.showPicture(picture);
		PictureGallery.setImageIndex(index);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		setBackground(Color.LIGHT_GRAY);
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		setBackground(Color.WHITE);
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
