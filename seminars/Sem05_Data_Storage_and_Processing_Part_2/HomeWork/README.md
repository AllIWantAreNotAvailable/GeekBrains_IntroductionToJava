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
> - [Ссылка на описание класса](https://github.com/AllIWantIsNotAvailable/GeekBrains_IntroductionToJava/blob/main/seminars/Sem05_Data_Storage_and_Processing_Part_2/HomeWork/src/Classes/Heap.java)
> - Реализован класс куча на основе Integer[] (условие кучи: родитель меньше или равен дочернему узлу) со следующими методами:
>   1) public isEmpty() – проверяет, содержится ли хоть 1 элемент в куче;
>   2) public insert() – добавляет элемент в кучу и просеивает вверх;
>   3) public getMin() - возвращает минимальный элемент не удаляя его;
>   4) public removeMin() – удаляет минимальный элемент и возвращает его значение;
>   5) private sift_up() – просеивает элемент вверх;
>   6) private sift_down() – просеивает элемент вниз;
>   7) private swap() – меняет элементы местами;
>   8) public heapSort() – сортирует переданный массив (по убыванию или по возрастанию, в зависимости от переданного аргумента).
>


# [Задача со звездочкой №4](https://github.com/AllIWantIsNotAvailable/GeekBrains_IntroductionToJava/blob/main/seminars/Sem05_Data_Storage_and_Processing_Part_2/HomeWork/src/TaskStar04.java):
> ## Комментарии к задаче:
> На данный момент решение задачи не представлено.
> 
