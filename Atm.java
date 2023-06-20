import java.util.*;
class Atm{
	
	static String getname(){
		Scanner inp5 = new Scanner(System.in);
		System.out.println("enter the name of the person you want to transfer the amount");
		String nme = inp5.nextLine();
		return nme;
	}
	
	static int withdraw(int bal){
		Scanner inp4 = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw");
		int amt3 = inp4.nextInt();
		if (amt3 > 0 && amt3 <= bal){
			return amt3;
		}
		else if (amt3 < 0){
			return -1;
		}
		else{
			return 0;
		}
	}
	
	
	static int transfer(int bal){
		Scanner inp3 = new Scanner(System.in);
		System.out.println("Enter the amount to be Transfer");
		int amt2 = inp3.nextInt();
		if (amt2 > 0 && amt2 <= bal){
			return amt2;
		}
		else if (amt2 < 0){
			return -1;
		}
		else{
			return 0;
		}
	}
	
	static int deposit(){
		Scanner inp2 = new Scanner(System.in);
		System.out.println("Enter the amount to be Deposit");
		int amt = inp2.nextInt();
		if (amt > 0){
			return amt;
		}
		else{
			return 0;
		}
	}
	
	public static void main(String[] args){
		ArrayList <String> history = new ArrayList <>();
		int balance = 0;
		System.out.println("\t\t\t\t\tWelcome to our ATM");
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter user Name");
		String username = inp.nextLine();
		System.out.println("Enter Password");
		String password = inp.nextLine();
		if (username.equals("babu") && password.equals("babu@29012003")){
			System.out.println("\nLogged in Successfully\n");
			while (true){
				System.out.println("\t\t\t1. Transacation History");
				System.out.println("\t\t\t2. Withdraw");
				System.out.println("\t\t\t3. Deposit");
				System.out.println("\t\t\t4. Money transfer");
				System.out.println("\t\t\t5. Exit");
				System.out.println("\nEnter your Choice");
				int choice = inp.nextInt();
				
				if (choice == 1){
					int leng = 0;
					for (String itm : history){
						leng+=1;
					}
					if (leng > 0){
						for (String item : history){
							System.out.println(item);
						}
					}
					else
					{
						System.out.println("\nThere is no Transaction history");
					}
				}
				
				else if (choice == 2){
					int with_amt = withdraw(balance);
					if (with_amt == 0){
						System.out.println("\nThere is no sufficient balance for withdrawing the amount");
						System.out.println("\n");
						System.out.println("\n The clear balance in your account is "+String.valueOf(balance));
						System.out.println("\n");
					}
					else if (with_amt > 0){
						balance -= with_amt;
						System.out.println("\nPlease collect your cash");
						System.out.println("\n");
						System.out.println("\n The clear balance in your account is "+String.valueOf(balance));
						System.out.println("\n");
						history.add("The amount of Rs "+String.valueOf(with_amt)+
						" has been withdrawn clear balance Rs "+String.valueOf(balance));
						
					}
					else{
						System.out.println("\n invalid amount");
						System.out.println("\n");
						history.add("Invalid Transaction");
					} 
				}
				
				else if (choice == 3){
					int depo_amt = deposit();
					if (depo_amt > 0){
						balance+=depo_amt;
						System.out.println("\nAmount has been successfully deposited");
						System.out.println("\n");
						System.out.println("\n The clear balance in your account is "+String.valueOf(balance));
						System.out.println("\n");
						history.add("The amount deposited of Rs "+String.valueOf(depo_amt)+
						" clear balance Rs "+String.valueOf(balance));
					}else{
						System.out.println("\n invalid amount");
						System.out.println("\n");
						history.add("Invalid Transaction");
					}
				}
				
				else if (choice == 4){
					int trans_amt = transfer(balance);
					if (trans_amt == 0){
						System.out.println("\nThere is no sufficient balance for transaction");
						System.out.println("\n");
						System.out.println("\n The clear balance in your account is "+String.valueOf(balance));
						System.out.println("\n");
					}
					else if (trans_amt > 0){
						balance -= trans_amt;
						String name = getname();
						System.out.println("\nAmount has been successfully Transfered to "+name);
						System.out.println("\n");
						System.out.println("\n The clear balance in your account is "+String.valueOf(balance));
						System.out.println("\n");
						history.add("The amount of Rs "+String.valueOf(trans_amt)+
						" is transfered to "+name+" clear balance Rs "+String.valueOf(balance));
						
					}
					else{
						System.out.println("\n invalid amount");
						System.out.println("\n");
						history.add("Invalid Transaction");
					} 
				}
				
				else if (choice == 5){
					System.out.println("Logged out Successfully");
					break;
				}
				
			}
		}
		else{
			System.out.println("\t\t\t\tThe UserName or Password is Incorrect");
		}			
	}
}