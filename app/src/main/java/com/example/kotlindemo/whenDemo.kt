package com.example.kotlindemo

fun main(){

    val  day= 4

    val result = when (day){
        1-> "Monday"
        2->"Tuesday"
        3->"Wednesday"
        4-> "Thursday"
        5->"Friday"
        6->"Saturday"
        7->"Sunday"
        else-> "Invalid Days"
    }
    println(result)


    val absent_status= 2
    val results =when(absent_status){
        1->"Leave"
        2->"weekly off"
        3->"Holiday"
        4->"Com Off"
        else->"Invalid Data"

    }
    println(results)
}