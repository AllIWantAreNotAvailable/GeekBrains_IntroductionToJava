> > # Общие комментарии:
> Для задач №1 и №2 использовался один и тот-же класс, методы ввода значений были переписаны, согласно условию 2-й задачи.

# [Задача №1](https://github.com/AllIWantIsNotAvailable/GeekBrains_IntroductionToJava/blob/main/seminars/Sem02_Why_you_cannot_not_use_the_API/HomeWork/src/Tasks_01_and_02.java):
## Комментарии к задаче:
> - Решение представлено с использованием RegEx и StringBuilder;
> - В ходе написания задача были использованы в тч методы класса String, но в итоге алгоритм был переписан, решение сведено к оптимальному варианту, спасибо следующему списку литературы:
> [первое приближение](https://tproger.ru/articles/regexp-for-beginners/)
> [лекция GeekBrains на YouTube](https://www.youtube.com/watch?v=FXP-oFsvQSU);
> [в продолжение к первому источнику](https://tproger.ru/articles/java-regex-ispolzovanie-reguljarnyh-vyrazhenij-na-praktike/)
> - Строку получаем из метода `static String getJsonString()`;
> - Парсим при помощи логики описанной в методе `static String parseJSON()`;
> - Результат работы сохраняется методом `static void saveToFile()`;
> - Экземпляр класса Logger связан с FileHandler, который пишет логи в файл `Tasks_01_and_02_logs.log`, логируется запись в файл.
>

# [Задача №2](https://github.com/AllIWantIsNotAvailable/GeekBrains_IntroductionToJava/blob/main/seminars/Sem02_Why_you_cannot_not_use_the_API/HomeWork/src/Tasks_01_and_02.java):
## Комментарии к задаче:
> - Метод `static String getJsonString()` из задачи №1 переписан согласно условию задачи, до этого программа считывала строку из консоли;
> - Данные считываются из файла `gradebook.json`;
> - Для считывания данных из файла используется связка FileReader + Scanner и StringBuilder как строка накопления данных;
> - После изменения логики считывания данных программой, в переписанный фрагмент кода добавлена процедура логирвоания.
>

# [Задача №3](https://github.com/AllIWantIsNotAvailable/GeekBrains_IntroductionToJava/blob/main/seminars/Sem02_Why_you_cannot_not_use_the_API/HomeWork/src/Task03.java):
## Комментарии к задаче:
> - Генерируется массив псевдослучайной длины в диапазоне [10..100], заполняется псевдослучайными натуральными числами в диапазоне [10..100];
> - Реализован алгоритм сортировки пузырьком, добавлена небольшая оптимизация алгоритма;
> - Каждая итерация сортировки будет записана в файл `Task03_logs.log`.