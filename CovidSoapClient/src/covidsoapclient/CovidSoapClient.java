/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidsoapclient;

import java.util.Scanner;
import services.CovidWeek;

/**
 *
 * @author ASUS
 */
public class CovidSoapClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input case Id =");
        int id = sc.nextInt();
        CovidWeek emp = findCaseById(id);
        System.out.println("Func findCaseById = "+id);
        System.out.println("Case Id: "+emp.getId());
        System.out.println("Week: "+emp.getWeeknum());
        System.out.println("Year: "+emp.getYearnum());
        System.out.println("New Case: "+emp.getNewCase());
        System.out.println("Total Case: "+emp.getTotalCase());
        System.out.println("New case excludeabroad: "+emp.getNewCaseExcludeabroad());
        System.out.println("Total Case Excludeabroad: "+emp.getTotalCaseExcludeabroad());
        System.out.println("New Recovered: "+emp.getNewRecovered());
        System.out.println("Total Recovered: "+emp.getTotalRecovered());
        System.out.println("New Death: "+emp.getNewDeath());
        System.out.println("Total Death: "+emp.getTotalDeath());
        System.out.println("Case Prison: "+emp.getCaseForeign());
        System.out.println("New Death: "+emp.getCasePrison());
        System.out.println("Case Walkin: "+emp.getCaseWalkin());
        System.out.println("Case NewPrev: "+emp.getCaseNewPrev());
        System.out.println("Death NewPrev: "+emp.getCaseNewDiff());
        System.out.println("New Death: "+emp.getDeathNewPrev());
        System.out.println("Death NewDiff: "+emp.getDeathNewDiff());
        System.out.println("Update Date: "+emp.getUpdateDate());
        System.out.println("-------------------------------");
        
        
        //findCasebyWeekNum
        System.out.println("Input Week number =");
        int weeknum = sc.nextInt();
        System.out.println("Func findCaseByWeek = "+weeknum);
        weeknum += 1;
        //int weeknum = 30;
        CovidWeek week = findCaseByWeek(weeknum);
        System.out.println("Case Id: "+week.getId());
        System.out.println("Week: "+week.getWeeknum());
        System.out.println("Year: "+week.getYearnum());
        System.out.println("New Case: "+week.getNewCase());
        System.out.println("Total Case: "+week.getTotalCase());
        System.out.println("New case excludeabroad: "+week.getNewCaseExcludeabroad());
        System.out.println("Total Case Excludeabroad: "+week.getTotalCaseExcludeabroad());
        System.out.println("New Recovered: "+week.getNewRecovered());
        System.out.println("Total Recovered: "+week.getTotalRecovered());
        System.out.println("New Death: "+week.getNewDeath());
        System.out.println("Total Death: "+week.getTotalDeath());
        System.out.println("Case Prison: "+week.getCaseForeign());
        System.out.println("New Death: "+week.getCasePrison());
        System.out.println("Case Walkin: "+week.getCaseWalkin());
        System.out.println("Case NewPrev: "+week.getCaseNewPrev());
        System.out.println("Death NewPrev: "+week.getCaseNewDiff());
        System.out.println("New Death: "+week.getDeathNewPrev());
        System.out.println("Death NewDiff: "+week.getDeathNewDiff());
        System.out.println("Update Date: "+week.getUpdateDate());
        System.out.println("-------------------------------");
         
    }

    private static CovidWeek findCaseById(int id) {
        services.CovidWeekWebService_Service service = new services.CovidWeekWebService_Service();
        services.CovidWeekWebService port = service.getCovidWeekWebServicePort();
        return port.findCaseById(id);
    }

    private static CovidWeek findCaseByWeek(int weeknum) {
        services.CovidWeekWebService_Service service = new services.CovidWeekWebService_Service();
        services.CovidWeekWebService port = service.getCovidWeekWebServicePort();
        return port.findCaseByWeek(weeknum);
    }

   
    
    
    
    
    
}
