
package com.devs.dao;

import com.devs.daogeneral.DaoGeneral;
import com.devs.entities.Usuarios;
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
public class UsuarioDao extends DaoGeneral{
     //Establecer conexion con la base de datos
    SessionFactory factory = HibernateUtil.getSessionFactory();
    Session session = null;
    
    //metodo que permite listar todos los registros de la base de datos
    public List<Usuarios> listAll() {
       
//lista que contendra todos los registros de todos los bancos
        List<Usuarios> listado = null;
        
        //transaccion que permite ejecutar la consulta exitosamente o no ejecutarla
        Transaction tx = null;
        try {
            session = factory.openSession();
            tx = session.beginTransaction();

            //hquery que permite obtener todos los registros
            Query query = session.createQuery("From Usuarios");
            //permite llenar la lista de todos los bancos
            listado =(List<Usuarios>) query.list();
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
    public List<Usuarios> listAllParameter(String parameter) {
       //atributo que contendra los registros encontrados
        List<Usuarios> listado = null;
        Transaction tx = null;
        try {
            //abrir la conexion
            session = factory.openSession();
            tx = session.beginTransaction();
           //query que permite encontrar los registros por medio de una busqueda
            Query query = session.createQuery("From Usuarios where usuario like '%"+parameter+"%' or idusuario like '%"+parameter+"%'or nivel_acceso like '%"+parameter+"%'");
            listado =(List<Usuarios>) query.list();
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
//permite validar si existe o no el usuario
    
     public Usuarios Validarusuario(String user, String pass) {

        Usuarios usuario = null;
        List<Usuarios> lista = null;
        Transaction tx = null;
        try {
            session = factory.openSession();
            tx = session.beginTransaction();

            Query query = session.createQuery("From Usuarios where usuario ='" + user + "'");
            lista = (List<Usuarios>) query.list();
            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        // validar contraseña
        if (lista != null) {
            for (Usuarios u : lista) {
                if (u.getPassword().equals(pass)) {
                    usuario = u;
                }
            }
        }
        return usuario;
    }
    
}
