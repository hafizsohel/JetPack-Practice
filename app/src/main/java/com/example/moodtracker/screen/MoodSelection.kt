package com.example.moodtracker.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MoodSelectionScreen(onMoodSelected: (String) -> Unit) {
    val moods = listOf("Happy", "Sad", "Angry", "Excited", "Relaxed")
    var selectedMood by remember { mutableStateOf("") }
    var moodNote by remember { mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        Text("Select Your Mood", style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(16.dp))

        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            moods.forEach { mood ->
                MoodButton(mood = mood, isSelected = selectedMood == mood) {
                    selectedMood = mood
                    onMoodSelected(mood)
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        TextField(
            value = moodNote,
            onValueChange = { moodNote = it },
            label = { Text("Write a Note") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* Save Mood and Note */ },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text("Save")
        }
    }
}

@Composable
fun MoodButton(mood: String, isSelected: Boolean, onClick: () -> Unit) {
    val backgroundColor = when (mood) {
        "Happy" -> Color.Yellow
        "Sad" -> Color.Blue
        "Angry" -> Color.Red
        "Excited" -> Color.Cyan
        else -> Color.Gray
    }

    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = if (isSelected) backgroundColor else Color.Gray),
        modifier = Modifier.padding(8.dp)
    ) {
        Text(mood)
    }
}

@Preview
@Composable
fun PreviewMoodSelectionScreen() {
    MoodSelectionScreen(onMoodSelected = { })
}
