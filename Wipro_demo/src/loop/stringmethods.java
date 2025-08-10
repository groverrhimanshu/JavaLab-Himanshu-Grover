package loop;

public class stringmethods {

	public static void main(String[] args) {
		String str = " Hello Java World ";
        String str2 = "hello java world";

       
        System.out.println("Length: " + str.length());

        
        System.out.println("Character at 6: " + str.charAt(6));

       
        System.out.println("Equals: " + str.equals(str2));

        
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(str2));

        
        System.out.println("CompareTo: " + str.compareTo(str2));

        
        System.out.println("CompareTo Ignore Case: " + str.compareToIgnoreCase(str2));

        
        System.out.println("Lowercase: " + str.toLowerCase());

        
        System.out.println("Uppercase: " + str.toUpperCase());

        
        System.out.println("Trimmed: '" + str.trim() + "'");

        
        System.out.println("Substring (6 to 10): " + str.substring(6, 10));

        
        System.out.println("Contains 'Java': " + str.contains("Java"));

        
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

       
        System.out.println("Starts with ' Hello': " + str.startsWith(" Hello"));

        
        System.out.println("Ends with 'World ': " + str.endsWith("World "));

        
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

        
        String[] words = str.trim().split(" ");
        System.out.println("Words:");
        for (String word : words) {
            System.out.println("  - " + word);
        }

        
        String joined = String.join("-", words);
        System.out.println("Joined with '-': " + joined);

        // 19. isEmpty
        System.out.println("Is empty: " + str.isEmpty());

        
        String blankStr = "   ";
        System.out.println("Is blank: " + blankStr.isBlank());

        
        System.out.println("Repeat: " + "Hi ".repeat(3));

        
        String template = "Name: %s, Age: %d";
        System.out.println(template.formatted("Amit", 25));

        
        System.out.println("Indented:\n" + str.indent(4));

        
        String escapeStr = "Line1\\nLine2";
        System.out.println("Translated escapes: " + escapeStr.translateEscapes());

        
        int x = 100;
        System.out.println("Value of int: " + String.valueOf(x));

        
        char[] chars = str.toCharArray();
        System.out.println("Char array:");
        for (char ch : chars) {
            System.out.print(ch + " ");
        }

        
        byte[] bytes = str.getBytes();
        System.out.println("\nByte array:");
        for (byte b : bytes) {
            System.out.print(b + " ");
        }
    }

	

}
