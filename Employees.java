package Code.Junior.Home_work.HW_3;

import java.io.Serial;
import java.io.Serializable;

/**
 * Тестовый класс Employees для записи в файл
 */
public class Employees implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private final int age;
    private final String name;
    private final String department;

    public Employees(int age, String name, String department) {
        this.age = age;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return  "имя = " + name +
                ", возраст = " + age +
                ", отдел = " + department + "\n";
    }
}