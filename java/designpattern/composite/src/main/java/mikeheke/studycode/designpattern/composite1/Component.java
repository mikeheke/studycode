package mikeheke.studycode.designpattern.composite1;

public abstract class Component {
	
	protected String name;
	
	public Component(String name) {
		this.name = name;
	}
	
	public abstract void add(Component c);
	
	public abstract void remove(Component c);
	
	public abstract void display(int depth);

	public String getDepthStr(int depth) {
		StringBuffer depthBuf = new StringBuffer();
		for (int i=0; i<depth; i++) {
			depthBuf.append("-");
		}
		return depthBuf.toString();
	}
}
