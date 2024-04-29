import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ExpenseTrackerTest{
    @Test
    public void testAddExpenseUpdatesUI(){
        ExpenseSubject subject = new ExpenseSubject();
        UIObserver ui = new UIObserver(subject);
        subject.attach(ui);

        subject.addExpense(new Expense("Tea", 3.50));
        assertTrue("There should be no changes to UI when expense is added", ui.isUpdated());
    }
}
