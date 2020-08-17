package pengjf.softwaretest;

import pengjf.softwaretest.People;

/**
 * Created by Pengjf on 2020/8/17
 */
public interface PeopleDao {
    People getPeople(int id);

    boolean update(People people);
}
