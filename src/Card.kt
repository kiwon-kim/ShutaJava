class Card(val no: Int, val isKwang: Boolean)
{
    override fun toString(): String {
        return if (isKwang) "${no}K" else "$no"
    }
}
//class Card(no: Int, isKwang: Boolean)
//{
//    val no: Int
//    val isKwang: Boolean
//
//    init {
//        this.no = no
//        this.isKwang = isKwang
//    }
//}
