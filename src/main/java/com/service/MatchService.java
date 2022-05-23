package com.service;


import com.repositary.MatchRepo;
import com.model.MatchModel;
import com.model.TeamModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


/**
 * The type Match service.
 */
@Service
public class MatchService {
    @Autowired
    private MatchRepo matchRepo;
    /**
     * The Team service.
     */
    @Autowired
    TeamService teamService;

    /**
     * Instantiates a new Match service.
     *
     * @param matchRepo the match repo
     */
    public MatchService(MatchRepo matchRepo) {
        this.matchRepo=matchRepo;
    }

    /**
     * Gets all matches.
     *
     * @return the all matches
     */
    public List<MatchModel> getAllMatches() {
        return (List<MatchModel>) matchRepo.findAll();
    }

    /**
     * Save.
     *
     * @param match_model the match model
     * @return the match model
     */
    public MatchModel saveMatch(final MatchModel match_model) {
        return matchRepo.save(match_model);
    }


    /**
     * Get match model.
     *
     * @param Id the id
     * @return the match model
     */
    public MatchModel get(int Id) {

        return matchRepo.findById(Id).get();
    }


    /**
     * Delete.
     *
     * @param id the id
     */
    public void delete(int id) {

        matchRepo.deleteById(id);
    }


    /**
     * Find venue is exist optional.
     *
     * @param venue the venue
     * @return the optional
     */
    @Transactional
    public Optional<MatchModel> findVenueIsExist (String venue) {
        return matchRepo.findByVenue(venue);
    }

    /**
     * Venue exists boolean.
     *
     * @param venue  the venue
     * @param result the result
     * @return the boolean
     */
    public boolean venueExists (String venue, BindingResult result) {
        try {
            return findVenueIsExist(venue).isPresent(); }
        catch (Exception e) {
            result.addError(new FieldError("match", "scheduledate", "date or venue already exist"));
        }
        return false;
    }

    /**
     * Find date is exist optional.
     *
     * @param date the date
     * @return the optional
     */
    @Transactional
    public Optional<MatchModel> findDateIsExist (String date) {

        return matchRepo.findByScheduledate(date);

    }

    /**
     * Date is exist boolean.
     *
     * @param date   the date
     * @param result the result
     * @return the boolean
     */
    public boolean DateIsExist (String date, BindingResult result) {
        try {
            return findDateIsExist(date).isPresent(); }
        catch (Exception e) {
            result.addError(new FieldError("match", "scheduledate", "teams already schedule on same date"));
        }
        return false;

    }

    /**
     * Find team optional.
     *
     * @param team1 the team 1
     * @return the optional
     */
    @Transactional
    public Optional<MatchModel> findTeam (TeamModel team1, TeamModel team2) {


        Optional<MatchModel> t=  matchRepo.findByTeam1(team1);
        t=  matchRepo.findByTeam2(team2);
          return t;
    }

    /**
     * Team is exist boolean.
     *
     * @param team1  the team 1
     * @param result the result
     * @return the boolean
     */
    public boolean teamIsExist (TeamModel team1,TeamModel team2, BindingResult result) {
        try {
            return findTeam(team1,team2).isPresent(); }
        catch (Exception e) {
            result.addError(new FieldError("match", "team1", "teams matches already scheduled"));
        }
        return false;
    }

    /**
     * View matchs model.
     *
     * @param model the model
     * @return the model
     */
    public Model viewMatchs(Model model){
        List<MatchModel> matchModelsList = (List<MatchModel>) matchRepo.findAll();
        model.addAttribute("matchModelsList", matchModelsList);
        return model;
    }

    public Model scheduledMatchs(Model model){
        List<MatchModel> matchModelsList = (List<MatchModel>) matchRepo.findByResult();
        model.addAttribute("matchModelsList", matchModelsList);
        return model;
    }


    /**
     * View scores model.
     *
     * @param model the model
     * @return the model
     */
    public Model viewScores(Model model){
        List<MatchModel> matchModelsList = (List<MatchModel>) matchRepo.findAll();
        model.addAttribute("matchModelsList", matchModelsList);
        return model;
    }

    /**
     * Scores model.
     *
     * @param model the model
     * @return the model
     */
    public Model  scoresResult(Model model){
        List<MatchModel> matchModelsList = (List<MatchModel>) matchRepo.findAll();
        model.addAttribute("matchModelsList", matchModelsList);
        return model;
    }

    /**
     * Match result model.
     *
     * @param model the model
     * @return the model
     */
    public Model matchResult(Model model){
        List<MatchModel> matchModelsList = (List<MatchModel>) matchRepo.findAll();
        model.addAttribute("matchModelsList", matchModelsList);
        return model;
    }

    /**
     * Add match model.
     *
     * @param model the model
     * @return the model
     */
    public Model AddMatch(Model model){
        model.addAttribute("match", new MatchModel());
        List<TeamModel> teamList = teamService.listAll();
        model.addAttribute("teamList", teamList);
        return model;
    }

    /**
     * Save matches string.
     *
     * @param match              the match
     * @param result             the result
     * @param redirectAttributes the redirect attributes
     * @return the string
     */
    public String saveMatches( MatchModel match, BindingResult result, RedirectAttributes redirectAttributes){
        if (this.teamIsExist(match.getTeam1(),match.getTeam2(), result)  && this.DateIsExist(match.getScheduledate(), result) ) {
            result.addError(new FieldError("match", "team1", "team1 or team2 match already scheduled"));
        }

        else if (this.venueExists(match.getVenue(), result) && this.DateIsExist(match.getScheduledate(), result)) {
            result.addError(new FieldError("match", "scheduledate", "date or venue already exists"));
        }

        if (result.hasErrors()) {

            return "matchSchedule";
        }
        else {
            this.saveMatch(match);
            redirectAttributes.addFlashAttribute("Addmessage", "Match Scheduled successfully");
            return "redirect:editMatch";
        }
    }

}
