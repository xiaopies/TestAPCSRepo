public class Demo{
  public static void printLoop(String[]args){
    int x = Integer.parseInt(args[0]);
    for (int i = 1; i<=x; i++){
      for (int j=x-i; j>=0; j--){
        System.out.print(i);
      }
      System.out.println();
    }
  }
  public static String arrToString(int[] args){
    if (args.length==0){
      return "{}";
    }
    String a = "{";
    for (int i =0; i<args.length-1; i++){
      a+= args[i] +", ";
    }
    return (a+ args[args.length-1]+"}");
  }
  public static String arrayDeepToString(int[][] args){
    if (args.length==0){
      return "{}";
    }
    String x = "{";
    for (int i=0; i<args.length-1; i++){
      x+= arrToString.main(args[i]) + "\n";
    }
    x+= arrToString.main(args[args.length-1]);
    return x += "}";
  }
}
