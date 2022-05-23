
package com.repositary;

import com.model.MatchModel;
import com.model.TeamModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * The interface Match repo.
 */
public interface MatchRepo extends CrudRepository<MatchModel, Integer> {
    /**
     * Find by venue optional.
     *
     * @param venue the venue
     * @return the optional
     */
//    List<PlayersModel> findByTeamId(String team_id);
    Optional<MatchModel> findByVenue(String venue);

    /**
     * Find by scheduledate optional.
     *
     * @param date the date
     * @return the optional
     */
    Optional<MatchModel> findByScheduledate(String date);

    /**
     * Find by team 1 optional.
     *
     * @param team1 the team 1
     * @return the optional
     */
    Optional<MatchModel> findByTeam1(TeamModel team1);
    Optional<MatchModel> findByTeam2(TeamModel team2);

    /**
     * Find all by team 1 list.
     *
     * @param team1 the team 1
     * @return the list
     */
    List<MatchModel> findAllByTeam1(TeamModel team1);

    @Query(value = "FROM MatchModel where result is null")
    List<MatchModel> findByResult();


}
