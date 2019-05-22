public class BobTest {
	public static void main(String[] args) {
		Bob f = new Bob("GoBobGo", 19);
		System.out.println(f);
	}
}

class Bob {
	int shoeSize;
	String nickName;

	Bob(String nickName, int shoeSize) {
		this.shoeSize = shoeSize;
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "Bob [shoeSize=" + shoeSize + ", nickName=" + nickName + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

		
}