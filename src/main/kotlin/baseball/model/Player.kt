package baseball.model

import baseball.util.Constants.TEXT_INPUT_NUMBER
import baseball.util.Validation.validateDigit
import baseball.util.Validation.validateDuplicate
import baseball.util.Validation.validateLength
import camp.nextstep.edu.missionutils.Console

object Player {
    fun inputNumber(): MutableList<Int> {
        print(TEXT_INPUT_NUMBER)

        val number = mutableListOf<Int>()
        val input = Console.readLine()

        input.forEach {
            number.add(validateDigit(it))
        }

        validateLength(number)
        validateDuplicate(number)

        return number
    }
}