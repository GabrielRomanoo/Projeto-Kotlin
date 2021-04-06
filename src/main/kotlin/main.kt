fun main() {
    println("bem vindo ao bytebank")

//  val titular = "gabriel" //val eh constante, nao pode mudar de valor
    var titular: String = "gabriel" //var eh mutavel
    titular = "romano"

    val numeroConta : Int = 1000

    var saldo : Double = 0.0
    saldo = 100.0
    saldo += 200


    println("titular " + titular)
    //ou
    println("titular $titular") // <- string template

    println("numero da conta $numeroConta")
    println("saldo $saldo")


}