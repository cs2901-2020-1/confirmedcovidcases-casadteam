package cs_utec.cs2901.repositories;

import org.springframework.data.repository.CrudRepository;
import cs_utec.cs2901.data.DailyCases;

/* Persistence management for the DailyCases entity. It supports the basic CRUD (Create, Read, Update and Delete) instructions. 
    CREATE: INSERT INTO dailycases VALUES(id_value, quantity, 'date');
    READ ONE: SELECT * FROM dailycases WHERE id = 2;
    READ ALL: SELECT * FROM dailycases;
    UPDATE: UPDATE dailycases SET quantity = 3 WHERE id = 5; (if you don't specify the WHERE, you'll update all rows).
    DELETE: DELETE FROM dailycases WHERE id=3 
*/

public interface DailyCasesRepository extends CrudRepository<DailyCases, Long>{
}