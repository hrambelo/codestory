package com.hrambelo.codestory.web.service.manager;

import com.hrambelo.codestory.web.service.manager.impl.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 31/01/13 - Time: 10:45
 * Package: com.hrambelo.codestory.web.service.manager
 * Codestory
 */
@RunWith(MockitoJUnitRunner.class)
public class QuestionManagerTest {

    @Mock
    private AFactory mockFactory;
    private QuestionManager questionManager;

    @Before
    public void setUp() throws Exception {
        questionManager = new QuestionManager(mockFactory);
        IAnswer mockEmail = mock(Email.class);
        doReturn("bensmania@gmail.com").when(mockEmail).answer();
        when(mockFactory.createEmailAnswer()).thenReturn(mockEmail);
        IAnswer mockHappy = mock(Happy.class);
        doReturn("happy").when(mockHappy).answer();
        when(mockFactory.createHappyAnswer()).thenReturn(mockHappy);
        IAnswer mockMailing = mock(Mailing.class);
        doReturn("OUI").when(mockMailing).answer();
        when(mockFactory.createMailingAnswer()).thenReturn(mockMailing);
        IAnswer mockMarkDown = mock(MarkDown.class);
        doReturn("markDown yeah").when(mockMarkDown).answer();
        when(mockFactory.createMarkDownAnswer()).thenReturn(mockMarkDown);
        IAnswer mockStillthere = mock(AlwaysYesAnswer.class);
        doReturn("always there").when(mockStillthere).answer();
        when(mockFactory.createAlwaysYesAnswer()).thenReturn(mockStillthere);
        IAnswer mockReceive = mock(ReceiveFirstSubject.class);
        doReturn("5/5").when(mockReceive).answer();
        when(mockFactory.createReceiveAllAnswer()).thenReturn(mockReceive);

    }

    @Test
    public void testConfigureRouteEmail() throws Exception {
        IAnswer result = questionManager.configureRoute("email");
        assertEquals("bensmania@gmail.com", result.answer());
    }

    @Test
    public void testConfigureRouteHappy() throws Exception {
        IAnswer result = questionManager.configureRoute("heureux");
        assertEquals("happy", result.answer());
    }

    @Test
    public void testConfigureRouteMailing() throws Exception {
        IAnswer result = questionManager.configureRoute("mailing");
        assertEquals("OUI", result.answer());
    }

    @Test
    public void testConfigureRouteMarkdown() throws Exception {
        IAnswer result = questionManager.configureRoute("markdown");
        assertEquals("markDown yeah", result.answer());
    }

    @Test
    public void testConfigureRouteStilThere() throws Exception {
        IAnswer result = questionManager.configureRoute("tu+reponds+toujours");
        assertEquals("always there", result.answer());
    }

    @Test
    public void testConfigureRouteReceive() throws Exception {
        IAnswer result = questionManager.configureRoute("bien+recu");
        assertEquals("5/5", result.answer());
    }

}
