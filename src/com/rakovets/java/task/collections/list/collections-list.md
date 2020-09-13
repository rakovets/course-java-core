# Collections. List.


## Project `StringList`
### Specification of task 1
Создать класс:
- `StringList`
- `StringListDemo` демонстрация работы класса `StringList` 


### Specification of task 2
В `StringList` добавить метод `markWordsWithLength()`, принимающий в качестве параметра `List` типа `String` и размер слова.
Метод размещающает строку "*" перед каждым элементом длина которого равна размеру слова. Оригинальные элементы должны остаться на месте.

Например:

Длина слова 4 символа. Первоначальная коллекция:
```
["this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"]
```

Коллекция после обработки методом:
```
["*", "this", "is", "*", "lots", "of", "fun", "for", "every", "*", "Java", "programmer"]
```


### Specification of task 3
В `StringList` добавить метод  `removeWordsWithLength()`, который прынимает `Collection` типа `String` и размер слова.
Метод удаляет из списка строк все строки длиной равной размерности слова.


## Project `Hollywood`
### Specification of task 1
Создать класс `Actor`.

Поля:
- `firstName`
- `lastName`
- `fee`


### Specification of task 2
Создать класс `HollywoodDemo`:
- создать `ArrayList<Actor>`
- добавить в него несколько актёров с данными


### Specification of task 3
Написать метод `fire()`, принимающий `List` типа `Actor` и удаляющий из списка актёра с наибольшим гонораром.


### Specification of task 4
Продемострировать коррректность работы метода `fire()`


### Specification of task 5
Добавить в класс `Actor` возраст актёра `age`.


### Specification of task 6
Написать компараторы, которые позволят отсортировать список актёров по:
- фамилии
- возрасту
- гонорару
- фамилии и возрасту
- гонорару и фамилии


## Project `School`
### Specification of task 1
Создать класс `Student`, представляющий собой ученика.
Поля:
- `name`
- `surname`
- `age`
- `averageAnnualMark`


### Specification of task 2
Создать класс `SchoolDemo`, где создать `List` учеников.
В дальнейшем использовать как класс для демонстрации корректной работы других классов. 


### Specification of task 3
Создать класс `SchoolUtil`.
Создать в нем метод `getBestStudent()` принимающий `List` учеников и возвращающий ученика с самым высоким средним баллом.


### Specification of task 4
Написать компараторы, которые позволят отсортировать список актёров по:
- полному имени (имя + фамилия)
- возрасту
- среднему баллу
