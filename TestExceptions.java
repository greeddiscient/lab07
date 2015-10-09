public class TestExceptions {

	public static void main (String [ ] args) {
		Object[] k= new String[5] ;
		Object obj = new Integer(100);

		
		try {
			 k[3].toString();
			 
				 

		} catch (NullPointerException e) {
			System.out.println ("got null pointer");
		}
		try {
			k[2]= new Integer(1) ;

		} catch (ArrayStoreException e) {
			System.out.println ("got illegal array store");
		}
		try {
			System.out.println((String) obj);


		} catch (ClassCastException e) {
			System.out.println ("got illegal class cast");
		}
	}

}
