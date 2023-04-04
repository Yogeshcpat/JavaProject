package Project;

import java.util.Comparator;

public class Home implements Comparator<Pojo> {

	Pojo p1;
	Pojo p2;

	public Home() {
		// super();
		// TODO Auto-generated constructor stub
	}

	public Home(Pojo p1, Pojo p2) {
		// super();
		this.p1 = p1;
		this.p2 = p2;
	}

	@Override
	public int compare(Pojo o1, Pojo o2) {
		// TODO Auto-generated method stub
		if (o1.getId() > o2.getId())
			return 1;
		else if (o1.getId() == o2.getId())
			return 0;
		else
			return -1;
	}

	public static void deleteById(int id) {
		// TODO Auto-generated method stub

	}

}
