package sutdy;

public class studystr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = new String("JAVA");
		System.out.println("str : " +str);
		
		str = str + "8";
		System.out.println("str : " + str);
		
		//String Buffer
		StringBuffer sf = new StringBuffer("JAVA");
		System.out.println("sf : " + sf);
		sf.append("world");
		System.out.println("sf : " + sf);
		System.out.println("sf.length() : " + sf.length());
		sf.insert(sf.length(), "~~~~~~~~");
		System.out.println("sf : " + sf);
		
		sf.delete(4,8);
		System.out.println("sf : "+sf);
		
		StringBuilder sb = new StringBuilder("JAVAWORLD!!!");
		System.out.println("sb : "+sb);
		
	}

}
