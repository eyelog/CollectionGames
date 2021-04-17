package kotlinset.model

data class TestBox(
    val id: Int,
    val name: String
) {
    override fun toString(): String {
        return "TestBox(id=$id, name='$name')"
    }
}
