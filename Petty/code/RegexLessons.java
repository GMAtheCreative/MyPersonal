import java.util.regex.*;
class RegexLessons{
	public static void main(String[] regularExpression){

		Boolean firstExpression =  Pattern.compile("je");
		Matcher result =firstExpression.matches("jesus");
		System.out.println(result.matches("je", "jesus"));
	}
}