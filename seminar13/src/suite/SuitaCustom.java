package suite;

import categorii.Categorie1;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.AplicaDiscountTest;
import test.StubPersoanaTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({AplicaDiscountTest.class, StubPersoanaTest.class})
@Categories.IncludeCategory(Categorie1.class)
public class SuitaCustom {
}
