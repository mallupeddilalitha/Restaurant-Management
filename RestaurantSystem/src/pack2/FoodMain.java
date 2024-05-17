package pack2;

import java.io.BufferedWriter;

import java.io.FileWriter;

import java.util.Scanner;

import pack1.Variables;

public class FoodMain implements Login

{

	Scanner sc = new Scanner(System.in);

	protected Variables v = new Variables();

	int index[] = new int[20];

	int no[] = new int[20];

	@Override

	public void contact()

	{

		System.out.print("Enter your name: ");

		sc.nextLine();

		v.setUname(sc.nextLine());

		System.out.print("Enter your address: ");

		v.setUadd(sc.nextLine());

		while (true)

		{

			System.out.print("Enter your contact no: ");

			v.setUmNo(sc.nextLine());

			if (v.getUmNo().length() == 10)

				break;

			else

				System.out.println("\nInvalid mobile number \nPlease enter 10-digit number.");

		}

	}

	@Override

	public void login()

	{

		System.out.println("---------------------------------------------------");

		System.out.println("--------------------- MAIN MENU -------------------");

		System.out.println("---------------------------------------------------");

	}

	void billData() throws Exception // Entering Data in the Restaurant_Data.txt file.

	{

		BufferedWriter bfw = new BufferedWriter(new FileWriter("C:\\Java\\Restaurant_Data.txt", true));

		bfw.write("\n-------------------------\n");

		bfw.write("Date: " + v.formattedDateTime);

		bfw.write("\n-------------------------\n");

		bfw.write("Name: " + v.getUname() + "\n");

		bfw.write("Address: " + v.getUadd() + "\n");

		bfw.write("Phone No: " + v.getUmNo() + "\n");

		bfw.write("Total Bill: " + v.getUpdateBill_v());

		bfw.write("\n-------------------------\n");

		bfw.close();

	}


   

	public void mainMenu() throws Exception

	{

		System.out.println("| 1.VEG |");

		System.out.println("| 2.NON-VEG |");

		System.out.println("| 3.Drinks |");

		System.out.println("---------------------------------------------------");

		System.out.println("Please choose your option:");

		do

		{

			switch (sc.nextInt())

			{

			case 1:

				menu(); // VEG

				v.setValidCode(true);

				break;

			case 2:

				menu(0); // NON-VEG

				v.setValidCode(true);

				break;

			case 3:

				menu("Java is Awesome"); // Drinks

				v.setValidCode(true);

				break;

			default:

				System.out.println("Invalid Code. \nPlease choose valid code: ");

			}

		} while (!v.isValidCode());

	}

	void menu() throws Exception // veg

	{

		System.out.println("---------------------------------------------------");

		System.out.println("--------------------- VEG MENU -------------------");

		System.out.println("---------------------------------------------------");

		System.out.println("| Code Items Price |");

		System.out.println("| 1. VEG BIRIYANI - 180 |");

		System.out.println("| 2. PANEER BIRIYANI - 200 |");

		System.out.println("| 3. PANEER SPL BIRIYANI - 250 |");

		System.out.println("| 4. KAJU PANEER BIRIYANI - 300 |");

		System.out.println("| 5. MUSHROOM BIRIYANI - 180 |");

		System.out.println("---------------------------------------------------");

		System.out.println("Please choose your biriyani code:");

		while (!v.isValidCode())

		{

			v.setOption(sc.nextInt());

			switch (v.getOption())

			{

			case 1:

				System.out.println("How many plates you want to order:");

				v.setN_plates(sc.nextInt());

				bill(180, v.getN_plates());

				v.setValidCode(true);

				break;

			case 2:

				System.out.println("How many plates you want to order:");

				v.setN_plates(sc.nextInt());

				bill(200, v.getN_plates());

				v.setValidCode(true);

				break;

			case 3:

				System.out.println("How many plates you want to order:");

				v.setN_plates(sc.nextInt());

				bill(250, v.getN_plates());

				v.setValidCode(true);

				break;

			case 4:

				System.out.println("How many plates you want to order:");

				v.setN_plates(sc.nextInt());

				bill(300, v.getN_plates());

				v.setValidCode(true);

				break;

			case 5:

				System.out.println("How many plates you want to order:");

				v.setN_plates(sc.nextInt());

				bill(180, v.getN_plates());

				v.setValidCode(true);

				break;

			default:

				System.out.println("Invalid Code. \nPlease choose valid code: ");

			}

		}

	}

	void menu(int a) throws Exception // Non-veg

	{

		System.out.println("----------------------------------------------------");

		System.out.println("------------------ NON-VEG MENU --------------------");

		System.out.println("----------------------------------------------------");

		System.out.println("| Code \t Items \t Price |");

		System.out.println("| 6. HYDERABAD SPL BIRIYANI - 250 |");

		System.out.println("| 7. CHICKEN 65 BIRIYANI - 320 |");

		System.out.println("| 8. SPL DUM BIRIYANI - 280 |");

		System.out.println("| 9. MUTTON BIRIYANI - 350 |");

		System.out.println("| 10. CHICKEN MUGHLAI BIRIYANI - 320 |");

		System.out.println("----------------------------------------------------");

		System.out.println("Please choose your biriyani code:");

		while (!v.isValidCode())

		{

			v.setOption(sc.nextInt());

			switch (v.getOption())

			{

			case 6:

				System.out.println("How many plates you want to order:");

				v.setN_plates(sc.nextInt());

				bill(250, v.getN_plates());

				v.setValidCode(true);

				break;

			case 7:

				System.out.println("How many plates you want to order:");

				v.setN_plates(sc.nextInt());

				bill(320, v.getN_plates());

				v.setValidCode(true);

				break;

			case 8:

				System.out.println("How many plates you want to order:");

				v.setN_plates(sc.nextInt());

				bill(280, v.getN_plates());

				v.setValidCode(true);

				break;

			case 9:

				System.out.println("How many plates you want to order:");

				v.setN_plates(sc.nextInt());

				bill(350, v.getN_plates());

				v.setValidCode(true);

				break;

			case 10:

				System.out.println("How many plates you want to order:");

				v.setN_plates(sc.nextInt());

				bill(320, v.getN_plates());

				v.setValidCode(true);

				break;

			default:

				System.out.println("Invalid Code. \nPlease choose valid code: ");

			}

		}

	}

	void menu(String s) throws Exception // Drinks

	{

		System.out.println("----------------------------------------------------");

		System.out.println("---------------------- Drinks ----------------------");

		System.out.println("----------------------------------------------------");

		System.out.println("| Code Items Price |");

		System.out.println("| 11. SPRITE - 50 |");

		System.out.println("| 12. THUMS UP - 60 |");

		System.out.println("| 13. COCO-COLA - 60 |");

		System.out.println("| 14. MAAZA - 45 |");

		System.out.println("| 15. WATER BOTTLE - 20 |");

		System.out.println("----------------------------------------------------");

		System.out.println("Please choose your Drink code:");

		while (!v.isValidCode())

		{

			v.setOption(sc.nextInt());

			switch (v.getOption())

			{

			case 11:

				System.out.println("How many drinks you want to order:");

				v.setN_plates(sc.nextInt());

				bill(50, v.getN_plates());

				v.setValidCode(true);

				break;

			case 12:

				System.out.println("How many drinks you want to order:");

				v.setN_plates(sc.nextInt());

				bill(60, v.getN_plates());

				v.setValidCode(true);

				break;

			case 13:

				System.out.println("How many drinks you want to order:");

				v.setN_plates(sc.nextInt());

				bill(60, v.getN_plates());

				v.setValidCode(true);

				break;

			case 14:

				System.out.println("How many drinks you want to order:");

				v.setN_plates(sc.nextInt());

				bill(45, v.getN_plates());

				v.setValidCode(true);

				break;

			case 15:

				System.out.println("How many drinks you want to order:");

				v.setN_plates(sc.nextInt());

				bill(20, v.getN_plates());

				v.setValidCode(true);

				break;

			default:

				System.out.println("Invalid Code. \nPlease choose valid code: ");

			}

		}

	}

	public void discount()

	{

		if (v.getbill_v() >= 800) // discount got

		{

			System.out.println("Your Bill is " + v.getbill_v());

			v.setUpdateBill_v(v.getbill_v() - v.getbill_v() * 5 / 100);

			System.out.println("You got discount of Rs." + v.getbill_v() * 5 / 100 + "\nYour Total Bill is Rs."
					+ v.getUpdateBill_v());

		}

		else // discount didn't get

		{

			v.setUpdateBill_v(v.getbill_v());

			System.out.println("\nYour Total Bill is Rs." + v.getUpdateBill_v()
					+ "\nYou didn't get any discount. \nIf your Bill is Rs.800 or more than that then you will get discount.\nSo, You need to buy again Rs."
					+ (800 - v.getbill_v()) + " items.");

		}

		System.out.println(
				"-----------------------------------------------------------------------------------------------");

	}

	void bill(int p, int n) throws Exception

	{

		v.setbill_v(v.getbill_v() + p * n);

		index[v.getCount()] = v.getOption();

		no[v.getCount()] = n;

		while (!v.isValidCode())

		{

			System.out.println("Enter 1 to order anything else");

			System.out.println("Enter 2 to place the order");

			v.setOpt(sc.nextInt());

			if (v.getOpt() == 1)

			{

				v.setCount(v.getCount() + 1);

				mainMenu();

				v.setValidCode(true);

			}

			else if (v.getOpt() == 2)

			{

				discount();

				System.out.println("Enter 1 to order anything else");

				System.out.println("Enter 2 to place the order");

				v.setOpt(sc.nextInt());

				if (v.getOpt() == 1)

				{

					v.setCount(v.getCount() + 1);

					mainMenu();

					v.setValidCode(true);

				}

				else if (v.getOpt() == 2)

				{

					contact();

					System.out.println("Kindly Please wait...Your Bill is in process...");

					Thread.sleep(4000);

					System.out.println(
							"\n-----------------------------------------------------------------------------------------------");

					System.out.println(
							"\n-----------------------------------------------------------------------------------------------");

					System.out.println(
							"******************************WELCOME TO BEST BIRIYANI RESTUARANT******************************");

					System.out.println("\n |" + v.formattedDateTime + "| ");

					System.out.println(
							"-----------------------------------------------------------------------------------------------");

					Thread.sleep(3000);

					System.out.println(
							"-----------------------------------------------------------------------------------------------");

					System.out.println("sr.no |" + " Name |" + " Price |" + " Quantity |" + " Total Price |");

					System.out.println(
							"-----------------------------------------------------------------------------------------------");

					for (int i = 0; i <= v.getCount(); i++)

					{

						int price = Integer.parseInt(v.getPrice()[index[i] - 1].trim());

						int quantity = no[i];

						int result = price * quantity;

						System.out.println((i + 1) + ". " + v.getName()[index[i] - 1] + " " + v.getPrice()[index[i] - 1]
								+ " " + quantity + " " + result);

					}

					System.out.println(
							"-----------------------------------------------------------------------------------------------");

					Thread.sleep(3000);

					// Total Bill

					System.out.println(" Total= " + v.getbill_v());

					System.out.println(
							"-----------------------------------------------------------------------------------------------");

					System.out.println("Your Final Bill is Rs." + v.getUpdateBill_v());

					billData(); // Storing data in the Restaurant_Data File.

					// Payment options

					while (!v.isValidCode())

					{

						System.out.println(
								"-----------------------------------------------------------------------------------------------");

						System.out.println("\nPayment options: ");

						System.out.println("1.Credit card or Debit card");

						System.out.println("2.Cash");

						System.out.println("Choose payment option: ");

						int op = sc.nextInt();

						boolean validPan = true;

						if (op == 1)

						{

							while (validPan)

							{

								System.out.println("\nEnter your Card number");

								String cardNo_v = sc.next();

								if (cardNo_v.length() == 16) {
									System.out.println("Enter your CVV ");
									String cvvNo_v = sc.next();
									if (cvvNo_v.length() == 3) {
										System.out.println(
												"-----------------------------------------------------------------------------------------------");

										System.out.println(
												"***********************************************************************************************");

										System.out.println(
												" Your Order has been Placed!!\nYour order will be delivered within 30 minutes");

										System.out.println(
												"-----------------------------------------------------------------------------------------------");

										System.out.println(
												"***********************************************************************************************");

										System.out.println(
												"--------------------------------------ENJOY THE FOOD :)----------------------------------------");

										System.out.println(
												"***********************************************************************************************");

										System.out.println(
												"-----------------------------------------------------------------------------------------------");

										validPan = false;
									} else {
										System.out.println("you entered wrong cvv no.");
									}

								}

								else

								{

									System.out.println("\nyou entered wrong cardNo.");

								}

							}

							v.setValidCode(true);

						}

						else if (op == 2)

						{

							System.out.println(
									"-----------------------------------------------------------------------------------------------");

							System.out.println(
									"***********************************************************************************************");

							System.out.println(
									" Your Order has been Placed!!\nYour order will be delivered within 30 minutes");

							System.out.println(
									"-----------------------------------------------------------------------------------------------");

							System.out.println(
									"***********************************************************************************************");

							System.out.println(
									"--------------------------------------ENJOY THE FOOD :)----------------------------------------");

							System.out.println(
									"***********************************************************************************************");

							System.out.println(
									"-----------------------------------------------------------------------------------------------");

							v.setValidCode(true);

						}

						else

						{

							System.out
									.println("\nYou choose wrong payment mode....\nPlease choose valid payment mode\n");

							System.out.println("1.Credit card or Debit card");

							System.out.println("2.Cash");

						}

					}

				}
			}
		}
	}

	public void displayMenu() {
		// TODO Auto-generated method stub

	}

	public void addMenuItem(String newName, String newPrice) {
		// TODO Auto-generated method stub

	}

	public void removeMenuItem(String itemName) {
		// TODO Auto-generated method stub

	}

	public void updateMenuItem(String itemName, String newPrice) {
		// TODO Auto-generated method stub

	}

}
