package kotlinset.lists

import kotlinset.model.TestBox
import kotlinset.model.TestBoxMode

fun main() {

    val list = listOf(
        TestBox(1, "1"),
        TestBox(1, "1"),
        TestBoxMode(1, "1"),
        TestBoxMode(1, "1"),
        101,
        "37"
    )

    println(list)
}