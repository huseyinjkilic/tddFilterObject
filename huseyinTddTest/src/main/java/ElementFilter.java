package huseyin;

import java.util.List;
import java.util.stream.Collectors;

class ElementFilter {

    public List<huseyin.Element> getElementListForOverAge(List<huseyin.Element> elementList, int age) {
        List<huseyin.Element> result = elementList.stream().filter(x -> x.getAge() > age).collect(Collectors.toList());

        return result;
    }

    public List<huseyin.Element> getDistinctElementListForOverAge(List<huseyin.Element> elementList, int age) {
        List<huseyin.Element> result = elementList.stream().distinct().filter(x -> x.getAge() > age).collect(Collectors.toList());

        return result;
    }
}
