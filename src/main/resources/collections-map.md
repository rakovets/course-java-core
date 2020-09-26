# Collections. Map  


## Project `Words monitoring`
### Specification of task 1
Создать класс:
- `TextMonitoring`
- `TextMonitoringDemo` демонстрация работы класса `TextMonitoring` 


### Specification of task 2
Добавить метод `researchText()`, принимающий в качестве параметра `String`. Метод выделяет все
различные слова и подсчитывае частоту с которой они встречаются. Слова считаются различными даже если у них отличается
регистром букв.


### Specification of task 3
Добавить методы:
- `getCountUniqueWords()` возвращает количество уникальных слов в тексте
- `getUniqueWords()` возвращает `Collection` уникальных слов из текста
- `get(String work)` возвращае частоту употребления слова `word`
- `print()` выводит в *Standard Output* все слова и частоту их употребления (в порядке убывания частоты)


## Project `Garage`
### Specification of task 1
Создать абстрактный класс представляющий автомобиль:
- `Car`


### Specification of task 2
Добавить поля:
- `brand`
- `model`
- `color`
- `yearManufacture`
- `registrationNumber`


### Specification of task 3
Создать 4 класса, являющихся наследниками `Car`.


### Specification of task 4
Переопределить во всех subclasses классы `Car` методы:
- `equals()`
- `hashCode()`
- `toString()`


### Specification of task 5
Создать класс `Garage`, хранящий в себе `HashMap` c автомобилями, в которой ключом является объект автомобиля, значением - количество точно таких автомобилей в гараже.


### Specification of task 6
Добавить в класс `Garage`:
- `park()`
- `leave()`
- `getCount(String )`
- `getCount(brand)`
- `getCount(brand, model)`


### Specification of task 7
Продемонстрировать работу гаража в классе `GarageDemo`