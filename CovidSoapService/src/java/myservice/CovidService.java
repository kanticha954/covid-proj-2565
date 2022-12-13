/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myservice;
import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import model.Covid;


/**
 *
 * @author sarun
 */
@WebService(serviceName = "CovidService")
public class CovidService {
    @PersistenceContext(unitName = "EmployeeSoapServicePU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;

    /**
     * Web service operation
     * @param id
     * @return 
     */
    @WebMethod(operationName = "findCovidById")
    public Covid findCovidById(@WebParam(name = "id") int id) {
        Covid emp = em.find(Covid.class, id);
        return emp;
    }
    
    
    
}