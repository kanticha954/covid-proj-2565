/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidsoapclient;

import java.util.Scanner;
import services.CovidWeek;
import covidAll.Covid;

/**
 *
 * @author ASUS
 */
public class CovidSoapClient {

    public static void main(String[] args) {
       //findCasebyId
       Scanner sc = new Scanner(System.in);
        System.out.println("Input case ID =");
        int id = sc.nextInt();
        if(id > 50){
            System.out.println("Non Data");
        } else {
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
            System.out.println("Case Foreign: "+emp.getCaseForeign());
            System.out.println("Case Prison: "+emp.getCasePrison());
            System.out.println("Case Walkin: "+emp.getCaseWalkin());
            System.out.println("Case NewPrev: "+emp.getCaseNewPrev());
            System.out.println("Death NewPrev: "+emp.getCaseNewDiff());
            System.out.println("New Death: "+emp.getDeathNewPrev());
            System.out.println("Death NewDiff: "+emp.getDeathNewDiff());
            System.out.println("Update Date: "+emp.getUpdateDate());
            System.out.println("-------------------------------");
        }
        
        
        //findCasebyWeekNum
        System.out.println("Input Week number =");
        int weeknum = sc.nextInt();
        if(weeknum > 52){
            System.out.println("Non Data");
        } else {
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
            System.out.println("Case Foreign: "+week.getCaseForeign());
            System.out.println("Case Prison: "+week.getCasePrison());
            System.out.println("Case Walkin: "+week.getCaseWalkin());
            System.out.println("Case NewPrev: "+week.getCaseNewPrev());
            System.out.println("Death NewPrev: "+week.getCaseNewDiff());
            System.out.println("New Death: "+week.getDeathNewPrev());
            System.out.println("Death NewDiff: "+week.getDeathNewDiff());
            System.out.println("Update Date: "+week.getUpdateDate());
            System.out.println("-------------------------------");
        }
        
        
//        //findCovidbyId show province per week
//        System.out.println("Input Case ID Between 1 - 3871 =");
//        int id_cv = sc.nextInt();
//        //id = 1;
//        System.out.println("Func findCovidById = "+id_cv);
//        Covid cv = findCovidById(id_cv);
//        System.out.println("Case Id: "+cv.getId());
//        System.out.println("Week: "+cv.getWeeknum());
//        System.out.println("Year: "+cv.getYearnum());
//        System.out.println("New Case: "+cv.getNewCase());
//        System.out.println("Total Case: "+cv.getTotalCase());
//        System.out.println("New case excludeabroad: "+cv.getNewCaseExcludeabroad());
//        System.out.println("Total Case Excludeabroad: "+cv.getTotalCaseExcludeabroad());
//        System.out.println("New Death: "+cv.getNewDeath());
//        System.out.println("Total Death: "+cv.getTotalDeath());
//        System.out.println("Update Date: "+cv.getUpdateDate());
//        System.out.println("-------------------------------");
        
         
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

    private static Covid findCovidById(int id) {
        covidAll.CovidService_Service service = new covidAll.CovidService_Service();
        covidAll.CovidService port = service.getCovidServicePort();
        return port.findCovidById(id);
    }
    
    

   
    
    
    
    
    
}
