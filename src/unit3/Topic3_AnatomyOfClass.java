package unit3;

/*
 * AP CS A – Unit 3, Topic 3.3: Anatomy of a Class
 *
 * Students learn:
 *   - Classes are declared public so they are accessible from other packages.
 *   - Instance variables are declared private — this is ENCAPSULATION. The
 *     internal data is hidden from outside classes; only the class's own methods
 *     can directly read or write the fields.
 *   - Constructors are declared public and have the SAME NAME as the class.
 *     They have NO return type (not even void).
 *   - Public methods form the class's interface — they are the only way outside
 *     code can interact with the object's data.
 *   - private members are accessible ONLY within the declaring class.
 *   - Data encapsulation hides implementation details and protects object state.
 *
 * This file also contains a separate BankAccount class (at the bottom) so
 * students can see a complete class alongside the demonstration methods.
 */
public class Topic3_AnatomyOfClass {

    // -------------------------------------------------------------------------
    // PROBLEM 1
    // Method: demonstrateEncapsulation()
    //
    // TODO: Demonstrate how encapsulation works using the BankAccount class.
    //
    //   Step 1 – Create a BankAccount with an initial balance of 100.0:
    //       BankAccount account = new BankAccount(100.0);
    //
    //   Step 2 – You CANNOT write: account.balance  (balance is private!)
    //       // account.balance = 200.0;  ← compile error — private field
    //       Leave a comment like the one above explaining why direct access fails.
    //
    //   Step 3 – Use the public method instead:
    //       System.out.println("Balance: " + account.getBalance());
    //       // Expected output: Balance: 100.0
    //
    //   Step 4 – Deposit 50.0 and print the new balance:
    //       account.deposit(50.0);
    //       System.out.println("After deposit: " + account.getBalance());
    //       // Expected output: After deposit: 150.0
    //
    //   Why this matters on the AP exam:
    //     The AP exam tests that students know private fields cannot be accessed
    //     from outside the class — you MUST go through public methods.
    // -------------------------------------------------------------------------
    public static void demonstrateEncapsulation() {
        // TODO: create BankAccount(100.0), show private field is inaccessible,
        //       call getBalance(), call deposit(50.0), print new balance
    }

    // -------------------------------------------------------------------------
    // PROBLEM 2
    // Method: describeAccessModifiers(String modifier)
    //
    // TODO: Use an if-else chain to return a description of each access modifier.
    //
    //   "public"  → "Accessible from any class"
    //   "private" → "Accessible only within declaring class"
    //   anything else → "Unknown modifier"
    //
    //   Examples:
    //     describeAccessModifiers("public")   → "Accessible from any class"
    //     describeAccessModifiers("private")  → "Accessible only within declaring class"
    //     describeAccessModifiers("package")  → "Unknown modifier"
    //
    //   Why this matters on the AP exam:
    //     The AP exam requires students to know which modifier to use on instance
    //     variables (private) vs. constructors and methods (public).
    //
    //   Implementation hint:
    //     if (modifier.equals("public")) { return "Accessible from any class"; }
    //     else if (modifier.equals("private")) { return "Accessible only within declaring class"; }
    //     else { return "Unknown modifier"; }
    // -------------------------------------------------------------------------
    public static String describeAccessModifiers(String modifier) {
        // TODO: implement the if-else chain described above
        return "";
    }

    public static void main(String[] args) {
        demonstrateEncapsulation();
        System.out.println(describeAccessModifiers("public"));
        System.out.println(describeAccessModifiers("private"));
        System.out.println(describeAccessModifiers("package"));
    }
}

// =============================================================================
// SEPARATE CLASS: BankAccount
// (A second top-level class in the same file — allowed in Java as long as it
//  is NOT declared public. Only one public class per .java file.)
// =============================================================================

/*
 * BankAccount models a simple bank account with a private balance.
 * Students implement the constructor and methods below.
 */
class BankAccount {

    // Instance variable — private so outside code cannot modify balance directly
    private double balance;

    // -------------------------------------------------------------------------
    // Constructor: BankAccount(double initialBalance)
    //
    // TODO: Set the instance variable 'balance' equal to initialBalance.
    //   this.balance = initialBalance;
    // -------------------------------------------------------------------------
    public BankAccount(double initialBalance) {
        // TODO: assign initialBalance to balance
    }

    // -------------------------------------------------------------------------
    // Accessor: getBalance()
    //
    // TODO: Return the current value of balance.
    //   return balance;
    // -------------------------------------------------------------------------
    public double getBalance() {
        // TODO: return balance
        return 0;
    }

    // -------------------------------------------------------------------------
    // Mutator: deposit(double amount)
    //
    // TODO: Add amount to balance.
    //   balance += amount;
    //   (For a real bank account you would also check amount > 0.)
    // -------------------------------------------------------------------------
    public void deposit(double amount) {
        // TODO: add amount to balance
    }
}
