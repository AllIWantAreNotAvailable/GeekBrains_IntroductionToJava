# [Задача №1](https://github.com/AllIWantIsNotAvailable/GeekBrains_IntroductionToJava/blob/main/seminars/Sem05_Data_Storage_and_Processing_Part_2/HomeWork/src/Task01.java):
> ## Комментарии к задаче:
> - [Ссылка на описание класса](https://github.com/AllIWantIsNotAvailable/GeekBrains_IntroductionToJava/blob/main/seminars/Sem05_Data_Storage_and_Processing_Part_2/HomeWork/src/Classes/PhoneBook.java);
> - Реализовали функцию добавления, метод имеет 3 перегрузки:
>   1) по полному имени и телефону;
>   2) по имени, фамилии и телефону;
>   3) по какому-то имени и телефону.
> - переопредели метод toString() для "красивого" вывода в консоль.
>


# [Задача №2](https://github.com/AllIWantIsNotAvailable/GeekBrains_IntroductionToJava/blob/main/seminars/Sem05_Data_Storage_and_Processing_Part_2/HomeWork/src/Task02.java):
> ## Комментарии к задаче:
> - [Ссылка на описание класса](https://github.com/AllIWantIsNotAvailable/GeekBrains_IntroductionToJava/blob/main/seminars/Sem05_Data_Storage_and_Processing_Part_2/HomeWork/src/Classes/CorporateHandbook.java);
> - реализовали добавление элементов;
> - переопределили метод toString() и сосредоточили в нем логику вывода популярных имен;
> - логика простая:
>   1) инициализировали treeMap();
>   2) при инициализации указали обратный порядок сортировки;
>   3) в качестве ключа будем использовать инкремент, в который будем считать количество вхождений каждого имени;
>   4) в качестве значения - ArrayList<String>;
>   5) обход по атрибуту класса handbook организован с помощью вложенных циклов:
>      1) главный в переменной цикла хранит текущее полное имя;
>      2) сплитим полное имя по пробелу, забираем первый элемент (имя) и запоминаем его;
>      3) вложенный цикл для подсчета вхождений, п. b в нем повторяется для переменной вложенного цикла;
>      4) при выходе из вложенного цикла, проверяем содержится ли наш ключ в дереве, если нет - создаем новый node, иначе проверяем "добавляли ли мы текущее имя в список", если нет – добавляем;
>      5) далее просто формируем красивый вывод.
>


# [Задача со звездочкой №3](https://github.com/AllIWantIsNotAvailable/GeekBrains_IntroductionToJava/blob/main/seminars/Sem05_Data_Storage_and_Processing_Part_2/HomeWork/src/TaskStar03.java):
> ## Комментарии к задаче:
> На данный момент решение задачи не представлено.
>


# [Задача со звездочкой №4](https://github.com/AllIWantIsNotAvailable/GeekBrains_IntroductionToJava/blob/main/seminars/Sem05_Data_Storage_and_Processing_Part_2/HomeWork/src/TaskStar04.java):
> ## Комментарии к задаче:
> На данный момент решение задачи не представлено.
> 
