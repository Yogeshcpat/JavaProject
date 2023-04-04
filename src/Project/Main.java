package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static String username = "Jacksparrow";
	static String password = "Black bell";
	static Scanner in = new Scanner(System.in);
	static ArrayList<Pojo> arraylist = new ArrayList<Pojo>();

	public static void main(String args[]) {
		Pojo p = new Pojo(1, "yogi", "tamil", "login issue", "to do");
		Pojo p1 = new Pojo(2, "yogesh", "priya", "server slow", "done");
		Pojo p2 = new Pojo(3, "siva", "kumar", "user name wrong ", "testing");

		arraylist.add(p);
		arraylist.add(p1);
		arraylist.add(p2);

		System.err.println("***Welcome To Jira_Ticket***");
		while (true) {

			System.out.println("1.create ticket\r\n" + "2.view ticket\r\n" + "3.update ticket\r\n"
					+ "4.delete ticket\r\n" + "5.logout");
			System.err.println("Enter any one option:");
			int option = in.nextInt();
			switch (option) {
			case 1:
				Helper.createticket(in, arraylist);
				break;
			case 2:
				Helper.viewticket(in, arraylist);
				break;
			case 3:
				Helper.updateticket(in, arraylist);
				break;
			case 4:
				Helper.deleteticket(in, arraylist);
				break;
			case 5:
				Helper.logout(in, arraylist);
				break;

			}
		}
	}

}
