import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetTest {

  private Set testObject;

  @Before
  public void setUp() throws Exception {
    testObject = new Set();
  }

  @Test
  public void isEmpty_ReturnsTrue_WhenTheSetIsEmpty() {
    boolean actual = testObject.isEmpty();

    assertTrue(actual);
  }

  @Test
  public void isEmpty_ReturnsFalse_WhenTheSetContainsAMember() {
    testObject.add(0);
    boolean actual = testObject.isEmpty();

    assertFalse(actual);
  }

  @Test
  public void size_returns1_whenOnlyOneMemberHasBeenAdded() throws Exception {

    testObject.add(0);

    int actual = testObject.size();

    assertEquals(1, actual);
  }

  @Test
  public void size_returns0_whenNoMembersHaveBeenAdded() {

    int actual = testObject.size();

    assertEquals(0, actual);

  }

  @Test
  public void size_returnsNumberOfMembers() {

    testObject.add(0);
    testObject.add(1);
    testObject.add(2);
    testObject.add(3);
    testObject.add(4);

    int actual = testObject.size();

    assertEquals(5, actual);
  }

  @Test
  public void containsReturnsFalseWhenElementIsNotMember() {

    boolean actual = testObject.contains(0);

    assertEquals(false, actual);
  }

  @Test
  public void containsReturnsTrueWhenElementIsMember() {

    testObject.add(6);
    boolean actual = testObject.contains(6);

    assertTrue(actual);
  }

  @Test
  public void containsReturnsTrueWhenSetContainsMoreThanOneMember() {

    testObject.add(0);
    testObject.add(6);

    assertTrue(testObject.contains(0));
    assertTrue(testObject.contains(6));
  }

  @Test
  public void sizeDoesNotIncreaseWhenSameMemberIsAddedMoreThanOnce() {

    testObject.add(0);
    testObject.add(0);

    assertEquals(1, testObject.size());
  }

}