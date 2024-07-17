package com.MortgageCalc.Mortgage.oop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MortgageService {
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    private int principal;
    private float annualInterest;
    private int years;


    public void initializeValuesforService(int principal, float annualInterest, int years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    //Controller Method
    public int calculate(int principal, float annualInterest, int years){
     return 5;
    }
    public double calculateMortgage() {

        float monthlyInterest = getMonthlyInterest();

        double totalNumberOfPayments = getTotalNumberOfPayments();

        // calculate the monthly interest per month
        double paymentsPerMonth = Math.pow(1 + monthlyInterest, totalNumberOfPayments);
        // calculate the mortgage value
        double mortgage =  principal * (monthlyInterest * paymentsPerMonth) / (paymentsPerMonth - 1);

        return mortgage;
    }
    //Support Logics
    private int getTotalNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

    //Calculate Balance
    public double calculateBalance(double numberOfPaymentsMade) {

        float monthlyInterest = getMonthlyInterest();

        double totalNumberOfPayments = getTotalNumberOfPayments();

        double balance = principal
                * ( Math.pow(1 + monthlyInterest, totalNumberOfPayments)
                - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1+ monthlyInterest, totalNumberOfPayments) - 1);

        return balance;
    }

    //Get Remaining Balances
    public double[] getRemainingBalances() {
        var balances = new double[getTotalNumberOfPayments()];
        for (int month = 1; month <= balances.length; month++)
            balances[month - 1] = calculateBalance(month);
        return balances;
    }



}
