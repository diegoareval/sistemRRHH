
package com.devs.dao;

import com.devs.daogeneral.DaoGeneral;
import com.devs.entities.Area;
import com.devs.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author DiegoArevalo
 */
public class AreaDao extends DaoGeneral{
    //Establecer conexion con la base de datos
    SessionFactory factory = HibernateUtil.getSessionFactory();
    Session session = null;
    
     //metodo que permite listar todos los registros de la base de datos
    public List<Area> listAll() {
       
//lista que contendra todos los registros de todos los bancos
        List<Area> listado = null;
        
        //transaccion que permite ejecutar la consulta exitosamente o no ejecutarla
        Transaction tx = null;
        try {
            session = factory.openSession();
            tx = session.beginTransaction();

            //hquery que permite obtener todos los registros
            Query query = session.createQuery("From Area");
            //permite llenar la lista de todos los bancos
            listado =(List<Area>) query.list();
            //permite ejecutar la consulta
            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                //en caso de excepcion permite volver a el estado normal
                tx.rollback();
            }
            System.out.println("Excepcion: "+e.getMessage());
        } finally {
            session.close();
        }
        return listado;
    }
    //metodo que permite realizar una busqueda de registros por medio de un parametro
    //BancoDao bancodao=new BancoDao();
    //bancodao.listallparameter()
    public List<Area> listAllParameter(String parameter) {
       //atributo que contendra los registros encontrados
        List<Area> listado = null;
        Transaction tx = null;
        try {
            //abrir la conexion
            session = factory.openSession();
            tx = session.beginTransaction();
           //query que permite encontrar los registros por medio de una busqueda
           //select * from bancos where descripcion like %'sco'%
            Query query = session.createQuery("From Area where nombre like '%"+parameter+"%' or idarea like '%"+parameter+"%'");
            listado =(List<Area>) query.list();
            //permite ejecutar toda la consulta
            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                //permite volver al estado normal
                tx.rollback();
            }
            System.out.println("Error: "+e.getMessage());
        } finally {
            session.close();
        }
        return listado;
    }
    
     public List<Area> buscarporID(int parameter) {
       //atributo que contendra los registros encontrados
        List<Area> listado = null;
        Transaction tx = null;
        try {
            //abrir la conexion
            session = factory.openSession();
            tx = session.beginTransaction();
           //query que permite encontrar los registros por medio de una busqueda
           //select * from bancos where descripcion like %'sco'%
            Query query = session.createQuery("From Area where idarea= '"+parameter+"%'");
            listado =(List<Area>) query.list();
            //permite ejecutar toda la consulta
            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                //permite volver al estado normal
                tx.rollback();
            }
            System.out.println("Error: "+e.getMessage());
        } finally {
            session.close();
        }
        return listado;
    }
}
