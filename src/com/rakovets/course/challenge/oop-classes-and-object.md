# OOP (classes and objects)


## Specification of task 1
<<<<<<< HEAD
Создать класс, описывающий промежуток времени. Сам промежуток времени должен задаваться тремя свойствами:
- секундами
- минутами
- часами

Создать метод для получения полного количества секунд в объекте Создать два конструктора: первый принимает общее
количество секунд, второй - часы, минуты и секунды по отдельности. Создать метод для вывода данных. 

Написать тесты для класса.


## Specification of task 2
Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате должен задаваться тремя свойствами,
которые определяют количество купю номинала: 
- 20
- 50
- 100

Сделать методы для добавления денег в банкомат. Сделать метод, снимающий деньги, который принимает сумму денег, а 
возвращает булевое значение - успешность выполнения операции. При снятии денег функция должна распечатывать каким
количеством купюр какого номинала выдаётся сумма. Создать конструктор с тремя параметрами - количеством купюр
каждого номинала.

Написать тесты для класса. 


## Specification of task 3
Создать класс `Point`.

Поля:
- `x` - координата
- `y` - координата

Конструктор:
- `Point(x, y)` – принимает координаты `x` и `y`

Методы:
- `getX()` – получает `x`
- `setX()` – задает `x`
- `getY()` – получает `y`
- `setY()` – задает `y`
- `distance(point)` – принимает `point`, возвращает расстояние от текущей точки (экземпляра, для которого был вызван),
до принимаемой точки

Написать тесты для класса. 


## Specification of task 4
Создать класс `Rectangle`.

Поля:
- `pointLT` - точка левого верхнего угла
- `pointRU` – точка правого нижнего угла

Конструктор:
- `Rectangle(point1, point2)` – принимает два `Point`

Методы:
- `getPointLT()` – получает точку левого верхнего угла
- `setPointLT()` – задает точку левого верхнего угла
- `getPointRU()` – получает точку правого нижнего угла
- `setPointRU()` – задает точку правого нижнего угла
- `area()` – возвращает площадь прямоугольника
- `perimeter()` – возвращает периметр прямоугольника

Написать тесты для класса.
=======
Создать class `Time`.
 
Fields:
- `hours`
- `minutes`
- `seconds`

Constructors:
- `Time(totalSeconds)` - принимает общее время в секунда
- `Time(hours, minutes, seconds)`

Methods:
- `getHours()`
- `setHours(hours)`
- `getMinutes()`
- `setMinutes(minutes)`
- `getSeconds()`
- `setSeconds()`
- `getTotalSeconds()` - возвращает общее время в секундах

Продемонстрировать работу конструкторов и методов в class `TimeTests`


## Specification of task 2
Создать class `Point`, описывающей точку в декартовой системе координат.

Fields:
- `x` - координата точки по оси Ox
- `y` - координата точки по оси Oy

Constructors:
- `Point(x, y)` – принимает координаты `x` и `y`

Methods:
- `getX()`
- `setX()`
- `getY()`
- `setY()`
- `distance(point)` – принимает объект типа `Point`, возвращает расстояние от текущей точки (экземпляра, для которого был вызван), до принимаемой точки

Продемонстрировать работу конструкторов и методов в class `PointTests` 


## Specification of task 3
Создать class `Rectangle`.

Fields:
- `firstPoint` - первая точка
- `secondPoint` – вторая точка

Constructors:
- `Rectangle(firstPoint, secondPoint)` – принимает два объекта типа `Point`

Methods:
- `getFirstPoint()`
- `setFirstPoint()`
- `getSecondPoint()`
- `setSecondPoint()`
- `getPerimeter()` – возвращает периметр прямоугольника
- `getArea()` – возвращает площадь прямоугольника

Продемонстрировать работу конструкторов и методов в class `PointTests`


## Specification of task 4
Создать class `Atm` описывающий банкомат.

Fields:
- `numberBanknotes100`
- `numberBanknotes50`
- `numberBanknotes20`

Constructors:
- `Atm(numberBanknotes100, numberBanknotes50, numberBanknotes20)`

Methods:
- `addBanknotes100(number)`
- `addBanknotes50(number)`
- `addBanknotes20(number)`

Methods*:
- `isPossibleIssue(amount)` - проверяет, возможно ли выдать сумму, которую запросил клиент
- `getOptionsCombinationBanknotes(amount)` - возвращает все возможное варианты для выдачы суммы
- `getCash(option)` - выдает деньги клиенту, для выбранного им варианта 

Продемонстрировать работу конструкторов и методов в class `AtmTests`
>>>>>>> origin/oop-classes-and-object
