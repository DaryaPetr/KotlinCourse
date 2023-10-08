package lesson_11

class Contact(
    val avatar: String,
    val userName: String,
    val firstName: String,
    val secondName: String,
    val mobileNumber: String,
    val homeNumber: String,
    val iCloud: String,
    val pinnedContacts: List<PinnedContact> = listOf(),
) {
    val toChat = "Написать"
    val toCall = "Вызов"
    val toVideo = "Видео"
    val toMail = "Почта"
    val faceTimeVideo = "FaceTime видео"
    val faceTimeCall = "FaceTime вызов"

    fun toChat() = println(toChat)

    fun toCall() = println(toCall)

    fun toVideo() = println(toVideo)

    fun  toMail() = println(toMail)

    fun toFaceTimeVideo() = println(faceTimeVideo)

    fun toFaceTimeCall() = println(faceTimeCall)
}

class PinnedContact(
    val status: String,
    val contact: Contact,
) {
    fun printName() = println(contact.userName)
}

fun main() {

    val wife = Contact("@a1", "wife","u11", "u21","111", "221", "mail1", )
    val friend1 = Contact("@a2", "friend","u12", "u22","112", "222", "mail2", )
    val friend2 = Contact("@a3", "friend","u13", "u23","113", "223", "mail3", )
    val pinnedContact1 = PinnedContact("жена", wife,)
    val pinnedContact2 = PinnedContact("подруга", friend1,)
    val pinnedContact3 = PinnedContact("подруга", friend2,)
    val pinnedContacts = listOf(pinnedContact1, pinnedContact2, pinnedContact3)
    val user = Contact("@mouse", "@first_name","First Name", "Second Name", "89999994242", "89998884242", "mail@mail.ru", pinnedContacts)
}