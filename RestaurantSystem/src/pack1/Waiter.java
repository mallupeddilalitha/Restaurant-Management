package pack1;

import java.util.Scanner;

import pack2.FoodMain;

public class Waiter {

	public void login() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Waiter Login:");
		System.out.print("Username: ");
		String username = sc.nextLine();
		System.out.print("Password: ");
		String password = sc.nextLine();

		if (username.equals("waiter") && password.equals("waiter123")
				|| username.equals("waiter1") && password.equals("waiter112")
				|| username.equals("waiter3") && password.equals("waiter456")) {
			System.out.println("Waiter logged in successfully.");

		
			FoodMain aobj1 = new RestaurantMainClass();
		
			aobj1.login();
			aobj1.mainMenu();

		} else {
			System.out.println("Invalid username or password.");

		}
		sc.close();
	}


}