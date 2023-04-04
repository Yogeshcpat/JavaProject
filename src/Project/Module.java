package Project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Module {

	public static void sigle_ticket(Scanner in, ArrayList<Pojo> arraylist) {

		System.out.println("enter id no:");

		int id = in.nextInt();

		Iterator<Pojo> itr = arraylist.iterator();

		Pojo P = null;

		while (itr.hasNext()) {

			P = itr.next();

			if (P.getId() == id) {

				System.err.println("Id=" + P.getId() + " " + "Assignee_name=" + P.getAssignee_name() + " "
						+ "Reopter_name=" + P.getReporter() + " " + "Heading=" + P.getHeading() + " " + "Status="
						+ P.getStatus());
				break;
			}
		}
	}

	public static void all_sorted_id(Scanner in, ArrayList<Pojo> arraylist) {

		// Collections.sort((List<T>) new Home());
		Iterator<Pojo> itr = arraylist.iterator();
		Pojo P = null;
		while (itr.hasNext()) {
			P = itr.next();
			System.err.println("Id=" + P.getId());
		}
	}

	public static void all_name(Scanner in, ArrayList<Pojo> arraylist) {

		Iterator<Pojo> itr = arraylist.iterator();
		Pojo P = null;
		while (itr.hasNext()) {
			P = itr.next();
			System.err.println("Assignee_name=" + P.getAssignee_name());
		}
	}

	public static void all_Heading(Scanner in, ArrayList<Pojo> arraylist) {

		Iterator<Pojo> itr = arraylist.iterator();
		Pojo P = null;
		while (itr.hasNext()) {
			P = itr.next();
			System.err.println("Assignee_Heading=" + P.getHeading());
		}
	}

	public static void all_Status(Scanner in, ArrayList<Pojo> arraylist) {

		Iterator<Pojo> itr = arraylist.iterator();
		Pojo P = null;
		while (itr.hasNext()) {
			P = itr.next();
			System.err.println("Assignee_Status=" + P.getStatus());
		}
	}

	public static void chage_Assignee_name(Scanner in, ArrayList<Pojo> arraylist) {
		System.out.println("enter Id_no;");
		int i = in.nextInt();

		System.out.println("enter new Assignee name:");
		String sg = in.next();

		Iterator<Pojo> itr = arraylist.iterator();
		Pojo P = null;
		while (itr.hasNext()) {
			P = itr.next();
			if (P.getId() == i) {
				P.setAssignee_name(sg);

				System.err.println("Assignee_name=" + P.getAssignee_name());
				break;
			}
		}
	}
	// System.err.println("Name change sucessfully");

	public static void change_Heading(Scanner in, ArrayList<Pojo> arraylist) {
		System.out.println("enter Id_no;");
		int j = in.nextInt();

		System.out.println("enter new Heading:");
		String sg = in.next();

		Iterator<Pojo> itr = arraylist.iterator();
		Pojo P = null;
		while (itr.hasNext()) {
			P = itr.next();
			if (P.getId() == j) {
				P.setHeading(sg);
				System.err.println("Heading=" + P.getHeading());
				break;
			}
		}
	}

	public static void change_Status(Scanner in, ArrayList<Pojo> arraylist) {

		System.out.println("enter Id_no;");
		int k = in.nextInt();

		System.out.println("enter new Status:");
		String sg = in.next();

		Iterator<Pojo> itr = arraylist.iterator();

		Pojo P = null;

		while (itr.hasNext()) {

			P = itr.next();

			if (P.getId() == k)

				P.setStatus(sg);

			System.err.println("Status=" + P.getStatus());
			break;
		}
	}

	public static void delete_single_ticket(Scanner in, ArrayList<Pojo> arraylist) {
		System.out.println("enter the Id_no to Delete:");
		int d = in.nextInt();
		Iterator<Pojo> d1 = arraylist.iterator();
		Pojo P = null;
		while (d1.hasNext()) {
			P = d1.next();
			if (P.getId() == d) {
				d1.remove();
				System.err.println("Deleted Successfully");
				break;
			}
		}
	}

	public static void delete_all_ticket(Scanner in, ArrayList<Pojo> arraylist) {
		Iterator<Pojo> itr = arraylist.iterator();
		Pojo o = null;
		while (itr.hasNext()) {
			o = itr.next();
			itr.remove();
			System.err.println("All Ticket Deleted Successfully");
		}
	}
}
