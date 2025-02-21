class Profesor(
    nombre: String,
    edad: Int,
    id: String,
    val departamento: String,
    val aniosExperiencia: Int
) : Persona(nombre, edad, id) {

    override fun mostrarRol() {
        println("Rol: Profesor")
    }

    fun mostrarExperiencia() {
        println("$nombre tiene $aniosExperiencia años de experiencia en el departamento de $departamento")
    }
}