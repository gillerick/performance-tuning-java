package Threading;

public class SyncedAdder implements Adder {
  Adder adder;

  public SyncedAdder(Adder a) {
    adder = a;
  }

  @Override
  public synchronized void add(int aNumber) {
    adder.add(aNumber);
  }
}
