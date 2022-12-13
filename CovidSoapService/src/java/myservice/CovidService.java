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

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findCovidByProvince")
    public Covid findCovidByProvince(@WebParam(name = "weeknum") int weeknum, @WebParam(name = "province") String province) {
        Covid emp = em.find(Covid.class, weeknum);
        emp = em.find(Covid.class, province);
        return emp;
    }

    /**
     * Web service operation
     */
    
    
  
    /**
     * Web service operation
     * @param emp
     * @return 
     */
//    @WebMethod(operationName = "updateEmployee")
//    public int updateEmployee(@WebParam(name = "emp") Employee emp) {
//        try {
//            utx.begin();
//            Employee target = em.find(Employee.class, emp.getId());
//            if (target == null) {
//                return 0;
//            }
//            target.setName(emp.getName());
//            target.setSalary(emp.getSalary());
//            em.persist(target);
//            utx.commit();
//        } catch (NotSupportedException ex) {
//            Logger.getLogger(CovidService.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SystemException ex) {
//            Logger.getLogger(CovidService.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (RollbackException ex) {
//            Logger.getLogger(CovidService.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (HeuristicMixedException ex) {
//            Logger.getLogger(CovidService.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (HeuristicRollbackException ex) {
//            Logger.getLogger(CovidService.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SecurityException ex) {
//            Logger.getLogger(CovidService.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalStateException ex) {
//            Logger.getLogger(CovidService.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return 1;
//    }
    
}
