fun main(){
    var myAccount=CurrentAccount("0113362506", "Tessa Loop",23000.00)
    myAccount.deposit(2000.00)
    myAccount.balance
    myAccount.withdrawal(5000.00)
    myAccount.balance
    myAccount.details()
    var mySavings=SavingsAccount("0113362507","Marie Loop",23000.00,1)
    mySavings.withdrawal(2000.00)
    println( mySavings.balance)
    mySavings.withdrawal(2000.00)
    println( mySavings.balance)
    mySavings.withdrawal(2000.00)
    println( mySavings.balance)
    mySavings.withdrawal(2000.00)
    println( mySavings.balance)
    mySavings.deposit(1000.00)
    mySavings.balance
    println( word("Tomato"))
     shop(Product("kituli",23.56,50.25,"groceries"))




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
        if(withdrawals<4 ){
            withdrawals++
            super.withdrawal(amount)
            println(withdrawals)
        }
        else{
            println("reached maximun withdrawal")
        }

    }
}
data class Product(var name:String, var weight: Double, var price: Double, var category:String)
fun shop(product:Product) {
    var groceriesList = mutableListOf<Product>()
    var hygieneList = mutableListOf<Product>()
    var otherList = mutableListOf<Product>()
    when(product.category){
        "groceries"-> groceriesList.add(product)
        "hygiene"-> hygieneList.add(product)
        else->otherList.add(product)
    }
    println(groceriesList)
    println(hygieneList)
    println(otherList)

}
fun word(name:String):String{
    var y=""
    name.forEachIndexed { index, c ->
        if (index%2==0){
            y+=c
        }
    }
    return y
}