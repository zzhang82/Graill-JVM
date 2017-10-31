//forecast API  1000calls per day
@Grapes([
        @Grab(group='org.codehaus.groovy.modules.http-builder',
                module='http-builder',
                version='0.6')
])

import groovyx.net.http.RESTClient

def file = new File('../data/fells_loop.gpx')

def slurper = new XmlSlurper()
def gpx = slurper.parse(file)








