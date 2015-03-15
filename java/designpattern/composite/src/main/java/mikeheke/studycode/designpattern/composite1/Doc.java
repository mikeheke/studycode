package mikeheke.studycode.designpattern.composite1;

public class Doc extends Component {

	public Doc(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		System.out.println("leaf can't add component!");
	}

	@Override
	public void remove(Component c) {
		System.out.println("leaf can't remove componet!");
	}

	@Override
	public void display(int depth) {
		System.out.println(this.getDepthStr(depth)+name);
	}

	public static void main(String[] args) {
		System.out.println(
		new Doc("haha").getDepthStr(5));
	}
}
