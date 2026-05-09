package unit2;

/*
 * AP Topic 2.5 – Compound Boolean Expressions
 *
 * Students learn:
 *   !   (NOT)  – inverts a boolean value: !true → false, !false → true
 *   &&  (AND)  – true only when BOTH sides are true; SHORT-CIRCUITS: if the
 *                left side is false, the right side is never evaluated
 *   ||  (OR)   – true when AT LEAST ONE side is true; SHORT-CIRCUITS: if the
 *                left side is true, the right side is never evaluated
 *
 * Operator precedence (highest to lowest): ! > && > ||
 * Use parentheses to make complex expressions clear.
 *
 * Short-circuit evaluation matters when the right-hand expression has a
 * side effect or could throw an exception (e.g., null check before .equals()).
 */
public class Topic5_CompoundBoolean {

    /**
     * TODO: Return true if year is a leap year, false otherwise.
     *       Use a SINGLE compound boolean expression (no if statements needed).
     *
     *       Leap year rules:
     *         - Divisible by 4                          →  probably a leap year
     *         - EXCEPT divisible by 100                 →  NOT a leap year
     *         - UNLESS also divisible by 400            →  IS a leap year
     *
     *       As one expression:
     *         (year % 4 == 0)  &&  ( !(year % 100 == 0)  ||  (year % 400 == 0) )
     *
     * Parameters:
     *   year – a positive integer year
     *
     * Returns: boolean – true if leap year
     *
     * Example:
     *   isLeapYear(2000)  →  true   (div by 400)
     *   isLeapYear(1900)  →  false  (div by 100, not 400)
     *   isLeapYear(2024)  →  true   (div by 4, not by 100)
     *   isLeapYear(2023)  →  false  (not div by 4)
     */
    public static boolean isLeapYear(int year) {
        // TODO: implement using &&, ||, ! in a single compound expression
        return false;
    }

    /**
     * TODO: Return true if pw (password) meets ALL three of the following criteria:
     *   1. Length >= 8          (pw.length() >= 8)
     *   2. Contains at least one digit     — loop with Character.isDigit(pw.charAt(i))
     *   3. Contains at least one uppercase — loop with Character.isUpperCase(pw.charAt(i))
     *
     *   Use compound && to combine all three conditions before returning.
     *   Hint: use two boolean flags (hasDigit, hasUpper), set them to false,
     *   then loop through each character and flip the flag when the criteria is met.
     *   Finally return: pw.length() >= 8 && hasDigit && hasUpper
     *
     * Parameters:
     *   pw – the password string to validate
     *
     * Returns: boolean – true if the password satisfies all three rules
     *
     * Example:
     *   isValidPassword("Hello123")   →  true   (length 8, has digit, has upper)
     *   isValidPassword("hello123")   →  false  (no uppercase)
     *   isValidPassword("HELLO123")   →  false  (no lowercase — wait, rule only needs upper)
     *   isValidPassword("Hello12")    →  false  (length 7, too short)
     *   isValidPassword("HelloWorld") →  false  (no digit)
     */
    public static boolean isValidPassword(String pw) {
        // TODO: implement using compound && and a loop with Character.isDigit / isUpperCase
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));           // expected: true
        System.out.println(isLeapYear(1900));           // expected: false
        System.out.println(isLeapYear(2024));           // expected: true
        System.out.println(isValidPassword("Hello123")); // expected: true
        System.out.println(isValidPassword("hello123")); // expected: false
    }
}
