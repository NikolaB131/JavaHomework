package pr12;

public class AddressClassTest {
    private static final String[] data = {"Россия,Москва,Москва,Проспект Вернадского,78,4,ИВЦ-102"
                           , "Какая-то страна 1,Какой-то регион,Какой-то город,Какая-то улица,Какой-то дом,Какой-то корпус,Какая-то квартира"
                           , "Какая-то страна 2.Какой-то регион.Какой-то город.Какая-то улица.Какой-то дом.Какой-то корпус.Какая-то квартира"
                           , "Какая-то страна 3;Какой-то регион;Какой-то город;Какая-то улица;Какой-то дом;Какой-то корпус;Какая-то квартира"};
    public static void startTest() {
        Address testClass1 = new Address();
        testClass1.setAddressUsingSplit(data[0]);
        Address testClass2 = new Address();
        testClass2.setAddressUsingTokenizer(data[1]);
        Address testClass3 = new Address();
        testClass3.setAddressUsingTokenizer(data[2]);
        Address testClass4 = new Address();
        testClass4.setAddressUsingTokenizer(data[3]);

        if (testClass1.toString().equals("Address{country='Россия', region='Москва', town='Москва', street='Проспект Вернадского', house='78', building='4', apartment='ИВЦ-102'}")) {
            System.out.println("Тест 1 пройден! " + testClass1.toString());
        } else {
            System.out.println("Тест 1 не пройден! " + testClass1.toString());
        }
        if (testClass2.toString().equals("Address{country='Какая-то страна 1', region='Какой-то регион', town='Какой-то город', street='Какая-то улица', house='Какой-то дом', building='Какой-то корпус', apartment='Какая-то квартира'}")) {
            System.out.println("Тест 2 пройден! " + testClass2.toString());
        } else {
            System.out.println("Тест 2 не пройден! " + testClass2.toString());
        }
        if (testClass3.toString().equals("Address{country='Какая-то страна 2', region='Какой-то регион', town='Какой-то город', street='Какая-то улица', house='Какой-то дом', building='Какой-то корпус', apartment='Какая-то квартира'}")) {
            System.out.println("Тест 3 пройден! " + testClass3.toString());
        } else {
            System.out.println("Тест 3 не пройден! " + testClass3.toString());
        }
        if (testClass4.toString().equals("Address{country='Какая-то страна 3', region='Какой-то регион', town='Какой-то город', street='Какая-то улица', house='Какой-то дом', building='Какой-то корпус', apartment='Какая-то квартира'}")) {
            System.out.println("Тест 4 пройден! " + testClass4.toString());
        } else {
            System.out.println("Тест 4 не пройден! " + testClass4.toString());
        }
    }
}
