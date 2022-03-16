package com.alparslan.kotlin_notes

fun main(){

    for (i in 1..5){
        println("Döngü 1: $i")
        if (i==3){
            break
        }
    }

    for(i in 1..8){
        if(i==4){
            continue
        }
        println("Döngü 2: $i")
    }

}