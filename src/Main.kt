fun main() {
    //Задание 89
/*
    first
    second
    third
    fourth
    fifth
    sixth
    seventh
    eighth
    ninth
    tenth
    eleventh
    twelfth
*/
    for(i in 1..12){
        numeral(i)
    }
}

fun numeral(num:Int) :String{
    if(num==1){
        println("First")
    }
    if(num==2){
        println("Second")
    }
    if(num==3){
        println("Third")
    }
    if(num==4){
        println("Fourth")
    }
    if(num==5){
        println("Fifth")
    }
    if(num==6){
        println("Sixth")
    }
    if(num==7){
        println("Seventh")
    }
    if(num==8){
        println("Eighth")
    }
    if(num==9){
        println("Ninth")
    }
    if(num==10){
        println("Tenth")
    }
    if(num==11){
        println("Eleventh")
    }
    if(num==12){
        println("Twelfth")
    }
    return " "
}