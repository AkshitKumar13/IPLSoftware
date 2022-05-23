package com.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.repositary.PlayerRepo;
import com.model.PlayersModel;
import com.model.TeamModel;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {PlayerService.class})
@ExtendWith(SpringExtension.class)
class PlayerServiceTest {
    @MockBean
    private PlayerRepo playerRepo;

    @Autowired
    private PlayerService playerService;

    /**
     * Method under test: {@link PlayerService#save(PlayersModel)}
     */
    @Test
    void testSave() {
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");

        PlayersModel playersModel = new PlayersModel();
        playersModel.setId(1);
        playersModel.setName("Name");
        playersModel.setPlayer_role("Player role");
        playersModel.setTeam(teamModel);
        when(this.playerRepo.save((PlayersModel) any())).thenReturn(playersModel);

        TeamModel teamModel1 = new TeamModel();
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        teamModel1.setPlayersModel(new ArrayList<>());
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");

        PlayersModel playersModel1 = new PlayersModel();
        playersModel1.setId(1);
        playersModel1.setName("Name");
        playersModel1.setPlayer_role("Player role");
        playersModel1.setTeam(teamModel1);
        this.playerService.save(playersModel1);
        verify(this.playerRepo).save((PlayersModel) any());
        assertEquals(1, playersModel1.getId());
        assertSame(teamModel1, playersModel1.getTeam());
        assertEquals("Player role", playersModel1.getPlayer_role());
        assertEquals("Name", playersModel1.getName());
    }

    /**
     * Method under test: {@link PlayerService#get(String)}
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

        PlayersModel playersModel = new PlayersModel();
        playersModel.setId(1);
        playersModel.setName("Name");
        playersModel.setPlayer_role("Player role");
        playersModel.setTeam(teamModel);
        Optional<PlayersModel> ofResult = Optional.of(playersModel);
        when(this.playerRepo.findById((Integer) any())).thenReturn(ofResult);
        assertSame(playersModel, this.playerService.get("42"));
        verify(this.playerRepo).findById((Integer) any());
    }

    /**
     * Method under test: {@link PlayerService#get(String)}
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
        //       at com.service.PlayerService.get(PlayerService.java:37)
        //   In order to prevent get(String)
        //   from throwing NoSuchElementException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   get(String).
        //   See https://diff.blue/R013 to resolve this issue.

        when(this.playerRepo.findById((Integer) any())).thenReturn(Optional.empty());
        this.playerService.get("42");
    }

    /**
     * Method under test: {@link PlayerService#get(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGet3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NumberFormatException: For input string: "Id"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Integer.parseInt(Integer.java:652)
        //       at java.lang.Integer.valueOf(Integer.java:983)
        //       at com.service.PlayerService.get(PlayerService.java:37)
        //   In order to prevent get(String)
        //   from throwing NumberFormatException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   get(String).
        //   See https://diff.blue/R013 to resolve this issue.

        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");

        PlayersModel playersModel = new PlayersModel();
        playersModel.setId(1);
        playersModel.setName("Name");
        playersModel.setPlayer_role("Player role");
        playersModel.setTeam(teamModel);
        Optional<PlayersModel> ofResult = Optional.of(playersModel);
        when(this.playerRepo.findById((Integer) any())).thenReturn(ofResult);
        this.playerService.get("Id");
    }

    /**
     * Method under test: {@link PlayerService#findByPlayersplayer_name(String)}
     */
    @Test
    void testFindByPlayersplayer_name() {
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");

        PlayersModel playersModel = new PlayersModel();
        playersModel.setId(1);
        playersModel.setName("Name");
        playersModel.setPlayer_role("Player role");
        playersModel.setTeam(teamModel);
        Optional<PlayersModel> ofResult = Optional.of(playersModel);
        when(this.playerRepo.findByName((String) any())).thenReturn(ofResult);
        Optional<PlayersModel> actualFindByPlayersplayer_nameResult = this.playerService
                .findByPlayersplayer_name("Playername");
        assertSame(ofResult, actualFindByPlayersplayer_nameResult);
        assertTrue(actualFindByPlayersplayer_nameResult.isPresent());
        verify(this.playerRepo).findByName((String) any());
    }

    /**
     * Method under test: {@link PlayerService#playernameExists(String)}
     */
    @Test
    void testPlayernameExists() {
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");

        PlayersModel playersModel = new PlayersModel();
        playersModel.setId(1);
        playersModel.setName("Name");
        playersModel.setPlayer_role("Player role");
        playersModel.setTeam(teamModel);
        Optional<PlayersModel> ofResult = Optional.of(playersModel);
        when(this.playerRepo.findByName((String) any())).thenReturn(ofResult);
        assertTrue(this.playerService.playernameExists("Playername"));
        verify(this.playerRepo).findByName((String) any());
    }

    /**
     * Method under test: {@link PlayerService#playernameExists(String)}
     */
    @Test
    void testPlayernameExists2() {
        when(this.playerRepo.findByName((String) any())).thenReturn(Optional.empty());
        assertFalse(this.playerService.playernameExists("Playername"));
        verify(this.playerRepo).findByName((String) any());
    }

    /**
     * Method under test: {@link PlayerService#delete(int)}
     */
    @Test
    void testDelete() {
        doNothing().when(this.playerRepo).deleteById((Integer) any());
        this.playerService.delete(1);
        verify(this.playerRepo).deleteById((Integer) any());
    }
}

