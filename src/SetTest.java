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
  public void isEmpty_ReturnsFalse_WhenTheSetContainsAMember(){
    testObject.add(0);
    boolean actual = testObject.isEmpty();

    assertFalse(actual);
  }
}