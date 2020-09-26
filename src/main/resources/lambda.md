## Task1
Дан массив аргументов. Нужно получить Map, где каждому ключу будет соответствовать своё значение.

```java
String[] arguments = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
// -i: in.txt
// --limit: 40
// -d: 1
// -o: out.txt
```

сконвертировать Map с аргументами в массив строк,

```java
// -i in.txt --limit 40 -d 1 -o out.txt
```


## Task 2
Вывести таблицу умножения.
- в 1 столбец
- в 4 столбца, как на школьных тетрадя


## Task 3
Дан список студентов.
```java
    List<Student> students = Arrays.asList(
            new Student("Alex", Speciality.Physics, 1),
            new Student("Rika", Speciality.Biology, 4),
            new Student("Julia", Speciality.Biology, 2),
            new Student("Steve", Speciality.History, 4),
            new Student("Mike", Speciality.Finance, 1),
            new Student("Hinata", Speciality.Biology, 2),
            new Student("Richard", Speciality.History, 1),
            new Student("Kate", Speciality.Psychology, 2),
            new Student("Sergey", Speciality.ComputerScience, 4),
            new Student("Maximilian", Speciality.ComputerScience, 3),
            new Student("Tim", Speciality.ComputerScience, 5),
            new Student("Ann", Speciality.Psychology, 1)
            );
     
    enum Speciality {
        Biology, ComputerScience, Economics, Finance,
        History, Philosophy, Physics, Psychology
    }
```

У класса Student реализованы все геттеры и сеттеры, toString и equals+hashCode

- Нужно сгруппировать всех студентов по курсу.
- Вывести в алфавитном порядке список специальностей, на которых учатся перечисленные в списке студенты
- Вывести количество учащихся на каждой из специальностей.
- Сгруппировать студентов по специальностям, сохраняя алфавитный порядок специальности, а затем сгруппировать по курсу.
    - всё красиво вывести
- Проверить, есть ли третьекурсники среди учащихся всех специальностей кроме физики и CS.
