package ar.edu.unsam.algo2.contenidos

import java.time.LocalDate

abstract class Contenido(val presupuesto: Int) {
  // Template method
  fun esInteresante() = presupuesto > 5 && cumpleCriterioInteresante()

  // Primitive
  abstract fun cumpleCriterioInteresante(): Boolean
}

class Serie(presupuesto: Int, val temporadas: Int = 5) : Contenido(presupuesto) {
  // Primitive
  override fun cumpleCriterioInteresante() = temporadas < 5
}

class Pelicula(presupuesto: Int, val fechaEstreno: LocalDate = LocalDate.now()) : Contenido(presupuesto) {
  // Primitive
  override fun cumpleCriterioInteresante() = seEstrenoRecientemente()
  fun seEstrenoRecientemente() = fechaEstreno.year == LocalDate.now().year
}