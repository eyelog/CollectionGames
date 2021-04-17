package kotlinset.sets

import kotlinset.model.TestBox

fun main() {

    val set = mutableSetOf(TestBox(1, "1"), TestBox(1, "1"), "kotlin.model.TestBox(1)")

    set.add(TestBox(1, "1"))
    set.add(TestBox(1, "1"))
    set.add(TestBox(2, "2"))
    set.add(100)
    set.add("100")

    println(set)
}