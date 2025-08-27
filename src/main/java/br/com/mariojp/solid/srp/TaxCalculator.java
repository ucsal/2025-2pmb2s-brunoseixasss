package br.com.mariojp.solid.srp;

public class TaxCalculator {
	 public double calculateTax(double subtotal) {
	        double taxRate = getTaxRate();
	        return subtotal * taxRate;
	    }
	    
	    private double getTaxRate() {
	        String taxRateProperty = System.getProperty("tax.rate", "0.10");
	        return Double.parseDouble(taxRateProperty);
	    }
	}