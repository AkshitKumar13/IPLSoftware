package com.service;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.repositary.PointRepo;
import com.model.MatchModel;
import com.model.PointModel;
import com.model.TeamModel;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ResultService.class})
@ExtendWith(SpringExtension.class)
class ResultServiceTest {
    @MockBean
    private PointRepo pointRepo;

    @Autowired
    private ResultService resultService;

    /**
     * Method under test: {@link ResultService#getResult(MatchModel)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetResult() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NumberFormatException: For input string: "Team1 Description"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Integer.parseInt(Integer.java:652)
        //       at java.lang.Integer.parseInt(Integer.java:770)
        //       at com.service.ResultService.getResult(ResultService.java:51)
        //   In order to prevent getResult(MatchModel)
        //   from throwing NumberFormatException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getResult(MatchModel).
        //   See https://diff.blue/R013 to resolve this issue.

        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");

        PointModel pointModel = new PointModel();
        pointModel.setId(123L);
        pointModel.setLossCount(3);
        pointModel.setMatchCount(3);
        pointModel.setPoint(1);
        pointModel.setTeam(teamModel);
        pointModel.setWinCount(3);
        when(this.pointRepo.findByTeamId((Long) any())).thenReturn(pointModel);

        TeamModel teamModel1 = new TeamModel();
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        teamModel1.setPlayersModel(new ArrayList<>());
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");

        TeamModel teamModel2 = new TeamModel();
        teamModel2.setCaptain("Captain");
        teamModel2.setId(123L);
        teamModel2.setPlayersModel(new ArrayList<>());
        teamModel2.setPointModels(new ArrayList<>());
        teamModel2.setState("MD");
        teamModel2.setTeamname("Teamname");

        MatchModel matchModel = new MatchModel();
        matchModel.setMatchid(1);
        matchModel.setResult("Result");
        matchModel.setScheduledate("2020-03-01");
        matchModel.setTeam1(teamModel1);
        matchModel.setTeam1Description("Team1 Description");
        matchModel.setTeam1Overs(10.0d);
        matchModel.setTeam1Wickets("Team1 Wickets");
        matchModel.setTeam2(teamModel2);
        matchModel.setTeam2Description("Team2 Description");
        matchModel.setTeam2Overs(10.0d);
        matchModel.setTeam2Wickets("Team2 Wickets");
        matchModel.setTime("Time");
        matchModel.setVenue("Venue");
        this.resultService.getResult(matchModel);
    }

    /**
     * Method under test: {@link ResultService#getPoint()}
     */
    @Test
    void testGetPoint() {
        ArrayList<PointModel> pointModelList = new ArrayList<>();
        when(this.pointRepo.findAll()).thenReturn(pointModelList);
        List<PointModel> actualPoint = this.resultService.getPoint();
        assertSame(pointModelList, actualPoint);
        assertTrue(actualPoint.isEmpty());
        verify(this.pointRepo).findAll();
    }
}

