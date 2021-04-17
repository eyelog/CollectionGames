package kotlinset.model

data class TestBoxMode(
    val id: Int,
    val name: String
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TestBoxMode) return false

        if (id != other.id) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + name.hashCode()
        return result
    }

    override fun toString(): String {
        return "TestBoxMode(id=$id, name='$name')"
    }
}
