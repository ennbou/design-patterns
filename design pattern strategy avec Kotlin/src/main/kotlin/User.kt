class User(var name: String) {
    fun sayHello() : String {
        val result = "Hello $name!"
        print(result)
        return result;
    }
}
