package com.Controller;


import com.controller.TeamController;
import com.repositary.TeamRepo;
import com.service.TeamService;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertEquals;

@ExtendWith(MockitoExtension.class)
 public class TeamControllerTest {

    @InjectMocks
    TeamController teamController;
    @Mock
    TeamRepo teamRepo;
@Mock
    TeamService teamService;

//    @Test
//    public void saveUserTest() {
////        TeamModel user = new TeamModel(1,"CSK", "M.S Dhoni",  "Chennai");
//        when(teamRepo.save(user)).thenReturn(user);
//        assertEquals(user,teamRepo.save(user));
//    }
}
