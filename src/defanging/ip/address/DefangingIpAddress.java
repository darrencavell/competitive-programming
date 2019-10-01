package defanging.ip.address;

public class DefangingIpAddress {

	/*
	 * Given a valid (IPv4) IP address.
	 * Return a defanged version of that IP address.
	 *
	 * Input: address = "1.1.1.1"
	 * Output: "1[.]1[.]1[.]1"
	 *
	 * Input: address = "255.100.50.0"
	 * Output: "255[.]100[.]50[.]0"
	 */

	public DefangingIpAddress() {
		String text = "address = \"1.1.1.1\"";
		System.out.println(defangIPaddr(text));;
	}
	public String defangIPaddr(String address) {
		return address.replace(".", "[.]").substring(10);
	}
}
