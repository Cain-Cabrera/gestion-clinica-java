package dao;

import java.util.List;
/**
 *
 * @author Cain
 * @param <T>
 */
public interface GenericDAO<T> {
   
    void insertar(T entidad) throws Exception;
    void actualizar(T entidad)throws Exception;
    void eliminar(int id)throws Exception;
    T getById(int id)throws Exception;
    List<T> getAll()throws Exception;
    
}
