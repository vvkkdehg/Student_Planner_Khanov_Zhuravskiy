package com.zhuravskii_khanov.student_planner2.data

data class Subject(
    val id: String,
    val name: String,
    val professor: String,
    val credits: Int,
    val currentGrade: String,
    val description: String
) {
    val sampleSubjects = listOf(
        Subject(
            id = "1",
            name = "Разработка мобильных приложений",
            professor = "Леонтьев Д.А.",
            credits = 91,
            currentGrade = "Отлично",
            description = "Разработка нативных Android-приложений с использованием Kotlin и современных компонентов Jetpack Compose. Изучение архитектурных паттернов MVVM, работы с локальными базами данных и сетевыми API."
        ),
        Subject(
            id = "2",
            name = "Менеджмент в профессиональной деятельности",
            professor = "Запорожская С.А.",
            credits = 61,
            currentGrade = "Зачет",
            description = "Создание своей компании. Обучение управлять ею. "
        ),
        Subject(
            id = "3",
            name = "Системное программирование",
            professor = "Токаев Т.И.",
            credits = 75,
            currentGrade = "Хорошо",
            description = "Низкоуровневая разработка на языке Rust: управление памятью без сборщика мусора, многопоточность, работа с операционной системой и создание высокопроизводительных системных компонентов."
        ),
        Subject(
            id = "4",
            name = "Иностранный язык в профессиональной деятельности",
            professor = "Пенькова О.В.",
            credits = 71,
            currentGrade = "Хорошо",
            description = "Изучение английских слов, связанных с направлением подготовки, чтение текстов и составление аннотаций"
        ),
        Subject(
            id = "5",
            name = "Физическая культура",
            professor = "Магомедов С.К.",
            credits = 91,
            currentGrade = "Отлично",
            description = "Поддержание физической формы студентов. Сдача нормативов"
        ),
        Subject(
            id = "7",
            name = "Разработка программных модулей",
            professor = "Донскова Д.А.",
            credits = 91,
            currentGrade = "Отлично",
            description = "Разработка, отладка и тестирование программных модулей на языках программирования, работа с базами данных"
        ),
        Subject(
            id = "8",
            name = "Управление проектами",
            professor = "Трошина О.В.",
            credits = 72,
            currentGrade = "Хорошо",
            description =  "Планирование, организация и контроль выполнения IT-проектов, управление рисками и ресурсами"
        ),
        Subject(
            id = "9",
            name = "Математическое моделирование",
            professor = "Трошина О.В.",
            credits = 81,
            currentGrade = "Хорошо",
            description =  "Построение математических моделей для решения прикладных задач, численные методы, анализ данных"
        ),
        Subject(
            id = "10",
            name = "Инструментальные средства разработки программного обеспечения",
            professor = "Леонтьев Д.А.",
            credits = 91,
            currentGrade = "Отлично",
            description =  "Использование современных IDE, систем контроля версий, средств автоматизации сборки и тестирования"
        ),
        Subject(
            id = "11",
            name = "Обеспечение качества функционировыания компьютерных систем",
            professor = "Ушакова М.А.",
            credits = 91,
            currentGrade = "Отлично",
            description =  "Методы тестирования, контроль качества ПО, написание тест-кейсов, автоматизация тестирования"
        ),
    )
}