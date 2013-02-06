package gallery.java;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JEditorPane;

public class PictureView extends Container {
	
	private JEditorPane pane;
	private GalleryControlButton prevButton;
	private GalleryControlButton nextButton;
	private PictureGallery gallery;

	public PictureView(final PictureGallery gallery) {
		pane=new JEditorPane();
		pane.setContentType("text/html");
		
		this.gallery=gallery;
		
		prevButton=new PreviousPictureButton("<< Previous Picture",gallery);
		nextButton=new NextPictureButton("Next Picture >>",gallery);
		
		Container c=new Container();
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		c.add(prevButton);
		c.add(nextButton);
		
		setLayout(new BorderLayout());
		add(pane,BorderLayout.CENTER);
		add(c,BorderLayout.SOUTH);
	}

	public void showPicture(Picture picture) {
		if(picture!=null){
			pane.setText("<table width=100% height=100% border=0><tr>" +
					"<td align=center valign=middle><img src=\"file:///"+picture.getPath()+
					"\" width=800 height=600 >" +
					"</td></tr><tr><td align=center valign=top><font face=verdana size=4>"+picture.getName()+
					"</td></tr></table>");
		}
	}

}
