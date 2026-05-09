package unit4;

/*
 * Topic 4.1 – Ethical and Social Issues Around Data Collection
 *
 * Learning Goals:
 * - Understand that collecting and storing personal data raises privacy risks.
 * - Recognize that data collection can be both beneficial (personalization) and harmful
 *   (surveillance, data breaches).
 * - Know that programs can have unintended consequences on society.
 */
public class Topic1_EthicsDataCollection {

    /**
     * Returns a risk level string based on the type of data being collected.
     *
     * TODO: Implement using an if-else-if chain:
     *   - If dataType equals "location" or "health"       → return "HIGH risk — sensitive personal data"
     *   - If dataType equals "name" or "email"            → return "MEDIUM risk — personally identifiable"
     *   - If dataType equals "favorite color" or "age range" → return "LOW risk — general preference"
     *   - Otherwise                                        → return "UNKNOWN risk"
     *
     * Example:
     *   assessDataRisk("health")         → "HIGH risk — sensitive personal data"
     *   assessDataRisk("email")          → "MEDIUM risk — personally identifiable"
     *   assessDataRisk("favorite color") → "LOW risk — general preference"
     *   assessDataRisk("shoe size")      → "UNKNOWN risk"
     */
    public static String assessDataRisk(String dataType) {
        // TODO: Replace with if-else-if logic described above.
        return "";
    }

    /**
     * Prints three ethical considerations for a program that collects data.
     *
     * TODO: Print the following three lines (substituting programName):
     *   Line 1: "[programName] collects data."
     *   Line 2: "Consider: 1) Is user consent obtained?"
     *   Line 3: "2) Is data encrypted?"
     *   Line 4: "3) What is the data retention policy?"
     *
     * Example:
     *   printPrivacyConsiderations("FitnessTracker") prints:
     *     FitnessTracker collects data.
     *     Consider: 1) Is user consent obtained?
     *     2) Is data encrypted?
     *     3) What is the data retention policy?
     */
    public static void printPrivacyConsiderations(String programName) {
        // TODO: Use System.out.println to print each of the four lines above,
        //       inserting programName into the first line.
    }

    public static void main(String[] args) {
        System.out.println(assessDataRisk("health"));
        System.out.println(assessDataRisk("email"));
        System.out.println(assessDataRisk("favorite color"));
        System.out.println(assessDataRisk("shoe size"));
        printPrivacyConsiderations("FitnessTracker");
    }
}
