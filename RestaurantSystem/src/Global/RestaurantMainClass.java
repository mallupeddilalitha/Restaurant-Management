package Global;


import Functionality.FoodMain;


public class RestaurantMainClass extends FoodMain {
	
	public static void main(String[] args) throws Exception {
		System.out.println("-----------Welcome to Best Biryani restaurant!-----------");
	
			WaiterLogin waiter = new WaiterLogin();
			
			waiter.login();
		

		}
	}


