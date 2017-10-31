//Grape   Grape List
//grape install xmlwriter xmlwriter 2.2.2      git installs
//joda-time
@Grapes(
        @Grab(group='joda-time', module='joda-time', version='2.3')
)
import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat  //helps to reconigzie the time object

def file = new File('..data/fells_loop.gpx') //load gpx file

def slurper = new XmlSlurper()
def gpx = slurper.parse(file)
print gpx.name
println ''
println gpx.desc
println gpx.foo  //all these are child function
println ''
println gpx.@version    //@ is for the attributes inside the gpx array
println gpx.@creator

gpx.rte.rtept.each {      //each with it like the for with this.
    println it.@lat
    println it.@lon

    def printableTime = new DateTime(it.time.toString())
    def format = DateTimeFormat.forPattern('MM/dd/yyyy - hh:mm aa')
    println printableTime.toString(format)
}

