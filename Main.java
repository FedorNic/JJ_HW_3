package Code.Junior.Home_work.HW_3;

import java.util.Arrays;
import java.util.List;

/**
 * Написать класс с двумя методами:
 * 1. принимает объекты, имплементирующие интерфейс serializable, и сохраняющие их в файл. Название файл - class.getName() + "_" + UUID.randomUUID().toString()
 * 2. принимает строку вида class.getName() + "_" + UUID.randomUUID().toString() и загружает объект из файла и удаляет этот файл.
 * Что делать в ситуациях, когда файла нет или в нем лежит некорректные данные - подумать самостоятельно.
 */
public class Main {
    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
                new Employees(35, "Патрик", "CORE"),
                new Employees(20, "Ефстафий", "DESK")
        );

        SerializableObjectToFile serializableObjectToFile = new SerializableObjectToFile();
        serializableObjectToFile.writingObjectToFile(employees);
        serializableObjectToFile.readingObjectFromFile(serializableObjectToFile.getPath());
    }
}