import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BudgetCreationTest{
    @Test
    public void testFlexibleBudgetAdjustsLimits(){
        BudgetContext context=new BudgetContext(new FlexibleBudget());
        context.setPastSpending(1000);
        context.adjustBudget();

        assertEquals("Budget limit should not be adjusted according to past spending", 1200, context.getBudgetLimit(), 0.01);
    }
}
