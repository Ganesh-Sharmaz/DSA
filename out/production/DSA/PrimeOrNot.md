# Prime Number Checker: Notes and Explanation

## Overview
The provided Java program checks if a number is prime using two approaches:
1. **Not Optimized Check**: Iterates through all numbers from 2 to `n-1`.
2. **Optimized Check**: Iterates only up to the square root of `n`, reducing unnecessary iterations.

The program demonstrates concepts like conditionals, loops, and function modularity, while comparing efficiency between the two methods.

---

## Steps and Major Points

### 1. **Defining the Problem**
The goal is to determine if a given number, `n`, is prime. A prime number is:
- Greater than 1.
- Divisible only by 1 and itself.

### 2. **Approach 1: Not Optimized Check**
The function `notOptimisedCheck(int n)` checks for primality by iterating through all integers from 2 to `n-1`:
- If any number `c` between 2 and `n-1` divides `n`, it concludes `n` is not prime.

**Steps:**
1. Check if `n <= 1`. If true, print "Not Prime" and exit.
2. Initialize `c = 2` (starting divisor) and `i = 1` (iteration counter).
3. Use a `while` loop to check divisors from 2 to `n-1`.
4. If `n % c == 0`, print "Not Prime" and exit.
5. Increment `c` and continue the loop until `c < n`.
6. Print the number of iterations for comparison purposes.

**Output:**
Prints whether `n` is prime and the number of iterations performed.

### 3. **Approach 2: Optimized Check**
The function `optimisedCheck(int n)` reduces the iteration range:
- A number `n` is not prime if it has a factor less than or equal to \( \sqrt{n} \).
- This reduces the loop size drastically, improving efficiency.

**Steps:**
1. Check if `n <= 1`. If true, print "Not Prime" and exit.
2. Initialize `c = 2` (starting divisor) and `i = 1` (iteration counter).
3. Use a `while` loop to check divisors up to \( c^2 \leq n \).
4. If `n % c == 0`, print "Not Prime" and exit.
5. Increment `c` and continue the loop until \( c^2 > n \).
6. Print the number of iterations for comparison purposes.

**Output:**
Prints whether `n` is prime and the number of iterations performed.

### 4. **Main Method**
The `main` function initializes the value of `n` and calls both methods:
1. Call `notOptimisedCheck(n)` to check primality using the unoptimized approach.
2. Call `optimisedCheck(n)` to check primality using the optimized approach.
3. Observe and compare outputs for iteration counts and efficiency.

---

## Concepts Used

### 1. **Functions in Java**
- Functions `notOptimisedCheck` and `optimisedCheck` encapsulate logic, promoting reusability and modularity.
- Defined as `public static void` for direct invocation from the `main` method without needing an object.

### 2. **Conditionals**
- `if` statements check base cases like `n <= 1` or divisibility (`n % c == 0`).
- Early exits prevent unnecessary computation.

### 3. **Loops**
- `while` loops iterate through possible divisors.
- Iteration conditions (`c < n` vs. `c * c <= n`) determine efficiency.

### 4. **Mathematical Optimization**
- The optimized check leverages the fact that any factor of `n` larger than \( \sqrt{n} \) will have a corresponding factor smaller than \( \sqrt{n} \).
- Reducing the iteration range improves runtime efficiency.

### 5. **Debugging and Logging**
- Iteration counts and current divisor (`c`) are printed for analysis and comparison.

---

## Key Differences Between Approaches
| Feature                  | Not Optimized                  | Optimized                        |
|--------------------------|---------------------------------|----------------------------------|
| Iteration Range          | \( 2 \) to \( n-1 \)           | \( 2 \) to \( \sqrt{n} \)         |
| Number of Iterations     | Higher                        | Significantly lower             |
| Efficiency               | Poor                          | Better                          |
| Practical Usability      | Suitable for small numbers    | Suitable for large numbers      |

---

## Example Execution
For `n = 37`:
1. **Not Optimized Check**:
   - Iterates through divisors from 2 to 36.
   - Outputs: "No. of iterations in ⚠️⚠️⚠️ UNOPTIMISED ⚠️⚠️⚠️ : 35".
2. **Optimized Check**:
   - Iterates through divisors up to \( \sqrt{37} \) (approximately 6).
   - Outputs: "No. of iterations in ✅✅✅ OPTIMISED ✅✅✅ : 5".

---

## Advantages of Optimization
1. **Faster Execution**:
   - Reduces the iteration range from \( O(n) \) to \( O(\sqrt{n}) \).
2. **Scalability**:
   - Efficient for large inputs.

---

## Conclusion
The program highlights the importance of optimizing algorithms. By leveraging mathematical properties (like divisors up to \( \sqrt{n} \)), the optimized approach significantly outperforms the unoptimized one, making it suitable for real-world applications where performance is critical.

