/*
 * Travis Davis
 * 
 * This class contains an array of valid account numbers (validChargeAccounts[])
 * 
 * It also contains a boolean method containing a for loop to sequentially check against validChargeAccount[]
 * and determine if the recieved account number is valid
 */
public class ChargeAccountValidation {
	private static int[] validChargeAccounts = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152, 4562555, 5552012, 5050552, 7825877,
			1250255, 1005231, 6545231, 3852085, 7576651, 7881200, 4581002 };

	static boolean verifyAccountNumber(int accountNumber) {
		for (int i = 0; i < validChargeAccounts.length; i++) {
			if (validChargeAccounts[i] == accountNumber) {
				return true;
			}

		}
		return false;
	}
}
