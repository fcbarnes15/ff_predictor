package ff

class User {

	String userName
	static hasMany = [players: Player]
    static constraints = {
    }
}
