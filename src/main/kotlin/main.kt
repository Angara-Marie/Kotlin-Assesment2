fun main(){
    var myAccount=CurrentAccount("0113362506", "Tessa Loop",23000.00)
    myAccount.deposit(2000.00)
    myAccount.balance
    myAccount.withdrawal(5000.00)
    myAccount.balance
    myAccount.details()
    var mySavings=SavingsAccount("0113362507","Marie Loop",23000.00,1)
    mySavings.withdrawal(2000.00)
    mySavings.withdrawals
    mySavings.deposit(1000.00)
    mySavings.balance
    word("Tomato")

}
 open class CurrentAccount(var accountNumber:String, var accountName:String, var balance:Double){
    open fun deposit(amount:Double){
        balance+=amount
        println(balance)

    }
    open fun withdrawal(amount: Double){
        balance-=amount
        println(balance)

    }
    open fun details(){
        println("$accountNumber with $balance is operated by $accountName")

    }
}
class SavingsAccount(accountNumber: String,accountName: String, balance: Double,var withdrawals:Int):CurrentAccount(accountNumber,accountName,balance){
    override fun withdrawal(amount: Double) {
       // super.withdrawal(amount)
        if(withdrawals<4 ){
            withdrawals++
            println(withdrawals)
        }

    }
}
data class Product(var name:String, var weight: Double, var price: Double, var category:String)
//fun takeProduct(word:String):List<String>{
//
//
//}
fun word(name:String):String{
    name.forEachIndexed { index, c ->
        if (index%2==0){
            print(c)
        }
    }
    return name
}