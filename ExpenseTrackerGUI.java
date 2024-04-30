//Import all the required files
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ExpenseTrackerGUI extends JFrame{
    //make the variables, expebses category,amount,date,expenseArea
    private List<Expense> expenses=new ArrayList<>();
    private JTextField categoryField;
    private JTextField amountField;
    private JTextField dateField;
    private JTextArea expenseArea;

        //this is for the interactive GUI
    public ExpenseTrackerGUI() {
        createUI();
    }
    //make a func called createUI to set the attributes of the GUI that you are going to use.
    private void createUI(){
        //Expense tracker 
        setTitle("Expense Tracker");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        categoryField=new JTextField(10);
        amountField=new JTextField(10);
        dateField=new JTextField(10);
        expenseArea=new JTextArea();
        expenseArea.setEditable(false);

        //j panel to make the heading Category,Amount and date
        JPanel inputPanel=new JPanel();
        inputPanel.add(new JLabel("Category:"));
        inputPanel.add(categoryField);
        inputPanel.add(new JLabel("Amount:"));
        inputPanel.add(amountField);
        inputPanel.add(new JLabel("Date:"));
        inputPanel.add(dateField);

        //Add a button called Add expense
        JButton addButton=new JButton("Add Expense");
        addButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                addExpense();
            }
        });

        inputPanel.add(addButton);

        //Set the border and make it center for scroll panel
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(expenseArea), BorderLayout.CENTER);

        setVisible(true);
    }

    private void addExpense(){
        String category=categoryField.getText();
        double amount=Double.parseDouble(amountField.getText());
        String date=dateField.getText(); //parse

        expenses.add(new Expense(category,amount,date));

        expenseArea.append("Category: " + category + ", Amount: " + amount + ", Date: " + date + "\n");

        categoryField.setText("");
        amountField.setText("");
        dateField.setText("");
    }

    //main
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new ExpenseTrackerGUI();
            }
        });
    }

        //define user and expense
    class User{
        private String username;
        private String password;
        private String role;

        //constructor
        public User(String username, String password, String role){
            this.username=username;
            this.password=password;
            this.role=role;
        }

        //instead of making those huge ones, make it like js
        public String getUsername(){return username;}
        public String getPassword(){return password;}
        public String getRole(){return role;}
    }

    class Expense{
        //for expense make three vars=c, amount and date.
        private String category;
        private double amount;
        private String date;

        //constructor
        public Expense(String category,double amount,String date) {
            this.category=category;
            this.amount=amount;
            this.date=date;
        }

        //instead of making those huge ones, make it like js
        public String getCategory(){return category;}
        public double getAmount(){return amount;}
        public String getDate(){return date;}
    }
}
