package com.zhuravskii_khanov.student_planner2.ui_model

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class Para(
    val time: String,
    val name: String,
    val prepod: String,
    val kabinet: String
)

data class Day(
    val day: String,
    val raspis: List<Para>
)

val raspisWeek = listOf(
    Day(
        day = "Вторник",
        raspis = listOf(
            Para("8:30 - 10:00", "Системное программирование (лаб.)", "Токаев Т.И.", "ауд. 3-03"),
            Para("10:10 - 11:40", "Системное программирование (л.)", "Токаев Т.И.", "ауд. 2-20"),
            Para("12:10 - 13:40", "Разработка программных модулей (лаб.)", "Донскова Д.А.", "ауд. 3-12")
        )
    ),
    Day(
        day = "Среда",
        raspis = listOf(
            Para("12:10 - 13:40", "Разработка программных модулей (л.)", "Донскова Д.А.", "ауд. Актовый зал"),
            Para("13:50 - 15:20", "Разработка мобильных приложений (лаб.)", "Леонтьев Д.А.", "ауд. 1-02"),
            Para("15:30 - 17:00", "Разработка мобильных приложений (лаб.)", "Леонтьев Д.А.", "ауд. 1-02")
        )
    ),
    Day(
        day = "Четверг",
        raspis = listOf(
            Para("10:10 - 11:40", "Математическое моделирование (л.)", "Трошина О.В.", "ауд. Актовый зал"),
            Para("12:10 - 13:40", "Иностранный язык в профессиональной деятельности (лаб.)", "Пенькова О.В.", "ауд. 2-22"),
        )
    ),
    Day(
        day = "Пятница",
        raspis = listOf(
            Para("8:30 - 10:00", "Управление проектами (лаб.)", "Трошина О.В.", "ауд. 3-03"),
            Para("10:10 - 11:40", "Инструментальные средства разработки программного обеспечения (лаб.)", "Леонтьев Д.А.", "ауд. 1-02"),
            Para("12:10 - 13:40", "Управление проектами (лаб.)", "Трошина О.В.", "ауд. Актовый зал"),
            Para("13:50 - 15:20", "Инструментальные средства разработки программного обеспечения (лаб.)", "Леонтьев Д.А.", "ауд. 1-02"),
        )
    )
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RaspisScreen(
    onNavigateBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Расписание") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Назад")
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            raspisWeek.forEach { day ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer
                    )
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(
                            text = day.day,
                            style = MaterialTheme.typography.headlineSmall,
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(modifier = Modifier.height(12.dp))

                        day.raspis.forEach { para ->
                            Column {
                                Text(
                                    text = para.time,
                                    style = MaterialTheme.typography.labelMedium,
                                    color = MaterialTheme.colorScheme.primary
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = para.name,
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = FontWeight.Medium
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = "Преподаватель: ${para.prepod}",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                                Text(
                                    text = "Аудитория: ${para.kabinet}",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                                Spacer(modifier = Modifier.height(8.dp))
                            }
                        }
                    }
                }
            }
        }
    }
}