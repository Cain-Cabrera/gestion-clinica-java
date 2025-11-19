package service;

import java.util.List;

/**
 *
 * @author Cain
 * @param <T>
 */
public interface GenericService<T> {
    
    void actualizar (T entidad) throws Exception;
    void insertar (T entidad) throws Exception;
    void eliminar (int id) throws Exception;
    T getById(int id)throws Exception;
    List<T> getAll()throws Exception;
    
}
