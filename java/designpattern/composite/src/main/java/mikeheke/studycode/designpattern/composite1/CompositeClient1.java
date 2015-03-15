package mikeheke.studycode.designpattern.composite1;

public class CompositeClient1 {

	public static void main(String[] args) {

		Files rootFiles = new Files("根目录");
		rootFiles.add(new Doc("根目录下的文件AA"));
		rootFiles.add(new Doc("根目录下的文件FC")); 
		
		Files comp = new Files("根目录下的文件夹FA");
		comp.add(new Doc("文件夹FA下的文件KL"));
		comp.add(new Doc("文件夹FA下的文件DL"));
		
		rootFiles.add(comp);
		
		rootFiles.display(2);
	}

}
