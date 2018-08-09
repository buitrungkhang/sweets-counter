package com.deividasstr.domain.common

import com.deividasstr.domain.entities.ConsumedSweet
import com.deividasstr.domain.entities.Fact
import com.deividasstr.domain.entities.Sweet
import com.deividasstr.domain.utils.DateRange
import com.deividasstr.domain.utils.DateTimeHandler
import com.deividasstr.domain.utils.Periods
import org.threeten.bp.LocalDateTime
import org.threeten.bp.OffsetDateTime

class TestData {

    companion object {
        val LOCAL_DATE_TIME = LocalDateTime.of(2018, 8, 8, 17, 15)!!
        val CURRENT_EPOCH_SECS = LOCAL_DATE_TIME.toEpochSecond(OffsetDateTime.now().offset)

        val TEST_CONSUMED_SWEET =
            ConsumedSweet(1, 2, 100, CURRENT_EPOCH_SECS)
        val TEST_CONSUMED_SWEET2 = ConsumedSweet(2, 3, 65, CURRENT_EPOCH_SECS.minus(2 * 60 * 60))
        val TEST_CONSUMED_SWEET3 = ConsumedSweet(
            3,
            2,
            12,
            LocalDateTime.of(2018, 8, 6, 17, 15)!!.toEpochSecond(OffsetDateTime.now().offset))
        val TEST_CONSUMED_SWEET4 = ConsumedSweet(
            4,
            3,
            120,
            LocalDateTime.of(2018, 8, 5, 17, 15)!!.toEpochSecond(OffsetDateTime.now().offset))
        val TEST_CONSUMED_SWEET5 = ConsumedSweet(
            5,
            2,
            66,
            LocalDateTime.of(2018, 7, 6, 17, 15)!!.toEpochSecond(OffsetDateTime.now().offset))
        val TEST_CONSUMED_SWEET6 = ConsumedSweet(
            6,
            3,
            90,
            LocalDateTime.of(2017, 8, 6, 17, 15)!!.toEpochSecond(OffsetDateTime.now().offset))

        val TEST_SWEET = Sweet(2, "Choco", 500.0, 25.0, 50.0, 12.0, 8.0, 12.0)
        val TEST_SWEET2 = Sweet(3, "Milka", 350.0, 25.0, 50.0, 12.0, 8.0, 12.0)
        val TEST_SWEET3 = Sweet(8, "Raisins", 150.0, 25.0, 50.0, 12.0, 8.0, 12.0)

        val TEST_TOTAL_CALS = 3000

        val TEST_LIST_CONSUMED_SWEETS = listOf(TEST_CONSUMED_SWEET, TEST_CONSUMED_SWEET)
        val TEST_LIST_CONSUMED_SWEETS2 = listOf(TEST_CONSUMED_SWEET, TEST_CONSUMED_SWEET2)
        val TEST_LIST_CONSUMED_SWEETS3 = listOf(
            TEST_CONSUMED_SWEET,
            TEST_CONSUMED_SWEET2,
            TEST_CONSUMED_SWEET3,
            TEST_CONSUMED_SWEET4,
            TEST_CONSUMED_SWEET5,
            TEST_CONSUMED_SWEET6)

        val TEST_LIST_CONSUMED_SWEETS_DIFFERENT_PERIODS =
            listOf(TEST_CONSUMED_SWEET, TEST_CONSUMED_SWEET2)
        val TEST_LIST_CONSUMED_SWEETS_EMPTY = listOf<ConsumedSweet>()
        val TEST_ID: Long = 1
        val TEST_FACT_1 = Fact(12, "Sweets are sweet")
        val TEST_FACT_2 = Fact(1, "Sweets are bad")

        val TEST_LIST_SWEETS = listOf(TEST_SWEET, TEST_SWEET2)
        val TEST_SWEET_NAME_SEARCH = "Choco coconut bun"
        val TEST_DATERANGE: DateRange = DateRange(Periods.WEEK, DateTimeHandler())
    }
}