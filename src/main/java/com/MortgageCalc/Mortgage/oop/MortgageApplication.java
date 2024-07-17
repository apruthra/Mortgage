package com.MortgageCalc.Mortgage.oop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MortgageApplication {

	public static void main(String[] args)   {
		SpringApplication.run(MortgageApplication.class, args);


	}




		/*final int PRINCIPAL_MIN = 1000;
		final int PRINCIPAL_MAX = 1_000_000;

		int principal = (int) Console.readNumber("Principal: ", PRINCIPAL_MIN, PRINCIPAL_MAX);

		float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);

		int years = (int) Console.readNumber("Period (Years): ", 1, 30);*/

		/*//var calculator = new MortgageCalculator(principal, annualInterest, years);
		var calculator=context.getBean(MortgageCalculator.class);
		var report=context.getBean(MortgageReport.class);


		//var report = new MortgageReport(calculator);

		report.printMortgage();

		report.printPaymentSchedule();*/


}
