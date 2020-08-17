package pengjf.softwaretest.mock;
import org.junit.Test;
import pengjf.softwaretest.People;
import pengjf.softwaretest.PeopleDao;
import org.junit.Before;
import pengjf.softwaretest.PeopleService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.*;

/**
 * Created by Pengjf on 2020/8/17
 */
public class PeopleServiceTest {
    private PeopleDao   mockDao;
    private PeopleService personService;

    @Before
    public void setUp() throws Exception {
        //模拟PersonDao对象
        mockDao = mock(PeopleDao.class);
        when(mockDao.getPeople(1)).thenReturn(new People(1, "Pengjianfei"));
        when(mockDao.update(isA(People.class))).thenReturn(true);

        personService = new PeopleService(mockDao);
    }

    @Test
    public void testGetPeople() throws Exception  {
        String name = mockDao.getPeople(1).getName();
        assertEquals(name, "Pengjianfei");
    }

    @Test
    public void testUpdate() throws Exception {
        boolean result = personService.update(1, "new name");
        assertTrue("must true", result);
    }

}
