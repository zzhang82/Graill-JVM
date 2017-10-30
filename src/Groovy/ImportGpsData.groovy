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
}

////////////////////////////////////////////////////////////////
//writing Xml

def inFile = new File('..data/fells_loop.gpx') //load gpx file

def slurper1 = new XmlSlurper()
def gpx1 = slurper1.parse(inFile)

def markupBuilder =new groovy.xml.StreamingMarkupBuilder()
def xml = markupBuilder.bind {
    route {
        mkp.comment(gpx.name)
        gpx1.rte.rtept.each { point ->
            //TODO: write xml
            routepoint(timestamp: point.time.toString()) {
                latitude(point.@lat)
                longitude(point.@lon)
            }
        }
    }
}
def outFile = new File('..data/fells_loop_truncated.xml')
outFile.write(xml.toString())


/////////////////////////////////////////////////////////////////


