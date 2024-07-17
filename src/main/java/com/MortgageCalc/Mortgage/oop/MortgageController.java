package com.MortgageCalc.Mortgage.oop;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MortgageController {
    private MortgageService service;


    public MortgageController(MortgageService service) {
        this.service = service;
    }

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(){
        System.out.println("Method Called");
        return "home.jsp";
    }
    //submit-form
    @RequestMapping(value = "/submit-form")
    public String Submit(@RequestParam("principal") int principal, @RequestParam("annualInterest") float annualInterest, @RequestParam("years") int years, Model model){
        System.out.println("Submit Method Called");
        model.addAttribute("principal",principal);
        model.addAttribute("annualInterest",annualInterest);
        model.addAttribute("years",years);


        //Recent
        service.initializeValuesforService(principal, annualInterest, years);
        double mortgageValue=service.calculateMortgage();
        model.addAttribute("mortgageValue",mortgageValue);
        System.out.println("Mortage Value is :"+mortgageValue);
        //var report = new MortgageReport(calculator);

        return "submit.jsp";
    }

    @RequestMapping(value="/report")
    public String calculateEntireReport(Model model){
        double[] balanceCollection = service.getRemainingBalances();
        model.addAttribute("balanceCollection", balanceCollection);
        return "report.jsp";
    }


}
