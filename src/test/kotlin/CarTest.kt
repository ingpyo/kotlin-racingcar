import io.kotest.assertions.throwables.shouldNotThrow
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import racingcar.domain.car.Car
import kotlin.IllegalArgumentException

class CarTest : DescribeSpec({

    describe("car"){
        context("이름을 입력하면"){
            it("car가 생성된다.") {
                val car = Car("전")
                car.name shouldBe "전"
            }
        }

        context("자동차 이름의 크기가 5를 초과하면"){
            it("IllegalArgumentException이 발생한다."){
                shouldThrow<IllegalArgumentException> { Car("전인표전인표") }
            }
        }
    }
    describe("validateName"){
        context("자동차 이름의 크기가 5를 초과하지 않으면"){
            it("예외 메소드 통과"){
                shouldNotThrow<IllegalArgumentException> { Car("전전인표") }
            }
        }

        context("자동차 이름의 크기가 5를 초과하면"){
            it("IllegalArgumentException이 발생한다."){
                shouldThrow<IllegalArgumentException> { Car("전인표전인표") }
            }
        }
    }


})
