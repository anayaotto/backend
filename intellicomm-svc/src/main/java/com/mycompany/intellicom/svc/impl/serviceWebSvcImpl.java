/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.intellicom.svc.impl;

import com.mycompany.intellicom.dao.serviceWebDao;
import com.mycompany.intellicom.svc.serviceWebSvc;
import javax.inject.Inject;

/**
 *
 * @author Otto
 */
public class serviceWebSvcImpl implements serviceWebSvc{
@Inject private serviceWebDao svcDao;
    public void holaMundo() {
         System.out.println("HOLA MUNDO!!!");
        svcDao.getData();
        
    }
    
}
