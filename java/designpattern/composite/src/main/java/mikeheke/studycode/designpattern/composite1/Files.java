package mikeheke.studycode.designpattern.composite1;

import java.util.ArrayList;
import java.util.List;

public class Files extends Component {
	
	private List<Component> children = new ArrayList<Component>();

	public Files(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		this.children.add(c);
	}

	@Override
	public void remove(Component c) {
		this.children.remove(c);
	}

	@Override
	public void display(int depth) {
		System.out.println(this.getDepthStr(depth)+this.name);
		
		for (Component c : children) {
			c.display(depth+2);
		}
	}

}
