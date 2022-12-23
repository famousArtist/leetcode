package kata08//https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/kotlin

class `08_AbbreviateTwoWordName` {
}

fun main(){
    println(abbrevName("evgeny nikitenko"))
}

// my first version
fun abbrevName(name:String): String {
    var nameArr = name.split(" ")
    var result = ""
    if (nameArr.size > 1){
        result = "${nameArr[0][0].toUpperCase()}.${nameArr[1][0].toUpperCase()}"
    }

    return result
}

// best version from codewars
fun abbrevNameTrue(name: String): String {
    val v = name.indexOf(" ")
    return "${name[0]}.${name[v + 1]}".toUpperCase()
}