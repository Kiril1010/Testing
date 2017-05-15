package questionary;

import collections.pedigee.Person;
import homeWorkAcquaintance.PersonData;
import homeWorkAcquaintance.Questionary;
import homeWorkAcquaintance.Sex;
import org.junit.Assert;
import org.junit.Test;

public class QuestionaryTest {

    PersonData userOne = new PersonData("Kiril", "Bondarev", Sex.MAN, 32, "Kharkov", 2);
    PersonData userTwo = new PersonData("Katya", "Brusnikina", Sex.WOMAN, 32, "Kharkov", 2);
    PersonData userThree = new PersonData("Louisa", "Volkova", Sex.WOMAN, 22, "Kharkov", 2);
    Questionary questionary = new Questionary();

    @Test
    public void shouldAddNewUser() {
        int age = userOne.getAge();
        Assert.assertTrue("Age should be more then 18 years", age>=18);
    }

    @Test
    public void shouldShowSuitablePersonsBySex() {
//        questionary.addNewUser(userOne);
//        questionary.addNewUser(userTwo);
//        questionary.addNewUser(userThree);
        Assert.assertEquals("Person should be the man sex", Sex.MAN, userOne.getSex());
    }

    @Test
    public void shouldShowUserInfoByFirstNameAndLastName() {
        
    }
}
