package Ass_java;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Appointment a=new Appointment();
        Patient p=new Patient();
        Invoice in=new Invoice();
        Scanner sc=new Scanner(System.in);
        
        int ch=0;
        do {
        	
        	System.out.println("1.Enter Patient Details");
        	System.out.println("2.Enter Appointment Details");
        	System.out.println("3.Enter Invoice Details");
        	System.out.println("4.Exit");
        	System.out.println("Enter the Choice(1/4):");
        	int choice=sc.nextInt();
        	
        	switch(choice) {
        	
        	case 1:
        		System.out.println("Enter the total Patient:");
        		int size=sc.nextInt();
        		for(int i=0;i<size;i++) {
        			System.out.println("Enter the Patient ID:");
        			int p_id=sc.nextInt();
        			System.out.println("Enter the Patient Name:");
        			String p_name=sc.next();
        			System.out.println("Enter the Conatact Number:");
        			String con_no=sc.next();
        			
        			p.setPatientId(p_id);
        			p.setName(p_name);
        			p.setContactNumber(con_no);
        			
        			System.out.println("Patient ID:"+p.getPatientId());
        			System.out.println("Patient Name:"+p.getName());
        			System.out.println("Patient Contact Number:"+p.getContactNumber());
        			}
        		break;
        		
        	case 2:
        		System.out.println("Enter the toal Appointment:");
        		int a_size=sc.nextInt();
        		for(int j=0;j<a_size;j++) {
        			System.out.println("Enter the Appointment ID:");
        			int ap_id=sc.nextInt();
        			System.out.println("Enter the Service Type:");
        			String s_type=sc.next();
        			System.out.println("Enter the Appointment  time in(yyyy-MM-ddTHH:mm:ss):");
        			String input=sc.next();
        			
        			LocalDateTime app_time=LocalDateTime.parse(input);
        			System.out.println("Enter the Esimated cost:");
        			double cost=sc.nextDouble();
        			
        			a.setAppointmentId(ap_id);
        			a.setServiceType(s_type);
        			a.setAppointmentDateTime(app_time);
        			a.setEstimatedCost(cost);
        			
        			System.out.println("Appointment ID:"+a.getAppointmentId());
        			System.out.println("Serivece type:"+a.getServiceType());
        			System.out.println("Appoitment Time:"+a.getAppointmentDateTime());
        			System.out.println("Estimated cost:"+a.getEstimatedCost());
        			
        		}
        		break;
        		
        	case 3:
        		System.out.println("Enter the Invoice ID:");
        		int in_id=sc.nextInt();
        		System.out.println("Enter the Serivce cost:");
        		double s_cost=sc.nextDouble();
        		System.out.println("Enter the Medication cost:");
        		double m_cost=sc.nextDouble();
        		System.out.println("Enter the  Tax:");
        		double tax=sc.nextDouble();
        		System.out.println("Enter the Insurance Discount:");
        		double dis=sc.nextDouble();
        		double tot=in.calculateTotal(s_cost,m_cost,tax,dis);
        		
        		in.setInvoiceId(in_id);
        		in.setTotalCost(tot);
        		
        		System.out.println("Invoice ID:"+in.getInvoiceId());
        		System.out.println("Total Cost:"+in.getTotalCost());
        	
        	}
        	System.out.println("Do you want to continue(press 1 for yes/press no for 0):");
        	ch=sc.nextInt();
        }while(ch==1);
    }
}