package kotlinset.sets

import kotlinset.model.TestBox
import kotlinset.model.TestBoxMode

fun main() {

    val simpleSet = setOf(
        TestBox(1, "1"),
        TestBox(1, "1"),
        TestBoxMode(1, "1"),
        TestBoxMode(1, "1"),
        "101",
        37
    )
    println(simpleSet)

    val treeSet = sortedSetOf(17, 7, 19, 29, 101, 5)
    println(treeSet)

    val linkedSet = linkedSetOf(
        TestBox(1, "1"),
        TestBox(1, "1"),
        TestBoxMode(1, "1"),
        TestBoxMode(1, "1"),
        "101",
        37
    )
    println(linkedSet)

    val hashSet = hashSetOf(
        TestBox(1, "1"),
        TestBox(1, "1"),
        TestBoxMode(1, "1"),
        TestBoxMode(1, "1"),
        "101",
        37
    )
    println(hashSet)
}