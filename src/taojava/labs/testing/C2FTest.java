package taojava.labs.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class C2FTest
{

  @Test
  public void
    testC2f ()
  {
    assertEquals("0C to 32F", 32, SampleMethods.c2f (0));
    
    assertEquals("100C to 212F", 212, SampleMethods.c2f (100));
  }

}
