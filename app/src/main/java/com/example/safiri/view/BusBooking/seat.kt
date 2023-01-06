package com.example.safiri.view.BusBooking

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun JourneyDetail() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Journey Details",
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colors.primary
                )
                //divider
                Divider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 10.dp, start = 10.dp)

                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    ) {
                    //leave from
                    Text(
                        text = "Leaving From",
                        modifier = Modifier
                            .width(180.dp)
                            .padding(start = 10.dp, top = 5.dp),
                        textAlign = TextAlign.Start,
                        color = Color(0xFF7A7E7D),
                        //font size

                    )
                    //going to
                    Text(
                        text = "Going To",
                        modifier = Modifier
                            .width(200.dp)
                            .padding(top = 5.dp),
                        textAlign = TextAlign.Start,
                        color = Color(0xFF7A7E7D),
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),

                    ) {
                    //leave from place
                    Text(
                        text = "Nairobi",
                        modifier = Modifier
                            .width(180.dp)
                            .padding(start = 10.dp,),
                        textAlign = TextAlign.Start,
                    )
                    //place to go
                    Text(
                        text = "Mombasa",
                        modifier = Modifier
                            .width(200.dp),
                        textAlign = TextAlign.Start,
                    )
                }
                //operator
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),

                    ) {
                    Text(
                        text = "Operator",
                        modifier = Modifier
                            .width(180.dp)
                            .padding(start = 10.dp, top = 5.dp),
                        textAlign = TextAlign.Start,
                        color = Color(0xFF7A7E7D),
                    )

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),

                    ) {
                    Text(
                        text = "Msafiri",
                        modifier = Modifier
                            .width(180.dp)
                            .padding(start = 10.dp,),
                        textAlign = TextAlign.Start,
                    )

                    Image(
                        painter = painterResource(id = com.example.safiri.R.drawable.logo),
                        contentDescription = "logo",
                        modifier = Modifier
                            .size(40.dp)

                    )
                }
//                //Vehicle details
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),

                    ) {
                    //Vehicle
                    Text(
                        text = "Vehicle",
                        modifier = Modifier
                            .width(180.dp)
                            .padding(start = 10.dp, top = 5.dp),
                        textAlign = TextAlign.Start,
                        color = Color(0xFF7A7E7D),
                    )

                    Text(
                        text = "Reg No",
                        modifier = Modifier
                            .width(200.dp)
                            .padding(top = 5.dp),
                        textAlign = TextAlign.Start,
                        color = Color(0xFF7A7E7D),
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),

                    ) {
                    //bus used
                    Text(
                        text = "Astron Bus",
                        modifier = Modifier
                            .width(180.dp)
                            .padding(start = 10.dp),
                        textAlign = TextAlign.Start,
                    )
                    //bus reg no
                    Text(
                        text = "KCM 269M",
                        modifier = Modifier
                            .width(200.dp),
                        textAlign = TextAlign.Start,
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),

                    ) {
                    //boarding time
                    Text(
                        text = "Boarding Time",
                        modifier = Modifier
                            .width(180.dp)
                            .padding(start = 10.dp, top = 5.dp),
                        textAlign = TextAlign.Start,
                        color = Color(0xFF7A7E7D),
                    )

                    Text(
                        text = "Time",
                        modifier = Modifier
                            .width(200.dp)
                            .padding(top = 5.dp),
                        textAlign = TextAlign.Start,
                        color = Color(0xFF7A7E7D),
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),

                    ) {
                    //the boarding point town
                    Text(
                        text = "River Road/Accra Road Juction",
                        modifier = Modifier
                            .width(180.dp)
                            .padding(start = 10.dp,),
                        textAlign = TextAlign.Start,
                    )
                    //Time
                    Text(
                        text = "2:00 PM",
                        modifier = Modifier
                            .width(200.dp)
                         ,
                        textAlign = TextAlign.Start,
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),

                    ) {
                    //selected seat
                    Text(
                        text = "Selected Seat",
                        modifier = Modifier
                            .width(180.dp)
                            .padding(start = 10.dp, top = 5.dp),
                        textAlign = TextAlign.Start,
                        color = Color(0xFF7A7E7D),
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                ) {
                    //number of seats
                    Text(
                        text = "2 Seats",
                        modifier = Modifier
                            .width(180.dp)
                            .padding(start = 10.dp, ),
                        textAlign = TextAlign.Start,
                    )

                }
                //divider
                Divider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 10.dp, start = 10.dp)

                )
                //Passenger Details
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),

                    ) {
                    //Passenger Details
                    Text(
                        text = "Passenger Details",
                        modifier = Modifier
                            .width(180.dp)
                            .padding(start = 10.dp, top = 5.dp),
                        textAlign = TextAlign.Start,
                        color = Color(0xFF7A7E7D),
                    )
                    //Time
                    Text(
                        text = "Seats Reserved",
                        modifier = Modifier
                            .width(200.dp)
                            .padding(top = 5.dp),
                        textAlign = TextAlign.Start,
                        color = Color(0xFF7A7E7D),
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),

                    ) {
                    //passenger name
                    Text(
                        text = "John Doe",
                        modifier = Modifier
                            .width(180.dp)
                            .padding(start = 10.dp),
                        textAlign = TextAlign.Start,
                    )
                    //seat no
                    Text(
                        text = "23",
                        modifier = Modifier
                            .width(200.dp),
                        textAlign = TextAlign.Start,
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),

                    ) {
                    //passeger name
                    Text(
                        text = "Mustafa Amed",
                        modifier = Modifier
                            .width(180.dp)
                            .padding(start = 10.dp ),
                        textAlign = TextAlign.Start,
                    )
                    //seat no
                    Text(
                        text = "24",
                        modifier = Modifier
                            .width(200.dp),

                        textAlign = TextAlign.Start,
                    )
                }
                //divider
                Divider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 10.dp, start = 10.dp)

                )
                //seats for number of people
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),

                    ) {
                    //the boarding point town
                    Text(
                        text = "Seatfare(For 2 seats)",
                        modifier = Modifier
                            .width(180.dp)
                            .padding(start = 10.dp, top = 5.dp),
                        textAlign = TextAlign.Start,
                        color = Color(0xFF7A7E7D),

                    )
                    //price
                    Text(
                        text = "Ksh 2400",
                        modifier = Modifier
                            .width(200.dp)
                            .padding(top = 5.dp),
                        textAlign = TextAlign.Start,
                    )
                }
                Divider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 10.dp, start = 10.dp)

                )
//total
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),

                    ) {
                    //the boarding point town
                    Text(
                        text = "Net Payable",
                        modifier = Modifier
                            .width(180.dp)
                            .padding(start = 10.dp, top = 5.dp),
                        textAlign = TextAlign.Start,
                        color = Color(0xFF7A7E7D),
                    )
                    //price
                    Text(
                        text = "Ksh 2400",
                        modifier = Modifier
                            .width(200.dp)
                            .padding(top = 5.dp),
                        textAlign = TextAlign.Start,
                    )
                }
//book button
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 10.dp, start = 10.dp, top = 10.dp)
                ) {
                    Text(text = "Book")
                }
            }
        }
    }
}
