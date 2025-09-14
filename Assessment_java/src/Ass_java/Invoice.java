package Ass_java;

public class Invoice {
    private int invoiceId;
    private int appointmentId;
    private double serviceCost;
    private double medicationCost;
    private double tax;
    private double insuranceDiscount;
    private double totalCost;

    public double calculateTotal(double serivceCost,double medicationCost,double tax,double insuranceDiscount)
    {
    	this.serviceCost=serivceCost;
    	this.medicationCost=medicationCost;
    	this.tax=tax;
    	this.insuranceDiscount=insuranceDiscount;
        totalCost = serviceCost + medicationCost + tax - insuranceDiscount;
        return totalCost;
    }
   

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public double getServiceCost() {
		return serviceCost;
	}

	public void setServiceCost(double serviceCost) {
		this.serviceCost = serviceCost;
	}

	public double getMedicationCost() {
		return medicationCost;
	}

	public void setMedicationCost(double medicationCost) {
		this.medicationCost = medicationCost;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getInsuranceDiscount() {
		return insuranceDiscount;
	}

	public void setInsuranceDiscount(double insuranceDiscount) {
		this.insuranceDiscount = insuranceDiscount;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
    
    
}