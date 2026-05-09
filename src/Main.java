/**
 * AP Computer Science A — Practice Codebase
 *
 * HOW TO USE THIS PROJECT
 * =======================
 * Each unit maps directly to the AP CS A course framework.
 * Open the unit folder that matches what you're currently studying,
 * find the topic file, read the comments, and fill in the TODO methods.
 *
 * Every topic file contains:
 *   - A header comment explaining the AP topic and what you'll learn
 *   - 2 method stubs with detailed TODO instructions and worked examples
 *   - A main() method you can run to test your implementation
 *
 * Run each file's own main() method to check your work.
 *
 * ─────────────────────────────────────────────────────────────────────────────
 * UNIT 1 – Using Objects and Methods          (15–25% of AP exam)  ~32–34 days
 * ─────────────────────────────────────────────────────────────────────────────
 *  unit1/Topic1_AlgorithmsProgrammingCompilers.java  — 1.1 Algorithms, errors, compilation
 *  unit1/Topic2_VariablesDataTypes.java              — 1.2 int, double, boolean; reference types
 *  unit1/Topic3_ExpressionsOutput.java               — 1.3 Arithmetic, operator precedence, output
 *  unit1/Topic4_AssignmentInput.java                 — 1.4 Assignment operator, Scanner input
 *  unit1/Topic5_CastingRange.java                    — 1.5 Explicit casting, truncation, int range
 *  unit1/Topic6_CompoundAssignment.java              — 1.6 +=, -=, *=, /=, %=, ++, --
 *  unit1/Topic7_APILibraries.java                    — 1.7 Using APIs without knowing implementation
 *  unit1/Topic8_Documentation.java                   — 1.8 Javadoc, comments, preconditions
 *  unit1/Topic9_MethodSignatures.java                — 1.9 Signatures, overloading, return types
 *  unit1/Topic10_CallingClassMethods.java            — 1.10 Static methods, ClassName.method()
 *  unit1/Topic11_MathClass.java                      — 1.11 Math.abs/pow/sqrt/random/min/max
 *  unit1/Topic12_ObjectsInstances.java               — 1.12 Classes as blueprints, instances
 *  unit1/Topic13_Instantiation.java                  — 1.13 new keyword, constructors, references
 *  unit1/Topic14_InstanceMethods.java                — 1.14 Dot operator, NullPointerException
 *  unit1/Topic15_StringManipulation.java             — 1.15 String immutability, substring, indexOf
 *
 * ─────────────────────────────────────────────────────────────────────────────
 * UNIT 2 – Selection and Iteration           (25–35% of AP exam)  ~29–31 days
 * ─────────────────────────────────────────────────────────────────────────────
 *  unit2/Topic1_SelectionRepetition.java             — 2.1  Sequencing, selection, repetition
 *  unit2/Topic2_BooleanExpressions.java              — 2.2  Relational operators, boolean results
 *  unit2/Topic3_IfStatements.java                    — 2.3  if, if-else, if-else-if
 *  unit2/Topic4_NestedIf.java                        — 2.4  Nested conditionals, multi-way selection
 *  unit2/Topic5_CompoundBoolean.java                 — 2.5  &&, ||, !, short-circuit evaluation
 *  unit2/Topic6_ComparingBoolean.java                — 2.6  De Morgan's law, .equals() vs ==
 *  unit2/Topic7_WhileLoops.java                      — 2.7  while, infinite loops, off-by-one
 *  unit2/Topic8_ForLoops.java                        — 2.8  for loop structure, equivalence to while
 *  unit2/Topic9_SelectionIterationAlgorithms.java    — 2.9  Min/max, sum/average, divisibility
 *  unit2/Topic10_StringAlgorithms.java               — 2.10 Reverse string, count substrings
 *  unit2/Topic11_NestedIteration.java                — 2.11 Nested loops, inner completes first
 *  unit2/Topic12_RuntimeAnalysis.java                — 2.12 Statement execution counts, O(n²)
 *
 * ─────────────────────────────────────────────────────────────────────────────
 * UNIT 3 – Class Creation                    (10–18% of AP exam)  ~20–22 days
 * ─────────────────────────────────────────────────────────────────────────────
 *  unit3/Topic1_AbstractionProgramDesign.java        — 3.1  Data/procedural abstraction, decomposition
 *  unit3/Topic2_ImpactProgramDesign.java             — 3.2  Social/ethical impact, open source
 *  unit3/Topic3_AnatomyOfClass.java                  — 3.3  public/private, encapsulation
 *  unit3/Topic4_Constructors.java                    — 3.4  Constructors, default vs parameterized
 *  unit3/Topic5_Methods_Writing.java                 — 3.5  void/non-void, accessors, mutators
 *  unit3/Topic6_Methods_References.java              — 3.6  Passing/returning object references
 *  unit3/Topic7_ClassVariablesMethods.java           — 3.7  static variables, final constants
 *  unit3/Topic8_ScopeAccess.java                     — 3.8  Local vs instance scope, shadowing
 *  unit3/Topic9_ThisKeyword.java                     — 3.9  this reference, method chaining
 *
 * ─────────────────────────────────────────────────────────────────────────────
 * UNIT 4 – Data Collections                  (30–40% of AP exam)  ~50–52 days
 * ─────────────────────────────────────────────────────────────────────────────
 *  unit4/Topic1_EthicsDataCollection.java            — 4.1  Privacy risks, beneficial vs harmful data use
 *  unit4/Topic2_DataSets.java                        — 4.2  Organizing data, median, summary stats
 *  unit4/Topic3_ArrayCreationAccess.java             — 4.3  int[] arr = new int[n], indices, defaults
 *  unit4/Topic4_ArrayTraversals.java                 — 4.4  for-loop, for-each, forward/backward
 *  unit4/Topic5_ArrayAlgorithms.java                 — 4.5  Contains, reverse, standard array patterns
 *  unit4/Topic6_TextFiles.java                       — 4.6  Scanner+File, PrintWriter, IOException
 *  unit4/Topic7_WrapperClasses.java                  — 4.7  Integer/Double, autoboxing/unboxing, parseInt
 *  unit4/Topic8_ArrayListMethods.java                — 4.8  add/get/set/remove/size on ArrayList
 *  unit4/Topic9_ArrayListTraversals.java             — 4.9  Index traversal, removing during loop
 *  unit4/Topic10_ArrayListAlgorithms.java            — 4.10 findMax, removeDuplicates on ArrayList
 *  unit4/Topic11_2DArrayCreationAccess.java          — 4.11 int[][] grid, row/col indexing
 *  unit4/Topic12_2DArrayTraversals.java              — 4.12 Nested loops for 2D, row sums
 *  unit4/Topic13_2DArrayAlgorithms.java              — 4.13 Global min, matrix transpose
 *  unit4/Topic14_SearchingAlgorithms.java            — 4.14 Linear search O(n), binary search O(log n)
 *  unit4/Topic15_SortingAlgorithms.java              — 4.15 Selection sort, insertion sort — both O(n²)
 *  unit4/Topic16_Recursion.java                      — 4.16 Base case, recursive case, call stack
 *  unit4/Topic17_RecursiveSearchingSorting.java      — 4.17 Recursive binary search, merge sort O(n log n)
 */
public class Main {
    public static void main(String[] args) {
        // This file is your table of contents.
        // Run individual topic files to test your work.
        System.out.println("AP CS A Practice Codebase — see the comments above for a full topic index.");
    }
}
