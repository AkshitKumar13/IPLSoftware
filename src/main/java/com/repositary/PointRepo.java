
package com.repositary;

import com.model.PointModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * The interface Point repo.
 */
@Repository
public interface PointRepo extends JpaRepository<PointModel, Long> {

    /**
     * Find by team id point model.
     *
     * @param id the id
     * @return the point model
     */
    PointModel findByTeamId(Long id);
   List<PointModel> findByOrderByPointDesc();


}