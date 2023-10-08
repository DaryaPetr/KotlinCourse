package lesson_11

class Room(
    val cover: String,
    val name: String,
    val members: List<Member>,
)

class Member(
    val avatar: String,
    val name: String,
    var islight: Boolean = false,
    var talkStatus: String = "разговаривает",
)
{
    fun setHighlight(status: Boolean) {
        islight = status
    }

    fun setTalkingStatus(status: String) {
        talkStatus = status
    }
}

fun main() {

    val user1 = Member(avatar = "@1", name = "u1", talkStatus = "микрофон выключен",)
    val user2 = Member("@2", "u2",)
    val user3 = Member("@3", "u2", true, "пользователь заглушен,")
    val room1 = Room("@30", "r1", listOf(),)
    val room2 = Room("@32", "r2", listOf(user1, user2, user3),)

}