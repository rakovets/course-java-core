# OOP (classes and objects)


## Specification of task 1
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