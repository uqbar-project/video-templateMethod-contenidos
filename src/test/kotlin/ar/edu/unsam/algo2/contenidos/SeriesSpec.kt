package ar.edu.unsam.algo2.contenidos

import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import java.time.LocalDate

class SeriesSpec : DescribeSpec({
  isolationMode = IsolationMode.InstancePerTest
  describe("Test series") {
    it("serie con presupuesto bajo no es interesante") {
      // Arrange
      val serieSinPresupuesto = Serie(presupuesto = 2)
      // Assert
      serieSinPresupuesto.esInteresante() shouldBe false
    }
    it("serie con muchas temporadas no es interesante") {
      // Arrange
      val serieMuchasTemporadas = Serie(presupuesto = 6, temporadas = 5)
      // Assert
      serieMuchasTemporadas.esInteresante() shouldBe false
    }
    it("serie con pocas temporadas y con buen presupuesto es interesante") {
      // Arrange
      val serieInteresante = Serie(presupuesto = 6, temporadas = 4)
      // Assert
      serieInteresante.esInteresante() shouldBe true
    }
  }
})

