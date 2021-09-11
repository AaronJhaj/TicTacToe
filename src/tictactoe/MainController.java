package tictactoe;

import java.util.ArrayList;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
	@FXML
	private Button TL;
	@FXML
	private Button TM;
	@FXML
	private Button TR;
	@FXML
	private Button ML;
	@FXML
	private Button MM;
	@FXML
	private Button MR;
	@FXML
	private Button BL;
	@FXML
	private Button BM;
	@FXML
	private Button BR;
	ArrayList<String> remaining = new ArrayList<String>() {
		{
			add("TL");
			add("TM");
			add("TR");
			add("ML");
			add("MM");
			add("MR");
			add("BL");
			add("BM");
			add("BR");
		}
	};
	
	ArrayList<Button> remaining2 = new ArrayList<Button>() {
		{
			add(TL);
			add(TM);
			add(TR);
			add(ML);
			add(MM);
			add(MR);
			add(BL);
			add(BM);
			add(BR);
		}
	};
	
	
	
	
	
	@FXML
	public void button(ActionEvent e) {
		
		if (((Button)e.getSource()).getText().equals("")) {
			((Button)e.getSource()).setText("X");
			((Button)e.getSource()).setStyle("-fx-background-color: #00FFFF; ");
			for(int i = 0; i<remaining.size(); i++) {
				if(remaining.get(i).equals(((Button)e.getSource()).getId()))
					remaining.remove(i);
				
			}
		
			
			//You win
			
			if(TL.getText().equals("X") && TM.getText().equals("X") && TR.getText().equals("X")) {
				//((Node)e.getSource()).getScene().getWindow().hide();
				Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
				alert.setContentText("You win");
				alert.showAndWait();
			}
			
			if(TL.getText().equals("X") && MM.getText().equals("X") && BR.getText().equals("X")) {
				//((Node)e.getSource()).getScene().getWindow().hide();
				Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
				alert.setContentText("You win");
				alert.showAndWait();
			}
			
			if(TL.getText().equals("X") && ML.getText().equals("X") && BL.getText().equals("X")) {
				//((Node)e.getSource()).getScene().getWindow().hide();
				Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
				alert.setContentText("You win");
				alert.showAndWait();
			}
			
			if(ML.getText().equals("X") && MM.getText().equals("X") && MR.getText().equals("X")) {
				//((Node)e.getSource()).getScene().getWindow().hide();
				Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
				alert.setContentText("You win");
				alert.showAndWait();
			}
			
			if(BL.getText().equals("X") && BM.getText().equals("X") && BR.getText().equals("X")) {
				//((Node)e.getSource()).getScene().getWindow().hide();
				Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
				alert.setContentText("You win");
				alert.showAndWait();
			}
			
			if(TM.getText().equals("X") && MM.getText().equals("X") && BM.getText().equals("X")) {
				//((Node)e.getSource()).getScene().getWindow().hide();
				Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
				alert.setContentText("You win");
				alert.showAndWait();
			}
			
			if(TR.getText().equals("X") && MR.getText().equals("X") && BR.getText().equals("X")) {
				//((Node)e.getSource()).getScene().getWindow().hide();
				Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
				alert.setContentText("You win");
				alert.showAndWait();
			}
			
			if(BL.getText().equals("X") && MM.getText().equals("X") && TR.getText().equals("X")) {
				//((Node)e.getSource()).getScene().getWindow().hide();
				Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
				alert.setContentText("You win");
				alert.showAndWait();
			}
			
			
			//Computer wins
			
			if(TL.getText().equals("O") && TM.getText().equals("O") && TR.getText().equals("O")) {
				//((Node)e.getSource()).getScene().getWindow().hide();
				Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
				alert.setContentText("You win");
				alert.showAndWait();
			}
			
			if(TL.getText().equals("O") && MM.getText().equals("O") && BR.getText().equals("O")) {
				//((Node)e.getSource()).getScene().getWindow().hide();
				Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
				alert.setContentText("You win");
				alert.showAndWait();
			}
			
			if(TL.getText().equals("O") && ML.getText().equals("O") && BL.getText().equals("O")) {
				((Node)e.getSource()).getScene().getWindow().hide();
				Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
				//alert.setTitle("Error");
				//alert.setHeaderText("Incorrect Username");
				alert.setContentText("You win");
				alert.showAndWait();
			}
			
			if(ML.getText().equals("O") && MM.getText().equals("O") && MR.getText().equals("O")) {
				//((Node)e.getSource()).getScene().getWindow().hide();
				Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
				alert.setContentText("You win");
				alert.showAndWait();
			}
			
			if(BL.getText().equals("O") && BM.getText().equals("O") && BR.getText().equals("O")) {
				//((Node)e.getSource()).getScene().getWindow().hide();
				Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
				alert.setContentText("You win");
				alert.showAndWait();
			}
			
			if(TM.getText().equals("O") && MM.getText().equals("O") && BM.getText().equals("O")) {
				//((Node)e.getSource()).getScene().getWindow().hide();
				Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
				alert.setContentText("You win");
				alert.showAndWait();
			}
			
			if(TR.getText().equals("O") && MR.getText().equals("O") && BR.getText().equals("O")) {
				//((Node)e.getSource()).getScene().getWindow().hide();
				Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
				alert.setContentText("You win");
				alert.showAndWait();
			}
			
			if(BL.getText().equals("O") && MM.getText().equals("O") && TR.getText().equals("O")) {
				//((Node)e.getSource()).getScene().getWindow().hide();
				Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
				alert.setContentText("You win");
				alert.showAndWait();
			}
			
			
			if (remaining.size()>0) {
				Random rand = new Random();
			    int upperbound = remaining.size();
			    int int_random = rand.nextInt(upperbound);
			    if(remaining.get(int_random).equals("TL")) {
			    	TL.setText("O");
			    	TL.setStyle("-fx-background-color: #32CD32; ");
			    	remaining.remove(int_random);
			    }else {
			    	if(remaining.get(int_random).equals("TM")) {
			    		TM.setText("O");
			    		TM.setStyle("-fx-background-color: #32CD32; ");
				    	remaining.remove(int_random);
			    	} else {
			    		if(remaining.get(int_random).equals("TR")) {
			    			TR.setText("O");
			    			TR.setStyle("-fx-background-color: #32CD32; ");
					    	remaining.remove(int_random);
			    		}else {
				    		if(remaining.get(int_random).equals("ML")) {
				    			ML.setText("O");
				    			ML.setStyle("-fx-background-color: #32CD32; ");
						    	remaining.remove(int_random);
				    		}else {
					    		if(remaining.get(int_random).equals("MM")) {
					    			MM.setText("O");
					    			MM.setStyle("-fx-background-color: #32CD32; ");
							    	remaining.remove(int_random);
					    		}else {
						    		if(remaining.get(int_random).equals("MR")) {
						    			MR.setText("O");
						    			MR.setStyle("-fx-background-color: #32CD32; ");
								    	remaining.remove(int_random);
						    		}else {
							    		if(remaining.get(int_random).equals("BL")) {
							    			BL.setText("O");
							    			BL.setStyle("-fx-background-color: #32CD32; ");
									    	remaining.remove(int_random);
							    		}else {
								    		if(remaining.get(int_random).equals("BM")) {
								    			BM.setText("O");
								    			BM.setStyle("-fx-background-color: #32CD32; ");
										    	remaining.remove(int_random);
								    		}else {
									    		if(remaining.get(int_random).equals("BR")) {
									    			BR.setText("O");
									    			BR.setStyle("-fx-background-color: #32CD32; ");
											    	remaining.remove(int_random);
									    		}
									    	}
								    	}
							    	}
						    	}
					    	}
				    	}
			    	}
			    }
			}
			
		    
		    
		}
		
		
	}
	

	
	
	
	
}
