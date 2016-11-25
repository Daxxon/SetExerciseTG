public class Set {

  private boolean hasBeenAddedTo;

  private int addCount;

  public void add(int i){
    hasBeenAddedTo = true;
    addCount++;
  }

  public boolean isEmpty(){
    return !hasBeenAddedTo;
  }

  public int size() {
    return addCount;
  }
}
