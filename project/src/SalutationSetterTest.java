import org.junit.Assert;
import org.junit.Test; 

public class SalutationSetterTest {

    // @Test   
    // public void testSetSalutation_DecisionTable() {
    //     // Testcase 1: Male - Single
    //     String salutation1 = SalutationSetter.setSalutation("male", "single");
    //     Assert.assertEquals("Mr.", salutation1);
    //     System.out.println("Testcase 1 passed. Expected = Mr., Actual = " + salutation1);

    //     // Testcase 2: Male - Married
    //     String salutation2 = SalutationSetter.setSalutation("male", "married");
    //     Assert.assertEquals("Mr.", salutation2);
    //     System.out.println("Testcase 2 passed. Expected = Mr., Actual = " + salutation2);

    //     // Testcase 3: Female - Single
    //     String salutation3 = SalutationSetter.setSalutation("female", "single");
    //     Assert.assertEquals("Ms.", salutation3);
    //     System.out.println("Testcase 3 passed. Expected = Ms., Actual = " + salutation3);

    //     // Testcase 4: Female - Married
    //     String salutation4 = SalutationSetter.setSalutation("female", "married");
    //     Assert.assertEquals("Mrs.", salutation4);
    //     System.out.println("Testcase 4 passed. Expected = Mrs., Actual = " + salutation4);

    //     // Testcase 5: Other - Other 
    //     String salutation5 = SalutationSetter.setSalutation("other", "single");
    //     Assert.assertEquals("", salutation5);
    //     System.out.println("Testcase 5 passed. Expected = \"\", Actual = " + salutation5);
    // }

    // @Test
    // public void testSetSalutation_EquivalencePartitioning() {
    //     // Testcase 1: Male - Single
    //     String salutation1 = SalutationSetter.setSalutation("male", "single");
    //     Assert.assertEquals("Mr.", salutation1);
    //     System.out.println("Testcase 1 passed. Expected = Mr., Actual = " + salutation1);

    //     // Testcase 2: Female - Married
    //     String salutation2 = SalutationSetter.setSalutation("female", "married");
    //     Assert.assertEquals("Mrs.", salutation2);
    //     System.out.println("Testcase 2 passed. Expected = Mrs., Actual = " + salutation2);

    //     // Testcase 3: Other - Other 
    //     String salutation3 = SalutationSetter.setSalutation("other", "other");
    //     Assert.assertEquals("", salutation3);        
    //     System.out.println("Testcase 3 passed. Expected = \"\", Actual = " + salutation3);

    // }

    @Test   
    public void testSetSalutation_BranchCoverageCriterion() {
        // Testcase 1: Male - Single
        String salutation1 = SalutationSetter.setSalutation("male", "single");
        Assert.assertEquals("Mr.", salutation1);
        System.out.println("Testcase 1 passed. Expected = Mr., Actual = " + salutation1);

        // Testcase 2: Male - Married
        String salutation2 = SalutationSetter.setSalutation("male", "married");
        Assert.assertEquals("Mr.", salutation2);
        System.out.println("Testcase 2 passed. Expected = Mr., Actual = " + salutation2);

        // Testcase 3: Male - Other
        String salutation3 = SalutationSetter.setSalutation("male", "other");
        Assert.assertEquals("", salutation3);
        System.out.println("Testcase 3 passed. Expected = \"\", Actual = " + salutation3);

        // Testcase 4: Other - Single
        String salutation4 = SalutationSetter.setSalutation("other", "single");
        Assert.assertEquals("", salutation4);
        System.out.println("Testcase 4 passed. Expected = \"\", Actual = " + salutation4);
        
        // Testcase 5: Female - Single
        String salutation5 = SalutationSetter.setSalutation("female", "single");
        Assert.assertEquals("Ms.", salutation5);
        System.out.println("Testcase 5 passed. Expected = Ms., Actual = " + salutation5);

        // Testcase 6: Female - Married
        String salutation6 = SalutationSetter.setSalutation("female", "married");
        Assert.assertEquals("Mrs.", salutation6);
        System.out.println("Testcase 6 passed. Expected = Mrs., Actual = " + salutation6);

        // Testcase 7: Female - Other 
        String salutation7 = SalutationSetter.setSalutation("female", "other");
        Assert.assertEquals("", salutation7);
        System.out.println("Testcase 7 passed. Expected = \"\", Actual = " + salutation7);
    }
}