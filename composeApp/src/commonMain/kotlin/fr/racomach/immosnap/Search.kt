package fr.racomach.immosnap

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun Search() {
    Row {
        TextField("", {})
        Button({}) {
            Text("OK")
        }
    }
    
    
}

@Preview
@Composable
private fun SearchPreview() {
    Search()
}