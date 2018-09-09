package huseyin;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class ElementTest {

    private final huseyin.ElementFilter filterElement = new huseyin.ElementFilter();
    private List<huseyin.Element> elementList;
    private huseyin.Element elementHuseyin;
    private huseyin.Element elementAida;
    private huseyin.Element elementDuygu;
    private huseyin.Element elementYigit;
    private huseyin.Element elementMert;
    private huseyin.Element elementMertWith20Age;
    private huseyin.Element duplicateElementHuseyin;
    private List<huseyin.Element> distinctFilteredElementList;

    @Before
    public void setUpElementList(){
        createElements();
        addElementsToList();
        distinctFilteredElementList = filterElement.getDistinctElementListForOverAge(elementList,20);

    }

    @Test
    public void testForNotSameList() {
        assertNotSame(elementList, distinctFilteredElementList);
    }
    
    @Test
    public void testForNonExistelementInList() {
         assertFalse(distinctFilteredElementList.contains(elementMert));
    }

    @Test
    public void testForNonExist20YearselementInList() {
         assertFalse(distinctFilteredElementList.contains(elementMertWith20Age));
    }


    @Test
    public void testForSuccessCase() {
        assertTrue(distinctFilteredElementList.contains(elementHuseyin));
    }



    private void createElements() {
        elementHuseyin = new huseyin.Element(1, "huseyin", 33);
        elementAida = new huseyin.Element(2, "aida", 31);
        elementDuygu = new huseyin.Element(3, "duygu", 31);
        elementYigit = new huseyin.Element(4, "yigit", 2);
        elementMert = new huseyin.Element(5, "mert", 2);
        elementMertWith20Age = new huseyin.Element(6, "mert", 20);
        duplicateElementHuseyin = new huseyin.Element(1, "huseyin", 33);
    }

    private void addElementsToList() {
        elementList = new ArrayList<>();
        elementList.add(elementHuseyin);
        elementList.add(elementAida);
        elementList.add(elementDuygu);
        elementList.add(elementYigit);
        elementList.add(elementMert);
        elementList.add(elementMertWith20Age);
        elementList.add(duplicateElementHuseyin);
    }
}
