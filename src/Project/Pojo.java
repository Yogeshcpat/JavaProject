package Project;

public class Pojo {

	int Id;

	String Assignee_name;

	String Reporter;

	String Heading;

	String Status;

	public Pojo(int id, String assignee_name, String reporter, String heading, String status) {

		super();
		Id = id;
		Assignee_name = assignee_name;
		Reporter = reporter;
		Heading = heading;
		Status = status;
	}

	public Pojo() {
		// super();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getAssignee_name() {
		return Assignee_name;
	}

	public void setAssignee_name(String assignee_name) {
		Assignee_name = assignee_name;
	}

	public String getReporter() {
		return Reporter;
	}

	public void setReporter(String reporter) {
		Reporter = reporter;
	}

	public String getHeading() {
		return Heading;
	}

	public void setHeading(String heading) {
		Heading = heading;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

}
