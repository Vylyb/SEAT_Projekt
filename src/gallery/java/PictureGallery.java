package gallery.java;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.JFrame;

public class PictureGallery extends JFrame{

	private static FolderList folderList;
	private static PictureView pictureView;
	
	public final static String[] filetypes={"jpg","png"};
	
	public static void main(String[] args) {
		(new PictureGallery(1024, 768)).setVisible(true);
	}

	public PictureGallery(int width,int height) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width, height);
		setLocation(10,10);
		setLayout(new BorderLayout());
		
		folderList=new FolderList(this);
		add(folderList,BorderLayout.WEST);
		
		pictureView=new PictureView(this);
		add(pictureView,BorderLayout.CENTER);
		
		addFolder(new File("B:/Eigene Bilder/Fotos/2012-08-02 (Przystanek Woodstock)"));
	}
	
	public void addFolder(File folder){
		folderList.addFolder(folder);
	}

	public static void showPicture(Picture picture) {
		pictureView.showPicture(picture);
	}

	public static void showNextPicture() {
		showPicture(folderList.getNextPicture());
	}

	public static void showPreviousPicture() {
		showPicture(folderList.getPreviousPicture());
	}

	public static void setImageIndex(int index) {
		folderList.setIndex(index);
	}
}
