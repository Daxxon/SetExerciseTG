public class Set {

  private int size;

  private Integer[] arrayOfMembers = new Integer[5];

  public void add(int element){
    if(!contains(element)) {
      arrayOfMembers[size] = element;
      size++;
    }
  }

  public boolean isEmpty(){
    return (size == 0);
  }

  public int size() {
    return size;
  }

  public boolean contains(int element) {
    for (int i = 0; i < size; i++) {
      if (arrayOfMembers[i] == element) {
        return true;
      }
    }
    return false;
  }
}