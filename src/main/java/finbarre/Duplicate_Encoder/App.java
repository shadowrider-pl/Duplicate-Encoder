package finbarre.Duplicate_Encoder;

/**
 * Hello world!
 *
 *The goal of this exercise is to convert a string to a new string where each character in the new string is '(' if that character appears only once in the original string, or ')' if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

Examples:

"din" => "((("

"recede" => "()()()"

"Success" => ")())())"

"(( @" => "))(("
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        DuplicateEncoder de = new DuplicateEncoder();
        System.out.println( de.encode("Success"));
    }
}
