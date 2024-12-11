package com.example.stickyheadercontactos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.stickyheadercontactos.ui.theme.StickyHeaderContactosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StickyHeaderContactosTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    ContactListScreen()
}

fun getContacts(): Map<Char, List<Contactos>> {
    val listaContactos = listOf(
        Contactos("Alba", "600-123-456"),
        Contactos("Alicia", "658-256-254"),
        Contactos("Beatriz", "611-987-654"),
        Contactos("Carlos", "622-456-789"),
        Contactos("Carla", "622-222-333"),
        Contactos("Celia", "688-444-555"),
        Contactos("David", "633-654-321"),
        Contactos("Elena", "644-321-987"),
        Contactos("Francisco", "655-789-123"),
        Contactos("Gloria", "666-890-123"),
        Contactos("Guillermo", "677-111-222"),
        Contactos("Guillermina", "722-241-663"),
        Contactos("Isabel", "688-444-555"),
        Contactos("Jorge", "699-333-666"),
        Contactos("Lucía", "600-777-888"),
        Contactos("María", "611-999-000"),
        Contactos("Mario", "622-222-333"),
        Contactos("Pablo", "644-666-777"),
        Contactos("Paula", "655-888-999"),
    )
    return listaContactos.groupBy { it.nombre.first() }
}
