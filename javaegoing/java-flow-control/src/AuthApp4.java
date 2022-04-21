
public class AuthApp4 {
	
	public static void main (String [] args) {
		
		String[][] users = {
			{"egoing", "1111"},
			{"youbin", "2222"},
			{"thomas", "3333"}
		};
		
		String inputId = args[0];
		String inputPass = args[1];
		
		boolean isLogined = false;
		
		for(int i=0; i<users.length; i++) {
			 String[] current = users[i];
			
			if(
				current[0].equals(inputId) && 
				current[1].equals(inputPass)
			  ) {
				isLogined = true;
				break;
			}
		}
		
		System.out.println("Hi,");
		if(isLogined) {
			System.out.println("Master!!!");
		} else {
			System.out.println("who is this?");
		}
	}
}
