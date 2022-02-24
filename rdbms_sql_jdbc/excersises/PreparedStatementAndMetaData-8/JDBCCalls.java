public class JDBCCalls {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Pass some valid arguments!");
			return;
		}

		int ch = Integer.parseInt(args[0]);
		DAO dao = new DAO();

		switch (ch) {
		case 1: {
			// insert
			int rollNo = Integer.parseInt(args[1]);
			String name = args[2];
			String standard = args[3];
			String dob = args[4];
			int fee = Integer.parseInt(args[5]);

			dao.insert(rollNo, name, standard, dob, fee);
			break;
		}
		case 2: {
			// delete
			int rollNo = Integer.parseInt(args[1]);

			dao.delete(rollNo);
			break;
		}
		case 3: {
			// update
			int rollNo = Integer.parseInt(args[1]);
			int newFees = Integer.parseInt(args[2]);

			dao.update(rollNo, newFees);
			break;
		}
		case 4: {
			// display
			if (args.length == 2) {
				int rollNo = Integer.parseInt(args[1]);

				dao.display(rollNo);
			} else {
				dao.display();
			}
			break;
		}
		default:
			System.out.println("Pass valid option in arguments!");
		}
	}
}