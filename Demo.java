public class Demo{
  public static void main(String[]args){
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
      x+= arrToString(args[i]) + "\n";
    }
    x+= arrToString(args[args.length-1]);
    return x += "}";
  }
  public static int[][] create2DArray(int rows, int cols, int maxValue){
    int[][] a = new int[rows][cols];
    for (int i =0; i <a.length; i++){
      for (int j=0; j<a[i].length; j++){
        a[i][j] = (int) Math.round(Math.random() * (maxValue)) ;
      }
    }
    return a;
  }
  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
    int[][] a = new int[rows][];
    for (int i =0; i <a.length; i++){
      int x = (int) Math.round(Math.random() * cols);
      a[i] = new int[x];
      for (int j=0; j<a[i].length; j++){
        a[i][j] = (int) Math.round(Math.random() * (maxValue));
      }
    }
    return a;
  }


}
