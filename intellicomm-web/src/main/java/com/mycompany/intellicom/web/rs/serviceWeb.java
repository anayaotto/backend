/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.intellicom.web.rs;

import com.mycompany.intellicom.svc.serviceWebSvc;
import com.mycompany.intellicom.svc.serviceWebSvcImpl;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Otto
 */
@ManagedBean
@Path("mongoServices")
public class serviceWeb {
    @Inject private serviceWebSvc svc;
    serviceWebSvcImpl nuevo = new serviceWebSvcImpl();
    
    @Path("/holaMundo")
    @GET
    public void holaMundo(){
        svc.holaMundo();
    }
}
