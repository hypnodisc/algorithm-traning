package test;

public class Main2 {
	public static void main(String[] args) {
		String str1 = "가,나,다,라,마";
		String str2 = "가,나,다";
		String[] result1 = str1.split(",");
		String[] result2 = str2.split(",");

		StringBuilder builder = new StringBuilder();
		for (String r1 : result1) {
			boolean contain = false;
			for (String r2 : result2) {
				 if(r1.contains(r2)) {
					 contain = r1.contains(r2);
					 break;
				 }
			}
			if(!contain) {
				builder.append(r1);
				builder.append("\n");
			}
		}
		System.out.println(builder.toString());
	}
}



/*List<String> results = Arrays.asList(result2);
System.out.println(results.contains("마"));
*/