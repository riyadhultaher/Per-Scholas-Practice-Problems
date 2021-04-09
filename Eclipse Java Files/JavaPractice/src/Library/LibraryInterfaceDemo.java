package Library;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		LibraryUser k1 = new KidUsers (10, "Kids");
		LibraryUser k2 = new KidUsers (18, "Fiction");
		k1.registerAccount();
		k2.registerAccount();
		k1.requestBook();
		k2.requestBook();
		
		LibraryUser a1 = new AdultUsers (5, "Kids");
		LibraryUser a2 = new AdultUsers (23, "Fiction");
		a1.registerAccount();
		a2.registerAccount();
		a1.requestBook();
		a2.requestBook();
	}
}
