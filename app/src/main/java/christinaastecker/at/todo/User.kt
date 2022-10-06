package christinaastecker.at.todo

class User {
    var id : Int
    var firstName : String
    var lastName : String
    var password : String
    var isActive : Boolean

    constructor(
        id: Int,
        firstName: String,
        lastNamed: String,
        password: String,
        isActive: Boolean
    ) {
        this.id = id
        this.firstName = firstName
        this.lastName = lastNamed
        this.password = password
        this.isActive = isActive
    }
}