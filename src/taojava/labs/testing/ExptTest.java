package taojava.labs.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExptTest
{

  @Test
  public void
    test ()
  {
    for (int h = -5; h <= 5; h++)
      {
        int expected = 1;
        for (int i = 0; i < 50; i++)
          {
            assertEquals (h + " ^ " + i, expected, 
                           SampleMethods.expt (h, i));
            expected *= h;
          }
      }
  }

}
