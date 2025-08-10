package com.example.moodtracker.screen

import android.R.attr.dialogTitle
import android.R.attr.icon
import android.graphics.Paint
import android.graphics.drawable.Icon
import android.text.Layout
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moodtracker.R
import kotlinx.coroutines.launch

@Composable
fun DesignPractice() {
    /*Row(
        Modifier
            .background(androidx.compose.ui.graphics.Color.White)
            .fillMaxSize()
            .padding(20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("First Column")
            Button(onClick = {}){
                Text("Click Me!")
            }
        }
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Second Column")
            Button(onClick = {}) {
                Text("No, Click Me!")
            }
        }
    }*/

    /*Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text("First Text",modifier = Modifier.weight(1f).background(Color.Green))
            Text("Second Text",modifier = Modifier.weight(1f).background(Color.Yellow))
            Text("Third Text",modifier = Modifier.weight(1f).background(Color.Red))
        }

        Row( modifier = Modifier
            .fillMaxWidth()) {
            Text("Fourth Text",modifier = Modifier.weight(1f).background(Color.Red))
            Text("Five Text",modifier = Modifier.weight(1f).background(Color.Green))
            Text("Six Text",modifier = Modifier.weight(1f).background(Color.Yellow))
        }*/

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.DarkGray),
            contentAlignment = Alignment.Center

        ) {
            Text(
                "JetPack Compose",
                style = MaterialTheme.typography.headlineLarge
            )
        }
        Spacer(modifier = Modifier.height(10.dp))


        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    "First Text",
                    modifier = Modifier
                        .weight(1f)
                        .background(Color.Green),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    "Second Text",
                    modifier = Modifier
                        .weight(1f)
                        .background(Color.Yellow),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    "Third Text",
                    modifier = Modifier
                        .weight(1f)
                        .background(Color.Red),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    "Fourth Text",
                    modifier = Modifier
                        .weight(1f)
                        .background(Color.Red),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    "Five Text",
                    modifier = Modifier
                        .weight(1f)
                        .background(Color.Green),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    "Six Text",
                    modifier = Modifier
                        .weight(1f)
                        .background(Color.Yellow),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )
            }

        }
    }
}


@Composable
fun TextCustomize() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Text(
            "Compose Bangla",
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primary)
                .fillMaxWidth()
                .padding(20.dp),
            color = MaterialTheme.colorScheme.onPrimary,
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}


@Composable
fun TextCustomize2() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Magenta,
                        fontSize = 50.sp
                    )
                ) {
                    append("H")
                }

                append("A")
                append("F")
                append("I")
                append("Z")
                append("U")
                append("R")
            },
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primary)
                .padding(20.dp),
            color = Color.White

        )
    }
}

@Composable
fun TextCustomize3() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Text(
            text = "Hello to All! ".repeat(40),
            maxLines = 3, overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
fun Counter() {
    val count = remember { mutableIntStateOf(0) }
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan),
            contentAlignment = Alignment.Center

        ) {
            Text(
                "Counter App",
                style = MaterialTheme.typography.headlineLarge
            )
        }
        Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Text("Counter: ${count.value}")
            Button(onClick = {
                count.value++
            }) {
                Text("Up!")
            }

            Button(onClick = {
                if (count.intValue > 0) {
                    count.value--
                } else {
                    Toast.makeText(
                        context,
                        "Value cannot be negative, decrement canceled.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }) {
                Text("Down!")
            }
        }

    }
}

@Composable
fun Counter2() {
    val count = remember { mutableIntStateOf(0) }
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Yellow),
            contentAlignment = Alignment.Center
        ) {
            Text(
                "Counter App",
                style = MaterialTheme.typography.headlineLarge,
            )
        }
        Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Counter: ${count.intValue}")
            Button(onClick = {
                if (count.intValue <= 9) {
                    count.intValue++
                } else {
                    Toast.makeText(
                        context,
                        "Value cannot be increment more than 10.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }) {
                Text("Up!")
            }
            Button(onClick = {
                if (count.intValue > 0) {
                    count.intValue--
                } else {
                    Toast.makeText(
                        context,
                        "Value cannot be negative, decrement canceled.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }) {
                Text("Down!")
            }
        }
    }
}

@Composable
fun TextInputField() {
    val name = remember { mutableStateOf(" ") }
    val email = remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
                .height(100.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                "User Input",
                style = MaterialTheme.typography.headlineLarge,
            )
        }
        Spacer(modifier = Modifier.height(10.dp))


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextField(
                value = name.value,
                onValueChange = { newName -> name.value = newName },
                label = { Text("Enter your name") }
            )
            Spacer(modifier = Modifier.height(8.dp))

            TextField(
                value = email.value,
                onValueChange = { newEmail -> email.value = newEmail },
                label = { Text("Enter your Email") }
            )

            val isEmailValid = email.value.contains("@") && email.value.contains(".com")
            if (!isEmailValid) {
                Text(
                    text = "Email not invalid",
                    color = Color.Red
                )
            }
        }
    }
}


@Composable
fun CardExample() {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.LightGray)
                .padding(16.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            Text(
                "Cards",
                style = MaterialTheme.typography.headlineLarge,
            )
        }
        Spacer(modifier = Modifier.height(10.dp))

        CardDesign()
        ImageCard()
        ClickAbleCard()
        StyleCard()

    }
}

@Composable
fun CardDesign() {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(16.dp)
    ) {
        Text(
            "This is Card",
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun ClickAbleCard() {
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .clickable(onClick = {
                Toast.makeText(context, "ClickAble Card Clicked!", Toast.LENGTH_SHORT).show()
            })
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Text(
            "Click AbleCard",
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Composable
fun StyleCard() {
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = {
                Toast.makeText(context, "StyleCard is Clicked!", Toast.LENGTH_SHORT).show()
            })
            .padding(16.dp),
        colors = CardDefaults.cardColors(contentColor = Color.Blue),
        shape = RoundedCornerShape(30.dp),
        elevation = CardDefaults.cardElevation(6.dp),
        border = BorderStroke(1.dp, Color.Gray)
    ) {
        Text(
            text = "Style Card",
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.bodyMedium
        )
    }
}


@Composable
fun ImageCard() {
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.image),
                contentDescription = "Beautiful Image",
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                text = "This is a sample Card",
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.bodyMedium
            )

            Button(
                onClick = {
                    Toast.makeText(context, "Button is Clicked!", Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier.padding(4.dp)
            ) {
                Text("Click Me!")
            }
        }
    }
}



data class Task(
    val id: Int, val title: String
)

val taskList = listOf(
    Task(1, "Mango"),
    Task(2, "Banana"),
    Task(3, "Lichi"),
    Task(4, "Pineapple"),
    Task(5, "WaterMelon"),
    Task(6, "Guava"),
    Task(7, "Jackfruit")
)

@Composable
fun TaskLazyColumn() {
    LazyColumn {
        items(taskList) { task ->
            TaskItem(task)
        }
    }
}

@Composable
fun TaskItem(task: Task) {
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp, vertical = 2.dp)
            .clickable(onClick = {
                Toast.makeText(context, "Click on ${task.title}", Toast.LENGTH_SHORT).show()
            })
    ) {
        Text(
            text = task.title,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}


@Composable
fun SampleLazyColumn() {
    LazyColumn {
        items(20) { i ->
            Text(
                text = "Item Number $i",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )

        }
    }
}

@Composable
fun AlertDialogExample(
    onDismissRequest: () -> Unit,
    onConfirmation: () -> Unit,
    dialogTitle: String,
    dialogText: String,
    icon: ImageVector,
) {
    AlertDialog(
        icon = {
            Icon(icon, contentDescription = "Example Icon")
        },
        title = {
            Text(text = dialogTitle)
        },
        text = {
            Text(text = dialogText)
        },
        onDismissRequest = {
            onDismissRequest()
        },
        confirmButton = {
            TextButton(
                onClick = {
                    onConfirmation()
                }
            ) {
                Text("Confirm")
            }
        },
        dismissButton = {
            TextButton(
                onClick = {
                    onDismissRequest()
                }
            ) {
                Text("Dismiss")
            }
        }
    )
}

@Composable
fun SnackbarExample() {
    val snackbarHostState = remember { SnackbarHostState() }
    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {
            coroutineScope.launch {
                snackbarHostState.showSnackbar("This is a Snackbar!")
            }
        }) {
            Text("Show Snackbar!")
        }
    }
    SnackbarHost(hostState = snackbarHostState)
}




@Composable
fun FabExample(
){
   FloatingActionButton(
       onClick = {},
       contentColor=Color.White,
       containerColor = Color.Blue,
       shape = RectangleShape
   ) {
       Icon(Icons.Default.Add,"Add")
   }
}

@Composable
fun FabSmall(){
    SmallFloatingActionButton(
        onClick = {}
    ) {
        Icon(Icons.Default.Info,"Small")
    }
}

@Composable
fun Dummy(){
    LazyColumn {
        items (50){
            item -> Text("Items $item")
        }
    }
}

@Preview
@Composable
fun PreviewBanglaApp() {
    MainScreen()
}

@Composable
fun MainScreen() {
    val showDialog = remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(MaterialTheme.colorScheme.primary)
                .padding(16.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            Text(
                "FAB",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        // SampleLazyColumn()
        // TaskLazyColumn()
        //SnackbarExample()

        //FabExample()
        //FabSmall()


        /*
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Button(onClick = { showDialog.value = true }) {
                        Text("Show Dialog")
                    }
                }
                if (showDialog.value){
                    AlertDialogExample(
                        onDismissRequest = { showDialog.value = false},
                        onConfirmation = { showDialog.value = false},
                        dialogTitle = "Dialog",
                        dialogText = "This is sample dialog box description",
                        icon = Icons.Default.Info

                    )
                }*/

    }
}