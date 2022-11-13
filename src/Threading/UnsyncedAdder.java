package Threading;

public class UnsyncedAdder implements Adder {
  int total;
  int numAdditions;

  @Override
  public void add(int aNumber) {
    total += aNumber;
    numAdditions++;
  }
}
