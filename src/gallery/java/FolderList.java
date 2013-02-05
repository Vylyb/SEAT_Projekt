package gallery.java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.JScrollPane;

public class FolderList extends Container {

	private PictureGallery gallery;
	private Container content;
	private JScrollPane scrollpane;
	private int index;
	private int countThumbs;

	public FolderList(PictureGallery gallery) {
		this.gallery=gallery;
		
		setLayout(new BorderLayout());
		
		content=new Container();
		content.setBackground(Color.BLACK);
		content.setLayout(new GridLayout(0, 1));
		
		add(new JScrollPane(content),BorderLayout.CENTER);
	}
	
	public void addPicture(Picture picture){
	}
	
	public void setIndex(int index) {
		this.index = index;
	}

	public void addFolder(File folder) {
		if(folder.isDirectory()){
			
			content.removeAll();
			
			int i=0;
			for(File file:folder.listFiles()){
				try {
					content.add(new ThumbNail(new Picture(file),i++));
				} catch (InvalidFileException e) {
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			countThumbs=i+1;
		}
	}

	public Picture getPreviousPicture() {
		index--;
		if(index<0)
			index=countThumbs-2;
		
		return pictureAtIndex();
	}

	private Picture pictureAtIndex() {
		System.out.println("@"+index);
		for(Component c:content.getComponents())
		{
			if(c instanceof ThumbNail)
			{
				if(((ThumbNail)c).getIndex()==index)
				{
					return ((ThumbNail)c).getPicture();
				}
			}
		}
		
		return null;
	}

	public Picture getNextPicture() {
		index++;
		if(index>=countThumbs-1)
			index=0;
		
		return pictureAtIndex();
	}

}
