public class PrimeOrNot {

  public static void notOptimisedCheck(int n){
    if (n <= 1){
      System.out.println("Not Prime");
      return;
    }
    int i = 1;
    int c = 2;
    while ( c < n){
      System.out.println("No. of iterations in ⚠️⚠️⚠️ UNOPTIMISED ⚠️⚠️⚠️ : " + i);
      System.out.println("c: " + c);
      if (n % c == 0){
        System.out.println("Not Prime");
        return;
      }
      c += 1;
      i += 1;
    }
  }

  public static void optimisedCheck(int n){
    if (n <= 1){
      System.out.println("Not Prime");
      return;
    }
    int i = 1;
    int c = 2;
    while ( c * c <= n){
      System.out.println("No. of iterations in ✅✅✅ OPTIMISED ✅✅✅ : " + i);
      System.out.println("c: " + c);
      if (n % c == 0){
        System.out.println("Not Prime");
        return;
      }
      c += 1;
      i += 1;
    }
  }

  public static void main(String[] args) {
    int n = 37;
    notOptimisedCheck(n);
    optimisedCheck(n);
  }
}