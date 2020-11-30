
public class PhoneFactory {
	
	public Phone getPhone(String phone) {
		if(phone.equalsIgnoreCase("Samsung"))
			return new Samsung();
		else if(phone.equalsIgnoreCase("OnePlus"))
			return new OnePlus();
		else if(phone.equalsIgnoreCase("Xiaomi"))
			return new Xiaomi();
		
		return null;
	}
}
