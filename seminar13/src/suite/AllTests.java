package suite;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Suite;
import test.AplicaDiscountTest;
import test.StubPersoanaTest;

@RunWith(JUnit4.class)
@Suite.SuiteClasses({AplicaDiscountTest.class, StubPersoanaTest.class})

public class AllTests {
}
