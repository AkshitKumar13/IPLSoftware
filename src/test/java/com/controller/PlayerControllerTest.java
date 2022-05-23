package com.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.repositary.PlayerRepo;
import com.repositary.TeamRepo;
import com.service.PlayerService;
import com.service.TeamService;

import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ConcurrentModel;

@ContextConfiguration(classes = {PlayerController.class})
@ExtendWith(SpringExtension.class)
class PlayerControllerTest {
    @Autowired
    private PlayerController playerController;

    @MockBean
    private PlayerRepo playerRepo;

    @MockBean
    private PlayerService playerService;

    @MockBean
    private TeamRepo teamRepo;

    @MockBean
    private TeamService teamService;

    /**
     * Method under test: {@link PlayerController#add(org.springframework.ui.Model)}
     */
    @Test
    void testAdd() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   javax.servlet.ServletException: Circular view path [addPlayers]: would dispatch back to the current handler URL [/addPlayers] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
        //       at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210)
        //       at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148)
        //       at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
        //       at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1400)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.render(TestDispatcherServlet.java:137)
        //       at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1145)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1084)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent add(Model)
        //   from throwing ServletException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   add(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        TeamRepo teamRepo = mock(TeamRepo.class);
        when(teamRepo.findAll()).thenReturn(new ArrayList<>());
        TeamService teamservice = new TeamService(teamRepo);
        PlayerController playerController = new PlayerController(new PlayerService(), teamservice, mock(PlayerRepo.class),
                mock(TeamRepo.class));
        assertEquals("addPlayers", playerController.add(new ConcurrentModel()));
        verify(teamRepo).findAll();
    }

    /**
     * Method under test: {@link PlayerController#add(org.springframework.ui.Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAdd2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   javax.servlet.ServletException: Circular view path [addPlayers]: would dispatch back to the current handler URL [/addPlayers] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
        //       at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210)
        //       at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148)
        //       at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
        //       at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1400)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.render(TestDispatcherServlet.java:137)
        //       at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1145)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1084)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent add(Model)
        //   from throwing ServletException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   add(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.controller.PlayerController.add(PlayerController.java:62)
        //   In order to prevent add(Model)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   add(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        PlayerController playerController = new PlayerController(new PlayerService(), null, mock(PlayerRepo.class),
                mock(TeamRepo.class));
        playerController.add(new ConcurrentModel());
    }

    /**
     * Method under test: {@link PlayerController#add(org.springframework.ui.Model)}
     */
    @Test
    void testAdd3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   javax.servlet.ServletException: Circular view path [addPlayers]: would dispatch back to the current handler URL [/addPlayers] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
        //       at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210)
        //       at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148)
        //       at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
        //       at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1400)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.render(TestDispatcherServlet.java:137)
        //       at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1145)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1084)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent add(Model)
        //   from throwing ServletException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   add(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        TeamService teamService = mock(TeamService.class);
        when(teamService.listAll()).thenReturn(new ArrayList<>());
        PlayerController playerController = new PlayerController(new PlayerService(), teamService, mock(PlayerRepo.class),
                mock(TeamRepo.class));
        assertEquals("addPlayers", playerController.add(new ConcurrentModel()));
        verify(teamService).listAll();
    }

    /**
     * Method under test: {@link PlayerController#deletePlayer(int, org.springframework.web.servlet.mvc.support.RedirectAttributes)}
     */
    @Test
    void testDeletePlayer() throws Exception {
        doNothing().when(this.playerService).delete(anyInt());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/delete/{id}", 1);
        MockMvcBuilders.standaloneSetup(this.playerController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isFound())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("redirect:/editPlayers"))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/editPlayers"));
    }

    /**
     * Method under test: {@link PlayerController#deletePlayer(int, org.springframework.web.servlet.mvc.support.RedirectAttributes)}
     */
    @Test
    void testDeletePlayer2() throws Exception {
        doNothing().when(this.playerService).delete(anyInt());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/delete/{id}", 1);
        getResult.contentType("https://example.org/example");
        MockMvcBuilders.standaloneSetup(this.playerController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isFound())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("redirect:/editPlayers"))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/editPlayers"));
    }

    /**
     * Method under test: {@link PlayerController#getAllPlayers(org.springframework.ui.Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAllPlayers() throws Exception {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ClassCastException: class org.mockito.codegen.Iterable$MockitoMock$2110523484 cannot be cast to class java.util.List (org.mockito.codegen.Iterable$MockitoMock$2110523484 is in unnamed module of loader com.diffblue.cover.e.f @2d7a5f88; java.util.List is in module java.base of loader 'bootstrap')
        //       at com.controller.PlayerController.getAllPlayers(PlayerController.java:148)
        //       at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:205)
        //       at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:150)
        //       at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:117)
        //       at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:895)
        //       at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:808)
        //       at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1067)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent perform(RequestBuilder)
        //   from throwing ClassCastException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   perform(RequestBuilder).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Object[] uriVars = new Object[]{};
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/showPlayers", uriVars);
        Object[] controllers = new Object[]{this.playerController};
        MockMvc buildResult = MockMvcBuilders.standaloneSetup(controllers).build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link PlayerController#getAllPlayersForEdit(org.springframework.ui.Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAllPlayersForEdit() throws Exception {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ClassCastException: class org.mockito.codegen.Iterable$MockitoMock$2110523484 cannot be cast to class java.util.List (org.mockito.codegen.Iterable$MockitoMock$2110523484 is in unnamed module of loader com.diffblue.cover.e.f @2d7a5f88; java.util.List is in module java.base of loader 'bootstrap')
        //       at com.controller.PlayerController.getAllPlayersForEdit(PlayerController.java:163)
        //       at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:205)
        //       at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:150)
        //       at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:117)
        //       at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:895)
        //       at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:808)
        //       at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1067)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent perform(RequestBuilder)
        //   from throwing ClassCastException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   perform(RequestBuilder).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Object[] uriVars = new Object[]{};
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/editPlayers", uriVars);
        Object[] controllers = new Object[]{this.playerController};
        MockMvc buildResult = MockMvcBuilders.standaloneSetup(controllers).build();

        // Act
        ResultActions actualPerformResult = buildResult.perform(requestBuilder);

        // Assert
        // TODO: Add assertions on result
    }
}

