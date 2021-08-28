package Week3.Day2;

public interface TaxCalculation {
/**
 * 
 * @param name
 * @param HRA
 * @param LTA
 */

public void calcDeductions(String name, double HRA, double LTA);

	/**
	 * 
	 * @param name
	 * @param HRA
	 * @param deductions
	 */
	
 void calGrossIncome(String name, double HRA, double deductions);

/**
 * 
 * @return
 */
public int taxSlab();

/**
 * 
 * @return
 */
public double  calcTaxandPublishValue();
}

