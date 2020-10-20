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
}
