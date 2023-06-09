public class Car {             // Класс(тип) Car - Образец(шаблон) для объекта
    // Поля класса. Нестатические поля будут дублироваться для каждого объекта
    int price;                 // Цена
    String brand;              // Марка
    double speed;              // Скорость
    int id;                    // Идентификатор
    // Статические поля принадлежат классу, т.е. для всех объектов они одни - не дублируются
    static int ident = 1;      // Статическое поле для вычисления идентификатора
    /*
    Задача
    Для каждого объекта создать автогенерацию уникального идентификатора
    Решение
    Создадим статическую(static) переменную ident - она будет храниться с Metaspace, т.е. будет общей для всех объектов,
    таким образом, добавив обычную переменную id и присвоив ей значение ident мы получим уникальное значение для
    id первого объекта, а чтобы это значение было уникальным и для следующего объекта выполним увеличение на 1 переменной
    ident(инкремент)
     */
    /**
     * Конструктор для создания объекта Car и автогенерации его идентификатора
     * @param price Цена
     * @param brand Марка
     * @param speed Скорость
     */
    public Car(int price, String brand, double speed) {
        this.price = price;
        this.brand = brand;
        this.speed = speed;
        id = ident;            // Присваиваем ident - статическую переменную
        ident++;               // Инкрементируем(увеличиваем на 1) ident, чтобы следующий объект получил уникальный идентификатор
    }
    /*
    Задача
    Создать метод для вывода полей объекта
    Решение
    Создадим метод(процедуру) out, который выведет на консоль состояние нашего объекта
     */
    public void out(){
        System.out.println("brand: " + brand + "\n" + "price: " + price + "\n" +
                "speed: " + speed + "\n" + "id: " + id);
    }

}
