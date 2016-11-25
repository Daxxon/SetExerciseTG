public class Set {

  private boolean hasBeenAddedTo;

  private int size;

  private Integer[] arrayOfMembers = new Integer[5];

  public void add(int element){
    hasBeenAddedTo = true;
    arrayOfMembers[size] = element;
    size++;
  }

  public boolean isEmpty(){
    return !hasBeenAddedTo;
  }

  public int size() {
    return size;
  }

  public boolean contains(int element) {
    return (size > 0) ? (arrayOfMembers[0] == element) : false;
  }
}