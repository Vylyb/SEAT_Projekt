package gallery.java;

import java.io.File;

public class Picture {

	private String path;
	private String description;
	private String name;
	
	public Picture(File imageFile) 
			throws Exception {
		checkFileType(imageFile);
		path=imageFile.getAbsolutePath();
		path=path.replace("\\", "/");
		name=imageFile.getName();
	}

	private void checkFileType(File imageFile) 
			throws InvalidFileException {
		boolean valid=false;
		for(String type:PictureGallery.filetypes){
			if(imageFile.getName().toLowerCase().endsWith(("."+type).toLowerCase())){
				valid=true;
			}
		}
		if(!valid){
			throw new InvalidFileException(imageFile.getAbsolutePath());
		}
	}

	public String getDescription() {
		return description;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPath() {
		return path;
	}

}
