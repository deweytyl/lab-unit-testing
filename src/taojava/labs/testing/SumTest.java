package taojava.labs.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest
{

  @Test
  public void
    test ()
  {
    int[] values = { 1, 2, 3 };
    int[] negValues = {-1, -2, -3};
    int[] negAndPosValues = {-2, -3, 4};
    int[] sameValues = {6, 6, 6};
    int[] manyValues = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                        1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    int[] zeroValues = {0, 1, 2, 3};
    
    assertEquals ("values", 6, SampleMethods.sum (values));
    assertEquals ("negValues", -6, SampleMethods.sum (negValues));
    assertEquals ("negAndPosValues", -1, SampleMethods.sum (negAndPosValues));
    assertEquals ("sameValues", 18, SampleMethods.sum (sameValues));
    assertEquals ("manyValues", 20, SampleMethods.sum (manyValues));
    assertEquals ("zeroValues", 6, SampleMethods.sum (zeroValues));
  }
  /**
   * 3f: We would prefer to alter the preconditions to account for 
   * integer overflow, because altering the code to account for such
   * a case, while probably possible, could very easily lead to very
   * messy code, and the vast majority of the time a program such as
   * 'sum' would likely not be dealing with such extremely large
   * values.
   */
}
