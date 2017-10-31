import jdk.nashorn.internal.parser.DateParser
@Grapes(
        @Grab(group='joda-time', module='joda-time', version='2.3')
)
import org.joda.time.DateTime
import groovy.util.GroovyTestCase

class DateParserTests extends GroovyTestCase {

    def void testCanParseDateTime(){
        def parser = new DateParser()

        def dateTime = new DateTime(2013,1,1,9,30)
        def result = parser.parse(dateTime.toString())

        assert '01/01/2013 - 09:30 AM' == result
    }

    //def void setUp{                      //setup for reduce the duplicate codes
    //    account = new bankAccount(10)
    //}

    //def void tearDown(){
    //    account = null
    //}

    def void testWillThrowAnErrorWhenNullDateTimeIsProvided() {
        def parser = new DateParser()
        shouldFail(IllegalArgumentException) {
            parser.parse(null)
        }
    }

}



