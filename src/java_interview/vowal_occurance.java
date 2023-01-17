package java_interview;

public class vowal_occurance {

	public static void main(String[] args) {
		String name = "aeiou aeiou aeiou aeiou aeiou this is the test";
        int tot_leng = name.length();
         int after_replace_a = name.replace("a","").replace("e","").replace("i","").replace("o","").replace("u","").length();
        
         int count = tot_leng - after_replace_a ;
         System.out.println(count);
        
          
          
	}

}
