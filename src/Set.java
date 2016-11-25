public class Set {

  private boolean hasBeenAddedTo;

  public void add(int i){
    hasBeenAddedTo = true;
  }

  public boolean isEmpty(){
    return !hasBeenAddedTo;
  }

  public int size() {
    return 0;
  }
}
