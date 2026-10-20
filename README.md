Портал группы: студенты и оценки (`GroupPortal`)

Учебное мобильное приложение для ОС Android на языке Kotlin, разработанное в рамках практической работы по изучению базовых компонентов Android SDK: `Activity`, явные `Intent`, XML-разметка (`ViewGroup`) и системное логирование (`Log`).

Основные характеристики и стек технологий:
Среда разработки: Android Studio Ladybug.
Тестовое устройство: Эмулятор Pixel 7 (Android 17, API Level 37.2).
Платформа и язык: Android 8.0+ (API 26) и выше; Kotlin.
Минимальная SDK (`minSdk`): 26 (Android 8.0 Oreo).
Целевая / Компилируемая SDK (`targetSdk` / `compileSdk`): 36.

Архитектура и структура экранов
Приложение состоит из 3 экранов (`Activity`), связанных между собой явными `Intent`:

1. MainActivity (Экран входа):
Стартовый экран авторизации с полем ввода имени пользователя.
Макет построен на базе контейнера LinearLayout (`android:orientation="vertical"`).
Передает введенное имя на следующий экран через `intent.putExtra("USER_NAME", name)`.

3. ListActivity (Экран списка группы):
Принимает имя пользователя и выводит персональное приветствие.
Отображает список кнопок с Ф.И.О. студентов группы.
Макет построен на базе контейнера LinearLayout.
Передает данные о выбранном студенте и его оценке в DetailActivity.

4. DetailActivity (Карточка студента):
Отображает подробную информацию о студенте: аватар, имя и итоговую оценку в баллах.
Макет построен на базе контейнера RelativeLayout с относительным позиционированием элементов.
Содержит кнопку «Назад», закрывающую текущую Activity методом `finish()`.

Ресурсы (`res/values`)
Все строки, цвета и размерные значения вынесены из кода и разметки в файлы ресурсов:

`res/values/strings.xml` — текстовые строки и названия кнопок.

`res/values/colors.xml` — цветовая палитра приложения.

`res/values/dimens.xml` — размерные отступы и размеры шрифтов (`dp`/`sp`).


Логирование (`Logcat`)
В приложении реализовано системное логирование жизненного цикла каждой Activity (`onCreate`, `onStart`, `onResume`, `onPause`, `onStop`, `onDestroy`) и ключевых действий пользователя.
Отфильтрованные логи сохранены в файл logs.txt в корне репозитория.

Ссылки и файлы
Исходный код: [https://github.com/roqua667/GroupPortalPrac](https://www.google.com/search?q=https://github.com/roqua667/GroupPortalPrac)
Журнал логов: [https://github.com/roqua667/GroupPortalPrac/blob/main/logs.txt](https://www.google.com/search?q=https://github.com/roqua667/GroupPortalPrac/blob/main/logs.txt)
Скачать APK-файл: [https://github.com/roqua667/GroupPortalPrac/releases/tag/v1.0](https://www.google.com/search?q=https://github.com/roqua667/GroupPortalPrac/releases/tag/v1.0)
