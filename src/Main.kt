fun main() {
    val estudiante = Estudiante("Juan Pérez", 20, "E123", "Matemáticas", 8.5)
    val profesor = Profesor("María López", 45, "P456", "Ciencias", 15)

    estudiante.mostrarRol()
    estudiante.mostrarCalificacion()

    println()

    profesor.mostrarRol()
    profesor.mostrarExperiencia()
}