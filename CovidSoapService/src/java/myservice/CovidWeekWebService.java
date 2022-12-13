/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myservice;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.CovidWeek;

/**
 *
 * @author ASUS
 */
@WebService(serviceName = "CovidWeekWebService")
public class CovidWeekWebService {

    @PersistenceContext(unitName = "EmployeeSoapServicePU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;

    //byID
    @WebMethod(operationName = "findCaseById")
    public CovidWeek findCaseById(@WebParam(name = "id") int id) {
        CovidWeek emp = em.find(CovidWeek.class, id);
        return emp;
    }
    
    //byWeek
    @WebMethod(operationName = "findCaseByWeek")
    public CovidWeek findCaseByWeek(@WebParam(name = "weeknum") int weeknum) {
        CovidWeek emp = em.find(CovidWeek.class, weeknum);
        return emp;
    }

    private void persist(Object object) {
        try {
            utx.begin();
            em.persist(object);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }

    
    
}
