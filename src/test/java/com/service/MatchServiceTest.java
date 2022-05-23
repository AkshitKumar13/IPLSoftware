package com.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.repositary.MatchRepo;
import com.model.MatchModel;
import com.model.PlayersModel;
import com.model.PointModel;
import com.model.TeamModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.ui.Model;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

@ContextConfiguration(classes = {MatchService.class})
@ExtendWith(SpringExtension.class)
class MatchServiceTest {
    @MockBean
    private MatchRepo matchRepo;

    @Autowired
    private MatchService matchService;

    @MockBean
    private TeamService teamService;

    /**
     * Method under test: {@link MatchService#getAllMatches()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAllMatches() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ClassCastException: class org.mockito.codegen.Iterable$MockitoMock$457452308 cannot be cast to class java.util.List (org.mockito.codegen.Iterable$MockitoMock$457452308 is in unnamed module of loader com.diffblue.cover.e.f @441589c7; java.util.List is in module java.base of loader 'bootstrap')
        //       at com.service.MatchService.getAllMatches(MatchService.java:49)
        //   In order to prevent getAllMatches()
        //   from throwing ClassCastException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getAllMatches().
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        // TODO: Populate arranged inputs
        List<MatchModel> actualAllMatches = this.matchService.getAllMatches();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MatchService#saveMatch(MatchModel)}
     */
    @Test
    void testSaveMatch() {
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");

        TeamModel teamModel1 = new TeamModel();
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        teamModel1.setPlayersModel(new ArrayList<>());
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");

        MatchModel matchModel = new MatchModel();
        matchModel.setMatchid(1);
        matchModel.setResult("Result");
        matchModel.setScheduledate("2020-03-01");
        matchModel.setTeam1(teamModel);
        matchModel.setTeam1Description("Team1 Description");
        matchModel.setTeam1Overs(10.0d);
        matchModel.setTeam1Wickets("Team1 Wickets");
        matchModel.setTeam2(teamModel1);
        matchModel.setTeam2Description("Team2 Description");
        matchModel.setTeam2Overs(10.0d);
        matchModel.setTeam2Wickets("Team2 Wickets");
        matchModel.setTime("Time");
        matchModel.setVenue("Venue");
        when(this.matchRepo.save((MatchModel) any())).thenReturn(matchModel);

        TeamModel teamModel2 = new TeamModel();
        teamModel2.setCaptain("Captain");
        teamModel2.setId(123L);
        teamModel2.setPlayersModel(new ArrayList<>());
        teamModel2.setPointModels(new ArrayList<>());
        teamModel2.setState("MD");
        teamModel2.setTeamname("Teamname");

        TeamModel teamModel3 = new TeamModel();
        teamModel3.setCaptain("Captain");
        teamModel3.setId(123L);
        teamModel3.setPlayersModel(new ArrayList<>());
        teamModel3.setPointModels(new ArrayList<>());
        teamModel3.setState("MD");
        teamModel3.setTeamname("Teamname");

        MatchModel matchModel1 = new MatchModel();
        matchModel1.setMatchid(1);
        matchModel1.setResult("Result");
        matchModel1.setScheduledate("2020-03-01");
        matchModel1.setTeam1(teamModel2);
        matchModel1.setTeam1Description("Team1 Description");
        matchModel1.setTeam1Overs(10.0d);
        matchModel1.setTeam1Wickets("Team1 Wickets");
        matchModel1.setTeam2(teamModel3);
        matchModel1.setTeam2Description("Team2 Description");
        matchModel1.setTeam2Overs(10.0d);
        matchModel1.setTeam2Wickets("Team2 Wickets");
        matchModel1.setTime("Time");
        matchModel1.setVenue("Venue");
        assertSame(matchModel, this.matchService.saveMatch(matchModel1));
        verify(this.matchRepo).save((MatchModel) any());
    }

    /**
     * Method under test: {@link MatchService#get(int)}
     */
    @Test
    void testGet() {
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");

        TeamModel teamModel1 = new TeamModel();
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        teamModel1.setPlayersModel(new ArrayList<>());
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");

        MatchModel matchModel = new MatchModel();
        matchModel.setMatchid(1);
        matchModel.setResult("Result");
        matchModel.setScheduledate("2020-03-01");
        matchModel.setTeam1(teamModel);
        matchModel.setTeam1Description("Team1 Description");
        matchModel.setTeam1Overs(10.0d);
        matchModel.setTeam1Wickets("Team1 Wickets");
        matchModel.setTeam2(teamModel1);
        matchModel.setTeam2Description("Team2 Description");
        matchModel.setTeam2Overs(10.0d);
        matchModel.setTeam2Wickets("Team2 Wickets");
        matchModel.setTime("Time");
        matchModel.setVenue("Venue");
        Optional<MatchModel> ofResult = Optional.of(matchModel);
        when(this.matchRepo.findById((Integer) any())).thenReturn(ofResult);
        assertSame(matchModel, this.matchService.get(123));
        verify(this.matchRepo).findById((Integer) any());
    }

    /**
     * Method under test: {@link MatchService#get(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGet2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException: No value present
        //       at java.util.Optional.get(Optional.java:148)
        //       at com.service.MatchService.get(MatchService.java:71)
        //   In order to prevent get(int)
        //   from throwing NoSuchElementException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   get(int).
        //   See https://diff.blue/R013 to resolve this issue.

        when(this.matchRepo.findById((Integer) any())).thenReturn(Optional.empty());
        this.matchService.get(123);
    }

    /**
     * Method under test: {@link MatchService#delete(int)}
     */
    @Test
    void testDelete() {
        doNothing().when(this.matchRepo).deleteById((Integer) any());
        this.matchService.delete(1);
        verify(this.matchRepo).deleteById((Integer) any());
        assertTrue(this.matchService.getAllMatches().isEmpty());
    }

    /**
     * Method under test: {@link MatchService#findVenueIsExist(String)}
     */
    @Test
    void testFindVenueIsExist() {
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");

        TeamModel teamModel1 = new TeamModel();
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        teamModel1.setPlayersModel(new ArrayList<>());
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");

        MatchModel matchModel = new MatchModel();
        matchModel.setMatchid(1);
        matchModel.setResult("Result");
        matchModel.setScheduledate("2020-03-01");
        matchModel.setTeam1(teamModel);
        matchModel.setTeam1Description("Team1 Description");
        matchModel.setTeam1Overs(10.0d);
        matchModel.setTeam1Wickets("Team1 Wickets");
        matchModel.setTeam2(teamModel1);
        matchModel.setTeam2Description("Team2 Description");
        matchModel.setTeam2Overs(10.0d);
        matchModel.setTeam2Wickets("Team2 Wickets");
        matchModel.setTime("Time");
        matchModel.setVenue("Venue");
        Optional<MatchModel> ofResult = Optional.of(matchModel);
        when(this.matchRepo.findByVenue((String) any())).thenReturn(ofResult);
        Optional<MatchModel> actualFindVenueIsExistResult = this.matchService.findVenueIsExist("Venue");
        assertSame(ofResult, actualFindVenueIsExistResult);
        assertTrue(actualFindVenueIsExistResult.isPresent());
        verify(this.matchRepo).findByVenue((String) any());
    }

    /**
     * Method under test: {@link MatchService#venueExists(String, org.springframework.validation.BindingResult)}
     */
    @Test
    void testVenueExists() {
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");

        TeamModel teamModel1 = new TeamModel();
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        teamModel1.setPlayersModel(new ArrayList<>());
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");

        MatchModel matchModel = new MatchModel();
        matchModel.setMatchid(1);
        matchModel.setResult("Result");
        matchModel.setScheduledate("2020-03-01");
        matchModel.setTeam1(teamModel);
        matchModel.setTeam1Description("Team1 Description");
        matchModel.setTeam1Overs(10.0d);
        matchModel.setTeam1Wickets("Team1 Wickets");
        matchModel.setTeam2(teamModel1);
        matchModel.setTeam2Description("Team2 Description");
        matchModel.setTeam2Overs(10.0d);
        matchModel.setTeam2Wickets("Team2 Wickets");
        matchModel.setTime("Time");
        matchModel.setVenue("Venue");
        Optional<MatchModel> ofResult = Optional.of(matchModel);
        when(this.matchRepo.findByVenue((String) any())).thenReturn(ofResult);
        assertTrue(this.matchService.venueExists("Venue", new BindException(new BindException(
                new BindException(new BindException(new BeanPropertyBindingResult("Target", "Object Name")))))));
        verify(this.matchRepo).findByVenue((String) any());
    }

    /**
     * Method under test: {@link MatchService#venueExists(String, org.springframework.validation.BindingResult)}
     */
    @Test
    void testVenueExists2() {
        when(this.matchRepo.findByVenue((String) any())).thenReturn(Optional.empty());
        assertFalse(this.matchService.venueExists("Venue", new BindException(new BindException(
                new BindException(new BindException(new BeanPropertyBindingResult("Target", "Object Name")))))));
        verify(this.matchRepo).findByVenue((String) any());
    }

    /**
     * Method under test: {@link MatchService#findDateIsExist(String)}
     */
    @Test
    void testFindDateIsExist() {
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");

        TeamModel teamModel1 = new TeamModel();
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        teamModel1.setPlayersModel(new ArrayList<>());
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");

        MatchModel matchModel = new MatchModel();
        matchModel.setMatchid(1);
        matchModel.setResult("Result");
        matchModel.setScheduledate("2020-03-01");
        matchModel.setTeam1(teamModel);
        matchModel.setTeam1Description("Team1 Description");
        matchModel.setTeam1Overs(10.0d);
        matchModel.setTeam1Wickets("Team1 Wickets");
        matchModel.setTeam2(teamModel1);
        matchModel.setTeam2Description("Team2 Description");
        matchModel.setTeam2Overs(10.0d);
        matchModel.setTeam2Wickets("Team2 Wickets");
        matchModel.setTime("Time");
        matchModel.setVenue("Venue");
        Optional<MatchModel> ofResult = Optional.of(matchModel);
        when(this.matchRepo.findByScheduledate((String) any())).thenReturn(ofResult);
        Optional<MatchModel> actualFindDateIsExistResult = this.matchService.findDateIsExist("2020-03-01");
        assertSame(ofResult, actualFindDateIsExistResult);
        assertTrue(actualFindDateIsExistResult.isPresent());
        verify(this.matchRepo).findByScheduledate((String) any());
    }

    /**
     * Method under test: {@link MatchService#DateIsExist(String, org.springframework.validation.BindingResult)}
     */
    @Test
    void testDateIsExist() {
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");

        TeamModel teamModel1 = new TeamModel();
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        teamModel1.setPlayersModel(new ArrayList<>());
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");

        MatchModel matchModel = new MatchModel();
        matchModel.setMatchid(1);
        matchModel.setResult("Result");
        matchModel.setScheduledate("2020-03-01");
        matchModel.setTeam1(teamModel);
        matchModel.setTeam1Description("Team1 Description");
        matchModel.setTeam1Overs(10.0d);
        matchModel.setTeam1Wickets("Team1 Wickets");
        matchModel.setTeam2(teamModel1);
        matchModel.setTeam2Description("Team2 Description");
        matchModel.setTeam2Overs(10.0d);
        matchModel.setTeam2Wickets("Team2 Wickets");
        matchModel.setTime("Time");
        matchModel.setVenue("Venue");
        Optional<MatchModel> ofResult = Optional.of(matchModel);
        when(this.matchRepo.findByScheduledate((String) any())).thenReturn(ofResult);
        assertTrue(this.matchService.DateIsExist("2020-03-01", new BindException(new BindException(
                new BindException(new BindException(new BeanPropertyBindingResult("Target", "Object Name")))))));
        verify(this.matchRepo).findByScheduledate((String) any());
    }

    /**
     * Method under test: {@link MatchService#DateIsExist(String, org.springframework.validation.BindingResult)}
     */
    @Test
    void testDateIsExist2() {
        when(this.matchRepo.findByScheduledate((String) any())).thenReturn(Optional.empty());
        assertFalse(this.matchService.DateIsExist("2020-03-01", new BindException(new BindException(
                new BindException(new BindException(new BeanPropertyBindingResult("Target", "Object Name")))))));
        verify(this.matchRepo).findByScheduledate((String) any());
    }

    /**
     * Method under test: {@link MatchService#findTeam(TeamModel)}
     */
    @Test
    void testFindTeam() {
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");

        TeamModel teamModel1 = new TeamModel();
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        teamModel1.setPlayersModel(new ArrayList<>());
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");

        MatchModel matchModel = new MatchModel();
        matchModel.setMatchid(1);
        matchModel.setResult("Result");
        matchModel.setScheduledate("2020-03-01");
        matchModel.setTeam1(teamModel);
        matchModel.setTeam1Description("Team1 Description");
        matchModel.setTeam1Overs(10.0d);
        matchModel.setTeam1Wickets("Team1 Wickets");
        matchModel.setTeam2(teamModel1);
        matchModel.setTeam2Description("Team2 Description");
        matchModel.setTeam2Overs(10.0d);
        matchModel.setTeam2Wickets("Team2 Wickets");
        matchModel.setTime("Time");
        matchModel.setVenue("Venue");
        Optional<MatchModel> ofResult = Optional.of(matchModel);
        when(this.matchRepo.findByTeam1((TeamModel) any())).thenReturn(ofResult);

        TeamModel teamModel2 = new TeamModel();
        teamModel2.setCaptain("Captain");
        teamModel2.setId(123L);
        teamModel2.setPlayersModel(new ArrayList<>());
        teamModel2.setPointModels(new ArrayList<>());
        teamModel2.setState("MD");
        teamModel2.setTeamname("Teamname");
        Optional<MatchModel> actualFindTeamResult = this.matchService.findTeam(teamModel2);
        assertSame(ofResult, actualFindTeamResult);
        assertTrue(actualFindTeamResult.isPresent());
        verify(this.matchRepo).findByTeam1((TeamModel) any());
    }

    /**
     * Method under test: {@link MatchService#teamIsExist(TeamModel, org.springframework.validation.BindingResult)}
     */
    @Test
    void testTeamIsExist() {
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");

        TeamModel teamModel1 = new TeamModel();
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        teamModel1.setPlayersModel(new ArrayList<>());
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");

        MatchModel matchModel = new MatchModel();
        matchModel.setMatchid(1);
        matchModel.setResult("Result");
        matchModel.setScheduledate("2020-03-01");
        matchModel.setTeam1(teamModel);
        matchModel.setTeam1Description("Team1 Description");
        matchModel.setTeam1Overs(10.0d);
        matchModel.setTeam1Wickets("Team1 Wickets");
        matchModel.setTeam2(teamModel1);
        matchModel.setTeam2Description("Team2 Description");
        matchModel.setTeam2Overs(10.0d);
        matchModel.setTeam2Wickets("Team2 Wickets");
        matchModel.setTime("Time");
        matchModel.setVenue("Venue");
        Optional<MatchModel> ofResult = Optional.of(matchModel);
        when(this.matchRepo.findByTeam1((TeamModel) any())).thenReturn(ofResult);
        TeamModel teamModel2 = mock(TeamModel.class);
        doNothing().when(teamModel2).setCaptain((String) any());
        doNothing().when(teamModel2).setId(anyLong());
        doNothing().when(teamModel2).setPlayersModel((java.util.List<PlayersModel>) any());
        doNothing().when(teamModel2).setPointModels((java.util.List<PointModel>) any());
        doNothing().when(teamModel2).setState((String) any());
        doNothing().when(teamModel2).setTeamname((String) any());
        teamModel2.setCaptain("Captain");
        teamModel2.setId(123L);
        teamModel2.setPlayersModel(new ArrayList<>());
        teamModel2.setPointModels(new ArrayList<>());
        teamModel2.setState("MD");
        teamModel2.setTeamname("Teamname");
        assertTrue(this.matchService.teamIsExist(teamModel2, teamModel1,new BindException(new BindException(
                new BindException(new BindException(new BeanPropertyBindingResult("Target", "Object Name")))))));
        verify(this.matchRepo).findByTeam1((TeamModel) any());
        verify(teamModel2).setCaptain((String) any());
        verify(teamModel2).setId(anyLong());
        verify(teamModel2).setPlayersModel((java.util.List<PlayersModel>) any());
        verify(teamModel2).setPointModels((java.util.List<PointModel>) any());
        verify(teamModel2).setState((String) any());
        verify(teamModel2).setTeamname((String) any());
    }

    /**
     * Method under test: {@link MatchService#teamIsExist(TeamModel, org.springframework.validation.BindingResult)}
     */
    @Test
    void testTeamIsExist2() {
        when(this.matchRepo.findByTeam1((TeamModel) any())).thenReturn(Optional.empty());
        TeamModel teamModel = mock(TeamModel.class);
        doNothing().when(teamModel).setCaptain((String) any());
        doNothing().when(teamModel).setId(anyLong());
        doNothing().when(teamModel).setPlayersModel((java.util.List<PlayersModel>) any());
        doNothing().when(teamModel).setPointModels((java.util.List<PointModel>) any());
        doNothing().when(teamModel).setState((String) any());
        doNothing().when(teamModel).setTeamname((String) any());
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");
        assertFalse(this.matchService.teamIsExist(teamModel, new BindException(new BindException(
                new BindException(new BindException(new BeanPropertyBindingResult("Target", "Object Name")))))));
        verify(this.matchRepo).findByTeam1((TeamModel) any());
        verify(teamModel).setCaptain((String) any());
        verify(teamModel).setId(anyLong());
        verify(teamModel).setPlayersModel((java.util.List<PlayersModel>) any());
        verify(teamModel).setPointModels((java.util.List<PointModel>) any());
        verify(teamModel).setState((String) any());
        verify(teamModel).setTeamname((String) any());
    }

    /**
     * Method under test: {@link MatchService#viewMatchs(Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testViewMatchs() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ClassCastException: class org.mockito.codegen.Iterable$MockitoMock$457452308 cannot be cast to class java.util.List (org.mockito.codegen.Iterable$MockitoMock$457452308 is in unnamed module of loader com.diffblue.cover.e.f @441589c7; java.util.List is in module java.base of loader 'bootstrap')
        //       at com.service.MatchService.viewMatchs(MatchService.java:179)
        //   In order to prevent viewMatchs(Model)
        //   from throwing ClassCastException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   viewMatchs(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Model model = null;

        // Act
        Model actualViewMatchsResult = this.matchService.viewMatchs(model);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MatchService#viewScores(Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testViewScores() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ClassCastException: class org.mockito.codegen.Iterable$MockitoMock$457452308 cannot be cast to class java.util.List (org.mockito.codegen.Iterable$MockitoMock$457452308 is in unnamed module of loader com.diffblue.cover.e.f @441589c7; java.util.List is in module java.base of loader 'bootstrap')
        //       at com.service.MatchService.viewScores(MatchService.java:192)
        //   In order to prevent viewScores(Model)
        //   from throwing ClassCastException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   viewScores(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Model model = null;

        // Act
        Model actualViewScoresResult = this.matchService.viewScores(model);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MatchService#scoresResult(Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testScoresResult() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ClassCastException: class org.mockito.codegen.Iterable$MockitoMock$457452308 cannot be cast to class java.util.List (org.mockito.codegen.Iterable$MockitoMock$457452308 is in unnamed module of loader com.diffblue.cover.e.f @441589c7; java.util.List is in module java.base of loader 'bootstrap')
        //       at com.service.MatchService.scoresResult(MatchService.java:204)
        //   In order to prevent scoresResult(Model)
        //   from throwing ClassCastException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   scoresResult(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Model model = null;

        // Act
        Model actualScoresResultResult = this.matchService.scoresResult(model);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MatchService#matchResult(Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMatchResult() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ClassCastException: class org.mockito.codegen.Iterable$MockitoMock$457452308 cannot be cast to class java.util.List (org.mockito.codegen.Iterable$MockitoMock$457452308 is in unnamed module of loader com.diffblue.cover.e.f @441589c7; java.util.List is in module java.base of loader 'bootstrap')
        //       at com.service.MatchService.matchResult(MatchService.java:216)
        //   In order to prevent matchResult(Model)
        //   from throwing ClassCastException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   matchResult(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Model model = null;

        // Act
        Model actualMatchResultResult = this.matchService.matchResult(model);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MatchService#AddMatch(Model)}
     */
//    @Test
//    void testAddMatch() {
//        when(this.teamService.listAll()).thenReturn(new ArrayList<>());
//        ConcurrentModel concurrentModel = new ConcurrentModel();
//        assertSame(concurrentModel, this.matchService.AddMatch(concurrentModel));
//        assertEquals(2, ((ConcurrentModel) this.matchService.AddMatch(concurrentModel)).size());
//        verify(this.teamService).listAll();
//    }

    /**
     * Method under test: {@link MatchService#saveMatches(MatchModel, BindingResult, org.springframework.web.servlet.mvc.support.RedirectAttributes)}
     */
    @Test
    void testSaveMatches() {
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");

        TeamModel teamModel1 = new TeamModel();
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        teamModel1.setPlayersModel(new ArrayList<>());
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");

        MatchModel matchModel = new MatchModel();
        matchModel.setMatchid(1);
        matchModel.setResult("Result");
        matchModel.setScheduledate("2020-03-01");
        matchModel.setTeam1(teamModel);
        matchModel.setTeam1Description("Team1 Description");
        matchModel.setTeam1Overs(10.0d);
        matchModel.setTeam1Wickets("Team1 Wickets");
        matchModel.setTeam2(teamModel1);
        matchModel.setTeam2Description("Team2 Description");
        matchModel.setTeam2Overs(10.0d);
        matchModel.setTeam2Wickets("Team2 Wickets");
        matchModel.setTime("Time");
        matchModel.setVenue("Venue");

        TeamModel teamModel2 = new TeamModel();
        teamModel2.setCaptain("Captain");
        teamModel2.setId(123L);
        teamModel2.setPlayersModel(new ArrayList<>());
        teamModel2.setPointModels(new ArrayList<>());
        teamModel2.setState("MD");
        teamModel2.setTeamname("Teamname");

        TeamModel teamModel3 = new TeamModel();
        teamModel3.setCaptain("Captain");
        teamModel3.setId(123L);
        teamModel3.setPlayersModel(new ArrayList<>());
        teamModel3.setPointModels(new ArrayList<>());
        teamModel3.setState("MD");
        teamModel3.setTeamname("Teamname");

        MatchModel matchModel1 = new MatchModel();
        matchModel1.setMatchid(1);
        matchModel1.setResult("Result");
        matchModel1.setScheduledate("2020-03-01");
        matchModel1.setTeam1(teamModel2);
        matchModel1.setTeam1Description("Team1 Description");
        matchModel1.setTeam1Overs(10.0d);
        matchModel1.setTeam1Wickets("Team1 Wickets");
        matchModel1.setTeam2(teamModel3);
        matchModel1.setTeam2Description("Team2 Description");
        matchModel1.setTeam2Overs(10.0d);
        matchModel1.setTeam2Wickets("Team2 Wickets");
        matchModel1.setTime("Time");
        matchModel1.setVenue("Venue");
        Optional<MatchModel> ofResult = Optional.of(matchModel1);

        TeamModel teamModel4 = new TeamModel();
        teamModel4.setCaptain("Captain");
        teamModel4.setId(123L);
        teamModel4.setPlayersModel(new ArrayList<>());
        teamModel4.setPointModels(new ArrayList<>());
        teamModel4.setState("MD");
        teamModel4.setTeamname("Teamname");

        TeamModel teamModel5 = new TeamModel();
        teamModel5.setCaptain("Captain");
        teamModel5.setId(123L);
        teamModel5.setPlayersModel(new ArrayList<>());
        teamModel5.setPointModels(new ArrayList<>());
        teamModel5.setState("MD");
        teamModel5.setTeamname("Teamname");

        MatchModel matchModel2 = new MatchModel();
        matchModel2.setMatchid(1);
        matchModel2.setResult("Result");
        matchModel2.setScheduledate("2020-03-01");
        matchModel2.setTeam1(teamModel4);
        matchModel2.setTeam1Description("Team1 Description");
        matchModel2.setTeam1Overs(10.0d);
        matchModel2.setTeam1Wickets("Team1 Wickets");
        matchModel2.setTeam2(teamModel5);
        matchModel2.setTeam2Description("Team2 Description");
        matchModel2.setTeam2Overs(10.0d);
        matchModel2.setTeam2Wickets("Team2 Wickets");
        matchModel2.setTime("Time");
        matchModel2.setVenue("Venue");
        Optional<MatchModel> ofResult1 = Optional.of(matchModel2);

        TeamModel teamModel6 = new TeamModel();
        teamModel6.setCaptain("Captain");
        teamModel6.setId(123L);
        teamModel6.setPlayersModel(new ArrayList<>());
        teamModel6.setPointModels(new ArrayList<>());
        teamModel6.setState("MD");
        teamModel6.setTeamname("Teamname");

        TeamModel teamModel7 = new TeamModel();
        teamModel7.setCaptain("Captain");
        teamModel7.setId(123L);
        teamModel7.setPlayersModel(new ArrayList<>());
        teamModel7.setPointModels(new ArrayList<>());
        teamModel7.setState("MD");
        teamModel7.setTeamname("Teamname");

        MatchModel matchModel3 = new MatchModel();
        matchModel3.setMatchid(1);
        matchModel3.setResult("Result");
        matchModel3.setScheduledate("2020-03-01");
        matchModel3.setTeam1(teamModel6);
        matchModel3.setTeam1Description("Team1 Description");
        matchModel3.setTeam1Overs(10.0d);
        matchModel3.setTeam1Wickets("Team1 Wickets");
        matchModel3.setTeam2(teamModel7);
        matchModel3.setTeam2Description("Team2 Description");
        matchModel3.setTeam2Overs(10.0d);
        matchModel3.setTeam2Wickets("Team2 Wickets");
        matchModel3.setTime("Time");
        matchModel3.setVenue("Venue");
        Optional<MatchModel> ofResult2 = Optional.of(matchModel3);
        when(this.matchRepo.save((MatchModel) any())).thenReturn(matchModel);
        when(this.matchRepo.findByScheduledate((String) any())).thenReturn(ofResult);
        when(this.matchRepo.findByTeam1((TeamModel) any())).thenReturn(ofResult1);
        when(this.matchRepo.findByVenue((String) any())).thenReturn(ofResult2);
        TeamModel teamModel8 = mock(TeamModel.class);
        doNothing().when(teamModel8).setCaptain((String) any());
        doNothing().when(teamModel8).setId(anyLong());
        doNothing().when(teamModel8).setPlayersModel((java.util.List<PlayersModel>) any());
        doNothing().when(teamModel8).setPointModels((java.util.List<PointModel>) any());
        doNothing().when(teamModel8).setState((String) any());
        doNothing().when(teamModel8).setTeamname((String) any());
        teamModel8.setCaptain("Captain");
        teamModel8.setId(123L);
        teamModel8.setPlayersModel(new ArrayList<>());
        teamModel8.setPointModels(new ArrayList<>());
        teamModel8.setState("MD");
        teamModel8.setTeamname("Teamname");
        TeamModel teamModel9 = mock(TeamModel.class);
        doNothing().when(teamModel9).setCaptain((String) any());
        doNothing().when(teamModel9).setId(anyLong());
        doNothing().when(teamModel9).setPlayersModel((java.util.List<PlayersModel>) any());
        doNothing().when(teamModel9).setPointModels((java.util.List<PointModel>) any());
        doNothing().when(teamModel9).setState((String) any());
        doNothing().when(teamModel9).setTeamname((String) any());
        teamModel9.setCaptain("Captain");
        teamModel9.setId(123L);
        teamModel9.setPlayersModel(new ArrayList<>());
        teamModel9.setPointModels(new ArrayList<>());
        teamModel9.setState("MD");
        teamModel9.setTeamname("Teamname");

        TeamModel teamModel10 = new TeamModel();
        teamModel10.setCaptain("Captain");
        teamModel10.setId(123L);
        teamModel10.setPlayersModel(new ArrayList<>());
        teamModel10.setPointModels(new ArrayList<>());
        teamModel10.setState("MD");
        teamModel10.setTeamname("Teamname");
        MatchModel matchModel4 = mock(MatchModel.class);
        when(matchModel4.getTeam1()).thenReturn(teamModel10);
        when(matchModel4.getScheduledate()).thenReturn("2020-03-01");
        doNothing().when(matchModel4).setMatchid(anyInt());
        doNothing().when(matchModel4).setResult((String) any());
        doNothing().when(matchModel4).setScheduledate((String) any());
        doNothing().when(matchModel4).setTeam1((TeamModel) any());
        doNothing().when(matchModel4).setTeam1Description((String) any());
        doNothing().when(matchModel4).setTeam1Overs((Double) any());
        doNothing().when(matchModel4).setTeam1Wickets((String) any());
        doNothing().when(matchModel4).setTeam2((TeamModel) any());
        doNothing().when(matchModel4).setTeam2Description((String) any());
        doNothing().when(matchModel4).setTeam2Overs((Double) any());
        doNothing().when(matchModel4).setTeam2Wickets((String) any());
        doNothing().when(matchModel4).setTime((String) any());
        doNothing().when(matchModel4).setVenue((String) any());
        matchModel4.setMatchid(1);
        matchModel4.setResult("Result");
        matchModel4.setScheduledate("2020-03-01");
        matchModel4.setTeam1(teamModel8);
        matchModel4.setTeam1Description("Team1 Description");
        matchModel4.setTeam1Overs(10.0d);
        matchModel4.setTeam1Wickets("Team1 Wickets");
        matchModel4.setTeam2(teamModel9);
        matchModel4.setTeam2Description("Team2 Description");
        matchModel4.setTeam2Overs(10.0d);
        matchModel4.setTeam2Wickets("Team2 Wickets");
        matchModel4.setTime("Time");
        matchModel4.setVenue("Venue");
        BindException bindException = new BindException(new BindException(
                new BindException(new BindException(new BeanPropertyBindingResult("Target", "Object Name")))));
        assertEquals("matchSchedule",
                this.matchService.saveMatches(matchModel4, bindException, new RedirectAttributesModelMap()));
        verify(this.matchRepo).findByScheduledate((String) any());
        verify(this.matchRepo).findByTeam1((TeamModel) any());
        verify(matchModel4).getTeam1();
        verify(matchModel4).getScheduledate();
        verify(matchModel4).setMatchid(anyInt());
        verify(matchModel4).setResult((String) any());
        verify(matchModel4).setScheduledate((String) any());
        verify(matchModel4).setTeam1((TeamModel) any());
        verify(matchModel4).setTeam1Description((String) any());
        verify(matchModel4).setTeam1Overs((Double) any());
        verify(matchModel4).setTeam1Wickets((String) any());
        verify(matchModel4).setTeam2((TeamModel) any());
        verify(matchModel4).setTeam2Description((String) any());
        verify(matchModel4).setTeam2Overs((Double) any());
        verify(matchModel4).setTeam2Wickets((String) any());
        verify(matchModel4).setTime((String) any());
        verify(matchModel4).setVenue((String) any());
        verify(teamModel8).setCaptain((String) any());
        verify(teamModel8).setId(anyLong());
        verify(teamModel8).setPlayersModel((java.util.List<PlayersModel>) any());
        verify(teamModel8).setPointModels((java.util.List<PointModel>) any());
        verify(teamModel8).setState((String) any());
        verify(teamModel8).setTeamname((String) any());
        verify(teamModel9).setCaptain((String) any());
        verify(teamModel9).setId(anyLong());
        verify(teamModel9).setPlayersModel((java.util.List<PlayersModel>) any());
        verify(teamModel9).setPointModels((java.util.List<PointModel>) any());
        verify(teamModel9).setState((String) any());
        verify(teamModel9).setTeamname((String) any());
        BindingResult bindingResult = bindException.getBindingResult();
        assertEquals(1, bindingResult.getErrorCount());
        assertEquals(
                "org.springframework.validation.BindException: org.springframework.validation.BindException:"
                        + " org.springframework.validation.BeanPropertyBindingResult: 1 errors\n"
                        + "Field error in object 'match' on field 'team1': rejected value [null]; codes []; arguments []; default"
                        + " message [team1 or team2 match already scheduled]",
                ((BindException) bindingResult).getLocalizedMessage());
    }
}

