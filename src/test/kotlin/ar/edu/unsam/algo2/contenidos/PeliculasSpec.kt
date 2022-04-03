package ar.edu.unsam.algo2.contenidos

import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import java.time.LocalDate

class PeliculasSpec : DescribeSpec({
  isolationMode = IsolationMode.InstancePerTest
//  describe("Test películas") {
//    it("película con presupuesto bajo no es interesante") {
//      // Arrange
//      val peliculaSinPresupuesto = Pelicula(presupuesto = 2)
//      // Assert
//      peliculaSinPresupuesto.esInteresante() shouldBe false
//    }
//    it("película estrenada hace mucho no es interesante") {
//      // Arrange
//      val hace2Anios = LocalDate.now().minusYears(2)
//      val peliculaVieja = Pelicula(presupuesto = 6, fechaEstreno = hace2Anios)
//      // Assert
//      peliculaVieja.esInteresante() shouldBe false
//    }
//    it("película estrenada recientemente y con buen presupuesto es interesante") {
//      // Arrange
//      val peliculaEstrenada = Pelicula(presupuesto = 6, temporadas = 4)
//      // Assert
//      peliculaEstrenada.esInteresante() shouldBe true
//    }
//  }
})

