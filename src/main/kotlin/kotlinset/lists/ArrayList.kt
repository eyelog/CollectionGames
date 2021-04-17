package kotlinset.lists.arraylist

import kotlinset.model.TestBox
import kotlinset.model.TestBoxMode

fun main() {

    val list = arrayListOf(
        TestBox(1, "1"),
        TestBox(1, "1"),
        TestBoxMode(1, "1"),
        TestBoxMode(1, "1"),
        101,
        "37"
    )

    list.add(TestBox(5, "5"))
    list.add(TestBox(5, "5"))

    println(list)
}
