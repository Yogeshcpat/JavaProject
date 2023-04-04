package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Helper {

	public static void createticket(Scanner in, ArrayList<Pojo> arraylist) {
		System.out.println("enter new Id:");
		int Id = in.nextInt();
		System.out.println("enter new Assignee_name:");
		String Assignee_name = in.next();
		System.out.println("enter new Reporter:");
		String Reporter = in.next();
		System.out.println("enter new Heading:");
		String Heading = in.next();
		System.out.println("enter new Status:");
		String Status = in.next();
		System.err.println("***Ticket create Sucessfully***");
		Pojo p1 = new Pojo(Id, Assignee_name, Reporter, Heading, Status);
		arraylist.add(p1);
	}

	public static void viewticket(Scanner in, ArrayList<Pojo> arraylist) {
		System.out.println("choose any option from below;\r\n" + "1. sigle_ticket\r\n" + "2. all_ticket_id\r\n"
				+ "3. all_ticket_name \r\n" + "4. all_ticket_Heading \r\n" + "5. all_ticket_Status \r\n");
		int option = in.nextInt();
		switch (option) {
		case 1:
			Module.sigle_ticket(in, arraylist);
			break;
		case 2:
			Module.all_sorted_id(in, arraylist);
			break;
		case 3:
			Module.all_name(in, arraylist);
			break;
		case 4:
			Module.all_Heading(in, arraylist);
			break;
		case 5:
			Module.all_Status(in, arraylist);
			break;
		}

	}

	public static void updateticket(Scanner in, ArrayList<Pojo> arraylist) {
		System.out.println("Choose any option from below;\r\n" + "1. chage_Assignee_name\r\n" + "2. change_Heading\r\n"
				+ "3. change_Status\r\n");
		int option = in.nextInt();
		switch (option) {

		case 1:
			Module.chage_Assignee_name(in, arraylist);
			break;
		case 2:
			Module.change_Heading(in, arraylist);
			break;
		case 3:
			Module.change_Status(in, arraylist);
			break;
		}
	}

	public static void deleteticket(Scanner in, ArrayList<Pojo> arraylist) {
		System.out.println(
				"Choose any option from below;\r\n" + "1. delete_single_ticket\r\n" + "2. delete_all_ticket\r\n");

		int option = in.nextInt();
		switch (option) {

		case 1:
			Module.delete_single_ticket(in, arraylist);
			break;
		case 2:
			Module.delete_all_ticket(in, arraylist);
			break;

		}
	}

	public static void logout(Scanner in, ArrayList<Pojo> arraylist) {
		System.err.println("***Thank You for your visit***");

	}
}

//
// System.out.println("Enter the new jira id:");
// int id=in.nextInt();
// in.nextLine();
//
// System.out.println("Enter the status:");
// String status=in.nextLine();
//
// statement.setInt(2, id);
// statement.setString(1, status);
//
//
// int i=statement.executeUpdate();
// if(i >= 1)
//		System.out.println("successfully inserted details");
// else
//		System.out.println("something went wrong");
