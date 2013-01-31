package com.hrambelo.codestory.web.service.manager;

import com.hrambelo.codestory.web.service.manager.impl.Email;
import com.hrambelo.codestory.web.service.manager.impl.Happy;
import com.hrambelo.codestory.web.service.manager.impl.Mailing;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
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
        /*IAnswer mockEmail = mock(Email.class);
        doReturn("bensmania@gmail.com").when(mockEmail).answer();
        when(mockFactory.createEmailAnswer()).thenReturn(mockEmail);
        IAnswer mockEmail = mock(Email.class);
        doReturn("bensmania@gmail.com").when(mockEmail).answer();
        when(mockFactory.createEmailAnswer()).thenReturn(mockEmail);
        IAnswer mockEmail = mock(Email.class);
        doReturn("bensmania@gmail.com").when(mockEmail).answer();
        when(mockFactory.createEmailAnswer()).thenReturn(mockEmail);*/

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

}
