package com.example.safiri.view.BusBooking

import android.app.DatePickerDialog
import android.widget.DatePicker
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.safiri.R
import com.example.safiri.view.BookBus

import java.util.*

@Composable
fun SearchBus() {
//navigation
    val navController = rememberNavController()
    val context = LocalContext.current

}
@Composable
fun Booking(onContinueClicked:()->Unit) {
    // Fetching the Local Context
    val mContext = LocalContext.current

    // Declaring integer values
    // for year, month and day
    val mYear: Int
    val mMonth: Int
    val mDay: Int

    // Initializing a Calendar
    val mCalendar = Calendar.getInstance()

    // Fetching current year, month and day
    mYear = mCalendar.get(Calendar.YEAR)
    mMonth = mCalendar.get(Calendar.MONTH)
    mDay = mCalendar.get(Calendar.DAY_OF_MONTH)

    mCalendar.time = Date()

    // Declaring a string value to
    // store date in string format
    val mDate = remember { mutableStateOf("") }
    // Declaring DatePickerDialog and setting
    // initial values as current values (present year, month and day)
    val mDatePickerDialog = DatePickerDialog(
        mContext,
        { _: DatePicker, mYear: Int, mMonth: Int, mDayOfMonth: Int ->
            mDate.value = "$mDayOfMonth/${mMonth+1}/$mYear"
        }, mYear, mMonth, mDay
    )


    Column() {
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                var traveFrom by remember { mutableStateOf(TextFieldValue("")) }
                var travelTo by remember { mutableStateOf(TextFieldValue("")) }
                OutlinedTextField(
                    value = traveFrom,
                    onValueChange = { traveFrom = it },
                    label = { Text("Traveling From") },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.White,
                        unfocusedBorderColor = Color.White,
                        cursorColor = Color.White
                    ),
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.city),
                            contentDescription = "Location",
                            tint = Color.Black,
                            modifier = Modifier
                                .size(24.dp)
                        )
                    }
                )
                //divider
                Divider(
                    color = Color.Gray,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp)
                )
                OutlinedTextField(
                    value = travelTo,
                    onValueChange = { travelTo = it },
                    label = { Text(
                            "Traveling To") },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.White,
                        unfocusedBorderColor = Color.White,
                        cursorColor = Color.White
                    ),
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.city),
                            contentDescription = "Location",
                            tint = Color.Black,
                            modifier = Modifier
                                .size(24.dp)
                        )
                    }
                )

            }
        }
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
        ) {
            Column(
                modifier = Modifier
                .fillMaxWidth()
            ) {
                        //create a calender
        Text(
            text ="Journey Date",
            color = Color(0xFF7A7E7D),
            modifier = Modifier
                .padding(start = 10.dp)
        )
                Row() {
                    //calender icon
                    Icon(
                        painter = painterResource(id = R.drawable.calendar),
                        contentDescription = "Calender",
                        tint = Color.Black,
                        modifier = Modifier
                            .size(40.dp)
                            .padding(start = 10.dp)
                            .clickable { mDatePickerDialog.show() }
                    )
                    Text(text = "${mDate.value}",
                        modifier = Modifier
                            .padding(start = 10.dp, top = 10.dp)
                            .clickable { mDatePickerDialog.show() }
                    )
                }
                    }

            }
        //search button
        Button(
            onClick = { onContinueClicked() },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Text(text = "Search")
        }
    }}
