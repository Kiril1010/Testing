package arraylist;

import homework_20_09_16.arraylist.ArrayList;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ImitationArrayListKirill {

    ArrayList list = new ArrayList(5);

    @Before
    public void testBeforClassAnnotation() {
        System.out.println("Befor test");
    }

    @After
    public void testAfterClassAnnotation() {
        System.out.println("After test");
    }

    @Test
    public void shouldAddElement()  {
        list.addElement(25);
        Assert.assertEquals("Should return 25", 25, list.getArray()[0]);
    }

    @Test
    public void testResize() {
        list.setArray(new int[1]);
        list.addElement(25);
        list.addElement(22);
        Assert.assertEquals("Should return 25", 25, list.getArray()[0]);
        Assert.assertEquals("Should return 2", 2, list.getArray().length);
    }

    @Test
    public void testChangeElementByIndex() {
        list.addElement(25);
        Assert.assertEquals("Should return 25", 25, list.getArray()[0]);
        list.changeElementByIndex(0, 12);
        Assert.assertEquals("Should return 12", 12, list.getArray()[0]);
    }

    @Test
    public void testDeleteElementByIndex() {
        list.addElement(25);
        list.addElement(48);
        list.addElement(32);
        list.deleteElementByIndex(1);
        Assert.assertEquals("Should return 32", 32, list.getArray()[1]);
    }

    @Test
    public void testEncreaseArray() {
        list.addElement(12);
        list.encreaseArray(6);
        Assert.assertEquals("Should return 11", 11, list.getArray().length);
    }
}



