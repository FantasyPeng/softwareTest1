package pengjf.softwaretest;

import pengjf.softwaretest.People;
import pengjf.softwaretest.PeopleDao;

/**
 * Created by Pengjf on 2020/8/17
 */
public class PeopleService {
    private final PeopleDao peopleDao;

    public PeopleService(PeopleDao peopleDao) {
        this.peopleDao = peopleDao;
    }

    public boolean update(int id, String name) {
        People people = peopleDao.getPeople(id);
        if (people == null) {
            return false;
        }

        People peopleUpdate = new People(people.getId(), name);
        return peopleDao.update(peopleUpdate);
    }

}
