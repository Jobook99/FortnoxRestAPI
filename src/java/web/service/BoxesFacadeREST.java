/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import web.Boxes;


@Stateless
@Path("web.boxes")
public class BoxesFacadeREST extends AbstractFacade<Boxes> {
    @PersistenceContext(unitName = "FortnoxRestAPIPU")
    private EntityManager em;

    public BoxesFacadeREST() {
        super(Boxes.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Boxes entity) {
        super.create(entity);
    }

    @GET
    @Override
    @Produces({"application/json"})
    public List<Boxes> findAll() {
        return super.findAll();
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
