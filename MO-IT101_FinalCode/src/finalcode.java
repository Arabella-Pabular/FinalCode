import java.awt.Font;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class finalcode {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		JTextArea myArea = new JTextArea(15,15);
		DecimalFormat f= new DecimalFormat("P00,000.00");
		DecimalFormat p= new DecimalFormat("P 0,000.00");
		DecimalFormat h= new DecimalFormat("000.00");
		
		final int STANDARD_WORK=168; // Monthly standard work hours 
		int Enumber;
		String Lname=("");
		String FName=("");
		String BDay;
		String Add;
		String Stat=("");
		String position=("");
		int Phone;
		double hoursWorked;
		double hourlyRate=0;
		double basicPay;
		double overTime=0;
		double overTimeRate=0;
		double overTimePay=0;
		double grossSalary=0;      //Gross Salary without deductions
	    double Tax=0;            //with holding tax
	    double philHealth=0.015;  // PhilHealth Deduction with 50% Employer's contribution
	    double SSS=0.04;          // SSS Deduction percentage
	    double PagIbig=0.02;     // PagIbig Fund Deduction percentage
	    double totaldeduct=0;    // Total Deductions 
	    double netSalary=0;      // Taxable Income
	        
	   
	    
	    double DeductSSS = grossSalary * SSS;
	    double DeductPf = grossSalary * PagIbig;
	    double DeductPh = grossSalary * philHealth;
	    double totalsalary = 0; // Final Salary after tax deduction
	    
	    
	    
	    {
		
		System.out.print("Enter an Employee Number: ");
		Enumber = keyboard.nextInt();
		int resp = Enumber;
		
			
		if (resp == 10001){ Lname ="Crisostomo";
        FName ="Jose";
        Stat = "Regular";
        position = "HR Manager";
        BDay = "February 14, 1988";
        Add ="17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands ";
        Phone = 918621603;
        hourlyRate = 373.04 ;
        System.out.println("****************");
        System.out.println("*Employee Number:" + Enumber);
        System.out.println("*Last Name:" + Lname);
        System.out.println("*First Name:" + FName);
        System.out.println("*Status:" + Stat);
        System.out.println("*Position:" + position);
        System.out.println("*Birthday:" + BDay);
        System.out.println("*Address:" + Add);
        System.out.println("*Phone Number:" + Phone);
		
        
		} 
		
			
		else
	    if (resp == 10002) {Lname ="Mata";
        FName ="Christian";
        Stat = "Regular";
        position = "Account Team Leader";
        BDay = "October 21, 1987";
        Add ="90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu ";
        Phone = 783776744;
        hourlyRate= 255.80;
        System.out.println("****************");
        System.out.println("*Employee Number:" + Enumber);
        System.out.println("*Last Name:" + Lname);
        System.out.println("*First Name:" + FName);
        System.out.println("*Status:" + Stat);
        System.out.println("*Position:" + position);
        System.out.println("*Birthday:" + BDay);
        System.out.println("*Address:" + Add);
        System.out.println("*Phone Number:" + Phone);}
	   
	    else
        if (resp == 10003) {
        	Lname ="San Jose";
            FName ="Brad";
            Stat = "Regular";
            position = "HR Team Leader";
            BDay = "March 15, 1996";
            Add ="99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi";
            Phone = 797009261;
            hourlyRate= 255.80;
            System.out.println("****************");
            System.out.println("*Employee Number:" + Enumber);
            System.out.println("*Last Name:" + Lname);
            System.out.println("*First Name:" + FName);
            System.out.println("*Status:" + Stat);
            System.out.println("*Position:" + position);
            System.out.println("*Birthday:" + BDay);
            System.out.println("*Address:" + Add);
            System.out.println("*Phone Number:" + Phone);
        }
        
        else
        if (resp == 10004) {Lname ="Salcedo";
        FName ="Anthony";
        Stat = "Regular";
        position = "Payroll Manager";
        BDay = "September 14, 1993";
        Add ="93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate";
        Phone = 070766300;
        hourlyRate = 362.05;
        System.out.println("****************");
        System.out.println("*Employee Number:" + Enumber);
        System.out.println("*Last Name:" + Lname);
        System.out.println("*First Name:" + FName);
        System.out.println("*Status:" + Stat);
        System.out.println("*Position:" + position);
        System.out.println("*Birthday:" + BDay);
        System.out.println("*Address:" + Add);
        System.out.println("*Phone Number:" + Phone);
        	
        }
        else
        if (resp == 10005) 
        {Lname ="Romualdez";
        FName ="Alice";
        Stat = "Regular";
        position = "HR Rank and File";
        BDay = "May 14, 1992";
        Add ="12A/33 Upton Isle Apt. 420, Roxas City 1814 Surigao del Norte";
        Phone = 983606799;
        hourlyRate= 133.93;
        System.out.println("****************");
        System.out.println("*Employee Number:" + Enumber);
        System.out.println("*Last Name:" + Lname);
        System.out.println("*First Name:" + FName);
        System.out.println("*Status:" + Stat);
        System.out.println("*Position:" + position);
        System.out.println("*Birthday:" + BDay);
        System.out.println("*Address:" + Add);
        System.out.println("*Phone Number:" + Phone);}
        else
        if (resp == 10006) {
        	Lname ="Atienza";
            FName ="Rosie";
            Stat = "Regular";
            position = "HR Rank and File";
            BDay = "September 24, 1948";
            Add ="90A Dibbert Terrace Apt. 190, San Lorenzo 6056 Davao del Norte";
            Phone = 266036427;
            hourlyRate= 133.93;
            System.out.println("****************");
            System.out.println("*Employee Number:" + Enumber);
            System.out.println("*Last Name:" + Lname);
            System.out.println("*First Name:" + FName);
            System.out.println("*Status:" + Stat);
            System.out.println("*Position:" + position);
            System.out.println("*Birthday:" + BDay);
            System.out.println("*Address:" + Add);
            System.out.println("*Phone Number:" + Phone);}
        else
        if (resp == 10007) {
        	Lname ="Farala";
            FName ="Martha";
            Stat = "Regular";
            position = "Payroll Rank and File";
            BDay = "January 11, 1942";
            Add ="42/25 Sawayn Stream, Ubay 1208 Zamboanga del Norte";
            Phone = 329034366;
            hourlyRate= 142.86;
            System.out.println("****************");
            System.out.println("*Employee Number:" + Enumber);
            System.out.println("*Last Name:" + Lname);
            System.out.println("*First Name:" + FName);
            System.out.println("*Status:" + Stat);
            System.out.println("*Position:" + position);
            System.out.println("*Birthday:" + BDay);
            System.out.println("*Address:" + Add);
            System.out.println("*Phone Number:" + Phone); 
        }
        else
        if (resp == 10008) {
        	Lname ="Martinez";
            FName ="Leila";
            Stat = "Regular";
            position = "Payroll Rank and File";
            BDay = "July 11, 1970";
            Add ="37/46 Kulas Roads, Maragondon 0962 Quirino  ";
            Phone = 877110749;
            hourlyRate= 142.86;
            System.out.println("****************");
            System.out.println("*Employee Number:" + Enumber);
            System.out.println("*Last Name:" + Lname);
            System.out.println("*First Name:" + FName);
            System.out.println("*Status:" + Stat);
            System.out.println("*Position:" + position);
            System.out.println("*Birthday:" + BDay);
            System.out.println("*Address:" + Add);
            System.out.println("*Phone Number:" + Phone);
        }
        else
        if (resp == 10009) {
        	 Lname ="San Jose";
             FName ="Allison";
             Stat = "Regular";
             position = "Account Rank and File";
             BDay = "June 24, 1986";
             Add ="08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union";
             Phone = 179075129;
             hourlyRate= 133.93;
             System.out.println("****************");
             System.out.println("*Employee Number:" + Enumber);
             System.out.println("*Last Name:" + Lname);
             System.out.println("*First Name:" + FName);
             System.out.println("*Status:" + Stat);
             System.out.println("*Position:" + position);
             System.out.println("*Birthday:" + BDay);
             System.out.println("*Address:" + Add);
             System.out.println("*Phone Number:" + Phone);
        }
        else
        if (resp == 10010) {
        	Lname ="Rosario";
            FName ="Cydney";
            Stat = "Regular";
            position = "Account Rank and File";
            BDay = "October 6, 1996";
            Add ="93A/21 Berge Points, Tapaz 2180 Quezon";
            Phone = 868819912;
            hourlyRate= 133.93;
            System.out.println("****************");
            System.out.println("*Employee Number:" + Enumber);
            System.out.println("*Last Name:" + Lname);
            System.out.println("*First Name:" + FName);
            System.out.println("*Status:" + Stat);
            System.out.println("*Position:" + position);
            System.out.println("*Birthday:" + BDay);
            System.out.println("*Address:" + Add);
            System.out.println("*Phone Number:" + Phone);
        }
        else
        if (resp == 10011) {
        	Lname ="Lopez";
            FName ="Josie";
            Stat = "Regular";
            position = "Payroll Team Leader";
            BDay = "January 14, 1937";
            Add ="49 Springs Apt. 266, Poblacion, Taguig 3200 Occidental Mindoro";
            Phone = 478355427;
            hourlyRate= 229.02;
            System.out.println("****************");
            System.out.println("*Employee Number:" + Enumber);
            System.out.println("*Last Name:" + Lname);
            System.out.println("*First Name:" + FName);
            System.out.println("*Status:" + Stat);
            System.out.println("*Position:" + position);
            System.out.println("*Birthday:" + BDay);
            System.out.println("*Address:" + Add);
            System.out.println("*Phone Number:" + Phone);
        }
        else
        if (resp == 10012) {
        	Lname ="De Leon";
            FName ="Selena";
            Stat = "Regular";
            position = "Account Team Leader";
            BDay = "February 20, 1945";
            Add ="89A Armstrong Trace, Compostela 7874 Maguindanao";
            Phone = 975432139;
            hourlyRate= 249.11;
            System.out.println("****************");
            System.out.println("*Employee Number:" + Enumber);
            System.out.println("*Last Name:" + Lname);
            System.out.println("*First Name:" + FName);
            System.out.println("*Status:" + Stat);
            System.out.println("*Position:" + position);
            System.out.println("*Birthday:" + BDay);
            System.out.println("*Address:" + Add);
            System.out.println("*Phone Number:" + Phone);
        }
        else
        if (resp == 10013) {
        	 Lname ="Romualdez";
             FName ="Fredrick";
             Stat = "Regular";
             position = "Account Manager";
             BDay = "March 10, 1985";
             Add ="22A/52 Lubowitz Meadows, Pililla 4895 Zambales";
             Phone = 23079009;
             hourlyRate= 377.98;
             System.out.println("****************");
             System.out.println("*Employee Number:" + Enumber);
             System.out.println("*Last Name:" + Lname);
             System.out.println("*First Name:" + FName);
             System.out.println("*Status:" + Stat);
             System.out.println("*Position:" + position);
             System.out.println("*Birthday:" + BDay);
             System.out.println("*Address:" + Add);
             System.out.println("*Phone Number:" + Phone);
        }
        else
        if (resp == 10014) {
        	Lname ="Bautista";
            FName ="Mark";
            Stat = "Regular";
            position = "Account Rank and File";
            BDay = "February 12, 1961";
            Add ="65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino";
            Phone = 683725348;
            hourlyRate= 138.39;
            System.out.println("****************");
            System.out.println("*Employee Number:" + Enumber);
            System.out.println("*Last Name:" + Lname);
            System.out.println("*First Name:" + FName);
            System.out.println("*Status:" + Stat);
            System.out.println("*Position:" + position);
            System.out.println("*Birthday:" + BDay);
            System.out.println("*Address:" + Add);
            System.out.println("*Phone Number:" + Phone);
        }
        else
        if (resp == 10015) {
        	Lname ="Lazaro";
            FName ="Darlene";
            Stat = "Probationary";
            position = "Account Rank and File";
            BDay = "November 25, 1985";
            Add ="47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino";
            Phone = 740721558;
            hourlyRate= 138.39;
            System.out.println("****************");
            System.out.println("*Employee Number:" + Enumber);
            System.out.println("*Last Name:" + Lname);
            System.out.println("*First Name:" + FName);
            System.out.println("*Status:" + Stat);
            System.out.println("*Position:" + position);
            System.out.println("*Birthday:" + BDay);
            System.out.println("*Address:" + Add);
            System.out.println("*Phone Number:" + Phone);
        }
        else
        if (resp == 10016) {
        	 Lname ="Delos Santos";
             FName ="Kolby ";
             Stat = "Probationary";
             position = "Account Rank and File";
             BDay = "February 26, 1980";
             Add ="06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur";
             Phone = 739443033;
             hourlyRate= 142.86;
             System.out.println("****************");
             System.out.println("*Employee Number:" + Enumber);
             System.out.println("*Last Name:" + Lname);
             System.out.println("*First Name:" + FName);
             System.out.println("*Status:" + Stat);
             System.out.println("*Position:" + position);
             System.out.println("*Birthday:" + BDay);
             System.out.println("*Address:" + Add);
             System.out.println("*Phone Number:" + Phone);
        }
        else
        if (resp == 10017) {
        	 Lname ="Santos";
             FName ="Vella";
             Stat = "Probationary";
             position = "Account Rank and File";
             BDay = "December 31, 1983";
             Add ="99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur";
             Phone = 955879269;
             hourlyRate= 133.93;
             System.out.println("****************");
             System.out.println("*Employee Number:" + Enumber);
             System.out.println("*Last Name:" + Lname);
             System.out.println("*First Name:" + FName);
             System.out.println("*Status:" + Stat);
             System.out.println("*Position:" + position);
             System.out.println("*Birthday:" + BDay);
             System.out.println("*Address:" + Add);
             System.out.println("*Phone Number:" + Phone);
        }
        else
        if (resp == 10018) {        	
        	Lname ="Del Rosario";
            FName ="Tomas";
            Stat = "Probationary";
            position = "Account Rank and File";
            BDay = "December 18, 1978";
            Add ="80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque";
            Phone = 882550989;
            hourlyRate= 133.93;
            System.out.println("****************");
            System.out.println("*Employee Number:" + Enumber);
            System.out.println("*Last Name:" + Lname);
            System.out.println("*First Name:" + FName);
            System.out.println("*Status:" + Stat);
            System.out.println("*Position:" + position);
            System.out.println("*Birthday:" + BDay);
            System.out.println("*Address:" + Add);
            System.out.println("*Phone Number:" + Phone);
        }
        else
        if (resp == 10019) { 
        	 Lname ="Tolentino";
             FName ="Jacklyn";
             Stat = "Probationary";
             position = "Account Rank and File";
             BDay = "May 19, 1944";
             Add ="96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao";
             Phone = 675757366;
             hourlyRate= 142.86;
             System.out.println("****************");
             System.out.println("*Employee Number:" + Enumber);
             System.out.println("*Last Name:" + Lname);
             System.out.println("*First Name:" + FName);
             System.out.println("*Status:" + Stat);
             System.out.println("*Position:" + position);
             System.out.println("*Birthday:" + BDay);
             System.out.println("*Address:" + Add);
             System.out.println("*Phone Number:" + Phone);
        }
        else
        if (resp == 10020) {
        	Lname ="Gutierrez";
            FName ="Percival";
            Stat = "Probationary";
            position = "Account Rank and File";
            BDay = "December 18, 1970";
            Add ="58A Wilderman Walks, Poblacion, Digos 5822 Davao del Sur";
            Phone = 512899876;
            hourlyRate= 147.32;
            System.out.println("****************");
            System.out.println("*Employee Number:" + Enumber);
            System.out.println("*Last Name:" + Lname);
            System.out.println("*First Name:" + FName);
            System.out.println("*Status:" + Stat);
            System.out.println("*Position:" + position);
            System.out.println("*Birthday:" + BDay);
            System.out.println("*Address:" + Add);
            System.out.println("*Phone Number:" + Phone);
        }
        else
        if (resp == 10021) {
        	Lname ="Manalaysay";
            FName ="Garfield";
            Stat = "Probationary";
            position = "Account Rank and File";
            BDay = "August 28, 1966";
            Add ="60 Goyette Valley Suite 219, Poblacion, Tabuk 3159 Lanao del Sur";
            Phone = 948628136;
            hourlyRate= 147.32;
            System.out.println("****************");
            System.out.println("*Employee Number:" + Enumber);
            System.out.println("*Last Name:" + Lname);
            System.out.println("*First Name:" + FName);
            System.out.println("*Status:" + Stat);
            System.out.println("*Position:" + position);
            System.out.println("*Birthday:" + BDay);
            System.out.println("*Address:" + Add);
            System.out.println("*Phone Number:" + Phone);
        }
        else
        if (resp == 10022) {
        	Lname ="Villegas";
            FName ="Lizeth";
            Stat = "Probationary";
            position = "Account Rank and File";
            BDay = "December 12, 1981";
            Add ="66/77 Mann Views, Luisiana 1263 Dinagat Islands";
            Phone = 332372215;
            hourlyRate= 142.86;
            System.out.println("****************");
            System.out.println("*Employee Number:" + Enumber);
            System.out.println("*Last Name:" + Lname);
            System.out.println("*First Name:" + FName);
            System.out.println("*Status:" + Stat);
            System.out.println("*Position:" + position);
            System.out.println("*Birthday:" + BDay);
            System.out.println("*Address:" + Add);
            System.out.println("*Phone Number:" + Phone);
        }
        
        else if (resp == 10023) {
        	 Lname ="Ramos";
             FName ="Carol";
             Stat = "Probationary";
             position = "Account Rank and File";
             BDay = "August 20, 1978";
             Add ="72/70 Stamm Spurs, Bustos 4550 Iloilo";
             Phone = 250700389;
             hourlyRate= 133.93;
             System.out.println("****************");
             System.out.println("*Employee Number:" + Enumber);
             System.out.println("*Last Name:" + Lname);
             System.out.println("*First Name:" + FName);
             System.out.println("*Status:" + Stat);
             System.out.println("*Position:" + position);
             System.out.println("*Birthday:" + BDay);
             System.out.println("*Address:" + Add);
             System.out.println("*Phone Number:" + Phone);
        }
        
        else if (resp == 10024) {
            Lname ="Maceda";
            FName ="Emelia";
            Stat = "Probationary";
            position = "Account Rank and File";
            BDay = "April 14, 1963";
            Add ="50A/83 Bahringer Oval Suite 145, Kiamba 7688 Nueva Ecija";
            Phone = 973358041;
            hourlyRate= 133.93;
            System.out.println("****************");
            System.out.println("*Employee Number:" + Enumber);
            System.out.println("*Last Name:" + Lname);
            System.out.println("*First Name:" + FName);
            System.out.println("*Status:" + Stat);
            System.out.println("*Position:" + position);
            System.out.println("*Birthday:" + BDay);
            System.out.println("*Address:" + Add);
            System.out.println("*Phone Number:" + Phone);
        }

        
        
        else if (resp == 10025) {
        	Lname ="Aguilar";
            FName ="Delia";
            Stat = "Probationary";
            position = "Account Rank and File";
            BDay = "January 27, 1939";
            Add ="95 Cremin Junction, Surallah 2809 Cotabato";
            Phone = 529705439;
            hourlyRate= 133.93;
            System.out.println("****************");
            System.out.println("*Employee Number:" + Enumber);
            System.out.println("*Last Name:" + Lname);
            System.out.println("*First Name:" + FName);
            System.out.println("*Status:" + Stat);
            System.out.println("*Position:" + position);
            System.out.println("*Birthday:" + BDay);
            System.out.println("*Address:" + Add);
            System.out.println("*Phone Number:" + Phone);
           
           
        }
        else  { 
        	System.out.print("\nEmployee Number not Found");
        }
        
        	
        
        
        
        
		
       
		System.out.print("\nEnter the no. of Hours Worked in a Month: ");
		hoursWorked = keyboard.nextDouble();
		
		
        
		//Process
		if(hoursWorked <= STANDARD_WORK) {
			basicPay = hoursWorked * hourlyRate;
			grossSalary = basicPay;
			
		}
		else {
			basicPay = STANDARD_WORK * hourlyRate;
			overTime = hoursWorked - STANDARD_WORK;
			overTimeRate = hourlyRate * 1.5; 
			overTimePay = overTimeRate * overTime; 
			grossSalary = basicPay + overTimePay;
		}
		
		//Deductions
		if(grossSalary > 1500){
			
			DeductSSS = grossSalary * SSS;
	        DeductPf = grossSalary * PagIbig;
	        DeductPh = grossSalary * philHealth;
	        totaldeduct = DeductSSS + DeductPf + DeductPh;
			grossSalary = basicPay + overTimePay;
			netSalary = grossSalary -totaldeduct;
		}
		else 
		{	   
		   netSalary = grossSalary - totaldeduct;
		   
		 
		 
		   
		}
		
		
		 if(netSalary <=20832)
		{
			
			System.out.print(Tax + "\sNo Tax");
        	totalsalary = netSalary;
			
		}
		else if(netSalary>20833 && netSalary<=33333)
		{
			Tax = (netSalary-20833) * .2;
			totalsalary = netSalary - Tax;
		}
		else if(netSalary>33333 && netSalary<=66667)
		{
			Tax = ((netSalary-33333)*.25)+2500;	
			totalsalary = netSalary - Tax;
		}
		else if(netSalary>66667 && netSalary<=166667)
		{
			Tax = ((netSalary-66667)*.3)+10833;
			totalsalary = netSalary - Tax;
		}
		else if(netSalary>166667 && netSalary<=666667)
		{
			Tax = ((netSalary-166667)*.32)+408833.33;
			totalsalary = netSalary - Tax;
		}
		else if(netSalary>666667)
		{
			Tax = ((netSalary-666667)*.35)+200833.33;
			totalsalary = netSalary - Tax;
		}
		if (overTime < 1) {grossSalary = hoursWorked * hourlyRate ;  }
		
		else {System.out.print(Tax + "\s Tax");}
	    
        
        

		
		
		
		//Print PaySlip
		myArea.setEditable(false);
		myArea.setFont(new Font("Arial",Font.PLAIN,20));
		myArea.setText(
		    "\tMOTORPH COMPANY\n\t PAYSLIP\n\n=============================================" +
			"\nEmployee Number:\t" + Enumber +
			"\nName:\t\t" + Lname + ",\s" + FName +
			"\nStatus:\t\t" + Stat +
			"\nPosition:\t\t" + position +
			"\nHours Worked:\t" + hoursWorked +
			"\nHourly Rate:\t\t" + hourlyRate +
			"\nOver Time:\t\t" + overTime +
			"\nOver Time Rate:\t" + h.format(overTimeRate) +
			"\n\nOver Time Pay:\t" + p.format(overTimePay) +
			"\nBasic Pay:\t\t" + f.format(basicPay) +
			
			"\n\nGross Salary:\t\t\t" + f.format(grossSalary) +
			"\n\nSSS:\t\t" + p.format(DeductSSS) +
		    "\nPhil Health Deduction:\t" + p.format(DeductPh) +
		    "\nPag-ibig Fund Deduction:\t" + p.format(DeductPf)+
		    "\n\nTOTAL DEDUCTIONS:\t\t" + p.format(totaldeduct) +
		    "\n\nTaxable Income:\t\t" + f.format(netSalary)+
		    "\n\nWithholding Tax:\t\t" + f.format(Tax) +
		    "\n--------------------------------------------------------------------------------\n\n" +
		    "\nMONTHLY SALARY:\t\t" + f.format(totalsalary));
		
		
				
		JOptionPane.showMessageDialog(
				null, myArea, "Payslip", JOptionPane.PLAIN_MESSAGE);
		
		
	
	
	
	
        }
	
	
	}

	}



