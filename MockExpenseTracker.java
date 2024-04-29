import java.util.ArrayList;
import java.util.List;

//using an array list and list I should be able to make a simple mock of how the features will look.
public class MockExpenseTracker{
    //make a new array
    private static List<Expense> expenses =new ArrayList<>();

    //make the expense class.
    public static class Expense{
        private String category;
        private double amount;
        private String date; //a normal string which can be parsed.

        //constructor
        public Expense(String category, double amount, String date){
            this.category=category;
            this.amount=amount;
            this.date=date;
            }

        public String getCategory(){
            return category;
         }

        public double getAmount(){
            return amount;
            }

        public String getDate(){
            return date;
            }

        @Override
        public String toString(){
            return "Expense{" + "category='" + category + '\'' + ", amount=" + amount + ", date='" + date +'}';
            }
    }

        //add expense
    public static void addExpense(String category, double amount, String date){
        //make a new expense and fill in the catergories 
        Expense newExpense=new Expense(category, amount, date);
        expenses.add(newExpense);
        //succesfull
        System.out.println("Added new expense: " + newExpense);
    }

    public static List<Expense> getExpenses(){
        return expenses;
    }

    public static void displayExpenses(){
        if(expenses.isEmpty()){
            System.out.println("No expenses");
        } 
        else{
            System.out.println("Recorded Expenses:");
            expenses.forEach(expense -> System.out.println(expense));
        }
    }
}
