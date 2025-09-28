package vn.edu.ut.hieupm9898.userprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.layout.*

import androidx.compose.material3.Surface

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import vn.edu.ut.hieupm9898.userprofile.ui.theme.UserProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserProfileTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = Color(0xFFF6F8FA)) {
                    UserProfileScreen()
                }
            }
        }
    }
}




