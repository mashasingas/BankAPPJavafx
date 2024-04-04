package application;



import javafx.geometry.Insets;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BankInsideUserInterface extends FlowPane{
	private Text text=new Text("Welcome to the Global Bank"+"\n"+"How can we assist you");
	bankImplementation bank=new bankImplementation();
	BankApp bankapp=new BankApp();
	private Label label=new Label("Current Balance");
	private TextField txtBalance=new TextField();
	
	private Label labelC=new Label("Cent Balance");
	private TextField txtBalanceCents=new TextField();
	
	private Label LtransactionAmount=new Label("Transaction");
	private TextField txtTransactionAmount=new TextField();
	

	
	private Button btnDeposit=new Button("Deposit");
	private Button btnWithdraw=new Button("Withdraw");
	private Button btnTransferToMain=new Button("Transfer To Main Account");
	private Button btnTransferToCent=new Button("Transfer To Cents Account");
	
	

	private Button btnPastTransaction=new Button("Past Transaction");
	private Button btnLogout=new Button("Logout");
	
   public void setUIControls(FlowPane flowpane,Stage primaryStage) {
	   flowpane.setAlignment(Pos.CENTER);
	   flowpane.setPadding(new Insets(10));
	   flowpane.setHgap(10);// set the Horizontal gap between the cols
	   flowpane.setVgap(10);
	   flowpane.setOrientation(javafx.geometry.Orientation.VERTICAL);
	   
	   text.setFont(Font.font("Arial",FontWeight.BOLD,16));
	   LtransactionAmount.setFont(Font.font("Arial",FontWeight.BOLD,16));
	   txtTransactionAmount.setFont(Font.font("Arial",FontWeight.BOLD,16));
	   
	   text.setFill(Color.BLUE);
	   label.setFont(Font.font("Arial",FontWeight.BOLD,16));
	   txtBalance.setFont(Font.font("Arial",FontWeight.BOLD,16));
	   txtBalanceCents.setFont(Font.font("Arial",FontWeight.BOLD,16));
	   labelC.setFont(Font.font("Arial",FontWeight.BOLD,16));
	   
	   btnDeposit.setFont(Font.font("Arial",FontWeight.BOLD,16));
	   btnWithdraw.setFont(Font.font("Arial",FontWeight.BOLD,16));
	   btnTransferToMain.setFont(Font.font("Arial",FontWeight.BOLD,16));
	   btnTransferToCent.setFont(Font.font("Arial",FontWeight.BOLD,16));
	   btnPastTransaction.setFont(Font.font("Arial",FontWeight.BOLD,16));
	   btnLogout.setFont(Font.font("Arial",FontWeight.BOLD,16));
	   
	   txtBalance.setMinWidth(200);
	   txtBalanceCents.setMinWidth(200);
	   
	   btnDeposit.setMinWidth(200);
	   btnWithdraw.setMinWidth(200);
	   btnTransferToMain.setMinWidth(200);
	   btnTransferToCent.setMinWidth(200);
	   btnPastTransaction.setMinWidth(200);
	   btnLogout.setMinWidth(200);
	   
	 
		
	   
	  
	   
	   flowpane.getChildren().addAll(text,LtransactionAmount,txtTransactionAmount,btnDeposit,btnWithdraw,
			   btnTransferToCent,btnTransferToMain,btnPastTransaction,btnLogout,label,txtBalance,labelC,txtBalanceCents);
	   
	   btnDeposit.setOnAction((e)->{
		   double transactionalAmount=Double.parseDouble(txtTransactionAmount.getText());
		   txtBalance.setText("R"+bank.newBalanceDeposit(transactionalAmount));
		   txtBalanceCents.setText("R"+bank.newBalanceDepositcents(transactionalAmount));
		   bank.setNewBalanceDeposit(transactionalAmount);
		   
		   
		   
		   
	   });
	   btnWithdraw.setOnAction((e)->{
		   double transactionalAmount=Double.parseDouble(txtTransactionAmount.getText());
		   bank.validateWidrawalAmount(transactionalAmount);
		   txtBalance.setText("R"+bank.newBalanceWithdrawal(transactionalAmount));
		   txtBalanceCents.setText("R"+bank.newBalanceWithdrawalcents(transactionalAmount));
		   bank.setNewBalanceWithdraw(transactionalAmount);
		  
		   
		   
	   });
	   btnTransferToMain.setOnAction((e)->{
		   double transactionalAmount=Double.parseDouble(txtTransactionAmount.getText());
		   txtBalance.setText("R"+bank.transferToMain(transactionalAmount));
		   bank.setNewBaltransToMain(transactionalAmount);
		   
	   });
	   btnTransferToCent.setOnAction((e)->{
		   double transactionalAmount=Double.parseDouble(txtTransactionAmount.getText());
		   txtBalanceCents.setText("R"+bank.transferToCents(transactionalAmount));
		   bank.setNewBaltransToCents(transactionalAmount);
		   
	   });
	
	   
   }
}
