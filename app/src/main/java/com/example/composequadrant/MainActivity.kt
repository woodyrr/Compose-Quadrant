package com.example.composequadrant

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    Quadrant(
                        head1 = getString(R.string.text_composable),
                        head2 = getString(R.string.image_composable),
                        head3 = getString( R.string.row_composable),
                        head4 = getString( R.string.column_composable),
                        message1 = getString( R.string.text_message),
                        message2 = getString( R.string.image_message),
                        message3 = getString( R.string.row_message),
                        message4 = getString( R.string.column_message)
                    )
                }
            }
        }
    }
}

@Composable
fun Quadrant(modifier: Modifier = Modifier, head1: String,  head2: String, head3: String,  head4: String, message1: String, message2: String, message3: String, message4: String){
    Column (modifier = Modifier){
        Row (modifier = Modifier){
            Column (modifier.background(color = Color(0xFFEADDFF)) .fillMaxHeight(0.5f) .fillMaxWidth(0.5f) .padding(16.dp), Arrangement.Center, Alignment.CenterHorizontally){
                Text(
                    text = head1,
                    modifier.padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold


                )
                Text(
                    text = message1,
                    modifier = Modifier,
                    textAlign = TextAlign.Justify

                )
            }
            Column (modifier.background(color = Color(0xFFD0BCFF)) .fillMaxHeight(0.5f) .fillMaxWidth(1f) .padding(16.dp),  Arrangement.Center, Alignment.CenterHorizontally) {
                Text(
                    text = head2,
                    modifier.padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = message2,
                    modifier = Modifier,
                    textAlign = TextAlign.Justify
                )
            }
        }
        Row (){
            Column (modifier.background(color = Color(0xFFB69DF8)) .fillMaxHeight(1f) .fillMaxWidth(0.5f) .padding(16.dp),  Arrangement.Center, Alignment.CenterHorizontally){
                Text(
                    text = head3,
                    modifier.padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = message3,
                    modifier = Modifier,
                    textAlign = TextAlign.Justify
                )
            }
            Column (modifier.background(color = Color(0xFFF6EDFF)) .fillMaxHeight(1f) .fillMaxWidth(1f) .padding(16.dp),  Arrangement.Center, Alignment.CenterHorizontally) {
                Text(
                    text = head4,
                    modifier.padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = message4,
                    modifier = Modifier,
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        Quadrant(
            head1 = stringResource(R.string.text_composable),
            head2 = stringResource(R.string.image_composable),
            head3 = stringResource( R.string.row_composable),
            head4 = stringResource( R.string.column_composable),
            message1 = stringResource( R.string.text_message),
            message2 = stringResource( R.string.image_message),
            message3 = stringResource( R.string.row_message),
            message4 = stringResource( R.string.column_message)
        )
    }
}