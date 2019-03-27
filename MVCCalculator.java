package org.priyam.mvc;

public class MVCCalculator {
    
    public static void main(String[] args) throws Exception{
    	
    	CalculatorView theView = new CalculatorView();
        
    	CalculatorModel theModel = new CalculatorModel();
        
        new CalculatorController(theView,theModel);
        
        theView.setVisible(true);
        
    }
}
