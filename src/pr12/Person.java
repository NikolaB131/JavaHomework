package pr12;

public class Person {
    private String surname;
    private String name;
    private String patronymic;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFullName() {
        StringBuilder sb = new StringBuilder();
        sb.append(surname);
        if (!name.isEmpty()) { // если есть имя
            sb.append(" ").append(name);
        }
        if (!patronymic.isEmpty()) { // если есть отчество
            sb.append(" ").append(patronymic);
        }
        return sb.toString();
    }
}
