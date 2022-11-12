package ObjectCreation;

public class Example {
//  public static VectorPoolManager vectorPoolManager = new VectorPoolManager(25);

  public static void main(String[] args) {
    String name = "Gill";
    String intern = name.intern();
    System.out.println(intern);

  }

}
