package com.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.repositary.TeamRepo;
import com.model.PlayersModel;
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

@ContextConfiguration(classes = {TeamService.class})
@ExtendWith(SpringExtension.class)
class TeamServiceTest {
    @MockBean
    private TeamRepo teamRepo;

    @Autowired
    private TeamService teamService;

    /**
     * Method under test: {@link TeamService#listAll()}
     */
    @Test
    void testListAll() {
        ArrayList<TeamModel> teamModelList = new ArrayList<>();
        when(this.teamRepo.findAll()).thenReturn(teamModelList);
        List<TeamModel> actualListAllResult = this.teamService.listAll();
        assertSame(teamModelList, actualListAllResult);
        assertTrue(actualListAllResult.isEmpty());
        verify(this.teamRepo).findAll();
    }

    /**
     * Method under test: {@link TeamService#saveTeams(TeamModel)}
     */
    @Test
    void testSaveTeams() {
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        ArrayList<PlayersModel> playersModelList = new ArrayList<>();
        teamModel.setPlayersModel(playersModelList);
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");
        when(this.teamRepo.save((TeamModel) any())).thenReturn(teamModel);

        TeamModel teamModel1 = new TeamModel();
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        ArrayList<PlayersModel> playersModelList1 = new ArrayList<>();
        teamModel1.setPlayersModel(playersModelList1);
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");
        this.teamService.saveTeams(teamModel1);
        verify(this.teamRepo).save((TeamModel) any());
        assertEquals("Captain", teamModel1.getCaptain());
        assertEquals("Teamname", teamModel1.getTeamname());
        assertEquals("MD", teamModel1.getState());
        assertEquals(playersModelList1, teamModel1.getPointModels());
        assertEquals(playersModelList, teamModel1.getPlayersModel());
        assertEquals(123L, teamModel1.getId().longValue());
    }

    /**
     * Method under test: {@link TeamService#getIds(Long)}
     */
    @Test
    void testGetIds() {
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");
        Optional<TeamModel> ofResult = Optional.of(teamModel);
        when(this.teamRepo.findById((Long) any())).thenReturn(ofResult);
        assertSame(teamModel, this.teamService.getIds(123L));
        verify(this.teamRepo).findById((Long) any());
    }

    /**
     * Method under test: {@link TeamService#getIds(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetIds2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException: No value present
        //       at java.util.Optional.get(Optional.java:148)
        //       at com.service.TeamService.getIds(TeamService.java:51)
        //   In order to prevent getIds(Long)
        //   from throwing NoSuchElementException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getIds(Long).
        //   See https://diff.blue/R013 to resolve this issue.

        when(this.teamRepo.findById((Long) any())).thenReturn(Optional.empty());
        this.teamService.getIds(123L);
    }

    /**
     * Method under test: {@link TeamService#getIds(String)}
     */
    @Test
    void testGetIds3() {
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");
        Optional<TeamModel> ofResult = Optional.of(teamModel);
        when(this.teamRepo.findById((Long) any())).thenReturn(ofResult);
        assertSame(teamModel, this.teamService.getIds("42"));
        verify(this.teamRepo).findById((Long) any());
    }

    /**
     * Method under test: {@link TeamService#getIds(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetIds4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException: No value present
        //       at java.util.Optional.get(Optional.java:148)
        //       at com.service.TeamService.getIds(TeamService.java:83)
        //   In order to prevent getIds(String)
        //   from throwing NoSuchElementException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getIds(String).
        //   See https://diff.blue/R013 to resolve this issue.

        when(this.teamRepo.findById((Long) any())).thenReturn(Optional.empty());
        this.teamService.getIds("42");
    }

    /**
     * Method under test: {@link TeamService#getIds(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetIds5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NumberFormatException: For input string: "Id"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Long.parseLong(Long.java:692)
        //       at java.lang.Long.valueOf(Long.java:1144)
        //       at com.service.TeamService.getIds(TeamService.java:83)
        //   In order to prevent getIds(String)
        //   from throwing NumberFormatException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getIds(String).
        //   See https://diff.blue/R013 to resolve this issue.

        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");
        Optional<TeamModel> ofResult = Optional.of(teamModel);
        when(this.teamRepo.findById((Long) any())).thenReturn(ofResult);
        this.teamService.getIds("Id");
    }

    /**
     * Method under test: {@link TeamService#findByname(String)}
     */
    @Test
    void testFindByname() {
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");
        Optional<TeamModel> ofResult = Optional.of(teamModel);
        when(this.teamRepo.findByTeamname((String) any())).thenReturn(ofResult);
        Optional<TeamModel> actualFindBynameResult = this.teamService.findByname("Teamname");
        assertSame(ofResult, actualFindBynameResult);
        assertTrue(actualFindBynameResult.isPresent());
        verify(this.teamRepo).findByTeamname((String) any());
    }

    /**
     * Method under test: {@link TeamService#teamNameExists(String)}
     */
    @Test
    void testTeamNameExists() {
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");
        Optional<TeamModel> ofResult = Optional.of(teamModel);
        when(this.teamRepo.findByTeamname((String) any())).thenReturn(ofResult);
        assertTrue(this.teamService.teamNameExists("Teamname"));
        verify(this.teamRepo).findByTeamname((String) any());
    }

    /**
     * Method under test: {@link TeamService#teamNameExists(String)}
     */
    @Test
    void testTeamNameExists2() {
        when(this.teamRepo.findByTeamname((String) any())).thenReturn(Optional.empty());
        assertFalse(this.teamService.teamNameExists("Teamname"));
        verify(this.teamRepo).findByTeamname((String) any());
    }

    /**
     * Method under test: {@link TeamService#deleteTeams(Long)}
     */
    @Test
    void testDeleteTeams() {
        doNothing().when(this.teamRepo).deleteById((Long) any());
        this.teamService.deleteTeams(123L);
        verify(this.teamRepo).deleteById((Long) any());
    }
}

