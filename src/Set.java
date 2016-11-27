public class Set {

  private int currentSize;
  private int oldSize = 5;

  private Integer[] arrayOfMembers = new Integer[5];

  public void add(int element) {
    if (!contains(element)) {
      arrayOfMembers[currentSize] = element;
      currentSize++;
    }

    if (currentSize == oldSize) {
      Integer[] newArrayOfMembers = new Integer[oldSize*2];
      for (int i = 0; i < oldSize; i++) {
        newArrayOfMembers[i] = arrayOfMembers[i];
      }
      oldSize *= 2;
      arrayOfMembers = newArrayOfMembers;
    }
  }

  public boolean isEmpty() {
    return (currentSize == 0);
  }

  public int size() {
    return currentSize;
  }

  public boolean contains(int element) {
    return indexOf(element) >= 0;
  }

  private int indexOf(int element) {
    for (int i = 0; i < currentSize; i++) {
      if (arrayOfMembers[i] == element) {
        return i;
      }
    }
    return -1;
  }

  public void remove(int element) {
    int i = indexOf(element);
    if (i >= 0) {
      arrayOfMembers[i] = arrayOfMembers[size() - 1];
      currentSize--;
    }
  }

  public void clear() {
    currentSize = 0;
  }
}