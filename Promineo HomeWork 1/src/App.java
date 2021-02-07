
public class App {

	public static void main(String[] args) {
		// 
        int itemPrice = 60;
		double moneyInWallet = 70.50;
		int numberOfFriends = 40;
		int age = 20;
        String firstName = "Phillip";
		String lastName = "Rodrigue";
		char middleInitial = 'J';
        String fullName = firstName + " " + middleInitial + " " + lastName;
		double newAmountOfMoneyInWallet = moneyInWallet - itemPrice;
        int numberOfFriendsYouveMadeEachYear = numberOfFriends / age;
		
        System.out.println("The item price is" + " " +  itemPrice);     
        System.out.println("The amount of money in my wallet is" + " " + moneyInWallet);
	    System.out.println("The amount of friends I have" + " " + numberOfFriends);
	    System.out.println("My age is" + " " + age); 
	    System.out.println("My first name is" + " " + firstName);
	    System.out.println("My last name is" + " " + lastName);
	    System.out.println("My middle initial is" + " " + middleInitial);
	    System.out.println("My full name is" + " " + fullName);
	    System.out.println("New amount of money in wallet after buying the item is" + " " + newAmountOfMoneyInWallet);
	    System.out.println("Number of friends youve made each year is" + " " + numberOfFriendsYouveMadeEachYear);
	    
	}


}
